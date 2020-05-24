package pageObjects;

import org.openqa.selenium.By;

public class SignInObjects {
	
	
	public static By email=By.id("email");
	public static String emailValue="napostolovska@yahoo.com";
	public static By password=By.xpath("//*[@id=\"passwd\"]");
	public static String passwordValue="RobotTest1";
	public static By signIn=By.id("SubmitLogin");	
	
}
