package com.Checkedin.testcases;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;


public class Gridclass {
	
	@Test 
	public void TestGrid() throws MalformedURLException, InterruptedException {
		
	DesiredCapabilities caps=new DesiredCapabilities();
	
	caps.setCapability(CapabilityType.BROWSER_NAME, "chrome");
	
	
	WebDriver driver=new RemoteWebDriver(new URL("http://192.168.40.176:4444"),caps);
	Thread.sleep(3000);
	driver.get("https://www.selenium.dev/downloads/");
	//driver.close();
	}
	
	
	
	
	

}
