package com.org.learningMaven.myMavenProject1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TP_024 {
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
		public void gobackhome()
		{
			driver.findElement(By.xpath("//a[@class='navbar-brand']//img")).click();
			 driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		 }
			 @AfterTest
			public void closewebsite() {
				driver.close();
			} 
			 //user logs in with username and password
			 @Test(priority=0)
			 public void login()
			 {	 
				 driver.findElement(By.xpath("//span[contains(text(),'LOG IN')]")).click();
				 driver.findElement(By.xpath("//input[@id='signInEmail']")).sendKeys("johny@mailinator.com"); 
					driver.findElement(By.xpath("//input[@id='signInPassword']")).sendKeys("qatest2plugs");
					driver.findElement(By.xpath("//span[contains(text(),'LOG IN')]")).click();
		 }
			 @Test(priority=1)
			 public void referafriend()
			 {
				 //user clicks on hi user by mouseaction
				 WebElement mouse = driver.findElement(By.xpath("//span[contains(text(),'Hi Jonny')]"));
				 Actions actions = new Actions(driver);
				 actions.moveToElement(mouse);
				 actions.click().build().perform();
				 
				 //user clicks on settings by mouse action
				WebElement mouse1= driver.findElement(By.xpath("//li//li[2]//a[1]"));
				Actions action=new Actions(driver);
				action.moveToElement(mouse1);
				action.click().build().perform();
				
				//user checks whether a friend can be refered to
				driver.findElement(By.xpath("//span[contains(text(),'Refer a Friend')]")).click();
				driver.findElement(By.xpath("//input[@id='email_input']")).sendKeys("tuli.sarkar2008@gmail.com");
				driver.findElement(By.xpath("//button[@class='btn btn-success w-btn-success email_btn']")).click();
				
				//assertion
				String exptext="Referral emails has been sent out";
				String acttext=driver.findElement(By.xpath("//div[contains(text(),'Referral emails has been sent out')]")).getText();
				Assert.assertEquals(exptext,acttext);
			 }
}


