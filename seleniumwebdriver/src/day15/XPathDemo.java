package day15;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class XPathDemo {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://automationpractice.com/");
		driver.manage().window().maximize();
		
		//driver.findElement(By.xpath("/html/body/div/div[1]/header/div[3]/div/div/div[2]/form/input[4]")).sendKeys("T-Shirts");
//driver.findElement(By.xpath("/html/body/div/div[1]/header/div[3]/div/div/div[2]/form/button")).click();
	
	//driver.findElement(By.xpath("//input[@id='search_query_top']")).sendKeys("T-Shirts");
	//driver.findElement(By.xpath("//button[@name='submit_search']")).click();
		
		//or operator
		
		driver.findElement(By.xpath("//*[@id='search_query_top'or @name='search_query']")).sendKeys("T-Shirts");
		driver.findElement(By.xpath("//*[@id='search_query_top'or @name='search_query']")).sendKeys("T-Shirts");
		
	//and operator
		
		driver.findElement(By.xpath("//*[@id='search_query_top'and @name='search_query']")).sendKeys("T-Shirts");
		driver.findElement(By.xpath("//*[@id='search_query_top'and @name='search_query']")).sendKeys("T-Shirts");
	// contains()
		driver.findElement(By.xpath("//input[contains(@id,'query_top']")).sendKeys("T-Shirts");
		driver.findElement(By.xpath("//button[contains(@name,'submit_search')]")).click();
		
	//starts with
		driver.findElement(By.xpath("//input[starts-with(@id,'search_')]")).sendKeys("T-Shirts");
		driver.findElement(By.xpath("//button[starts-with(@name,'submit_')]")).click();
		
		//text
		driver.findElement(By.xpath("//a[text()='Women']")).click();
		
		//chained xpath
		driver.findElement(By.xpath("")).sendKeys("T-Shirts");
		driver.findElement(By.xpath((By.xpath("//form[@id='searchbox']/button[@name='submit_search']")).click();
	
	}

}
