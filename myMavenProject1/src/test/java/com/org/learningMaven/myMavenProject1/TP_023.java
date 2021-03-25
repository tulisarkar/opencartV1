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

public class TP_023 {
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
	  String exppagetitle="twoPLUGS - A plug for your Service and another for your Need";
	  String actpagetitle=driver.getTitle();
	  Assert.assertEquals(actpagetitle,exppagetitle);
  }
 @AfterMethod
 public void changetooriginalpassword()
  {
	 //user clicks in hi user by mouse action
	 WebElement mouse = driver.findElement(By.xpath("//span[contains(text(),'Hi Jonny')]"));
	 Actions actions = new Actions(driver);
		actions.moveToElement(mouse);
		 actions.click().build().perform();
		 
		 //user clicks on settings by mouse action
		WebElement mouse1= driver.findElement(By.xpath("//li//li[2]//a[1]"));
	Actions action=new Actions(driver);
	action.moveToElement(mouse1);
		action.click().build().perform();
		driver.findElement(By.xpath("//span[contains(text(),'Password')]")).click();
		
		//user enters reverts back to original password
	driver.findElement(By.xpath("//div[@id='set-tab-1']//div[1]//div[1]//div[1]//input[1]")).sendKeys("qatest2plugs12");
		driver.findElement(By.xpath("//div[@id='set-tab-1']//div[2]//div[1]//div[1]//input[1]")).sendKeys("qatest2plugs");
	driver.findElement(By.xpath("//div[@id='set-tab-1']//div[contains(@class,'form-group row')]//div[2]//div[1]//input[1]")).sendKeys("qatest2plugs");
	driver.findElement(By.xpath("//span[contains(text(),'SAVE CHANGES')]")).click();		
		
 }
  
  @AfterTest
	public void closewebsite()
	{
		driver.quit();
	}
	  @Test(priority=0)
	  public void login()
	  {
		  
		  //user logs in with valid credentilas
		  driver.findElement(By.xpath("//span[contains(text(),'LOG IN')]")).click();
		  driver.findElement(By.xpath("//input[@id='signInEmail']")).sendKeys("johny@mailinator.com");
			driver.findElement(By.xpath("//input[@id='signInPassword']")).sendKeys("qatest2plugs");
			driver.findElement(By.xpath("//span[contains(text(),'LOG IN')]")).click();
			//assertion
			String expurl="https://qatest.twoplugs.com/home";
			String acturl=driver.getCurrentUrl();
			Assert.assertEquals(acturl,expurl);
	  }
	@Test(priority=1)
	public void changepasswordthrusettings()
	{
		//user clicks on hi user with mouse action
		 WebElement mouse = driver.findElement(By.xpath("//span[contains(text(),'Hi Jonny')]"));
		 Actions actions = new Actions(driver);
		 actions.moveToElement(mouse);
		 actions.click().build().perform();
		 
		 //user clicks on settings with mouse action
		WebElement mouse1= driver.findElement(By.xpath("//li//li[2]//a[1]"));
		Actions action=new Actions(driver);
		action.moveToElement(mouse1);
		action.click().build().perform();
		
		driver.findElement(By.xpath("//span[contains(text(),'Password')]")).click();
		
		//user enters new password
		driver.findElement(By.xpath("//div[@id='set-tab-1']//div[1]//div[1]//div[1]//input[1]")).sendKeys("qatest2plugs");
		driver.findElement(By.xpath("//div[@id='set-tab-1']//div[2]//div[1]//div[1]//input[1]")).sendKeys("qatest2plugs12");
		driver.findElement(By.xpath("//div[@id='set-tab-1']//div[contains(@class,'form-group row')]//div[2]//div[1]//input[1]")).sendKeys("qatest2plugs12");
		driver.findElement(By.xpath("//span[contains(text(),'SAVE CHANGES')]")).click();		
		
		//assertion
		WebDriverWait mywait = new WebDriverWait (driver,30);
	    WebElement a = mywait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[contains(text(),'Your password has been updated')]")));
	   String exp="Your password has been updated";
	   Assert.assertEquals(a.getText(), exp);
	}
	
	
  }

