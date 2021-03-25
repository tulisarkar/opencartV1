package com.org.learningMaven.myMavenProject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class TestMaven {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String baseURL = "https://www.facebook.com";
		
		System.setProperty("webdriver.gecko.driver","./Drivers\\geckodriver.exe");
		//System.setProperty("webdriver.chrome.driver","./Drivers\\chromedriver2.exe");
		
		WebDriver driver = new FirefoxDriver();
		//WebDriver driver = new ChromeDriver();
		driver.get(baseURL);
		driver.findElement(By.name("email")).sendKeys("abc12345");
		driver.findElement(By.name("pass")).sendKeys("abc@gmail.com");
		
		//driver.findElement(By.linkText("Why do I need to provide my birthday?")).click();
		
		//driver.findElement(By.xpath("//input[@id='email']")).sendKeys("abc@gmail.com");
		//driver.findElement(By.xpath("//input[@id='pass']")).sendKeys("password");
		//driver.findElement(By.xpath("//input[@id='u_0_8']")).click();
		//driver.findElement(By.xpath("//a[@id='birthday-help']")).click();
		//new Select (driver.findElement(By.xpath("//select[@id='month']"))).selectByVisibleText("Mar");
		driver.quit();
	}

}
