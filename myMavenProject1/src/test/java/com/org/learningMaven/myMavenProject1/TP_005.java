package com.org.learningMaven.myMavenProject1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TP_005 {
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
 //user logs in with valid username and password
 @BeforeMethod
 public void login()
 {
	 driver.findElement(By.xpath("//span[contains(text(),'LOG IN')]")).click();
	 driver.findElement(By.xpath("//input[@id='signInEmail']")).sendKeys("johny@mailinator.com"); 
		driver.findElement(By.xpath("//input[@id='signInPassword']")).sendKeys("qatest2plugs");
		driver.findElement(By.xpath("//span[contains(text(),'LOG IN')]")).click();
		String expurl="https://qatest.twoplugs.com/home";
		String acturl=driver.getCurrentUrl();
		Assert.assertEquals(expurl,acturl); 
 }
 
 @AfterTest
 public void closewebsite() {
	 driver.close();
 }
  @Test
//user searches for a particular user 
  public void searchforuser()
  {
	  driver.findElement(By.xpath("//input[@id='exampleInputAmount']")).sendKeys("fab");
	  driver.findElement(By.xpath("//span[@class='w-icons-search']")).click();
	  driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	  
	  
	  //assertion
	  String expurl="https://qatest.twoplugs.com/newsearchserviceneed?tp=2&q=fab";
	  String acturl=driver.getCurrentUrl();
	  Assert.assertEquals(acturl, expurl);
  }
}
