package com.Checkedin.testcases;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.testng.annotations.Test;

public class dbtesting {
	
	
	@Test

	public void testDB() throws ClassNotFoundException, SQLException  {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Ramachandra Rao\\eclipse-workspace\\CheckedinCareNewCode\\Checkedincare\\Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://cic-test-srv1.azurewebsites.net/");
	
       Class.forName("com.mysql.jdbc.Driver");
       System.out.println("Driver loaded");
       Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/selenium?characterEncoding=utf8","sqluser","password");
	   System.out.println("Connected to mysql DB");
	   Statement smt=con.createStatement();
       ResultSet rs=smt.executeQuery("select * from UserLoginDetails");
	    while(rs.next()){
		String username=rs.getString("username");
		String Password=rs.getString("password");
		System.out.println("Database recordis "+username);
		System.out.println("Database recordis "+Password);
	
		driver.findElement(By.name("UserName")).sendKeys(username);
		driver.findElement(By.name("PasswordEncry")).sendKeys(Password);
		
		driver.findElement(By.name("login")).click();
	
	
	}
	
	
	}

}
