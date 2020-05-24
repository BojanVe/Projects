package pageObjects;

import org.openqa.selenium.By;

public class AccountPage {

	public By signout = By.xpath("/html/body/div/div[1]/header/div[2]/div/div/nav/div[2]/a");
	public static By womentab = By.xpath("/html/body/div/div[1]/header/div[3]/div/div/div[6]/ul/li[1]/a");
	public By searchbar = By.id("searchbox");
	public By searchicon = By.xpath("/html/body/div/div[1]/header/div[3]/div/div/div[2]/form/button");
	public String searchdata = "Blouse";
}
