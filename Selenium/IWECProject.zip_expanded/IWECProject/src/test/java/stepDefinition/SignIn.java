package stepDefinition;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;



import environment.EnvironmentVars;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageMetods.HomePage;
import pageMetods.SignInMtehods;


public class SignIn extends EnvironmentVars {
	
	WebDriver driver = setDriver();

	@Given("User is on Home Page")
	public void user_is_on_Home_Page() {
	    	
		String url = webUrl;
		Assert.assertTrue(driver.getCurrentUrl().contains(url));		   
	}

	@When("User Navigate to SignIn Page")
	public void user_Navigate_to_SignIn_Page() throws InterruptedException {
	   		
		HomePage homePage = new HomePage (driver);
	    homePage.navigateToSinIn();
	    
	    String url = webUrl+"?controller=authentication&back=my-account";	    
	    Assert.assertTrue(driver.getCurrentUrl().contains(url));		
	}

	@When("User enters valid UserName and valid Password")
	public void user_enters_valid_UserName_and_valid_Password() throws InterruptedException {
	    
	    SignInMtehods loginPage = new SignInMtehods(driver);
	    loginPage.populateUsername();
	    loginPage.populatePassword();
	    loginPage.clickSignIn();
	    
	}

	@Then("User should be successfully loged in and see MyAccount")
	public void user_should_be_successfully_loged_in_and_see_MyAccount() {
	    
		String url = webUrl+"?controller=my-account";	    
	    Assert.assertTrue(driver.getCurrentUrl().contains(url));		     
	   		
	    String bodyText = driver.findElement(By.className("page-heading")).getText();	    	    
	    Assert.assertTrue("Text not found!", bodyText.contains("MY ACCOUNT"));  	 	    
	}
	
	@Then("End test by closing the window")
	public void end_test_by_closing_the_window() throws InterruptedException{
	    	  
	    driver.close();
		driver.quit();
	    
	}
	


	
}
