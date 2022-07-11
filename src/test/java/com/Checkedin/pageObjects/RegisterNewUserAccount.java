package com.Checkedin.pageObjects;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RegisterNewUserAccount {
	
	
	WebDriver ldriver;
	public RegisterNewUserAccount(WebDriver rdriver)
	{
		ldriver=rdriver;
		PageFactory.initElements(rdriver,this);
	}
	
	
	@FindBy(xpath="//input[@id='txtuserName']")
	WebElement Username;

	@FindBy(xpath="//input[@id='Users_Email']")
	WebElement UserEmail;
	
	@FindBy(xpath="//input[@id='txtpwdEncry']")
	WebElement UserPassword;
	
	@FindBy(xpath="//input[@id='txtconpwdEncry']")
	WebElement ConfirmPassword;
	
	@FindBy(xpath="//input[@id='txtfirstName']")
	WebElement FirstName;
	
	@FindBy(xpath="//input[@id='txtlastName']")
	WebElement LastName;
	
	//Select Userrole=new Select(ldriver.findElement(By.xpath("//select[@id='Users_UserType']")));
	@FindBy(xpath="//select[@id='Users_UserType']\"")
	WebElement Userrole;
	
	@FindBy(xpath="//input[@id='Users_PhoneNumber']")
	WebElement PhoneNumber;
	
	@FindBy(xpath="//input[@id='ImageUpload']")
	WebElement FileUplaod;
	
	@FindBy(xpath="//input[@id='btnSubmit']")
	WebElement CreateButton;
	
	@FindBy(xpath="//input[@id='btnReset']")
	WebElement Reset;
	
	@FindBy(xpath="//a[@class='btn btn-danger']")
	WebElement Cancel;
	
	
	public void Username(String uname) {
		Username.sendKeys(uname);
	}

	public void userEmail(String Email) {
		UserEmail.sendKeys(Email);
	}
	
	public void userPassword(String pwd)
	{
		UserPassword.sendKeys(pwd);
	}
	
	public void confirmpassword(String confpass) {
		ConfirmPassword.sendKeys(confpass);
	}
	
	public void Firstname(String FName) {
		FirstName.sendKeys(FName);
	}
	
	public void Lastname(String LName) {
		LastName.sendKeys(LName);
	}
	
	//public void userRole() {
		//Userrole.findElement(By.xpath(""))
	//}
	
	public void PhoneNumber(String PN) {
		PhoneNumber.sendKeys(PN);
	}

	
	
	
	
	
}
