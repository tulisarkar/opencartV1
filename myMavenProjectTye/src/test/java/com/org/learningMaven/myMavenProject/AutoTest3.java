package com.org.learningMaven.myMavenProject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutoTest3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String baseURL = "https://opensource-demo.orangehrmlive.com/";
		
		System.setProperty("webdriver.chrome.driver","./Drivers\\chromedriver2.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.get(baseURL);
		//driver.findElement(By.id("txtUsername")).sendKeys("Admin");
		driver.findElement(By.name("txtUsername")).sendKeys("Admin");
		driver.findElement(By.name("txtPassword")).sendKeys("admin123");
		driver.findElement(By.id("btnLogin")).click();
		//driver.close();
	}

}
