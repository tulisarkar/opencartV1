package com.org.learningMaven.myMavenProject1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TP_004 {
	String baseurl="https://qatest.twoplugs.com";
	WebDriver driver;
	
	@BeforeTest
	public void launchwebsite() {
	System.setProperty("webdriver.chrome.driver", "./Drivers\\chromedriver.exe");
	driver=new ChromeDriver();
	driver.get(baseurl);
	driver.manage().window().maximize();
	}
	//user logs in with valid credentials
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
	public void closewebsite()
	{
		driver.close();
	}
	//user searches for both baking services and needs
	@Test
	public void searchforserviceandneeds()
	{
		driver.findElement(By.xpath("//span[contains(text(),'Plugs')]")).click();
		driver.findElement(By.xpath("//input[@id='searchInput']")).sendKeys("baking");
		Select select =new Select(driver.findElement(By.name("category_id")));
		select.selectByVisibleText("Food & Beverage");
		Select select1=new Select(driver.findElement(By.xpath("//div[@class='clearfix']//select")));
		select1.selectByVisibleText("20+ km");
		
		//user can view all services and needs related to baking
		driver.findElement(By.xpath("//span[contains(text(),'SEARCH')]")).click();
		
		//user clicks on service to view all services
		driver.findElement(By.xpath("//a[contains(text(),'Services')]")).click();
		
		//user clicks on need to view all needs
		driver.findElement(By.xpath("//a[contains(text(),'Needs')]")).click();
		
		//assertion
		String expurl="https://qatest.twoplugs.com/newplug?country=&state=&city=&sort=date&type=n&q=baking&category_id=9";
		String acturl= driver.getCurrentUrl();
	Assert.assertEquals(acturl, expurl);
	}
}



