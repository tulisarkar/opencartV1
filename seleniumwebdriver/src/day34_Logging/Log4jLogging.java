package day34_Logging;

import java.util.concurrent.TimeUnit;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;



public class Log4jLogging {
	
WebDriver driver;
Logger logger;
	
	@BeforeClass
	void setup()
	{
		logger=LogManager.getLogger("Log4jLogging");
		
		System.setProperty("webdriver.chrome.driver", "./Drivers\\chromedriver.exe");
		driver=new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		logger.info("Chrome Browser got launched");
	
		driver.get("https://demo.opencart.com/");
		logger.info("opencart Application got opened");
		
		driver.manage().window().maximize();
		logger.info("Browser got maximized");
	}
	
	@Test
	public void testRegistration() {
			
		driver.findElement(By.xpath("//span[normalize-space()='My Account']")).click();
		
		driver.findElement(By.linkText("Register")).click();
		logger.info("Register link got clicked");
				
		driver.findElement(By.id("input-firstname")).sendKeys("JOHN");//Firstname
		logger.info("Provided First Name");
		
		driver.findElement(By.id("input-lastname")).sendKeys("CANEDY"); //Lastname
		logger.info("Provided Last Name");
		
		driver.findElement(By.id("input-email")).sendKeys("asdfgk6543@gmail.com"); //Email
		logger.info("Provided Email");
		
		driver.findElement(By.id("input-telephone")).sendKeys("123456789"); //Telephone
		logger.info("Provided Telephone");
		
		driver.findElement(By.id("input-password")).sendKeys("test123"); //Password
		logger.info("Provided Password");
				
		driver.findElement(By.id("input-confirm")).sendKeys("test123"); //confirm Password
		logger.info("Provided Confirm Password");
		
		driver.findElement(By.xpath("//input[@name='agree']")).click(); //privacy policy
		logger.info("Agreed privacy policy");
		logger.debug("Capturing API calls");
		
		
		driver.findElement(By.xpath("//input[@value='Continue']")).click(); //Continue button
		logger.info("Continue link got clicked");
		
				
		String confmsg=driver.findElement(By.xpath("//div[@id='content']//h1")).getText();
		logger.info("Confirmation message captured");
		
		if(confmsg.equals("Your Account Has Been Created!")) {
			
			logger.info("Success: User Registered");
			Assert.assertTrue(true);
			
		}
		else 
		{
			logger.error("Error: User Not Registered");
			Assert.assertTrue(false);
		}
		
		
	}
	
	@AfterClass
	void tearDown()
	{
		driver.close();
		logger.info("Chrome Browser got Closed");
	}
}





