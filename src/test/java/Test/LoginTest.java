package Test;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;

import org.testng.annotations.Test;

import base.BaseClass;
import pages.HomePage;
import pages.LoginPage;

public class LoginTest extends BaseClass {
	LoginPage loginpage;
	HomePage homepage;

	public LoginTest() {
		super();
	}
	@AfterMethod
	public void setUp()
	{
		initialization();
		
		loginpage=new LoginPage();
		
		
	}
	@Test(priority = 1)
	public void LoginPageTitleTest()
	{
		String title=loginpage.validateLoginPageTitle();
		Assert.assertEquals(title, "GOR Pathology Web Portal");
		
		
	}
	
	@Test(priority = 2)
	public void loginTest()
	{
		homepage=loginpage.Login(prop.getProperty("Username"),prop.getProperty("Password"));
		
	}
	
	
	
	@AfterMethod
	public void tearDown() {
		
		driver.quit();
		
	}
	
	
	
	

}
