package com.org.learningMaven.myMavenProject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ParamTest {
	
    String baseUrl = "http://www.practiceselenium.com/practice-form.html";
	WebDriver driver;
  
  @Test
  @Parameters("browser")
  public void chooseBrowser(String browser) {
	  if (browser.equals("chrome")) {
		    System.setProperty("webdriver.chrome.driver","./Drivers\\chromedriver2.exe");
			driver = new ChromeDriver();
			driver.get(baseUrl);
	  }else if (browser.equals("firefox")) {
		  	System.setProperty("webdriver.gecko.driver","./Drivers\\geckodriver.exe");
		  	driver = new FirefoxDriver();
		  	driver.get(baseUrl);
	  }
  }
}
