package com.org.learningMaven.myMavenProject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class auto1 {

	public static void main(String[] args) {
		String baseURL="https://opensource-demo.orangehrmlive.com";
		System.setProperty("webdriver.chrome.driver","./Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get(baseURL);
		//driver.findElement(By.xpath("//input[@id='txtUsername']")).sendKeys("Admin");
		//driver.findElement(By.xpath("//input[@id='txtPassword']")).sendKeys("admin123");
		//driver.findElement(By.xpath("//input[@id='btnLogin']")).click();
		
		driver.findElement(By.name("txtUsername")).sendKeys("Admin");
		driver.findElement(By.id("txtPassword")).sendKeys("admin123");
		driver.findElement(By.name("Submit")).click();
		driver.findElement(By.linkText("Assign Leave")).click();
		new Select(driver.findElement(By.id("assignleave_txtLeaveType"))).selectByVisibleText("Maternity US");	

		
		//WebElement leavetype = driver.findElement(By.id("assignleave_txtLeaveType"));
		//Select select=new Select (leavetype);
		//select.selectByVisibleText("Maternity US");

	}
	
}
