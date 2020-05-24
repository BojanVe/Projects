package pageMetods;

import org.openqa.selenium.WebDriver;

import pageObjects.MyAccountObjects;

public class MyAccount extends MyAccountObjects {
	
    WebDriver driver;
	
	public  MyAccount (WebDriver driver)
	{
		this.driver=driver;
	}

	public void navigateToSinIn() throws InterruptedException
	{
		Thread.sleep(2000);
		driver.getPageSource().contains((CharSequence) textMyAccount);
	}
	
	
}
