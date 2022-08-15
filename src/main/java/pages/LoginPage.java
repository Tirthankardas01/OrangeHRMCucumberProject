package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	
	private WebDriver driver;
	
	@FindBy(id = "txtUsername")
	WebElement txtUsername;
	
	@FindBy(id = "txtPassword")
	WebElement txtPassword;
	
	@FindBy(id = "btnLogin")
	WebElement btnLogin;
	
	public LoginPage (WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	public void enterUsernameAndPassword(String username, String password) {
		txtUsername.sendKeys(username);
		txtPassword.sendKeys(password);
	}
	
	public void clickLoginBtn() {
		btnLogin.click();
	}
	
	

}
