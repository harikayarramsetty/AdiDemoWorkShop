package com.cts.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class RegistrationPage {
	private By genderMaleLocator = By.id("gender-male");
	private By genderFemaleLocator = By.id("gender-female");
	private By firstnameLocator = By.id("FirstName");
	private By lastnameLocator = By.id("LastName");
	private By emailLocator = By.id("Email");
	private By passwordLocator = By.id("Password");
	private By confirmPasswordLocator = By.id("ConfirmPassword");
	private By registerButtonLocator = By.id("register-button");
	private By continueButtonLocator = By.xpath("//input[@value='Continue']");
	
	private WebDriver driver;
	
	public RegistrationPage(WebDriver driver)
	{
		this.driver = driver;
	}
	
	public void fillRegistrationDetails(String gender,String firstname,String lastname,String email,String password,String confirmPassword)
	{
		if (gender.equalsIgnoreCase("male"))
			driver.findElement(genderMaleLocator).click();
		else
			driver.findElement(genderFemaleLocator).click();

		driver.findElement(firstnameLocator).sendKeys(firstname);
		
		driver.findElement(lastnameLocator).sendKeys(lastname);
		
		driver.findElement(emailLocator).sendKeys(email);
		
		driver.findElement(passwordLocator).sendKeys(password);
		
		driver.findElement(confirmPasswordLocator).sendKeys(confirmPassword);

		driver.findElement(registerButtonLocator).click();

	}
	
	public boolean checkContinue()
	{
		boolean ele = driver.findElement(continueButtonLocator).isDisplayed();
		return ele;
	}
	
	public void clickContinue()
	{
		driver.findElement(continueButtonLocator).click();
	}
}
