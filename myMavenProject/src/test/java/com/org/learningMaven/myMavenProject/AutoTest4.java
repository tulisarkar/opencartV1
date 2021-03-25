package com.org.learningMaven.myMavenProject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class AutoTest4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String baseURL = "http://www.practiceselenium.com/practice-form.html";
		
		System.setProperty("webdriver.chrome.driver","./Drivers\\chromedriver2.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(baseURL);
		WebElement firstname = driver.findElement(By.name("firstname"));
		WebElement lastname = driver.findElement(By.name("firstname")); 
		
		//driver.findElement(By.name("lastname")).sendKeys("Alli");
		driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys("Tye");
		driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys("Alli");
		
		new Select (driver.findElement(By.name("continents"))).selectByVisibleText("Asia");
		//driver.findElement(By.linkText("Let's Talk Tea")).click();
		
		//driver.close();
	}

}
