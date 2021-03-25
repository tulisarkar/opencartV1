package com.org.learningMaven.myMavenProject3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class AutoTest3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//String baseURL = "https://opensource-demo.orangehrmlive.com/";
		String baseURL = "https://www.practiceselenium.com/practice-form.html";
		System.setProperty("webdriver.chrome.driver","./Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get(baseURL);
		String pageTitle = "practice-form";
		String actualPageTitle = driver.getTitle();
		System.out.println(pageTitle + " "+actualPageTitle);
		
		//driver.findElement(By.name("firstname")).sendKeys("Tye");
		driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys("Tye");
		driver.findElement(By.name("lastname")).sendKeys("Alli");
		driver.findElement(By.id("sex-1")).click();
		driver.findElement(By.id("tea2")).click();
		new Select (driver.findElement(By.name("continents"))).selectByVisibleText("Australia");
		//driver.findElement(By.linkText("Our Passion")).click();
		driver.quit();
		
		}

}
