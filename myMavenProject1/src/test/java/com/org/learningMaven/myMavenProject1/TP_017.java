package com.org.learningMaven.myMavenProject1;

import java.util.concurrent.TimeUnit;

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

public class TP_017 {
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
	//buyer bids for a need
	  
	  @Test(priority=0)

	  public void buyerbiddingforservice()
	  {
		  //buyer logs in with valid credentials
		  
		 driver.findElement(By.xpath("//span[contains(text(),'LOG IN')]")).click();
		 driver.findElement(By.xpath("//input[@id='signInEmail']")).sendKeys("johny@mailinator.com"); 
			driver.findElement(By.xpath("//input[@id='signInPassword']")).sendKeys("qatest2plugs");
			driver.findElement(By.xpath("//span[contains(text(),'LOG IN')]")).click();
			
			//buyer searches for service 
			driver.findElement(By.xpath("//span[contains(text(),'Plugs')]")).click();
			driver.findElement(By.xpath("//a[contains(text(),'dance lessons')]")).click();
			
			//buyer buys a service
			driver.findElement(By.xpath("//span[contains(text(),'I want this')]")).click();
			driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
			driver.findElement(By.xpath("//div[@id='chk_buyer_disclaimer-styler']")).click();
			driver.findElement(By.xpath("//button[@id='btn_confirmbuyService']")).click();
			driver.findElement(By.xpath("//a[@class='btn btn-success pull-right']")).click();
			
			//assertion
			String expurl="DANCE LESSONS";
			String acturl=driver.findElement(By.xpath("//div[contains(text(),'dance lessons')]")).getText();
			Assert.assertEquals(acturl, expurl);     
      	  }
	  //buyer signs out
	 @Test(priority=1)
	 public void signoutbuyer()
	 {
		 WebElement mouse = driver.findElement(By.xpath("//span[contains(text(),'Hi Jonny')]"));
		 Actions actions = new Actions(driver);
		 actions.moveToElement(mouse);
		 actions.click().build().perform();
		 
		 //buyer clicks on signout
		WebElement mouse1= driver.findElement(By.xpath("//li//li[3]//a[1]"));
		Actions action=new Actions(driver);
		action.moveToElement(mouse1);
		action.click().build().perform();
		
		//assertion
		String expurl="https://qatest.twoplugs.com/landing";
		String acturl=driver.getCurrentUrl();
		Assert.assertEquals(acturl, expurl);
	 	  }
	 @Test(priority=2)
	  public void confirmorderbyseller()
	  {
		 //seller logs in 
		  driver.findElement(By.xpath("//span[contains(text(),'LOG IN')]")).click();
			driver.findElement(By.xpath("//input[@id='signInEmail']")).sendKeys("fab@mailinator.com"); 
			driver.findElement(By.xpath("//input[@id='signInPassword']")).sendKeys("WinterIsComing@123");
			driver.findElement(By.xpath("//span[contains(text(),'LOG IN')]")).click(); 
		   driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		   
		   //seller checks messages
		   
		   driver.findElement(By.xpath("//span[contains(text(),'Messages')]")).click();
		   
		   //seller clicks on confirm order and confirm delivery
		 driver.findElement(By.xpath("//a[contains(text(),'Confirm Order')]")).click();
		  driver.findElement(By.xpath("//div[@id='Cagreeterm-styler']")).click();
		   driver.findElement(By.xpath("//a[@id='seller_confirm_btn']")).click();
		   driver.findElement(By.xpath("//span[contains(text(),'Inbox')]")).click();
		   driver.findElement(By.xpath("//tr[1]//td[2]//a[1]")).click();
		   driver.findElement(By.xpath("//a[@class='btn btn-success']")).click();
   
	 }
	 //seller signs out
	 @Test(priority=3)
	 public void signoutseller()
	 {
		 WebElement mouse = driver.findElement(By.xpath("//span[contains(text(),'Hi fab')]"));
		 Actions actions = new Actions(driver);
		 actions.moveToElement(mouse);
		 actions.click().build().perform();
		 
		WebElement mouse1= driver.findElement(By.xpath("//li//li[3]//a[1]"));
		Actions action=new Actions(driver);
		action.moveToElement(mouse1);
		action.click().build().perform();
		//assertion
		String expurl="https://qatest.twoplugs.com/landing";
		String acturl=driver.getCurrentUrl();
		Assert.assertEquals(acturl, expurl); 
  }
	 //buyer files a complaint for the service bought
	 	  @Test(priority=6)
	  public void fileacomplaint()
	  {
	 		  //buyer log in 
		  driver.findElement(By.xpath("//span[contains(text(),'LOG IN')]")).click();
			 driver.findElement(By.xpath("//input[@id='signInEmail']")).sendKeys("johny@mailinator.com"); 
				driver.findElement(By.xpath("//input[@id='signInPassword']")).sendKeys("qatest2plugs");
				driver.findElement(By.xpath("//span[contains(text(),'LOG IN')]")).click();
				
				//buyer checks transactions
				 driver.findElement(By.xpath("//span[contains(text(),'Transactions')]")).click();
				 
				 //buyer clicks on file a complaint
				 
				 WebElement mouse = driver.findElement(By.xpath("//tr[1]//td[7]//a[2]//i[1]"));
				 Actions actions = new Actions(driver);
				 actions.moveToElement(mouse);
				 actions.click().build().perform();
				
				driver.findElement(By.xpath("//input[@id='reportSubject']")).sendKeys("Not Satisfied");
				driver.findElement(By.xpath("//form[@id='compliantform']//div//div//textarea")).sendKeys("Not happy with the Service");
				driver.findElement(By.xpath("//form[@id='compliantform']//div//ul//li//button//span")).click();
			
				//assertion
			  WebDriverWait mywait1 = new WebDriverWait (driver,30);
			   String exp="Your complaint has been submitted. You will be contacted after it has been reviewed";
		      WebElement a1 = mywait1.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[contains(text(),'Your complaint has been submitted. You will be con')]")));
		      a1.getText();
		      Assert.assertEquals(a1.getText(), exp);
				  
	  }
}
