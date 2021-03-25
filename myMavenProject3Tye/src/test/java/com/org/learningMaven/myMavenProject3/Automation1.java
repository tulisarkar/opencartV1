package com.org.learningMaven.myMavenProject3;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Automation1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String baseURL = "https://www.msn.com/en-ca";
		//System.setProperty("webdriver.chrome.driver","./Drivers\\chromedriver.exe");
		System.setProperty("webdriver.gecko.driver","./Drivers\\geckodriver.exe");
		//WebDriver driver = new ChromeDriver();
		WebDriver driver=new FirefoxDriver();
		driver.get(baseURL);
		driver.close();
		driver.quit();
		
		
		
	
	
	}

}
