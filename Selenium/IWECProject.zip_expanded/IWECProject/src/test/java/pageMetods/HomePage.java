package pageMetods;

import org.openqa.selenium.WebDriver;

import pageObjects.HomePageObjects;

public class HomePage extends HomePageObjects {

	WebDriver driver;
	
	public HomePage (WebDriver driver)
	{
		this.driver=driver;
	}

	public void navigateToSinIn() throws InterruptedException
	{
		Thread.sleep(2000);
		driver.findElement(navigateToSinIn).click();

	}

}
