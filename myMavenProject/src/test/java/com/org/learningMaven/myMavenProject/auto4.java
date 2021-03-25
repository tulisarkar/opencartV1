package com.org.learningMaven.myMavenProject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class auto4 {

	public static void main(String[] args) {
		String baseUrl="http://demo.automationtesting.in/Windows.html";
		System.setProperty("webdriver.chrome.driver", "./Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get(baseUrl);
		driver.manage().window().maximize();
		String pageTitle = driver.getTitle();
		System.out.println("The page title is" +pageTitle);
		String url = driver.getCurrentUrl();
		System.out.println("current url is" +url);
		String text;
		text =driver.findElement(By.xpath("//h1[contains(text(),'Automation Demo Site')]")).getText();
		System.out.println("The page text is" +text);
		
		System.out.println(text);
		
		
	}

}
