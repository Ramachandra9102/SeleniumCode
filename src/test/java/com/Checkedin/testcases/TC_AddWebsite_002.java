package com.Checkedin.testcases;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.Checkedin.pageObjects.AddWebsite;
import com.Checkedin.pageObjects.LoginPage;
import com.Checkedin.utilities.XLUtils;


public class TC_AddWebsite_002 extends BaseClass{
	
	
	
	@Test(priority=1)
	public void Login()throws IOException, InterruptedException {
		//This Is Login Page Code
		
		LoginPage lp=new LoginPage(driver);
		lp.setUserName(username);
		Logger.info("Username Is Entered");
		lp.setpassword(password);
		Logger.info("password is enterd");
		lp.clicksubmit();
		Logger.info("Clicking The Submit Button");
		Thread.sleep(3000);
		
	}
		
		@Test(priority=2,dataProvider="SiteData")
		public void AddingNewSite(String SiteName,String Address,String ContactNumber) throws IOException {
		//Add The Website
	    AddWebsite AW=new AddWebsite(driver);		
		AW.clickAddSite();
		Logger.info("AddWesite Link Is Clicked");
		AW.SiteName(SiteName);
		Logger.info("SiteName Is Enterd");
		AW.Address(Address);
		Logger.info("Address is enterd");
		AW.ContactNumber(ContactNumber);
		Logger.info("phoneNumber  is enterd");
		AW.WINotification();
		Logger.info("WInotification Is clicked");
		//AW.CreateButton();
		
	   String awT	=driver.getTitle();
	   System.out.println(awT);
		//Assert.assertEquals(awT, "CheckedIn Care");
		
		
	}
	
		@DataProvider(name="SiteData")
		String [][] getData() throws IOException  
		{
			String path=System.getProperty("user.dir")+"/src/main/java/com/Checkedincare/testdata/Data.xlsx";
			
			int rownum=XLUtils.getRowCount(path, "Sheet3");
			int colcount=XLUtils.getCellCount(path,"Sheet3",1);
			
			String logindata[][]=new String[rownum][colcount];
			
			for(int i=1;i<=rownum;i++)
			{
				for(int j=0;j<colcount;j++)
				{
					logindata[i-1][j]=XLUtils.getCellData(path,"Sheet3", i,j);//1 0
				}
					
			}
		return logindata;
		}
	
	

}
