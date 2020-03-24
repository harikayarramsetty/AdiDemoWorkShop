package com.cts.pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ComputersPage {
	private WebDriver driver;
	
	private By notepadLocator = By.xpath("(//a[contains(text(),'Notebooks')])[4]");
	private By laptopLocator = By.xpath("//a[contains(text(),'14.1-inch Laptop')]");
	

	public ComputersPage(WebDriver driver) {
		this.driver = driver;
	}

	public void selectComputerType(String computerType) {
		driver.findElement(notepadLocator).click();
	}
	
	public void selectLaptop()
	{
		driver.findElement(laptopLocator).click();
	}
	
	public String getLaptopDetails()
	{
		String cpuType = null;
		WebElement table = driver.findElement(By.xpath("//table[@class='data-table']"));
		List<WebElement> elements = table.findElements(By.tagName("td"));
		for(WebElement ele :elements)
		{ 	
			System.out.println(ele.getText());
			if(ele.getText().equalsIgnoreCase("Intel"))
				cpuType = ele.getText();
		}
		return cpuType;

	}

}
