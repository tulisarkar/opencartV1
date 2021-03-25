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

public class TP_011 {
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
	//user logs in 
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
	//user checks the functionality of "I want this" button
	@Test(priority=1)
	public void Iwantthisbutton()
	{
		//user tries to buy a service 
		driver.findElement(By.xpath("//input[@id='exampleInputAmount']")).sendKeys("baking");
		driver.findElement(By.xpath("//span[@class='w-icons-search']")).click();
		driver.findElement(By.xpath("//a[contains(text(),'Baking Classes')]")).click();
		driver.findElement(By.xpath("//span[contains(text(),'I want this')]")).click();
		driver.findElement(By.xpath("//div[@id='chk_buyer_disclaimer-styler']")).click();
		driver.findElement(By.xpath("//span[contains(text(),'Buy')]")).click();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
		//assertion
		String expurl="https://qatest.twoplugs.com/postBuy";
		String acturl=driver.getCurrentUrl();
		Assert.assertEquals(acturl, expurl);
		
	}
	
}
