package com.Checkedin.testcases;



import java.io.File;
import java.io.IOException;
import java.net.MalformedURLException;
import java.time.Duration;


import org.apache.commons.io.FileUtils;
import org.apache.commons.mail.EmailException;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;

import com.Checkedin.utilities.Readconfig;

public class BaseClass {
	
    Readconfig readconfig=new Readconfig();
	public String baseURL=readconfig.getApllicationURL();
	public String username=readconfig.getUsername();
	public String password=readconfig.getpassword();
	//public String SiteName=readconfig.getSitename();
	//public String Address=readconfig.getAddress();
	
	public static WebDriver driver;
	public static Logger Logger;
	
	@Parameters("browser")
	
	@BeforeClass
	public void setup(String br)
	{

		Logger=Logger.getLogger("CheckedIncare");
		PropertyConfigurator.configure("Log4j.properties");
		
		if(br.equals("chrome"))
		{
			System.setProperty("webdriver.chrome.driver",readconfig.getchromepath());
			driver=new ChromeDriver();
		}
		
		else if(br.equals("firefox"))
		{
		System.setProperty("webdriver.gecko.driver", readconfig.getfirefoxpath());
		driver=new FirefoxDriver();
		}
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get(baseURL);
	}

	public void captureScreen(WebDriver driver, String tname) throws IOException {
		TakesScreenshot ts = (TakesScreenshot) driver;
		File source = ts.getScreenshotAs(OutputType.FILE);
		File target = new File(System.getProperty("user.dir") + "/Screenshots/" + tname + ".png");
		FileUtils.copyFile(source, target);
		System.out.println("Screenshot taken");
	}
	
	@AfterClass
	public void teardown() {
		driver.close();
	}
	
	
	@AfterSuite
	public void Emailreport() throws   MalformedURLException, EmailException {
	
		SendingextentReport.SendEmail();
		
		
	}


}
	
	