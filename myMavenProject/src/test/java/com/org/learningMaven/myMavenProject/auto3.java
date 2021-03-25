package com.org.learningMaven.myMavenProject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;


public class auto3 {

	public static void main(String[] args) throws InterruptedException {
		String baseUrl="http://newtours.demoaut.com/";
		System.setProperty("webdriver.gecko.driver", "./Drivers\\geckodriver.exe");
		WebDriver driver= new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get(baseUrl);
		driver.findElement(By.name("userName")).sendKeys("tutorial");
		driver.findElement(By.name("password")).sendKeys("tutorial");
		driver.findElement(By.name("login")).click();
		driver.close();

		
		
	//WebElement text=driver.findElement(By.xpath("//font[contains(text(),'Use our Flight Finder')]"));
	//text.getText();
	//System.out.println(text);
	//driver.quit();
	}
}


