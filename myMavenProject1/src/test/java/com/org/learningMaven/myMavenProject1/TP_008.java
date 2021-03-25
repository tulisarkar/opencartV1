package com.org.learningMaven.myMavenProject1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TP_008 {

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
	
	 @BeforeMethod
	 public void verifypagetitle()
	 {
		 
		 String expected="twoPLUGS - A plug for your Service and another for your Need";
			String actual= driver.getTitle();
			Assert.assertEquals(actual,expected);
	 }
	 @AfterMethod
	 public void gobackhome()
	 {
		 driver.findElement(By.xpath("//a[@class='navbar-brand']//img")).click();
		 driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	 }
	 @AfterTest
		public void closewebsite() {
			driver.close();
		} 
	 //user creates a new need
	 @Test(priority=0)

	  public void createaservice()
	  {
		 //user logs in with valid credentials
		 driver.findElement(By.xpath("//span[contains(text(),'LOG IN')]")).click();
		 driver.findElement(By.xpath("//input[@id='signInEmail']")).sendKeys("johny@mailinator.com"); 
		driver.findElement(By.xpath("//input[@id='signInPassword']")).sendKeys("qatest2plugs");
		driver.findElement(By.xpath("//span[contains(text(),'LOG IN')]")).click();
		
		//user creates a new need
		 driver.findElement(By.xpath("//span[@class='w-icons-caret']")).click();
		  driver.findElement(By.xpath("//div[@class='w-dropdown dropdown-create opened']//a[contains(text(),'Need')]")).click();
		  driver.findElement(By.xpath("//input[@id='name']")).sendKeys("Baking Tutorials");
		  driver.findElement(By.xpath("//textarea[@id='description']")).sendKeys("Jonny need for baking class");
		  driver.findElement(By.xpath("//div[@id='category_id-styler']//div[@class='jq-selectbox__trigger']")).click();
		  driver.findElement(By.xpath("//li[contains(text(),'Food & Beverage')]")).click();
         driver.findElement(By.xpath("//input[@id='price']")).sendKeys("100");
         driver.findElement(By.xpath("//input[@id='videourl']")).sendKeys("https://www.youtube.com/watch?v=10pXWMHFOO0");
         driver.findElement(By.xpath("//button[contains(@class,'btn btn-success w-btn-success')]//span[contains(@class,'help')][contains(text(),'Create')]")).click();
      //assertion
         
         String exptext="100 (EEDS)";
       String acttext=driver.findElement(By.xpath("//div[contains(text(),'100')]")).getText();
       Assert.assertEquals(acttext,exptext);
     }	
	 //user updates a need
	 @Test(priority=1)
	 public void updateaneed()
	 {
		 //user clicks on Hi Jonny with mouse action
		 WebElement mouse = driver.findElement(By.xpath("//span[contains(text(),'Hi Jonny')]"));
		 Actions actions = new Actions(driver);
		 actions.moveToElement(mouse);
		 actions.click().build().perform();
		 
		 //user clicks on profile with mouse action
		WebElement mouse1= driver.findElement(By.xpath("//li//li[1]//a[1]"));
		Actions action=new Actions(driver);
		action.moveToElement(mouse1);
		action.click().build().perform();
		
		//user updates name of the need
		driver.findElement(By.xpath("//tr[1]//td[2]//ul[1]//li[1]//a[1]//span[1]")).click();
		driver.findElement(By.xpath("//input[@id='name']")).clear();
		driver.findElement(By.xpath("//input[@id='name']")).sendKeys("Baking tutorials for kids");
		driver.findElement(By.xpath("//ul[@class='line-btn pull-right']//button[@class='btn btn-success w-btn-success']")).click();
		
		//assertion
		String exptext="100 (EEDS)";
	       String acttext=driver.findElement(By.xpath("//div[contains(text(),'100')]")).getText();
	       Assert.assertEquals(acttext,exptext);	      
	 }
	 //user deletes a need
	@Test(priority=2)
	public void deleteaneed()
	{
		//user clicks on Hi Jonny  with mouse action
		WebElement mouse= driver.findElement(By.xpath("//span[contains(text(),'Hi Jonny')]"));
		Actions actions=new Actions(driver);
		actions.moveToElement(mouse);
		actions.click().build().perform();
		
		//user clicks on profile with mouse action
		WebElement mouse2= driver.findElement(By.xpath("//li//li[1]//a[1]"));
		Actions action=new Actions(driver);
		action.moveToElement(mouse2);
		action.click().build().perform();
		
		//user deletes a need
		driver.findElement(By.xpath("//tr[1]//td[2]//ul[1]//li[2]//a[1]//span[1]")).click();
		driver.findElement(By.xpath("//span[contains(text(),'I want to delete')]")).click();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
		//assertion
		String expurl="https://qatest.twoplugs.com/profile/Jonny";
		String acturl=driver.getCurrentUrl();
		Assert.assertEquals(acturl, expurl);	
	}
}
