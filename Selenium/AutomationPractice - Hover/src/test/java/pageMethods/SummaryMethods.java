package pageMethods;

import org.openqa.selenium.WebDriver;

import junit.framework.Assert;
import pageObjects.SummaryPage;

public class SummaryMethods extends SummaryPage {
	
	WebDriver driver;
	
	public SummaryMethods (WebDriver driver) {
		this.driver = driver;
	}
	public void summary() {
		driver.findElement(proceedbutton).click();
	}
	public void assertQty() {
		Assert.assertEquals(expectedqty, actualqty);
	}
	public void assertColor() {
		Assert.assertEquals(expectedsizecolor, actualsizecolor);
	}
	public void assertProduct() {
		Assert.assertEquals(expectedproduct, actualproduct);
	}
	public void shoppingCart() {
		//driver.findElement(shoppingcart).click();
		driver.get("http://automationpractice.com/index.php?controller=order");
	}
	
	
	
	

}
