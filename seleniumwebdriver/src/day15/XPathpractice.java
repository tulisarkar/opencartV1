package day15;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class XPathpractice {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://automationpractice.com/");
		driver.manage().window().maximize();
		//driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/header[1]/div[3]/div[1]/div[1]/div[2]/form[1]/input[4]")).sendKeys("T-Shirts");
		//driver.findElement(By.xpath("//button[@name='submit_search']")).click();
		
		//driver.findElement(By.xpath("//input[@id='search_query_top'or @name='search_query']")).sendKeys("T-Shirts");
		//driver.findElement(By.xpath("//button[@name='submit_search' or @class='btn btn-default button-search']")).click();
		
		//driver.findElement(By.xpath("//input[contains(@id,'query_top']")).sendKeys("T-Shirts");
		//driver.findElement(By.xpath("//button[contains(@name,'submit_search')]")).click();
		
		driver.findElement(By.xpath("//input[starts-with(@id,'search_')]")).sendKeys("T-Shirts");
		driver.findElement(By.xpath("//button[starts-with(@name,'submit_')]")).click();
		driver.close();
		
		
	}

}
