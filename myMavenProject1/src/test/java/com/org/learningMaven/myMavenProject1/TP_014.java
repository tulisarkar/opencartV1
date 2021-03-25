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

public class TP_014 {
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
	 	 //user logs in with valid credentials
	@Test(priority=0)
	public void login()
	{
		driver.findElement(By.xpath("//span[contains(text(),'LOG IN')]")).click();
		driver.findElement(By.xpath("//input[@id='signInEmail']")).sendKeys("johny@mailinator.com"); 
		driver.findElement(By.xpath("//input[@id='signInPassword']")).sendKeys("qatest2plugs");
		driver.findElement(By.xpath("//span[contains(text(),'LOG IN')]")).click();
	}
	//user checks whether he can transfer eeds to another user successfully
	 	@Test(priority=1)
	  public void sendeeds()
	  {
	 		//user seraches for another user to transfer eeds
		  driver.findElement(By.xpath("//input[@id='exampleInputAmount']")).sendKeys("fab");
		  driver.findElement(By.xpath("//span[@class='w-icons-search']")).click();
		  driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		  driver.findElement(By.xpath("//a[contains(text(),'Baking Classes')]")).click();
		  driver.findElement(By.xpath("//a[contains(text(),'fab')]")).click(); 
		  driver.findElement(By.xpath("//span[@class='w-icons-profileCtrl2']")).click();
		  
		  //user transfers 10 eeds to another user		  
		  driver.findElement((By.xpath("//input[@id='transferAmount']"))).sendKeys("10");
		  driver.findElement(By.xpath("//span[contains(text(),'TRANSFER')]")).click();
		  driver.findElement(By.xpath("//a[@id='btn_transfer']//span[@class='help'][contains(text(),'Transfer')]")).click();
		 
		  //assertion
		  WebDriverWait mywait = new WebDriverWait (driver,30);
		    WebElement a = mywait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[contains(text(),'Credit Transfer was successful')]")));
		   String exp="Credit Transfer was successful";
		   Assert.assertEquals(a.getText(), exp);
		 		  
			  } 
}
