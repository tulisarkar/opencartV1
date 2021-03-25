package com.org.learningMaven.myMavenProject;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.GeckoDriverService;



public class TestMaven {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		String baseURL = "https://www.facebook.com";
		System.setProperty("webdriver.chrome.driver","./Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get(baseURL);
		driver.close();

		}

}


