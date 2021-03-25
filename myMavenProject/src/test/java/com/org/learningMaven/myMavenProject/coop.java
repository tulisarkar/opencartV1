package com.org.learningMaven.myMavenProject;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;

public class coop {

	public String baseURL="https://qatest.twoplugs.com";
	public ChromeDriver driver;
	
	@BeforeTest
	public void launchtwoPlugswebsite() {
		System.setProperty("webdriver.chrome.driver", "./Drivers\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get(baseURL);
		driver.manage().window().maximize();
	}
}
	