package day14;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorsDemo1 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://automationpractice.com/");
		driver.manage().window().maximize();
		//usage if id and name locators
		
		//WebElement searchbox=driver.findElement(By.id("search_query_top"));
		//searchbox.sendKeys("T-Shirts");
		//driver.findElement(By.name("submit_search")).click();
		
		//linkText and partialLinkText
		//driver.findElement(By.linkText("Printed Chiffon Dress")).click();
		//driver.findElement(By.partialLinkText("Printed Chiffon Dress")).click();
	}
}
		