package basePackage;

import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.remote.MobileCapabilityType;

public class PreConditionSteps extends CommonFields{
	
	public static AppiumDriver<MobileElement> driver;
	
	public void iOSSafariSetUp() throws Exception{
		
		// Set all the capabilities for iOS Platform
		DesiredCapabilities capabilities =  DesiredCapabilities.iphone();
		capabilities.setCapability(MobileCapabilityType.PLATFORM_NAME, iPlatformName);
		capabilities.setCapability(MobileCapabilityType.PLATFORM_VERSION, iPlatformVerson);
		capabilities.setCapability(MobileCapabilityType.AUTOMATION_NAME, iAutomationName);
		capabilities.setCapability(MobileCapabilityType.BROWSER_NAME, iBrowserName);
		capabilities.setCapability(MobileCapabilityType.DEVICE_NAME, iDeviceName);
		
		URL url = new URL(SAUCELABS_SERVER);	// Change the Server to APPIUM_SERVER. Please ensure to start the Server using Appium Desktop client or run appium & in the Terminal. 
		driver = new AppiumDriver<MobileElement>(url,capabilities);
		driver.get(SUT);
	}
	
	public void androidChromeSetUp() throws Exception{
		
		//Set all the capabilities for Android Platform
		
		DesiredCapabilities capabilities =  DesiredCapabilities.android();
		capabilities.setCapability(MobileCapabilityType.PLATFORM_NAME, platformName);
		capabilities.setCapability(MobileCapabilityType.PLATFORM_VERSION, platformVersion);
		capabilities.setCapability(MobileCapabilityType.AUTOMATION_NAME, automationName);
		capabilities.setCapability(MobileCapabilityType.BROWSER_NAME, browserName);
		capabilities.setCapability(MobileCapabilityType.DEVICE_NAME, deviceName);
		
		URL url = new URL(SAUCELABS_SERVER);
		driver = new AppiumDriver<MobileElement>(url,capabilities);
		driver.get(SUT);	
	}
}
