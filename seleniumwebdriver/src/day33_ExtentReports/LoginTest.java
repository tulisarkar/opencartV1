package day33_ExtentReports;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;



public class LoginTest {
	
	WebDriver driver;
	
	@BeforeClass
	void setup()
	{
		System.setProperty("webdriver.chrome.driver", "./Drivers\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("https://demo.nopcommerce.com");
		driver.manage().window().maximize();
		
	}
	
	@Test(priority=1)
	void testLogo()
	{
		try
		{
			boolean status=driver.findElement(By.xpath("//img[@alt='nopCommerce demo store']")).isDisplayed();
			Assert.assertEquals(status, true);
		}
		catch(NoSuchElementException e)
		{
		Assert.assertTrue(false);	
		}
	}
	
	@Test(priority=2)
	void testLogin()
	{
		try
		{
			driver.findElement(By.xpath("//a[normalize-space()='Log in']")).click();
			driver.findElement(By.xpath("//input[@id='Email']")).sendKeys("john@testmail.com");
			driver.findElement(By.xpath("//input[@id='Password']")).sendKeys("test@123");
			driver.findElement(By.xpath("//button[normalize-space()='Log in']")).click();
	
			boolean status=driver.findElement(By.linkText("My account")).isDisplayed();
			Assert.assertEquals(status, false);//this makes the method fail
		}
		catch(Exception e)
		{
			Assert.fail();//Assert.assertTrue(false);
		}
	}
	
	@Test(priority=3,dependsOnMethods= {"testLogin"})
	void testLogout()
	{
		driver.findElement(By.xpath("//a[normalize-space()='Log out']")).click();
		boolean status=driver.findElement(By.linkText("Register")).isDisplayed();
		Assert.assertEquals(status, true);
	}
	
	@AfterClass
	void tearDown()
	{
		driver.close();
	}

}
