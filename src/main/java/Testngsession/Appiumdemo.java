package Testngsession;
import java.net.URL;
import io.appium.java_client.remote.MobileCapabilityType;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import io.github.bonigarcia.wdm.WebDriverManager;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;

public class Appiumdemo {

    private AppiumDriver driver;
   // private AppiumDriver<MobileElement> driver;
    @BeforeTest
    public void setup() throws Exception {
        // Set the desired capabilities for your mobile device and app
        DesiredCapabilities caps = new DesiredCapabilities();
        caps.setCapability("automationName", "appium");
        caps.setCapability("deviceName", "Pixel6");
        caps.setCapability("udid", "emulator-5554");
        caps.setCapability("platformName", "Android");
        caps.setCapability("platformVersion", "13");
        caps.setCapability("browserName","Chrome");
   //     caps.setCapability("chromedriverExecutableDir","C:/chrome103/chromedriver.exe");
//        caps.setCapability("appPackage", "Your_App_Package");
//        caps.setCapability("appActivity", "Your_App_Main_Activity");

        // Initialize the driver
 
        driver = new AndroidDriver (new URL("http://127.0.0.1:4723/wd/hub"), caps);
        //driver = new AndroidDriver (new URL("http://127.0.0.1:4723/wd/hub"), caps);
    }

    @Test
    public void testSubmitForm() {
    	
    	driver.get("https://www.noon.com/uae-en/");
    	
    	
        
        //driver.findElementById("field1Id").sendKeys("Value1");
       // driver.findElementById("field2Id").sendKeys("Value2");
       

        // Submit the form
        //driver.findElementById("submitButtonId").click();

        // Add assertions to verify successful submission
        // For example, assert that a success message appears
        // Assert.assertTrue(driver.findElementById("successMessageId").isDisplayed());
    }

    @AfterTest
    public void tearDown() {
        if (driver != null) {
            driver.quit();
        }
    }
}
