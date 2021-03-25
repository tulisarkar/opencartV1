package com.org.learningMaven.myMavenProject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class auto2 {

	public static void main(String[] args) {
		String baseURL="https://opensource-demo.orangehrmlive.com";
		System.setProperty("webdriver.gecko.driver","./Drivers\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get(baseURL);
		//driver.findElement(By.xpath("//input[@id='txtUsername']")).sendKeys("Admin");
		//driver.findElement(By.xpath("//input[@id='txtPassword']")).sendKeys("admin123");
		//driver.findElement(By.xpath("//input[@id='btnLogin']")).click();
		driver.findElement(By.name("txtUsername")).sendKeys("Admin");
		driver.findElement(By.id("txtPassword")).sendKeys("admin");
		driver.findElement(By.name("Submit")).click();

	}

}
