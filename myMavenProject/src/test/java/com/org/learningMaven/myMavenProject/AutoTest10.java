package com.org.learningMaven.myMavenProject;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutoTest10 {

	public static void main(String[] args) {
		String baseURL = "http://seleniumhq.github.io/selenium/docs/api/java/index.html";
		System.setProperty("webdriver.chrome.driver","./Drivers\\chromedriver1.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(baseURL);
		
		 driver.switchTo().frame("packageListFrame");
		 driver.findElement(By.xpath("//a[@href='org/openqa/selenium/package-frame.html']")).click();
		 driver.switchTo().defaultContent();
		 
		 driver.switchTo().frame("packageFrame");
		 driver.findElement(By.xpath("//span[contains(.,'WebDriver')]")).click();
		 driver.switchTo().defaultContent();
		 
		 driver.switchTo().frame("classFrame");
		 driver.findElement(By.xpath("//li[contains(.,'Help')]")).click();
		 driver.close();
		 
	}
}
