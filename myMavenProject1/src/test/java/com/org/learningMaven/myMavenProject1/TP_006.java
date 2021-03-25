package com.org.learningMaven.myMavenProject1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TP_006 {
	 String baseurl="https://qatest.twoplugs.com";
	 WebDriver driver;
	//twoplugs website is launched 
	 @BeforeTest
	 public void launchwebsite()
	 {
		 System.setProperty("webdriver.chrome.driver", "./Drivers\\chromedriver.exe");
		 driver=new ChromeDriver();
		 driver.get(baseurl);
		 driver.manage().window().maximize();
	 }
	 //pagetitle is verified
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
	@AfterMethod 
	public void gobackhome()
	{
		driver.findElement(By.xpath("//a[@class='navbar-brand']//img")).click();
	}
	 
	 //user tests functionality of follow icon
	 @Test(priority=0)

	  public void follow()
	  
	  {
		 //user log in with valid credentials
		  driver.findElement(By.xpath("//span[contains(text(),'LOG IN')]")).click();
		driver.findElement(By.xpath("//input[@id='signInEmail']")).sendKeys("johny@mailinator.com"); 
		driver.findElement(By.xpath("//input[@id='signInPassword']")).sendKeys("qatest2plugs");
		driver.findElement(By.xpath("//span[contains(text(),'LOG IN')]")).click();	
		
		//user searches for another user
		
		driver.findElement(By.xpath("//input[@id='exampleInputAmount']")).sendKeys("fab");
		  driver.findElement(By.xpath("//span[@class='w-icons-search']")).click();
		  driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		  driver.findElement(By.xpath("//a[contains(text(),'Baking Classes')]")).click();
		  driver.findElement(By.xpath("//a[contains(text(),'fab')]")).click();
		  driver.findElement(By.xpath("//span[@class='w-icons-profileCtrl1']")).click();
		  driver.findElement(By.xpath("//span[contains(text(),'Confirm')]")).click();
		 
		  //assertion
		   String expurl="https://qatest.twoplugs.com/profile/fab#";
		  String acturl=driver.getCurrentUrl();
		  Assert.assertEquals(acturl, expurl);
		}
	 //user tests whether eeds can be transferred to other user
	  @Test(priority=1)
	  public void sendeeds()
	  {
		  driver.findElement(By.xpath("//input[@id='exampleInputAmount']")).sendKeys("fab");
		  driver.findElement(By.xpath("//span[@class='w-icons-search']")).click();
		  driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		  driver.findElement(By.xpath("//a[contains(text(),'Baking Classes')]")).click();
		  driver.findElement(By.xpath("//a[contains(text(),'fab')]")).click(); 
		  driver.findElement(By.xpath("//span[@class='w-icons-profileCtrl2']")).click();
		  driver.findElement((By.xpath("//input[@id='transferAmount']"))).sendKeys("10");
		  driver.findElement(By.xpath("//span[contains(text(),'TRANSFER')]")).click();
		  driver.findElement(By.xpath("//a[@id='btn_transfer']//span[@class='help'][contains(text(),'Transfer')]")).click();
		 
		  //assertion
		   String expurl="https://qatest.twoplugs.com/profile/fab";
		  String acturl=driver.getCurrentUrl();
		  Assert.assertEquals(acturl, expurl);
	  }
	  //user tests whether message can be sent to other user
	  @Test(priority=2)
	  public void sendmessage()
	  {
		  driver.findElement(By.xpath("//input[@id='exampleInputAmount']")).sendKeys("fab");
		  driver.findElement(By.xpath("//span[@class='w-icons-search']")).click();
		  driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		  driver.findElement(By.xpath("//a[contains(text(),'Baking Classes')]")).click();
		  driver.findElement(By.xpath("//a[contains(text(),'fab')]")).click(); 
		  	  
		  driver.findElement(By.xpath("//span[@class='w-icons-profileCtrl3']")).click();
		  driver.findElement(By.xpath("//div[@id='chkSendtoadmin-styler']")).click();
		  driver.findElement(By.xpath("//input[@id='messagetitle']")).sendKeys("I want Service");
		  driver.findElement(By.xpath("//textarea[@id='messagecontent']")).sendKeys("I want Gardening Service");
		  driver.findElement(By.xpath("//span[@class='help'][contains(text(),'Send')]")).click();
		  
		  //assertion
		  String expurl="https://qatest.twoplugs.com/profile/fab#";
		  String acturl=driver.getCurrentUrl();
		  Assert.assertEquals(acturl, expurl);
	  }
	  //user tests functionality of report user icon
	  @Test(priority=3)
	  public void reportuser()
	  {
		  driver.findElement(By.xpath("//input[@id='exampleInputAmount']")).sendKeys("fab");
		  driver.findElement(By.xpath("//span[@class='w-icons-search']")).click();
		  driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		  driver.findElement(By.xpath("//a[contains(text(),'Baking Classes')]")).click();
		  driver.findElement(By.xpath("//a[contains(text(),'fab')]")).click(); 
		  driver.findElement(By.xpath("//span[@class='w-icons-profileCtrl4']")).click();
		  driver.findElement(By.xpath("//input[@id='reportSubject']")).sendKeys("Low Quality of products");
		  driver.findElement(By.xpath("//textarea[contains(@placeholder,'Content')]")).sendKeys("Not satisfied with the service");
		  driver.findElement(By.xpath("//span[contains(text(),'Submit report')]")).click();
		  driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		  
		  //assertion
		  String expurl="https://qatest.twoplugs.com/profile/fab";
		  String acturl=driver.getCurrentUrl();
		  Assert.assertEquals(acturl, expurl);
	  }
}

