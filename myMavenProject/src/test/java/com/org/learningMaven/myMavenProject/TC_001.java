package com.org.learningMaven.myMavenProject;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.*;

public class TC_001
{
		String baseURL="http://newtours.demoaut.com/mercurywelcome.php";
	WebDriver driver;
	
	@BeforeTest
	public void launchwebsite()
	{
		System.setProperty("webdriver.gecko.driver", "./Drivers\\geckodriver.exe");
		driver=new FirefoxDriver();
		
        driver.get(baseURL);
		driver.manage().window().maximize();
	}
	@BeforeMethod
	public void verifyHomepageTitle() {
  	    String expected = "Welcome: Mercury Tours";
  	    String actual = driver.getTitle();
  	    Assert.assertEquals(actual, expected);
  	  
    }
	@AfterMethod
	 public void gobackHome() {
	  	   driver.findElement(By.xpath("//a[contains(.,'Home')]")).click();
	    }
			@AfterTest
			public void closewebsite()
			{
				driver.quit();
			}
	@Test(priority=0)
	public void bookroundtripticket()
	{
		driver.findElement(By.xpath("//input[@name='userName']")).sendKeys("tutorial");
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("tutorial");
		driver.findElement(By.xpath("//input[@name='login']")).click();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.findElement(By.name("tripType")).click();
		new Select(driver.findElement(By.xpath("//select[@name='passCount']"))).selectByVisibleText("1");
		new Select(driver.findElement(By.xpath("//select[@name='fromPort']"))).selectByVisibleText("London");
		new Select(driver.findElement(By.xpath("//select[@name='fromMonth']"))).selectByVisibleText("July");
		new Select (driver.findElement(By.name("fromDay"))).selectByVisibleText("25");
	    new Select (driver.findElement(By.name("toPort"))).selectByVisibleText("Sydney");
	    new Select (driver.findElement(By.name("toMonth"))).selectByVisibleText("August");
	    new Select (driver.findElement(By.name("toDay"))).selectByVisibleText("25");	      
	    driver.findElement(By.xpath("/html/body/div/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[5]/td/form/table/tbody/tr[9]/td[2]/font/font/input[1]")).click();
	    new Select (driver.findElement(By.xpath("//select[@name='airline']"))).selectByVisibleText("Blue Skies Airlines");
	  driver.findElement(By.xpath("//input[@name='findFlights']")).click();
	  driver.findElement(By.xpath("//input[@name='reserveFlights']")).click(); 
	  	  WebElement firstname = driver.findElement(By.xpath("//input[@name='passFirst0']"));
	    firstname.sendKeys("Tuli");
	    WebElement lastname = driver.findElement(By.xpath("//input[@name='passLast0']"));
	    lastname.sendKeys("Sarkar");
	    new Select (driver.findElement(By.xpath("//select[@name='pass.0.meal']"))).selectByVisibleText("Hindu");
	    new Select (driver.findElement(By.xpath("//select[@name='creditCard']"))).selectByVisibleText("MasterCard");
	    WebElement cardnumber = driver.findElement(By.xpath("//input[@name='creditnumber']"));
	    cardnumber.sendKeys("1234567812");
	    new Select (driver.findElement(By.xpath("//select[@name='cc_exp_dt_mn']"))).selectByVisibleText("08");
	    new Select (driver.findElement(By.xpath("//select[@name='cc_exp_dt_yr']"))).selectByVisibleText("2007");
	    driver.findElement(By.xpath("//input[@name='cc_frst_name']")).sendKeys("Tuli");
	    driver.findElement(By.xpath("//input[@name='cc_mid_name']")).sendKeys("");
	    driver.findElement(By.xpath("//input[@name='cc_last_name']")).sendKeys("Sarkar");
	    driver.findElement(By.xpath("//tr[8]//td[2]//input[1]")).click();
	   WebElement address = driver.findElement(By.xpath("//input[@name='billAddress1']"));
	    address.clear();
	    address.sendKeys("4633,Glen Erin Drive");
	    WebElement city = driver.findElement(By.xpath("//input[@name='billCity']"));
	    city.clear();
	    city.sendKeys("Mississauga");
	    WebElement state = driver.findElement(By.xpath("//input[@name='billState']"));
	    state.clear();
	   state.sendKeys("Ontario");
	    WebElement postalcode = driver.findElement(By.xpath("//input[@name='billZip']"));
	    postalcode.clear();
	    postalcode.sendKeys("L5M0Y6");
	 	 new Select (driver.findElement(By.xpath("//select[@name='billCountry']"))).selectByVisibleText("CANADA");   
	  	  WebElement address1 = driver.findElement(By.xpath("//input[@name='delAddress1']"));
	    address1.clear();
	    address1.sendKeys("4633,Glen Erin Drive");
	    WebElement city1 = driver.findElement(By.xpath("//input[@name='delCity']"));
	    city1.clear();
	    city1.sendKeys("Mississauga");
	    WebElement state1 = driver.findElement(By.xpath("//input[@name='delState']"));
	    state1.clear();
	   state1.sendKeys("Ontario");
	    WebElement postalcode1 = driver.findElement(By.xpath("//input[@name='delZip']"));
	    postalcode1.clear();
	    postalcode1.sendKeys("L5M0Y6");
	    new Select (driver.findElement(By.xpath("//select[@name='delCountry']"))).selectByVisibleText("CANADA");
	    driver.switchTo().alert().accept();
	 driver.findElement(By.name("buyFlights")).click();
	  	 String exptext="Your itinerary has been booked!";
	 String acttext= driver.findElement(By.xpath("//font[contains(text(),'Your')]")).getText();
	Assert.assertEquals(acttext, exptext);
	}
	@Test(priority=1)
	public void displaycruiseweeklyitinerary ()
	{
		driver.findElement(By.linkText("Cruises")).click();
		 String expstartday = "Sat";
		 String expstartport = "Seattle";
		 String expendday = "Sat";
		String expendport ="Seattle";
		 String startday = driver.findElement(By.xpath("//tr//tr//tr[4]//td[1]//font[1]")).getText();
		 String startport = driver.findElement(By.xpath("//tr//tr//tr[4]//td[2]//strong[1]//font[1]")).getText();
		 
		 String endday = driver.findElement(By.xpath("//tr[11]//td[1]//font[1]")).getText();
		 String endport = driver.findElement(By.xpath("//tr[11]//td[2]//strong[1]//font[1]")).getText();
		 Assert.assertTrue(startday.equalsIgnoreCase(expstartday) && (expstartport.equalsIgnoreCase(startport)));
		 Assert.assertTrue(endday.equalsIgnoreCase(expendday) && (expendport.equalsIgnoreCase(endport)));
	}
	
	 @Test(priority=2)
	 public void userunabletoreservehotel()
	 {
		 driver.findElement(By.linkText("Hotels")).click();
		 	boolean expected = true;
			boolean namedisplayed= driver.findElement(By.xpath("//body/div/table/tbody/tr/td/table/tbody/tr/td/table/tbody/tr/td/table/tbody/tr/td/p/font/b/font[1]")).isDisplayed();
			Assert.assertEquals(namedisplayed, expected);
			 	
			 	}
	}

		
		
	
	
  

