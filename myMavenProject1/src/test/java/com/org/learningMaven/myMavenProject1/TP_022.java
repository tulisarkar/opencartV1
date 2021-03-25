package com.org.learningMaven.myMavenProject1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import junit.framework.Assert;

public class TP_022 {
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
	  //user log in with valid credentials
	@BeforeMethod
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
	
	@AfterMethod
	public void changetooriginalemail()
	{
		//user clicks hi user by mouse action
		WebElement mouse = driver.findElement(By.xpath("//span[contains(text(),'Hi Jonny')]"));
		 Actions actions = new Actions(driver);
		 actions.moveToElement(mouse);
		 actions.click().build().perform();
		 
		 //user clicks on settings by mouse action
		 WebElement mouse2=driver.findElement(By.xpath("//li//li[2]//a[1]"));
		  actions=new Actions(driver);
		 actions.moveToElement(mouse2);
		 actions.click().build().perform();
		 
		 //user reverts back to original email 
		 driver.findElement(By.xpath("//span[contains(text(),'Email')]")).click();
		 driver.findElement(By.xpath("//div[@id='set-tab-2']//div[2]//div[1]//div[1]//input[1]")).clear();
		 driver.findElement(By.xpath("//div[@id='set-tab-2']//div[2]//div[1]//div[1]//input[1]")).sendKeys("johny@mailinator.com");
		 driver.findElement(By.xpath("//div[@id='set-tab-2']//div[contains(@class,'form-group row')]//div[2]//div[1]//input[1]")).sendKeys("johny@mailinator.com");
		 driver.findElement(By.xpath("//div[@id='set-tab-2']//input[@id='signUpPassword']")).sendKeys("qatest2plugs");
	    driver.findElement(By.xpath("//span[contains(text(),'SAVE CHANGES')]")).click();
	    
	}
	  
	@AfterTest
	 public void closewebsite()
	 {
		 driver.close();
	 }
	
	@Test
	public void changeemailthroughsettings()
	{
		
		//user clicks on Hi user by mouse action
		WebElement mouse = driver.findElement(By.xpath("//span[contains(text(),'Hi Jonny')]"));
		 Actions actions = new Actions(driver);
		 actions.moveToElement(mouse);
		 actions.click().build().perform();
		 
		 //user clicks on settings by mouse action
		 WebElement mouse2=driver.findElement(By.xpath("//li//li[2]//a[1]"));
		  actions=new Actions(driver);
		 actions.moveToElement(mouse2);
		 actions.click().build().perform();
		 
		 driver.findElement(By.xpath("//span[contains(text(),'Email')]")).click();
		 
		 //user enters new email
		
		 driver.findElement(By.xpath("//div[@id='set-tab-2']//div[2]//div[1]//div[1]//input[1]")).sendKeys("johny@mailinators.com");
		driver.findElement(By.xpath("//div[@id='set-tab-2']//div[contains(@class,'form-group row')]//div[2]//div[1]//input[1]")).sendKeys("johny@mailinators.com");
		 driver.findElement(By.xpath("//div[@id='set-tab-2']//input[@id='signUpPassword']")).sendKeys("qatest2plugs");
	    driver.findElement(By.xpath("//span[contains(text(),'SAVE CHANGES')]")).click();
	    
	    //assertion
	    WebDriverWait mywait = new WebDriverWait (driver,30);
	    WebElement a = mywait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[contains(text(),'Your email has been updated')]")));
	   String exp="Your email has been updated";
	   Assert.assertEquals(a.getText(), exp);
	   
	  
	
	}
	
}
