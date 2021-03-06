package day31;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderDemo {
	WebDriver driver;
	@BeforeClass
	void setup()
	{
		System.setProperty("webdriver.chrome.driver", "./Drivers\\chromedriver.exe");
		driver=new ChromeDriver();
	}
	
	@Test(dataProvider="dp1")
	void test_login1(String email, String pwd, String title)
	{
		driver.get("https://demo.nopcommerce.com/login");
		driver.findElement(By.id("Email")).sendKeys(email);
		driver.findElement(By.id("Password")).sendKeys(pwd);
		driver.findElement(By.xpath("//button[normalize-space()='Log in']")).click();
		
		String exp_title=title;
		String act_title=driver.getTitle();
		
		Assert.assertEquals(exp_title, act_title);
		
	}
	
	@AfterClass
	void tearDown()
	{
		driver.close();
	}
	
	
		
	@DataProvider(name="dp1")
	Object[][] loginData1()
	{
		Object data[][]= {    {"test123@gmail.com","test123","nopCommerce demo store"},
							   {"test@gmail.com","test3","nopCommerce demo store"},
								{"t@gmail.com","t23","nopCommerce demo store"},
						};
		return data;
	}
	
	
}





