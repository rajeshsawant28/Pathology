package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import base.BaseClass;

public class LoginPage extends BaseClass {

//PageFactory

	@FindBy(xpath = "//input[@name=\"email\"]")
	WebElement Email;

	@FindBy(xpath = "//input[@name=\"password\"]")
	WebElement Password;

	@FindBy(xpath = "//span[text()=\"Login\"]")
	WebElement LoginBtn;

    //initializing page object
	public LoginPage() {
		PageFactory.initElements(driver, this);

	}

	// Actions
	public String validateLoginPageTitle()
	{
		return driver.getTitle();
		
	}
	
	public HomePage Login(String email,String pwd)
	{
		Email.sendKeys(email);
		Password.sendKeys(pwd);
		LoginBtn.click();
		
		return new HomePage();
		
	}
}
