package com.org.learningMaven.myMavenProject1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TP_015 {
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
	 //user clicks on login button
	 @BeforeMethod
	 public void loginpage()
	 {
		 driver.findElement(By.xpath("//span[contains(text(),'LOG IN')]")).click();
		 String expected="twoPLUGS - A plug for your Service and another for your Need";
			String actual= driver.getTitle();
			Assert.assertEquals(actual,expected);
	 }
	 
	 @AfterMethod
	 public void gobacktolandingpage()
	 {
		 driver.findElement(By.xpath("//a[@class='navbar-brand']//img")).click();
	 }
	 	 @AfterTest
	public void closewebsite() {
		driver.close();
	}
	 	 //user checks whether he can reset his password thru settings
	 	 @Test
	 	 public void forgotpassword()
	 	 {
	 		 driver.findElement(By.xpath("//a[contains(text(),'FORGOT YOUR PASSWORD?')]")).click();
	 		 driver.findElement(By.xpath("//input[@placeholder='Enter your email address']")).sendKeys("johny@mailinator.com");
	 		 driver.findElement(By.xpath("//span[contains(text(),'reset')]")).click();
	 		 
	 		 //assertion
	 		 String expalert="Check your email for instructions on how to reset your password";
	 		WebDriverWait mywait = new WebDriverWait (driver,30);
	 		WebElement a = mywait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[contains(text(),'Check your email for instructions on how to reset')]")));
	 		Assert.assertEquals(a.getText(), expalert);
	 		 
	 	 }
}
