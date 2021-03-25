package com.org.learningMaven.myMavenProject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class automation1 {

	public static void main(String[] args) {
		 String baseURL = "https://www.msn.com/en-ca";
		   //System.setProperty("webdriver.chrome.driver","./Drivers\\chromedriver.exe");
		//WebDriver driver=new ChromeDriver();
		 System.setProperty("webdriver.gecko.driver","./Drivers\\geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get(baseURL);

	}

	
		
	}


