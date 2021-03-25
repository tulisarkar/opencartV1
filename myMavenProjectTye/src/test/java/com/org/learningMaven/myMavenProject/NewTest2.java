package com.org.learningMaven.myMavenProject;

import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;


	public class NewTest2 {
		
		public String baseUrl = "http://www.facebook.com/";
		public FirefoxDriver driver;
		
		@BeforeTest
		  public void launchFacebook() {
			  System.setProperty("webdriver.gecko.driver","./Drivers\\geckodriver.exe");
    		  driver = new FirefoxDriver();
			  driver.get(baseUrl);
		  }
		@BeforeMethod
		public void verifyfacebookTitle() {
			    String expected = "Facebook - Log In or Sign Up";
			    String actual = driver.getTitle();
			    Assert.assertEquals(actual, expected);
		}
	    @Test
	    public void enterLogin() {
		  driver.findElement(By.xpath("//input[@id='email']")).sendKeys("abc@gmail.com");
		  driver.findElement(By.xpath("//input[@id='pass']")).sendKeys("abc");
	    }
	  
	    @AfterTest
	    public void closeFacebook() {
		  driver.quit();
	    }
}
