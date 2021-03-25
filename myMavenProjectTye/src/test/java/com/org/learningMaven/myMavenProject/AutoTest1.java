package com.org.learningMaven.myMavenProject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutoTest1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String baseURL = "https://www.facebook.com";
		
		System.setProperty("webdriver.chrome.driver","./Drivers\\chromedriver2.exe");
		
		ChromeDriver driver = new ChromeDriver();
		driver.get(baseURL);
		driver.close();
		
	}
}
