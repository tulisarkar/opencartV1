package com.org.learningMaven.myMavenProject1;

import static org.testng.Assert.assertEquals;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import junit.framework.Assert;

public class TP_021 {
	String baseurl="https://qatest.twoplugs.com";
	  WebDriver driver;
	  
	  
	  @BeforeTest
	  public void launchwebsite()
	  {
		  System.setProperty("webdriver.chrome.driver", "./Drivers\\chromedriver.exe");
		  driver=new ChromeDriver();
		  driver.get(baseurl);
		  driver.manage().window().maximize();
	  }
	@BeforeMethod
	public void verifypagetitle()
	{
		String expected="twoPLUGS - A plug for your Service and another for your Need";
		String actual= driver.getTitle();
		Assert.assertEquals(actual,expected);
	}
	
	@AfterMethod
	public void gobacktolandingpage()
	{
		driver.navigate().back();
	}
	  
	@AfterTest
	 public void closewebsite()
	 {
		 driver.close();
	 }
	
	//user checks About footer link
	@Test(priority=0)
	public void Aboutlink()
	{
		driver.findElement(By.xpath("//div[@class='nav']//a[contains(text(),'ABOUT')]")).click();
		
		//assertion
		String expurl="https://qatest.twoplugs.com/about";
		String acturl=driver.getCurrentUrl();
		Assert.assertEquals(expurl, acturl);
		
	}
	//user checks EEDs footer link
	@Test(priority=1)
	public void EEdslink()
	{
		
		driver.findElement(By.xpath("//a[contains(text(),'EEDS')]")).click();
		
		//assertion
		String expurl="https://qatest.twoplugs.com/powerofeeds";
		String acturl=driver.getCurrentUrl();
		Assert.assertEquals(acturl,expurl);
	}
	//user checks Trust and Safety footer link
	@Test(priority=2)
	public void Trustandsafety()
	{
		
		driver.findElement(By.xpath("//a[contains(text(),'TRUST & SAFETY')]")).click();
		
		//assertion
		String exp="https://qatest.twoplugs.com/trustsafety";
		String act=driver.getCurrentUrl();
		Assert.assertEquals(act, exp);
	}
	
	//user checks FAQ footer link
	@Test(priority=3)
	public void FAQ()
	{
		
		driver.findElement(By.xpath("//div[@class='nav']//a[contains(text(),'FAQ')]")).click();
		
		//assertion
		String exp="https://qatest.twoplugs.com/helparticles/2";
		String act= driver.getCurrentUrl();
		Assert.assertEquals(act, exp);
	}
	
	//user checks HELP footer link
	@Test(priority=4)
	public void HELP()
	{
		
		driver.findElement(By.xpath("//a[contains(text(),'Help')]")).click();
		
		//assertion
		String exp="https://qatest.twoplugs.com/help";
		String act= driver.getCurrentUrl();
		Assert.assertEquals(act, exp);
	}
	
	//user checks TERMS footer link
	@Test(priority=5)
	public void TERMS()
	{
		driver.findElement(By.xpath("//a[contains(text(),'TERMS')]")).click();
		
		//assertion
		String exp="https://qatest.twoplugs.com/terms";
		String act=driver.getCurrentUrl();
		Assert.assertEquals(act, exp);
		}
	//user checks privacy footer link
	@Test(priority=6)
	public void privacy()
	{
		
		driver.findElement(By.xpath("//a[contains(text(),'PRIVACY')]")).click();
		//assertion
		String exp="https://qatest.twoplugs.com/terms#privacy";
		String act=driver.getCurrentUrl();
		Assert.assertEquals(act, exp);
		
	}
}
