package stepDefinitions;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObject.LoginPage_Morning;
import pageObject.Search_CustomersExample;

public class StepDefinition {
	WebDriver driver;
	LoginPage_Morning lm;
	Search_CustomersExample searchCust;
	
	@Before
	public void veriFirstExe()
	{
		System.out.println("First Execution");
	}
	
	@Given("User Launch Chrome Browser")
	public void user_launch_chrome_browser() {
		driver=new ChromeDriver();
		lm=new LoginPage_Morning(driver);
		searchCust=new Search_CustomersExample(driver);
	  driver.manage().window().maximize();
	}

	@When("User Open URL {string}")
	public void user_open_url(String url) throws InterruptedException {
	   driver.get(url);
	   Thread.sleep(2000);
	}

	@When("User enters Email as {string} and Password as {string}")
	public void user_enters_email_as_and_password_as(String emailId, String pass) {
		lm.enterEmail(emailId);
		lm.enterPassword(pass);
	}

	@When("Click on Login")
	public void click_on_login() throws InterruptedException {
	    lm.clickOnLogin();
	    Thread.sleep(2000);
	}

	@Then("Page title should be {string}")
	public void page_title_should_be(String expectedTitle) {
	   String actualTitle=driver.getTitle();
	   if(actualTitle.equals(expectedTitle))
	   {
		   Assert.assertTrue(true);
	   }
	   else
	   {
		   Assert.assertTrue(false);
	   }
	}
	@When("user click on Customers Menu")
	public void user_click_on_customers_menu() throws InterruptedException {
		searchCust.clickOnCustomersMenu();
		Thread.sleep(2000);
	}

	@When("User click on Customer Menu Item")
	public void user_click_on_customer_menu_item() throws InterruptedException {
		searchCust.clickOnCustomersMenuItem();
		Thread.sleep(2000);
	}

	@Then("After Customer Menu Page title should be {string}")
	public void after_customer_menu_page_title_should_be(String expectedTitle) {
	   String actualTitle=searchCust.getPageTitle();
	   if(actualTitle.equals(expectedTitle))
	   {
		   Assert.assertTrue(true);
	   }
	   else
	   {
		   Assert.assertTrue(false);
	   }
	}

	@When("user enters email id as {string}")
	public void user_enters_email_id_as(String emailAdd) {
		searchCust.enterEmailId(emailAdd);
	}
	
	@When("user enters first name as {string}")
	public void user_enters_first_name_as(String name) {
		searchCust.enterFirstName(name);
	}

	
	@When("User Clicks on Search button")
	public void user_clicks_on_search_button() throws InterruptedException {
		searchCust.clickOnSearchBtn();
		Thread.sleep(2000);
	}
	
	@Then("User email id should be {string}")
	public void user_email_id_should_be(String expResult) {
		String actualResult=searchCust.verifyResultByEmail();
		if(actualResult.equals(expResult))
		   {
			   Assert.assertTrue(true);
		   }
		   else
		   {
			   Assert.assertTrue(false);
		   }
	}

	@Then("User Name should be {string}")
	public void user_name_should_be(String expResult) {
		String actualResult=searchCust.verifyResultByName();
		if(actualResult.equals(expResult))
		   {
			   Assert.assertTrue(true);
		   }
		   else
		   {
			   Assert.assertTrue(false);
		   }
	}

	@When("user click on Logout Link")
	public void user_click_on_logout_link() throws InterruptedException {
	    lm.clickOnLogout();
	    Thread.sleep(2000);
	}

	@Then("After Logout Page title should be {string}")
	public void after_logout_page_title_should_be(String expectedTitle) {
		String actualTitle=driver.getTitle();
		   if(actualTitle.equals(expectedTitle))
		   {
			   Assert.assertTrue(true);
		   }
		   else
		   {
			   Assert.assertTrue(false);
		   }
	}

	@Then("close Browser")
	public void close_browser() {
	 driver.close();
	}

	@After
	public void lastExe()
	{
		driver.quit();
		System.out.println("Last Execution");
	}

}
