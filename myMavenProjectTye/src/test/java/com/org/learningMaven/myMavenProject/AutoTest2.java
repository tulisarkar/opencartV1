package com.org.learningMaven.myMavenProject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class AutoTest2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String baseURL = "https://www.facebook.com";
		System.setProperty("webdriver.gecko.driver","./Drivers\\geckodriver.exe");
				
		WebDriver driver = new FirefoxDriver();
		driver.get(baseURL);
		driver.close();
	}

}
