package com.org.learningMaven.myMavenProject3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class Automation4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String baseURL = "http://flex.apache.org/";
		System.setProperty("webdriver.chrome.driver","./Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get(baseURL);
		WebElement mouse = driver.findElement(By.xpath("//a[contains(text(),'About Flex')]"));
		Actions actions = new Actions(driver);
		actions.moveToElement(mouse);
		actions.click().build().perform();
		
		WebElement mouse2 = driver.findElement(By.xpath("//a[contains(text(),'The Team')]"));
		actions = new Actions(driver);
		actions.moveToElement(mouse2);
		actions.click().build().perform();
				
		//driver.quit();
	}

}
