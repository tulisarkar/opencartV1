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

public class TP_007 {
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
	 //user verifies whether he is on the correct page
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
	 }
	 
	 @AfterTest
	public void closewebsite() {
		driver.close();
	} 
	 //user creates a new service
	 @Test(priority=0)

	  public void createaservice()
	  {
		 //user logs in 
		 driver.findElement(By.xpath("//span[contains(text(),'LOG IN')]")).click();
		 driver.findElement(By.xpath("//input[@id='signInEmail']")).sendKeys("johny@mailinator.com"); 
			driver.findElement(By.xpath("//input[@id='signInPassword']")).sendKeys("qatest2plugs");
			driver.findElement(By.xpath("//span[contains(text(),'LOG IN')]")).click();
			
			//user creates new service
		 driver.findElement(By.xpath("//span[@class='w-icons-caret']")).click();
		  driver.findElement(By.xpath("//a[contains(text(),'Service')]")).click();
		  driver.findElement(By.xpath("//input[@id='name']")).sendKeys("Piano Classes");
		  driver.findElement(By.xpath("//textarea[@id='description']")).sendKeys("Professional tutors and affordable classes");
		  driver.findElement(By.xpath("//div[@id='category_id-styler']//div[contains(@class,'jq-selectbox__trigger-arrow')]")).click();
		  driver.findElement(By.xpath("//li[contains(text(),'Music & Entertainment')]")).click();
          driver.findElement(By.xpath("//input[@id='price']")).sendKeys("50");
          driver.findElement(By.xpath("//div[@id='slider-range-max3']")).click();
          driver.findElement(By.xpath("//input[@id='refund_valid']")).sendKeys("30");
          driver.findElement(By.xpath("//input[@id='videourl']")).sendKeys("https://www.youtube.com/watch?v=827jmswqnEA");
          driver.findElement(By.xpath("//div[contains(@class,'jq-checkbox checked')]")).click();
          driver.findElement(By.xpath("//button[contains(@class,'btn btn-success w-btn-success')]//span[contains(@class,'help')][contains(text(),'Create')]")).click();
       
          //assertion
          
          String exptext="PIANO CLASSES";
        String acttext=driver.findElement(By.xpath("//div[contains(text(),'Piano Classes')]")).getText();
        Assert.assertEquals(acttext,exptext);
      
	  }
	 //user updates the service that is created
	 @Test(priority=1)
	 public void updateaservice()
	 {
		
		WebElement mouse = driver.findElement(By.xpath("//span[contains(text(),'Hi Jonny')]"));
		 Actions actions = new Actions(driver);
		 actions.moveToElement(mouse);
		 actions.click().build().perform();
		 		 
		 WebElement mouse2=driver.findElement(By.xpath("//li//li[1]//a[1]"));
		  actions=new Actions(driver);
		 actions.moveToElement(mouse2);
		 actions.click().build().perform();
		 driver.findElement(By.xpath("//tr[9]//td[4]//ul[1]//li[1]//a[1]//span[1]")).click();
		 driver.findElement(By.xpath("//input[@id='price']")).clear();
		 driver.findElement(By.xpath("//input[@id='price']")).sendKeys("25");
		 driver.findElement(By.xpath("//body/div[@class='wrapper']/div[@class='container']/form[@class='signIn profileRoom addServiceForm']/div[@class='group']/div[@class='form-group clearfix']/div[@class='form-controls pull-right text-right']/ul[@class='check-list']/li[1]/span[1]/label[1]/div[1]")).click();
		 driver.findElement(By.xpath("//ul[@class='line-btn pull-right']//button[@class='btn btn-success w-btn-success']")).click();
		 
		 //assertion
		 String exptext="25 (EEDS)";
		 String acttext=driver.findElement(By.xpath("//div[contains(text(),'25')]")).getText();
		 Assert.assertEquals(acttext, exptext);
	 }
	 //user deletes a particular service
	@Test(priority=2)
	public void deleteservice()
	{
		//user clicks on Hi Jonny with mouse action
		WebElement mouse= driver.findElement(By.xpath("//span[contains(text(),'Hi Jonny')]"));
		Actions actions=new Actions(driver);
		actions.moveToElement(mouse);
		actions.click().build().perform();
		
		//user clicks on profile with mouse action
		WebElement mouse1= driver.findElement(By.xpath("//span[contains(text(),'Profile')]"));
		Actions action= new Actions(driver);
		action.moveToElement(mouse1);
		action.click().build().perform();
		
		//user deletes teh service
		driver.findElement(By.xpath("//tr[1]//td[4]//ul[1]//li[2]//a[1]//span[1]")).click();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//*[@id=\"btn_deleteService\"]/span")).click();
		String expurl="https://qatest.twoplugs.com/profile/Jonny";
		String acturl=driver.getCurrentUrl();
		Assert.assertEquals(acturl,expurl);
		
	}
		 
	 
	 
}
