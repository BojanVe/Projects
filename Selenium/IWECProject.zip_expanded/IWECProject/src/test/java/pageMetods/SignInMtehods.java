package pageMetods;

import org.openqa.selenium.WebDriver;

import pageObjects.SignInObjects;



public class SignInMtehods extends SignInObjects{

	WebDriver driver;

	public SignInMtehods (WebDriver driver)
	{
		this.driver=driver;
	}
	
	public void populateUsername() throws InterruptedException
	 {
		 Thread.sleep(1000);
			driver.findElement(email).sendKeys(emailValue);
			//driver.findElement(password).sendKeys(passwordValue);
		
	 }
	public void populatePassword() throws InterruptedException
	 {
		 Thread.sleep(1000);			
			driver.findElement(password).sendKeys(passwordValue);
	 }
	
	 public void clickSignIn() throws InterruptedException
	 {
		    Thread.sleep(2000);
			driver.findElement(signIn).click();
			
	 }
}
