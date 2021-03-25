package com.org.learningMaven.myMavenProject1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import junit.framework.Assert;

public class TP_019 {
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
	  public void verifyhomepagetitle()
	  {
		  String exp="twoPLUGS - A plug for your Service and another for your Need";
		  String act=driver.getTitle();
		  Assert.assertEquals(act, exp);
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
	  }
	  @Test(priority=1)
		 public void changenetwork()
		 {	
		  //user navigates to edit profile page
			 driver.findElement(By.xpath("//a[@class='edit-link']")).click();
			 driver.findElement(By.xpath("//form[@class='profileRoom']//span[@class='help'][contains(text(),'Profile')]")).click();
			 driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
			 
			 //user changes network 
             driver.findElement(By.xpath("//div[@id='stateDropdown-styler']//div[@class='jq-selectbox__select']")).click();
             driver.findElement(By.xpath("//li[contains(text(),'British Colombia')]")).click();
			driver.findElement(By.xpath("//div[@id='cityDropdown-styler']//div[@class='jq-selectbox__select']")).click();
			driver.findElement(By.xpath("//li[contains(text(),'North Vancouver')]")).click();
			
			 driver.findElement(By.xpath("//span[contains(text(),'SAVE CHANGES')]")).click();
			//asertion
			 String expurl="https://qatest.twoplugs.com/profile/Jonny";
			 String acturl=driver.getCurrentUrl();
			 Assert.assertEquals(acturl,expurl);
		 }
}
