package day34_PageObjectModel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class OrangeHRMTestCase {
	
	WebDriver driver;
	LogInPage lp;
	
	@BeforeClass
	void setUp()
	{
		System.setProperty("webdriver.chrome.driver", "./Drivers\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com");
		driver.manage().window().maximize();
	}
	
	@Test(priority=1)
	void displayLogo()
	{
		lp=new LogInPage(driver);
		boolean st=lp.checkLogo();
		Assert.assertEquals(st, true);
	}
	
	@Test(priority=2)
	void noOfHomepageLinks()
	{
		
		int links=lp.noOfLinks();
		Assert.assertEquals(links, 6);
	}
	
	@Test(priority=3)
	void logIn()
	{
		
		lp.setUserName("Admin");
		lp.setPassword("admin123");
		lp.submitButton();
	
		Assert.assertEquals(driver.getTitle(), "OrangeHRM");
	}
	
	@AfterClass
	void tearDown()
	{
		driver.close();
	}
	

}
