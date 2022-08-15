package stepDefinitions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import Factory.DriverFactory;
import io.cucumber.java.en.*;
import junit.framework.Assert;
import pages.LoginPage;

@SuppressWarnings("deprecation")
public class OrangeHRM {
	
	private WebDriver dr;
	private LoginPage loginPage;
	
	@SuppressWarnings("deprecation")
	@Given("browser is launched and application login page is displayed")
	public void browser_is_launched_and_application_login_page_is_displayed() {
		dr=DriverFactory.initDriver();
		dr.manage().window().maximize();
		dr.manage().deleteAllCookies();
		dr.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		dr.get("https://opensource-demo.orangehrmlive.com/");
		Assert.assertEquals(dr.getTitle(),"OrangeHRM");
		System.out.println("Login Page Title Verified");
	}

	@When("user enters {string} and {string} and clicks login button")
	public void user_enters_and_and_clicks_login_button(String username, String password) {
		loginPage=new LoginPage(dr);
		loginPage.enterUsernameAndPassword(username, password);
		System.out.println("Login Credentials are Entered");
		loginPage.clickLoginBtn();
		System.out.println("Login Button is clicked");
	}

	@Then("orange hrm home page is displayed with correct page title")
	public void orange_hrm_home_page_is_displayed_with_correct_page_title() {
		Assert.assertEquals(dr.getTitle(),"OrangeHRM");
		dr.quit();
		dr=null;
	}

}
