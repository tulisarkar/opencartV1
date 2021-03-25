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
		driver.get("https://opensource-demo.orangehrmlive.com/");
		driver.manage().window().maximize();
	}
	
	@Test(priority=1)
	void test_logo()
	{
		//creating object of LoginPage class
		lp=new LogInPage(driver);
		boolean st=lp.logoDisplay();
		Assert.assertEquals(st, true);
	}
	
	@Test(priority=2)
	void test_noOfLinks()
	{
		int homePagelinks=lp.noOfLinksInHomePage();
		Assert.assertEquals(homePagelinks,6);
	}
	
	@Test(priority=3)
	void test_logIn()
	{
		lp.setupUserName("Admin");
		lp.setupPassword("admin123");
		lp.clickLogInButton();
		Assert.assertEquals(driver.getTitle(), "OrangeHRM");
	}
	
	@AfterClass
	void tearDown()
	{
		driver.close();
	}

}
