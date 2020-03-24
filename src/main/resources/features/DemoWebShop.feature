Feature: DemoWebShop 
	In order to buy products 
	As a e-commerce customer
	I want to access the Application
	
Background: 
	Given I have a browser with DemoWebShop Application 
	
Scenario Outline: Registration 
	When I enter gender as '<gender>' and firstname as '<firstname>' and lastname as '<lastname>' and email as '<email>' and password as '<password>' and confirmpassword as '<confirmpassword>' 
	
	Then my account must be registered with the Application 
Examples:
|gender|firstname|lastname|email|password|confirmpassword|
|Female|Harika|Yarramsetty|harikaY@gmail.com|harikaY|harikaY|
|Female|Kiranmai|Kir|kiranmaiKir@gmail.com|kiranmai|kiranmai|
|Female|Prasanna|P|prasannaPra@gmail.com|prasannaP|prasannaP|
|Male|Aditya|Borra|aditya.BSaV@gmail.com|trustXD|trustXD|	


Scenario Outline: Login 
	When I enter email as '<username>' and enter password as '<password>' and click on Login 
	Then I must login to the portal 
Examples:
|username|password|
|trustxd@gmail.com|trustXD|
|harikaY@gmail.com|harikaY|
	

Scenario: Search 
	When I enter 'Fiction' in search bar and click on search 
	Then I must get the products related to 'Fiction'
	
	
Scenario: Books 
	When I click on Books in the Homepage and select 'Science' book 
	Then I must get the price of the book 


Scenario: Computers 
	When I click on Computers in the Homepage and click on 'Notebooks' and select '14.1-inch laptop' 
	
	Then I must get navigated to the laptop page and must be ale to get product details
	
	
