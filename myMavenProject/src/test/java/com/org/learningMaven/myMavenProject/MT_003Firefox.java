package com.org.learningMaven.myMavenProject;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class MT_003Firefox {

	public static void main(String[] args) {
		String baseUrl ="http://newtours.demoaut.com/mercurywelcome.php";
		System.setProperty("webdriver.gecko.driver", "./Drivers\\geckodriver.exe");
			WebDriver driver= new FirefoxDriver();
			driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.get(baseUrl);
		driver.manage().window().maximize();
		 driver.findElement(By.linkText("Hotels")).click();
					 	
		 boolean namedisplayed= driver.findElement(By.xpath("//body/div/table/tbody/tr/td/table/tbody/tr/td/table/tbody/tr/td/table/tbody/tr/td/p/font/b/font[1]")).isDisplayed();
		 	if (namedisplayed = true) {
		 		System.out.println("Testcase passed");
		 	}
		 	else {
		 		System.out.println("Testcase failed");
		 	}
		 	driver.close();
	     
	}

	}

