package com.org.learningMaven.myMavenProject1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TP_001 {
	
	String baseurl="https://qatest.twoplugs.com";
	WebDriver driver;
	
	//launch the website
	
	@BeforeTest
	public void launchwebsite() {
	System.setProperty("webdriver.chrome.driver", "./Drivers\\chromedriver.exe");
	driver=new ChromeDriver();
	driver.get(baseurl);
	driver.manage().window().maximize();
	}
	
	//user clicks on sign up page
	@BeforeMethod
	public void signup() {
		driver.findElement(By.xpath("//ul[@class='control-bar']//span[@class='help'][contains(text(),'Join Now For Free')]")).click();
		String expected="twoPLUGS - A plug for your Service and another for your Need";
		String actual= driver.getTitle();
		Assert.assertEquals(actual,expected);
		
	}
				
	@AfterTest
	public void closewebsite()
	{
		driver.quit();
		
		}
	
	//user tries to signup with invalid credentials
	@Test
	public void invalidcredentials() 
	{
		driver.findElement(By.xpath("//input[@id='signUpUser']")).sendKeys("z");
		driver.findElement(By.xpath("//input[@id='signUpEmail']")).sendKeys("z@123");
		driver.findElement(By.xpath("//input[@id='signUpPassword']")).sendKeys("ztest");
		driver.findElement(By.xpath("//span[contains(text(),'SIGN UP')]")).click();
		
		//assertion
		String expectedurl="https://qatest.twoplugs.com/signup";
		String actualurl= driver.getCurrentUrl();
		Assert.assertEquals(actualurl,expectedurl);
		
	 }
}
