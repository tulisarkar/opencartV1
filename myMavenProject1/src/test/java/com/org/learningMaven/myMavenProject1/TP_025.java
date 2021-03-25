package com.org.learningMaven.myMavenProject1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TP_025 {
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
	 
	
		 @AfterTest
			public void closewebsite() {
				driver.close();
			} 
		 @Test(priority=0)
		 public void login()
		 {	 
			 //user log in with valid credentials
			 driver.findElement(By.xpath("//span[contains(text(),'LOG IN')]")).click();
			 driver.findElement(By.xpath("//input[@id='signInEmail']")).sendKeys("johny@mailinator.com"); 
				driver.findElement(By.xpath("//input[@id='signInPassword']")).sendKeys("qatest2plugs");
				driver.findElement(By.xpath("//span[contains(text(),'LOG IN')]")).click();
	 }
		 
		 //user signs out 
 @Test(priority=1)
 public void signout()
 {
	 WebElement mouse = driver.findElement(By.xpath("//span[contains(text(),'Hi Jonny')]"));
	 Actions actions = new Actions(driver);
	 actions.moveToElement(mouse);
	 actions.click().build().perform();
	WebElement mouse1= driver.findElement(By.xpath("//li//li[3]//a[1]"));
	Actions action=new Actions(driver);
	action.moveToElement(mouse1);
	action.click().build().perform();
	
	//assertion
	String expurl="https://qatest.twoplugs.com/landing";
	String acturl=driver.getCurrentUrl();
	Assert.assertEquals(acturl, expurl);
 }
}
