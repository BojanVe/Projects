package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


public class SummaryPage {
	WebDriver driver;
	public By proceedbutton = By.xpath("/html/body/div/div[2]/div/div[3]/div/p[2]/a[1]");
	public String actualqty = driver.findElement(By.xpath("//*[@id=\"summary_products_quantity\"]")).getText();
	public String expectedqty = "1 Product";
	public String actualsizecolor = driver.findElement(By.xpath("/html/body/div/div[2]/div/div[3]/div/div[2]/table/tbody/tr/td[2]/small[2]/a")).getText();
	public String expectedsizecolor = "Color : Yellow, Size : M";
	public String actualproduct= driver.findElement(By.xpath("/html/body/div/div[2]/div/div[3]/div/div[2]/table/tbody/tr/td[2]/p/a")).getText();
	public String expectedproduct = "Printed Summer Dress";
	public By shoppingcart = By.xpath("/html/body/div/div[1]/header/div[3]/div/div/div[3]/div/a/span[3]");

}