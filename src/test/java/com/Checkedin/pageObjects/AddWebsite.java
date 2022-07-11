package com.Checkedin.pageObjects;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AddWebsite  {
	WebDriver ldriver;
	public AddWebsite(WebDriver rdriver)
	{
		ldriver=rdriver;
		PageFactory.initElements(rdriver,this);
	}
	

	//click The Addwebsite
	@FindBy(xpath="//a[@href='/Sites/Create/Index']//li")
	@CacheLookup
	WebElement Addwebsite;
	
	//Enter Sitename
	
	@FindBy(xpath="//input[@id='SiteName']")
	@CacheLookup
	WebElement SiteName;
	
	//Enter Address
	@FindBy(xpath="//input[@id='Address']")
	@CacheLookup
	WebElement Address;
	
	
	@FindBy(xpath="//input[@id='ContactNumber']")
	WebElement ContactNumber;
	
	@FindBy(xpath="//input[@id='IsWellCheckNotification']")
	WebElement WInotifiaction;
	
	
	//Click Create Button
	@FindBy(xpath="//input[@id='btnSubmit']")
	@CacheLookup
	WebElement CreateButton;
	
	
	//Creating Methods 
	public void clickAddSite() {
		Addwebsite.click();
	}
	
	public void SiteName(String sitename ) {
		SiteName.sendKeys(sitename);
	}
	
	public void Address(String address) {
		
		Address.sendKeys(address);
	}
	
    public void ContactNumber(String CN) {
		
		ContactNumber.sendKeys(CN);
	}
	
     public void WINotification() {
		
    	 WInotifiaction.click();
	}
	public void CreateButton() {
		CreateButton.click();
		
	}
	
}
