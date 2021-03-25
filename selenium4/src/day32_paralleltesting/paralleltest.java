package day32_paralleltesting;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class paralleltest {
	WebDriver driver;
	
	@BeforeClass
	@Parameters({"browser", "app"})
	
	void setup(String br,String url)
	{
		if(br.equals("chrome"))
		{
		System.setProperty("webdriver.chrome.driver","./Drivers\\chromedriver.exe");
		driver=new ChromeDriver();
		}
		else if(br.equals("edge"))
		{
			System.setProperty("webdriver.edge.driver","./Drivers\\msedgedriver.exe");
			driver=new EdgeDriver();	
		}
		else if(br.equals("firefox"))
		{
			System.setProperty("webdriver.gecko.driver","./Drivers\\geckodriver.exe");
			driver=new FirefoxDriver();	
		}
		driver.get(url);
	}
	
	@Test(priority=1)
	void testlogo()
	{
		boolean status=driver.findElement(By.xpath("//div[@id='divLogo']//img")).isDisplayed();
		Assert.assertEquals(status, true,"logo not displayed");
	}
	
	@Test(priority=2)
	void testTitle()
	{
		String act_title=driver.getTitle();
		String exp_title="OrangeHRM";
		Assert.assertEquals(act_title, exp_title,"title not matching");
	}
	 @AfterClass
	 void tearDown()
	 {
		 driver.close();
	 }
	 }
	


