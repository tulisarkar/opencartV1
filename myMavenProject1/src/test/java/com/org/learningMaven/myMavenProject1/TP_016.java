package com.org.learningMaven.myMavenProject1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import junit.framework.Assert;

public class TP_016 {
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
  @AfterMethod
  public void gobackhome()
  {
	  driver.findElement(By.xpath("//a[@class='navbar-brand']//img")).click();
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
  //user checks whether he can add service matchings to his settings
  @Test(priority=1)
  public void addservicematchtosettings()
  {
	 WebElement mouse=driver.findElement(By.xpath("//span[contains(text(),'Hi Jonny')]"));
	 Actions actions= new Actions(driver);
	 actions.moveToElement(mouse);
	 actions.click().build().perform();
	 
	 //user clicks on settings
	 WebElement mouse1=driver.findElement(By.xpath("//li//li[2]//a[1]"));
	 Actions action=new Actions(driver);
	 action.moveToElement(mouse1);
	 action.click().build().perform();
	 
	 //user clicks on service match
	 driver.findElement(By.xpath("//span[contains(text(),'Service Match')]")).click();
	 
	 //user enters all information related to servicematch
	 
	 driver.findElement(By.xpath("//div[@id='frequency-styler']//div[@class='jq-selectbox__trigger-arrow']")).click();
	 driver.findElement(By.xpath("//li[contains(text(),'Daily')]")).click();
	 driver.findElement(By.xpath("//span[contains(text(),'save')]")).click();
	 driver.findElement(By.xpath("//div[@id='category_id-styler']//div[@class='jq-selectbox__trigger-arrow']")).click();
	 driver.findElement(By.xpath("//li[contains(text(),'Music & Entertainment')]")).click();
	 driver.findElement(By.xpath("//span[contains(text(),'add')]")).click();
	 
	 //assertion
	 
	 String expurl="https://qatest.twoplugs.com/servicematch";
	 String acturl=driver.getCurrentUrl();
	 Assert.assertEquals(expurl, acturl);
	 
	 
  }
}
