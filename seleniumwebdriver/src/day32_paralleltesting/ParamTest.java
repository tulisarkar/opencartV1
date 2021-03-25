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

public class ParamTest {
	
	WebDriver driver;
	
	@BeforeClass
	@Parameters({"browser","app"})
	void setup(String br,String url)
	{
		if(br.equals("chrome"))
		{
		System.setProperty("webdriver.chrome.driver", "./Drivers\\chromedriver.exe");
		driver=new ChromeDriver();
	}
	
	else if(br.equals("edge"))
	{
		System.setProperty("webdriver.edge.driver", "./Drivers\\msedgedriver.exe");
		driver=new EdgeDriver();
	}
	
	else if(br.equals("firefox"))
	{
		System.setProperty("webdriver.gecko.driver", "./Drivers\\geckodriver.exe");
		driver=new FirefoxDriver();
		
	}
		driver.get(url);
	}
	
	@Test(priority=1)
	void testLogo()
	{
	boolean logo=driver.findElement(By.xpath("//div[@id='divLogo']//img")).isDisplayed();
	Assert.assertEquals(logo, true,"logo is not displayed");
	}
	
	@Test(priority=2)
	void testTitle()
	{
	String exp_title="OrangeHRM";
	String act_title=driver.getTitle();
	Assert.assertEquals(act_title,exp_title,"Titles are not matching");
	}
	
	@AfterClass
	void tearDown()
	{
		driver.close();
	}
	}


