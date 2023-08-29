package Testngsession;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class CrossBrowserTesting {

  WebDriver driver;
  @Parameters ( {"browserType","url"} )
  @Test(priority=1)
  
  public void testExamplePageOnMultipleBrowsers (String browserType,String url) {
    if (browserType.equalsIgnoreCase("Chrome")) {
      driver = new ChromeDriver();
    }
    
    else if (browserType.equalsIgnoreCase("Firefox")) {
    	//System.setProperty("webDriver.edge.driver","C:/msedgedriver.exe");
    	
    	
    	driver = new FirefoxDriver();
  
  }
    driver.manage().window().maximize();
    driver.get(url);
    
    }
  
  @Parameters ( {"email","password"} ) 
  @Test(priority=2)
  
  public void loginTest(String email,String password) {
	  System.out.println("email:" + email + "and password: " + password);
	  driver.findElement(By.id("dd_header_signInOrUp")).click();
	  driver.findElement(By.id("emailInput")).click();
	  driver.findElement(By.id("emailInput")).sendKeys(email);
	  driver.findElement(By.id("passwordInput")).click();
	  driver.findElement(By.id("passwordInput")).sendKeys(password);
	  driver.findElement(By.id("login-submit")).click();
	  driver.quit();
}	

}