package pageMethods;

import org.openqa.selenium.WebDriver;

import pageObjects.HomePage;

public class HomePageMethods extends HomePage{

	WebDriver driver;

	public HomePageMethods(WebDriver driver) {
		this.driver = driver;
	}
	public void SigninButton( ) {
		driver.findElement(signin).click();
	}
	
}
