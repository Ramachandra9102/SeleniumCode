package com.Checkedin.testcases;

 

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

import com.Checkedin.pageObjects.LoginPage;
import com.Checkedin.utilities.Reporting;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;

import java.io.IOException;
import java.net.MalformedURLException;


import org.apache.log4j.Logger;
import org.testng.annotations.Test;




public class Tc_LoginTestcase_001 extends BaseClass {
	
	public ExtentReports extent;
	public ExtentTest logger;
	@Test
	public void loginTest() throws IOException
	{


		
		Logger.info("URL is opened");
		
		LoginPage lp=new LoginPage(driver);
		
		lp.setUserName(username);
		Logger.info("Username Is Entered");
		
		lp.setpassword(password);
		Logger.info("password is enterd");
		lp.clicksubmit();
		Logger.info("Clicking The Submit Button");
		
		
		
		
		if(driver.getTitle().equals("CheckedIn Care | Dashboard"))
		{
			Assert.assertTrue(true);
			Logger.info("Login test passed");
			
		}
		else {
			captureScreen(driver,"Ramachandra");
			Assert.assertTrue(false);
		}
		

	}
	
	
	

	

}
