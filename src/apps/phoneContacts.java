package apps;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.remote.MobileCapabilityType;

public class phoneContacts {
	
	public static AndroidDriver<MobileElement> driver;
	
	public static void main(String[] args) throws MalformedURLException {
		
		DesiredCapabilities caps = new DesiredCapabilities();
		
		
		//DesiredCapabilities caps = new DesiredCapabilities();
		caps.setCapability("deviceName", "My Phone");
		//caps.setCapability("udid", "ENUL6303030010"); //Give Device ID of your mobile phone
		caps.setCapability("udid", "DesiredCapabilities caps = new DesiredCapabilities()");
		
		
		//DesiredCapabilities caps = new DesiredCapabilities();
		caps.setCapability("deviceName", "My Phone");
		//caps.setCapability("udid", "ENUL6303030010"); //Give Device ID of your mobile phone
		caps.setCapability("udid", "591d55d4"); 
		caps.setCapability("platformName", "Android");
		caps.setCapability("platformVersion", "6.0.1");
		caps.setCapability("appPackage", "com.android.contacts");
		caps.setCapability("appActivity", "com.android.contacts.activities.PeopleActivity");
		caps.setCapability("automationName","appium");
		caps.setCapability(MobileCapabilityType.NEW_COMMAND_TIMEOUT, "1000");
		caps.setCapability("autoGrantPermissions","true");
		caps.setCapability("autoDismissAlerts", true);
		caps.setCapability("noReset", "true");

	    //<AndroidElement> driver = new AndroidDriver<AndroidElement>(new URL("https://"+userName+":"+accessKey+"@hub-cloud.browserstack.com/wd/hub"), caps);
		driver = new AndroidDriver<MobileElement>(new URL("http://127.0.0.1:4723/wd/hub"), caps);
		
		addContact();
	}
	
	public static void addContact(){
		
		MobileElement addSign = driver.findElement(By.id("com.android.contacts:id/first_option_menu"));
		addSign.click();
		
		MobileElement name = driver.findElement(By.xpath("//android.widget.EditText[@text='Name']"));
		name.click();
		name.sendKeys("Kartik");
		
		MobileElement phoneNumber = driver.findElement(By.xpath("//android.widget.EditText[@text='Phone number']"));
		phoneNumber.sendKeys("1234567890");
		
		MobileElement numberTypeDropdown = driver.findElement(By.xpath("//android.widget.Spinner[@index='1']"));
		numberTypeDropdown.click();
		
		MobileElement numberTypeHome = driver.findElement(By.xpath("//android.widget.CheckedTextView[@index='1']"));
		numberTypeHome.click();
		
		MobileElement saveButton = driver.findElement(By.id("com.android.contacts:id/menu_done"));
		saveButton.click();
	}

}
