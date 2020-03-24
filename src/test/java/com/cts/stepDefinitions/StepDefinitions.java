package com.cts.stepDefinitions;

import java.io.IOException;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.cts.base.LaunchWebBrowser;
import com.cts.pages.BooksPage;
import com.cts.pages.ComputersPage;
import com.cts.pages.HomePage;
import com.cts.pages.LoginPage;
import com.cts.pages.RegistrationPage;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class StepDefinitions {

	WebDriver driver;
	
	
	@Given("I have a browser with DemoWebShop Application")
	public void i_have_a_browser_with_DemoWebShop_Application() {
	
		LaunchWebBrowser.LaunchWebDriver("ch");
		this.driver = LaunchWebBrowser.driver;

	}

	@When("I enter gender as {string} and firstname as {string} and lastname as {string} and email as {string} and password as {string} and confirmpassword as {string}")
	public void i_enter_gender_as_and_firstname_as_and_lastname_as_and_email_as_and_password_as_and_confirmpassword_as
	(String gender, String firstname, String lastname, String email, String password, String confirmPassword) 
	{
		HomePage home = new HomePage(driver);
		RegistrationPage register = new RegistrationPage(driver);
		//clicking on Register button
		home.clickonRegister();
		
		//filling the details to register
		register.fillRegistrationDetails(gender, firstname, lastname, email, password, confirmPassword);
	}

	@Then("my account must be registered with the Application")
	public void my_account_must_be_registered_with_the_Application() {	

		RegistrationPage register = new RegistrationPage(driver);
		//check if continue button is present after after clicking on Register to validate registration
		boolean ele = register.checkContinue();
		
		Assert.assertTrue("Not registered", ele);
		//terminating the current scenario
		LaunchWebBrowser.trerminate();

	}

	@When("I enter email as {string} and enter password as {string} and click on Login")
	public void i_enter_email_as_and_enter_password_as_and_click_on_Login(String email, String password) {
		// Write code here that turns the phrase above into concrete actions
		HomePage home = new HomePage(driver);
		LoginPage login = new LoginPage(driver);
		//clicking on Login Icon
		home.clickonLogin();
		
		//entering Login details
		login.loginDetils(email, password);
		
		//click on Login Button
		login.clickOnLogin();
	}

	@Then("I must login to the portal")
	public void i_must_login_to_the_portal() {
		// Write code here that turns the phrase above into concrete actions
		LoginPage login = new LoginPage(driver);
		//find if logout button is displayed after login
		boolean logoutele = login.validateLogin();
		Assert.assertTrue("Invalid Credentials", logoutele);
		
		//closing the scenario
		LaunchWebBrowser.trerminate();
	}

	@When("I enter {string} in search bar and click on search")
	public void i_enter_in_search_bar_and_click_on_search(String searchText) {
		// Write code here that turns the phrase above into concrete actions
		HomePage home = new HomePage(driver);
		home.search(searchText);
	}

	@Then("I must get the products related to {string}")
	public void i_must_get_the_products_related_to(String searchText) {
		// Write code here that turns the phrase above into concrete actions
		if (driver.getPageSource().toLowerCase().contains(searchText))
			System.out.println("Got the products related to search");
		else
			Assert.fail("Got wrong product suggestions");
		
		//closing the scenario
		LaunchWebBrowser.trerminate();
	}

	@When("I click on Books in the Homepage and select {string} book")
	public void i_click_on_Books_in_the_Homepage_and_select_book(String bookname) {
		// Write code here that turns the phrase above into concrete actions
		HomePage home = new HomePage(driver);
		BooksPage books = new BooksPage(driver);
		
		//clicking on Books
		home.books();
		
		//getting the book by name
		books.clickonBook(bookname);
	}

	@Then("I must get the price of the book")
	public void i_must_get_the_price_of_the_book() {
		// Write code here that turns the phrase above into concrete actions
		BooksPage books = new BooksPage(driver);
		
		//printing the price of the book
		System.out.println(books.getBookPrice());
		
		//closing the scenario
		LaunchWebBrowser.trerminate();
	}

	@When("I click on Computers in the Homepage and click on {string} and select {string}")
	public void i_click_on_Computers_in_the_Homepage_and_click_on_and_select(String computerType, String computer) 
	{
		HomePage home = new HomePage(driver);
		ComputersPage computers = new ComputersPage(driver);
		home.computers();
		//clicking on notepad
		computers.selectComputerType(computerType);
		//selecting the type of Laptop
		computers.selectLaptop();
		
		
	}

	@Then("I must get navigated to the laptop page and must be ale to get product details")
	public void i_must_get_navigated_to_the_laptop_page_and_must_be_ale_to_get_product_details() 
	{		
		ComputersPage computers = new ComputersPage(driver);
		//Asserting CPU type
		String cpuType = computers.getLaptopDetails();
		Assert.assertTrue("Wrong CPU type", cpuType.equalsIgnoreCase("Intel"));
		
		//closing the scenario
		LaunchWebBrowser.trerminate();
	}
	
}