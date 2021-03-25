package com.org.learningMaven.myMavenProject1;

import java.util.concurrent.TimeUnit;

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

public class TP_009 {
	String baseurl="https://qatest.twoplugs.com";
	WebDriver driver;
	
	@BeforeTest
	public void launchwebsite() {
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
	 //user logs in with valid username and password
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
	 //user edits his profile
	 @Test(priority=1)
	 public void editprofile()
	 {		
		 driver.findElement(By.xpath("//a[@class='edit-link']")).click();
		 driver.findElement(By.xpath("//form[@class='profileRoom']//span[@class='help'][contains(text(),'Profile')]")).click();
		 
		 //user edits the gender button
		 driver.findElement(By.xpath("//label[contains(text(),'Male')]")).click();
		 driver.findElement(By.xpath("//span[contains(text(),'SAVE CHANGES')]")).click();
		 
		 //assertion
		 WebDriverWait mywait = new WebDriverWait (driver,30);
		    WebElement a = mywait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[contains(text(),'Your profile has been updated')]")));
		   String exp="Your profile has been updated";
		   Assert.assertEquals(a.getText(), exp);
		 
	 }
}



