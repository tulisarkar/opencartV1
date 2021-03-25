package com.org.learningMaven.myMavenProject1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TP_018 {
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
	 
	 @Test(priority=0)

	  public void buyerbiddingforneed()
	  {
		 //Buyer logs in with valid credential
		 driver.findElement(By.xpath("//span[contains(text(),'LOG IN')]")).click();
		 driver.findElement(By.xpath("//input[@id='signInEmail']")).sendKeys("johny@mailinator.com"); 
			driver.findElement(By.xpath("//input[@id='signInPassword']")).sendKeys("qatest2plugs");
			driver.findElement(By.xpath("//span[contains(text(),'LOG IN')]")).click();
			
			//Buyer clicks on plugs to view services
			driver.findElement(By.xpath("//span[contains(text(),'Plugs')]")).click();
			driver.findElement(By.xpath("//input[@id='searchInput']")).sendKeys("dance lessons");
			driver.findElement(By.xpath("//button[@class='btn btn-filter']")).click();
			driver.findElement(By.xpath("//a[contains(text(),'dance lessons')]")).click();
			
			//Buyer buys the service
			driver.findElement(By.xpath("//span[contains(text(),'I want this')]")).click();
			driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
			driver.findElement(By.xpath("//div[@id='chk_buyer_disclaimer-styler']")).click();
			driver.findElement(By.xpath("//button[@id='btn_confirmbuyService']")).click();
			driver.findElement(By.xpath("//a[@class='btn btn-success pull-right']")).click();
			
			//assertion
			String exptext="DANCE LESSONS";
			String acttext=driver.findElement(By.xpath("//div[contains(text(),'dance lessons')]")).getText();
			Assert.assertEquals(acttext, exptext);     
      	  }
	 //Buyer signs out
	 
	 @Test(priority=1)
	 public void signoutbuyer()
	 {
		 WebElement mouse = driver.findElement(By.xpath("//span[contains(text(),'Hi Jonny')]"));
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
	 @Test(priority=2)
	  public void confirmorderbyseller()
	  {
		//seller logs in
		  driver.findElement(By.xpath("//span[contains(text(),'LOG IN')]")).click();
			driver.findElement(By.xpath("//input[@id='signInEmail']")).sendKeys("fab@mailinator.com"); 
			driver.findElement(By.xpath("//input[@id='signInPassword']")).sendKeys("WinterIsComing@123");
			driver.findElement(By.xpath("//span[contains(text(),'LOG IN')]")).click(); 
		   driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		   
		   //seller confirms the order and delivery
		   driver.findElement(By.xpath("//span[contains(text(),'Messages')]")).click();
		      
		   driver.findElement(By.xpath("//a[contains(text(),'Confirm Order')]")).click();
		 		 driver.findElement(By.xpath("//div[@id='Cagreeterm-styler']")).click();
		   driver.findElement(By.xpath("//a[@id='seller_confirm_btn']")).click();
		   driver.findElement(By.xpath("//span[contains(text(),'Inbox')]")).click();
		   driver.findElement(By.xpath("//tr[1]//td[2]//a[1]")).click();
		   driver.findElement(By.xpath("//a[@class='btn btn-success']")).click();
		   
		  //assertion 
		   WebDriverWait mywait = new WebDriverWait (driver,30);
		   String exp="Thank you for confirming the service";
	      WebElement a = mywait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[contains(text(),'Thank you for confirming the service')]"))); 
	      Assert.assertEquals(a.getText(), exp);
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
	 
@Test(priority=4)
public void refundrequestbybuyer()
{
	//buyer logs in 
	 driver.findElement(By.xpath("//span[contains(text(),'LOG IN')]")).click();
	 driver.findElement(By.xpath("//input[@id='signInEmail']")).sendKeys("johny@mailinator.com"); 
		driver.findElement(By.xpath("//input[@id='signInPassword']")).sendKeys("qatest2plugs");
		driver.findElement(By.xpath("//span[contains(text(),'LOG IN')]")).click();
		
		//Buyer requests for a refund
		 driver.findElement(By.xpath("//span[contains(text(),'Transactions')]")).click();
		 WebDriverWait mywait = new WebDriverWait (driver,30);
		 WebElement a = mywait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//tr[1]//td[7]//a[1]//i[1]"))); 
	      a.click();
	   driver.findElement(By.xpath("//span[contains(text(),'I want a refund')]")).click();
	    	      
	    	      //assertion
	      String exp="Your refund request has been sent to the Seller. Check your messages for an update.";
 WebDriverWait mywait1 = new WebDriverWait (driver,30);
 WebElement act = mywait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@id='refundmessagecontent']")));
	Assert.assertEquals(act.getText(),exp);	  
	 
}
}


