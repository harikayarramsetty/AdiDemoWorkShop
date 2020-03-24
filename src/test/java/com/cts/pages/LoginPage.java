package com.cts.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {
	private WebDriver driver;
	public LoginPage(WebDriver driver)
	{
		this.driver = driver;
	}
	
	private By emailLocator = By.id("Email"); 
	private By passwordLocator = By.id("Password");
	private By loginLocator = By.xpath("//input[@value='Log in']");

	public void loginDetils(String email,String password)
	{
		driver.findElement(emailLocator).sendKeys(email);
		driver.findElement(passwordLocator).sendKeys(password);

	}
	
	public void clickOnLogin()
	{
		driver.findElement(loginLocator).click();
	}
	
	public boolean validateLogin()
	{
		boolean logoutele = driver.findElement(By.xpath("//a[text()='Log out']")).isDisplayed();
		return logoutele;
	}
	
	
}
