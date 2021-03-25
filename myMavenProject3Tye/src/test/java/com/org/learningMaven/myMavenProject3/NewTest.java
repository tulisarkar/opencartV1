package com.org.learningMaven.myMavenProject3;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class NewTest {
	
	public String baseUrl = "http://newtours.demoaut.com/";
    public WebDriver driver ; 
	
  @Test
  public void verifyHomepageTitle() {
	  System.setProperty("webdriver.gecko.driver","./Drivers\\geckodriver.exe");
	  driver = new FirefoxDriver();
	  driver.get(baseUrl);
	  String expectedTitle = "Welcome: Mercury Tours";
	  String actualTitle = driver.getTitle();
	  Assert.assertEquals(actualTitle, expectedTitle);
	  driver.quit();
  }
  public void  verifyPassword() {
	 driver.close();
	  
  }
}
