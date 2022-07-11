package com.Checkedin.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class NewAutoSite {

	WebDriver ldriver;
	public NewAutoSite(WebDriver rdriver)
	{
		ldriver=rdriver;
		PageFactory.initElements(rdriver,this);
	}
	
	
	@FindBy(xpath="//a[normalize-space()='NewAuto']")
	WebElement NewAuto;
	
	@FindBy(xpath="//*[@id=\"parent\"]/div/div/table/tbody/tr[2]/td")
	WebElement CustomerList;
	
	@FindBy(xpath="//span[@class='glyphicon-class']")
	WebElement AddNewCustomer;


public void ClickNewAuto() {
	NewAuto.click();
}

public void clickCustomerList() {
	CustomerList.click();
}

public void clickAddNewCustomer() {
	AddNewCustomer.click();
}







}