package com.org.learningMaven.myMavenProject;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class AutoTest5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String baseURL = "http://newtours.demoaut.com/mercurywelcome.php";
		System.setProperty("webdriver.chrome.driver","./Drivers\\chromedriver2.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(baseURL);
		
		WebElement username = driver.findElement(By.name("userName"));
		username.sendKeys("tutorial");
		
		WebElement password = driver.findElement(By.name("password"));
		password.sendKeys("tutorial");
		
		WebElement login = driver.findElement(By.name("login"));
		login.click();
		
		String expectedTitle = "Find a Flight: Mercury Tours:"	;
		String actualTitle = driver.getTitle();
		
		if (expectedTitle.equals(actualTitle)) {
			System.out.println("Testcase Passed: User logged in");
		}
		else {
			System.out.println("Testcase Failed: User did not login");
		}
		
		/*
		if (driver.getTitle().contains(expTitle)) {
			System.out.println("Testcase Passed");
		}
		else {
			System.out.println("Testcase Failed");
		}
		*/
		
		driver.close();
		
	}

}
