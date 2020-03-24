package com.cts.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage {
	private WebDriver driver;
	
	private By registerIconLocator = By.xpath("//a[@class='ico-register']");
	private By loginIconLocator = By.linkText("Log in"); 
	private By searchBarLocator = By.id("small-searchterms");
	private By searchButtonLocator = By.xpath("//input[@value='Search']");
	private By booksLocator = By.xpath("//a[contains(text(),'Books')]");
	private By computersLocator = By.xpath("//a[contains(text(),'Computers')]");
	
	

	public HomePage(WebDriver driver)
	{
		this.driver = driver;
	}
	
	public void clickonRegister()
	{
		driver.findElement(registerIconLocator).click();
	}
	
	public void clickonLogin()
	{
		driver.findElement(loginIconLocator).click();
	}

	public void search(String searchText)
	{
		driver.findElement(searchBarLocator).sendKeys(searchText);

		driver.findElement(searchButtonLocator).click();

	}
	
	public void books()
	{
		driver.findElement(booksLocator).click();
	}
	public void computers()
	{
		driver.findElement(computersLocator).click();
	}

}
