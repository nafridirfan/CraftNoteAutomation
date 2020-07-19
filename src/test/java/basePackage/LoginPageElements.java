package basePackage;

import org.openqa.selenium.By;

public class LoginPageElements extends PreConditionSteps{
	
	public static By emailField = By.id("mat-input-0");
	public static By emailFieldAgain = By.xpath("//input[@name='email']");
	public static By passwordField = By.id("mat-input-1");
	public static By passwordFieldAgain = By.xpath("//input[@name='password']");
	public static By loginButton = By.xpath("//button[contains(text(), 'Login')]");

	public static By projectLabel = By.xpath("//span[contains(text(), 'Projects')]");
}
