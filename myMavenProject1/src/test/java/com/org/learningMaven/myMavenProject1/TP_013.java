package com.org.learningMaven.myMavenProject1;

import static org.testng.Assert.assertEquals;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TP_013 {
	String baseurl="https://qatest.twoplugs.com";
	WebDriver driver;
	@BeforeTest
	public void launchbrowser()
	{
	System.setProperty("webdriver.chrome.driver", "./Drivers\\chromedriver.exe");
	driver=new ChromeDriver();
	driver.get(baseurl);
	driver.manage().window().maximize();
	}
	@BeforeMethod
	public void verifyhomepagetitle()
	{
		 String expected="twoPLUGS - A plug for your Service and another for your Need";
			String actual= driver.getTitle();
			Assert.assertEquals(actual,expected);
	}
	
	@AfterMethod
	public void gobackhome()
	{
		driver.findElement(By.xpath("//a[@class='navbar-brand']//img")).click();
		 driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	 }
	@AfterTest
	public void closewebsite()
	{
	driver.close();
	}
	//user logs in with valid credentials
	@Test(priority=0)
	public void login()
	{
		driver.findElement(By.xpath("//span[contains(text(),'LOG IN')]")).click();
		 driver.findElement(By.xpath("//input[@id='signInEmail']")).sendKeys("johny@mailinator.com"); 
		driver.findElement(By.xpath("//input[@id='signInPassword']")).sendKeys("qatest2plugs");
		driver.findElement(By.xpath("//span[contains(text(),'LOG IN')]")).click(); 
		String expected="twoPLUGS - A plug for your Service and another for your Need";
		String actual= driver.getTitle();
		Assert.assertEquals(actual,expected);
	}
	//user checks the functionality of "I can do this" button
	@Test(priority=1)
	public void bidforneed()
	{
		//user bids for a need
		driver.findElement(By.xpath("//input[@id='exampleInputAmount']")).sendKeys("piano classes");
		driver.findElement(By.xpath("//span[@class='w-icons-search']")).click();
		driver.findElement(By.xpath("//a[contains(text(),'piano classes')]")).click();
		
		//user clicks on "I can do this button"
		driver.findElement(By.xpath("//span[contains(text(),'I can do this')]")).click();
		driver.findElement(By.xpath("//input[@id='price']")).sendKeys("50");
		driver.findElement(By.xpath("//div[@id='agreeterm-styler']")).click();
		driver.findElement(By.xpath("//span[contains(text(),'send')]")).click();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
		//assertion
		String exp="Bidding a Need";
		String act=driver.findElement(By.xpath("//label[contains(text(),'Bidding a Need')]")).getText();
		Assert.assertEquals(act, exp);
	}
}
