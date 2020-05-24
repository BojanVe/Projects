package pageObjects;

import org.openqa.selenium.By;

public class DetailedItemPage {

	public By quantityinc=By.xpath("/html/body/div/div[2]/div/div[3]/div/div/div/div[4]/form/div/div[2]/p[1]/a[2]");
	public By color=By.id("color_13");
	public By sizedropdown = By.id("group_1");
	public By size=By.xpath("/html/body/div/div[2]/div/div[3]/div/div/div/div[4]/form/div/div[2]/div/fieldset[1]/div/div/select/option[2]");
	public By addtocartbtn=By.name("Submit");
	public By continueshopping=By.xpath("//*[@id=\"layer_cart\"]/div[1]/div[2]/div[4]/span/span");
}
