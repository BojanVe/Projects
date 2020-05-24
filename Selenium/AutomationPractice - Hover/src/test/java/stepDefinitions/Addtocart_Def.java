package stepDefinitions;

import environment.EnvironmentVariables;
import io.cucumber.java.en.*;
import junit.framework.Assert;
import pageMethods.AccountMethods;
import pageMethods.DetailedItemMethods;
import pageMethods.ItemListMethods;
import pageMethods.SummaryMethods;
import pageObjects.SummaryPage;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

public class Addtocart_Def extends EnvironmentVariables{
	
	@Given("I am successfully logged in and I am on my account page")
	public void i_am_successfully_logged_in_and_I_am_on_my_account_page() throws Throwable {
		Login_Def login = new Login_Def();
		login.i_click_on_Sign_In_button();
		login.i_enter_in_email();
		login.i_enter_in_password();
		login.i_am_successfully_logged_in();
		Thread.sleep(2000);
	}

	@When("^I click on WOMEN tab$")
	public void i_click_on_WOMEN_tab() throws Exception {
		AccountMethods accPageMtds = new AccountMethods(driver);
		accPageMtds.WomenTab();
		Thread.sleep(2000);
	}

	@And("I click on Printed Summer Dress")
	public void i_click_on_Printed_Summer_Dress() throws Throwable {
	    ItemListMethods listPage = new ItemListMethods(driver);
	    listPage.printedSummerDressHover();
	}

	@Then("The detailed item page is opened")
	public void the_detailed_item_page_is_opened() {
	    Assert.assertTrue(driver.getTitle().contains("Printed Summer Dress - My Store"));
	}

	//@When("I select yellow color")
	//public void i_select_yellow_color() {
	//    DetailedItemMethods detailPage = new DetailedItemMethods(driver);
	//    detailPage.itemColor();
	//}

	//@And("Increase the quantity to {int} pieces")
	//public void increase_the_quantity_to_pieces(Integer int1) throws InterruptedException {
	//    DetailedItemMethods detailPage = new DetailedItemMethods(driver);
	//    detailPage.itemQty();
	//}
	//@And("Select size M")
	//public void select_size_m( ) {
	//    DetailedItemMethods detailPage = new DetailedItemMethods(driver);
	//    detailPage.itemSize();
	//}
	//
	//@And("Click Add to cart")
	//public void click_Add_to_cart() throws InterruptedException {
	//    DetailedItemMethods detailPage = new DetailedItemMethods(driver);
	//    detailPage.addToCartBtn();
	//    Thread.sleep(2000);
	//    detailPage.continueShopping();
	 //   Thread.sleep(2000);

	//}

	@Then("The items are successfully added to the cart")
	public void the_items_are_successfully_added_to_the_cart() throws InterruptedException {
		SummaryMethods summary = new SummaryMethods(driver);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		
		//Scroll window up
		js.executeScript("window.scrollBy(0,-2000)");
		Thread.sleep(1000);
		
		//Click on shopping cart
		summary.shoppingCart();
		
		//Scroll window down
		js.executeScript("window.scrollBy(0,500)");
		
		
		//Assertion to check if 3 items are added to the cart
		summary.assertQty();

		
		//Assertion to test if correct color and size are chosen
		summary.assertColor();
		
		//Assertion to test if the right product is added
		summary.assertProduct();	
		
		}
	
	
	}
	

