package com.org.learningMaven.myMavenProject;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class MT_002Firefox {

	public static void main(String[] args) {
		String baseUrl ="http://newtours.demoaut.com/mercurywelcome.php";
		System.setProperty("webdriver.gecko.driver", "./Drivers\\geckodriver.exe");
			WebDriver driver= new FirefoxDriver();
			driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.get(baseUrl);
		driver.manage().window().maximize();
		 driver.findElement(By.linkText("Cruises")).click();
		 String expstartday = "Sat";
		 String expstartport = "Seattle";
		 String expendday = "Sat";
		 String expendport ="Seattle";
		 String startday = driver.findElement(By.xpath("//tr//tr//tr[4]//td[1]//font[1]")).getText();
		 String startport = driver.findElement(By.xpath("//tr//tr//tr[4]//td[2]//strong[1]//font[1]")).getText();
		 
		 String endday = driver.findElement(By.xpath("//tr[11]//td[1]//font[1]")).getText();
		 String endport = driver.findElement(By.xpath("//tr[11]//td[2]//strong[1]//font[1]")).getText();
		
		 if(expstartday.equals(startday)&& (expstartport.equals(startport))) {
			 System.out.println("Testcase passed");
		 }
		 else {
			 System.out.println("Testcase failed"); 
		 }
		 if(expendday.equals(endday)&& (expendport.equals(endport))) {
			 System.out.println("Testcase passed");
		 }
		 else {
			 System.out.println("Testcase failed"); 
	}
		 driver.close();
	}


	}


