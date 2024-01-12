Feature: Search_CustomersExample

Background: All common Steps
				Given User Launch Chrome Browser
				When User Open URL "https://admin-demo.nopcommerce.com/login"
				And User enters Email as "admin@yourstore.com" and Password as "admin"
				And Click on Login
				Then Page title should be "Dashboard / nopCommerce administration"
				When user click on Customers Menu
				And User click on Customer Menu Item
				Then After Customer Menu Page title should be "Customers / nopCommerce administration"
@Smoke			
Scenario: Search Customer by using Email Id
				When user enters email id as "james_pan@nopCommerce.com"
				And User Clicks on Search button
				Then User Name should be "James Pan"
				When user click on Logout Link
				Then After Logout Page title should be "Your store. Login"
				And close Browser
@Sanity				
Scenario: Search Customer by using Name
				When user enters first name as "Virat"
				And User Clicks on Search button
				Then User email id should be "kiyjcycyhjc676008@gmail.com"
				When user click on Logout Link
				Then After Logout Page title should be "Your store. Login"
				And close Browser