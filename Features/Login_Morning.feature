Feature: LoginPage_Morning

@Smoke @Sanity
Scenario: Successful Login with Valid Credentials
				Given User Launch Chrome Browser
				When User Open URL "https://admin-demo.nopcommerce.com/login"
				And User enters Email as "admin@yourstore.com" and Password as "admin"
				And Click on Login
				Then Page title should be "Dashboard / nopCommerce administration"
				When user click on Logout Link
				Then After Logout Page title should be "Your store. Login"
				And close Browser
				
@Regression			
Scenario Outline: Successful Login with Valid Credentials DDT
				Given User Launch Chrome Browser
				When User Open URL "https://admin-demo.nopcommerce.com/login"
				And User enters Email as "<email>" and Password as "<password>"
				And Click on Login
				Then Page title should be "Dashboard / nopCommerce administration"
				When user click on Logout Link
				Then After Logout Page title should be "Your store. Login"
				And close Browser
				
Examples:
|email|password|
|admin@yourstore.com|admin|
|jyo@gmail.com|admin@123|