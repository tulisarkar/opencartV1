package com.org.learningMaven.myMavenProject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class auto5 {

	public static void main(String[] args) {
		String baseUrl="https://www.facebook.com";
		System.setProperty("webdriver.chrome.driver", "./Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get(baseUrl);
		driver.manage().window().maximize();
		
		//boolean nameEnabled; 
		//nameEnabled=driver.findElement(By.xpath("//input[@id='email']")).isEnabled();
		//System.out.println(nameEnabled);
		
		//boolean nameDisplayed;
		//nameDisplayed=driver.findElement(By.xpath("//input[@id='email']")).isDisplayed();
		//System.out.println(nameDisplayed);
		//driver.close();
		
		boolean maleSelected;
		maleSelected =
				//driver.findElement(By.xpath(".//*[@id='u_0_8']")).isSelected();
				driver.findElement(By.xpath("//input[@id='u_0_8']")).isSelected();
		System.out.println(maleSelected);
		driver.close();
		
		
		
		
	}

}
