package com.Checkedin.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	WebDriver ldriver;
	public LoginPage(WebDriver rdriver)
	{
		ldriver=rdriver;
		PageFactory.initElements(rdriver,this);
	}
	
	@FindBy(name="UserName")
	@CacheLookup
	WebElement txtUserName;
	
	@FindBy(name="PasswordEncry")
	@CacheLookup
	WebElement txtpassword;
	
	@FindBy(name="login")
	@CacheLookup
	WebElement btnLogin;
	
	//@FindBy(xpath="//a[@href='/Sites/Create/Index']//li")
	//@CacheLookup
	//WebElement Addwebsite;
	
	
	public void setUserName(String uname)
	{
		txtUserName.sendKeys(uname);
	}
	 public void setpassword(String pwd)
	 {
		 txtpassword.sendKeys(pwd);
	 }
	 
	 public void clicksubmit() {
		 btnLogin.click();
	 }

	
	
	
	
}
