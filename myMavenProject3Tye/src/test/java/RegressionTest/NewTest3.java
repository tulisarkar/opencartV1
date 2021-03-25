package RegressionTest;

import org.testng.annotations.Test;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.*;

public class NewTest3 {
		
	public String baseUrl = "http://newtours.demoaut.com/";
	public FirefoxDriver driver;
		
  @BeforeTest
  public void launchWebsite() {
	  System.setProperty("webdriver.gecko.driver","./Drivers\\geckodriver.exe");
	  driver = new FirefoxDriver();
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
