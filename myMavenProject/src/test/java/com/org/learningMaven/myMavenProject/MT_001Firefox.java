package com.org.learningMaven.myMavenProject;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class MT_001Firefox {

	public static void main(String[] args) {
		String baseURL = "http://newtours.demoaut.com/mercurywelcome.php";
		System.setProperty("webdriver.gecko.driver", "./Drivers\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.get(baseURL);
		driver.manage().window().maximize();
	    WebElement username = driver.findElement(By.name("userName"));
	    username.sendKeys("tutorial");
	    WebElement password = driver.findElement(By.name("password"));
	    password.sendKeys("tutorial");
	    WebElement signin = driver.findElement(By.name("login"));
	    signin.click();
	    WebElement roundtrip = driver.findElement(By.name("tripType"));
	    roundtrip.click();
	    new Select (driver.findElement(By.name("passCount"))).selectByVisibleText("1");
	    new Select (driver.findElement(By.name("fromPort"))).selectByVisibleText("London");
	    new Select (driver.findElement(By.name("fromMonth"))).selectByVisibleText("July");
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
	 if(exptext.contains(acttext)) {
		 System.out.println("Testcase passed");
		 	 }
	 else {
		 System.out.println("Testcase Failed");
	 }
	 
	 driver.close();
		
	}

}
