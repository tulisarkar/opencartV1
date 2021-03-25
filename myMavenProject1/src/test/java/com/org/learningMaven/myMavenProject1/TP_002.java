package com.org.learningMaven.myMavenProject1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TP_002 {
	
	String baseurl = "https://qatest.twoplugs.com";
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
	public void login()
	{
		driver.findElement(By.xpath("//span[contains(text(),'LOG IN')]")).click();
		String expected="twoPLUGS - A plug for your Service and another for your Need";
		String actual= driver.getTitle();
		Assert.assertEquals(actual,expected);
	}
			
	
  @AfterTest
  public void closewebsite()
  {
	  driver.quit();
  }
  //user logs in with valid username and password
  @Test
  public void loginwithvalidcredential()
  {
	  
	  driver.findElement(By.xpath("//input[@id='signInEmail']")).sendKeys("fab@mailinator.com");
	driver.findElement(By.xpath("//input[@id='signInPassword']")).sendKeys("WinterIsComing@123");
	driver.findElement(By.xpath("//span[contains(text(),'LOG IN')]")).click();
	
	//assertion
	String expurl="https://qatest.twoplugs.com/home";
	String acturl=driver.getCurrentUrl();
	Assert.assertEquals(acturl,expurl);
  }  	 
  
}
