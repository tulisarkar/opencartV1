package com.org.learningMaven.myMavenProject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

import junit.framework.Assert;

public class NewTest {
  

	
	  	
	  	public String baseUrl = "http://newtours.demoaut.com/";
	      public WebDriver driver ; 
	  	
	    @Test
	    public void verifyHomepageTitle() {
	  	  System.setProperty("webdriver.chrome.driver","./Drivers\\chromedriver.exe");
	  	  driver = new ChromeDriver();
	  	  driver.get(baseUrl);
	  	  String expectedTitle = "Welcome: Mercury Tours";
	  	  String actualTitle = driver.getTitle();
	  	  Assert.assertEquals(actualTitle, expectedTitle);
	  	  driver.quit();
	    }
	    
	  


  }

