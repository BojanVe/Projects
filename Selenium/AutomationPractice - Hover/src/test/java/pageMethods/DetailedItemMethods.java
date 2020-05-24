package pageMethods;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;

import pageObjects.DetailedItemPage;
public class DetailedItemMethods extends DetailedItemPage {

	WebDriver driver;

	public DetailedItemMethods (WebDriver driver) {
		this.driver=driver;
	}

	
	public void continueShopping( ) {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		
		driver.findElement(continueshopping).click();
		js.executeScript("window.scrollBy(0,-1300)");
		
	}
}