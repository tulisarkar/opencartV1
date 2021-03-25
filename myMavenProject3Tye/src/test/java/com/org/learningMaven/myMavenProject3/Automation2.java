package com.org.learningMaven.myMavenProject3;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class Automation2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String baseURL = "http://www.practiceselenium.com/practice-form.html";
		System.setProperty("webdriver.chrome.driver","./Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get(baseURL);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys("Tye");
		driver.findElement(By.xpath("//input[@id='sex-1']")).click();
		driver.findElement(By.xpath("//input[@id='exp-6']")).click();
		
		driver.findElement(By.xpath("//input[@id='tea1']")).click();
		new Select(driver.findElement(By.xpath("//select[@id='continents']"))).selectByVisibleText("North America");
		driver.findElement(By.xpath("//button[@id='submit']")).click();
		driver.quit();
	}
}
				
