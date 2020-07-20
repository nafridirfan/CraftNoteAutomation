package testPackage;

import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import basePackage.LoginPageElements;

public class LoginTests extends LoginPageElements{
	
	/*
	 * All the setup required before running the test cases are done here. 
	 */
	
	@BeforeTest
	public void stepBeforeTest() {
		try {
			iOSSafariSetUp();	// Change this to androidChromeSetup() to test on Chrome browser on an Android device.
		}catch(Exception e){
			e.getMessage();
		}
		driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
	}
	
	/*
	 * Test case with Valid Username and Password
	 */
	
	@Test
	public void validLoginTests() throws Exception {
		driver.findElement(emailFieldAgain).sendKeys("qa-challenge@craftnote.de");
		driver.findElement(passwordFieldAgain).sendKeys("Automation@2020");
		driver.findElement(loginButton).click();
		driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
		Assert.assertTrue(driver.findElement(projectLabel).isDisplayed()); 
	}
	
	@AfterTest
	public void afterTest() {
		driver.close();
	}
}

