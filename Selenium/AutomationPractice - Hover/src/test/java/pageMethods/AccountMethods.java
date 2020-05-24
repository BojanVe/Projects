package pageMethods;

import org.openqa.selenium.WebDriver;

import pageObjects.AccountPage;
public class AccountMethods extends AccountPage{

	WebDriver driver;
	
	public AccountMethods (WebDriver driver) {
		this.driver = driver;
		
	}
	public void LogoutButton() {
		driver.findElement(signout).click();
		
	}
	public void WomenTab() {
		driver.findElement(womentab).click();
	}
	public void SearchBar() throws Throwable {
		driver.findElement(searchbar).click();
	}
	public void SearchData() throws Throwable {
		driver.findElement(searchbar).sendKeys(searchdata);
	}
	public void SearchIcon() throws Throwable {
		driver.findElement(searchicon).click();
	}
}
