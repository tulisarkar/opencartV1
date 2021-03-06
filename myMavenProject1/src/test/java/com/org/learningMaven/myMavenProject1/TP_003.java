package com.org.learningMaven.myMavenProject1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TP_003 {
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
 public void login()
 {
	 driver.findElement(By.xpath("//span[contains(text(),'LOG IN')]")).click();
	 String exptitle="twoPLUGS - A plug for your Service and another for your Need";
	 String acttitle = driver.getTitle();
	 Assert.assertEquals(acttitle,exptitle);
 }
 @AfterTest
 public void closewebsite()
 {
	 driver.close();
 }
 //user tries to login with invalid username and password
 @Test
 public void loginwithinvalidcredentials()
 {
	driver.findElement(By.xpath("//input[@id='signInEmail']")).sendKeys("johny@mailinators.com"); 
	driver.findElement(By.xpath("//input[@id='signInPassword']")).sendKeys("qatest2plu");
	driver.findElement(By.xpath("//span[contains(text(),'LOG IN')]")).click();
	String expurl="https://qatest.twoplugs.com/login";
	
	//assertions
	String acturl=driver.getCurrentUrl();
	Assert.assertEquals(expurl,acturl);
 }
}






