package pageMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import pageObjects.ItemListPage;

public class ItemListMethods extends ItemListPage{

	WebDriver driver;
	public ItemListMethods(WebDriver driver) {
		this.driver=driver;		
	}
	public void printedSummerDress() {
		driver.findElement(printedsummerdress).click();
	}
	
	public void printedSummerDressHover() throws InterruptedException {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		Actions action = new Actions(driver);
		Thread.sleep(10000);
		js.executeScript("window.scrollBy(0,1300)");
		Thread.sleep(5000);
	    WebElement dresshover = driver.findElement(By.partialLinkText("Printed Summer Dress"));
	    action.moveToElement(dresshover).perform();
		Thread.sleep(2000);
		driver.findElement(By.partialLinkText("Add to cart")).click();
	}
}
