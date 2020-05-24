package stepDefinitions;

import org.openqa.selenium.WebDriver;

import io.cucumber.java.en.*;
import pageMethods.AccountMethods;
import stepDefinitions.Login_Def;

public class Search_Def {
	WebDriver driver;
	@Given("User is successfully logged")
	public void user_is_successfully_logged() throws Throwable {
		Login_Def login = new Login_Def();
		login.i_am_on_home_page();
		login.i_click_on_Sign_In_button();
		Thread.sleep(2000);
		login.i_enter_in_email();
		login.i_enter_in_password();
		login.i_am_successfully_logged_in();
	}
	
	@When("User clicks on the search bar")
	public void user_clicks_on_the_search_bar() throws Throwable {
		AccountMethods search = new AccountMethods(driver);
		search.SearchBar();
		
		
	}

	@And("Enters a product name")
	public void enters_a_product_name() throws Throwable {
		AccountMethods search = new AccountMethods(driver);
		search.SearchData();
	}

	@And("Clicks on the search icon")
	public void clicks_on_the_search_icon() throws Throwable {
		AccountMethods search = new AccountMethods(driver);
		search.SearchIcon(); 
	}

	@Then("The products that contain that keyword are displayed")
	public void the_products_that_contain_that_keyword_are_displayed() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

}
