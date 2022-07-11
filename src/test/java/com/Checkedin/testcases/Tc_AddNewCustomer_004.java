package com.Checkedin.testcases;

import java.io.IOException;
import java.net.MalformedURLException;

import org.apache.commons.mail.EmailException;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.Checkedin.pageObjects.LoginPage;
import com.Checkedin.pageObjects.NewAutoSite;
import com.Checkedin.pageObjects.RegisterNewUserAccount;
import com.Checkedin.utilities.XLUtils;

public class Tc_AddNewCustomer_004 extends BaseClass {
		@Test(priority=1)
		
		public void Login() throws IOException {
			
			//Creating Object For Login Page And NewAuto site
			LoginPage lp=new LoginPage(driver);
			NewAutoSite NA=new NewAutoSite(driver);
			
			
			//Getting Values From Objects
			lp.setUserName(username);
			lp.setpassword(password);
			lp.clicksubmit();
			
			//click The Newauto site
			NA.ClickNewAuto();
			Logger.info("clicked NewAuto");
			NA.clickCustomerList();
			Logger.info("clicking The CustomerList");
			NA.clickAddNewCustomer();
			Logger.info("clicking The AddNew CustomerButton");
			captureScreen(driver,"Login");
		}
			@Test(priority=2,dataProvider="NewUser")
			public void AddNewCustomer(String Username,String Email,String Password,String ConfirmPassword,String FirstName,String LastName,String ContactNumber) throws IOException
			{
			//Adding New Customer
		    RegisterNewUserAccount RNA=new RegisterNewUserAccount(driver);
		    RNA.Username(Username);
			RNA.userEmail(Email);
			RNA.userPassword(Password);
			RNA.confirmpassword(ConfirmPassword);
			RNA.Firstname(FirstName);
			RNA.Lastname(LastName);
			//RNA.userRole(1);
			RNA.PhoneNumber(ContactNumber);
			captureScreen(driver,"Ravi");
			
		}
		
			@DataProvider(name="NewUser")
			String [][] getData() throws IOException  
			{
				String path=System.getProperty("user.dir")+"/src/main/java/com/Checkedincare/testdata/Data.xlsx";
				
				int rownum=XLUtils.getRowCount(path, "Sheet2");
				int colcount=XLUtils.getCellCount(path,"Sheet2",1);
				
				String logindata[][]=new String[rownum][colcount];
				
				for(int i=1;i<=rownum;i++)
				{
					for(int j=0;j<colcount;j++)
					{
						logindata[i-1][j]=XLUtils.getCellData(path,"Sheet2", i,j);//1 0
					}
						
				}
			return logindata;
			}
		
			
	}