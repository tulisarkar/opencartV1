package com.org.learningMaven.myMavenProject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class auto7 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://seleniumhq.github.io/selenium/docs/api/java/index.html");

		//driver.switchTo().frame("packageListFrame");
		//driver.findElement(By.xpath("//a[@href='org/openqa/selenium/package-frame.html']")).click();
		//driver.switchTo().defaultContent();

		driver.switchTo().frame("packageFrame");
		driver.findElement(By.xpath("//span[contains(.,'WebDriver')]")).click();
		driver.switchTo().defaultContent();

		//driver.switchTo().frame("classFrame");
		//driver.findElement(By.xpath("//li[contains(.,'Help')]")).click();
	}

}
