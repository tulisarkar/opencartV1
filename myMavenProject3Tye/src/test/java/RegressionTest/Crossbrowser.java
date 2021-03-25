package RegressionTest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Crossbrowser {
	
	public String baseUrl = "http://newtours.demoaut.com/";
	public WebDriver driver;
	
@BeforeTest
@Parameters("browser")
public void launchWebsite(String browser) {
	if (browser.equals("chrome")) {
		System.setProperty("webdriver.chrome.driver","./Drivers\\chromedriver.exe");
		driver = new ChromeDriver();
	}
	else if (browser.equals("firefox")) {
		 System.setProperty("webdriver.gecko.driver","./Drivers\\geckodriver.exe");
		 driver = new FirefoxDriver();
	}
    driver.get(baseUrl);
}

@BeforeMethod
public void verifyHomepageTitle() {
    String expected = "Welcome: Mercury Tours";
    String actual = driver.getTitle();
    Assert.assertEquals(actual, expected);
    
}
@AfterMethod
public void gobackHome() {
   driver.findElement(By.xpath("//a[contains(.,'Home')]")).click();
}

@AfterTest
public void closeWebsite() {
    driver.quit();
}

@Test(priority=1)
public void bookTicket() {
  System.out.println("This is the book a ticket method");
  
}
@Test(priority=0)
public void login() {
  driver.findElement(By.xpath("//input[@name='userName']")).sendKeys("tutorial");
  driver.findElement(By.xpath("//input[@name='password']")).sendKeys("tutorial");
  driver.findElement(By.xpath("//input[@alt='Sign-In']")).click();
}
}

