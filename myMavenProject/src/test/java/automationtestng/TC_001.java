package automationtestng;

import static org.testng.Assert.assertEquals;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.*;

public class TC_001
{
	
	String baseURL="http://newtours.demoaut.com/mercurywelcome.php";
	WebDriver driver;
	
	@BeforeTest
	public void launchwebsite() {
		
		System.setProperty("webdriver.chrome.driver", "./Drivers\\chromedriver.exe");
		driver.get(baseURL);
		driver.manage().window().maximize();
	}
	@BeforeMethod
	public  void verifytitle() {
		String expected="Welcome: Mercury Tours";
		String actual= driver.getTitle();
		Assert.assertEquals(actual, expected);
		}
	@AfterMethod
	public void gobacktohomepage()
	{
		driver.findElement(By.xpath("//a[contains(text(),'Home')]")).click();
	}
	@AfterTest
	public void closebrowser()
	{
		driver.quit();
	}
	@Test
	public void login()
	{
		driver.findElement(By.xpath("//input[@name='userName']")).sendKeys("tutorial");
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("tutorial");
		driver.findElement(By.xpath("//input[@name='login']")).click();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	}
	
		
	}
	
  

