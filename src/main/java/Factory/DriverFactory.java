package Factory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DriverFactory {
	
	private static WebDriver dr;
	
	public static WebDriver initDriver() {
		System.setProperty("webdriver.chrome.driver", ".//ChromeDriver//chromedriver.exe");
		dr = new ChromeDriver();
		return dr;
	}

}
