package pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage_Morning {

	WebDriver driver;
	public LoginPage_Morning(WebDriver idriver)
	{
		driver=idriver;
		PageFactory.initElements(driver, this);
	}

	@FindBy (id="Email") WebElement email;
	@FindBy (id="Password") WebElement password;
	@FindBy (xpath="//button[@type='submit']") WebElement login;
	@FindBy (linkText = "Logout") WebElement logout;

	public void enterEmail(String em)
	{
		email.clear();
		email.sendKeys(em);
	}
	public void enterPassword(String pw)
	{
		password.clear();
		password.sendKeys(pw);
	}
	public void clickOnLogin()
	{
		login.click();

	}

	public void clickOnLogout()
	{
		logout.click();

	}

}
