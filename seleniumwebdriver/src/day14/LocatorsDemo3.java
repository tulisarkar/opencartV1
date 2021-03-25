package day14;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.edge.EdgeDriver;

public class LocatorsDemo3 {

	public static void main(String[] args) {
		System.setProperty("webdriver.edge.driver", "./Drivers\\msedgedriver.exe");
		WebDriver driver=new EdgeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		//Tag &ID
		
		driver.findElement(By.cssSelector("input#email")).sendKeys("abc@gmail.com");
		//driver.findElement(By.cssSelector("#email")).sendKeys("abc@gmail.com");//either can be used
		
		//tag and class
		driver.findElement(By.cssSelector("input.inputtext")).sendKeys("abc@gmail.com");
		//driver.findElement(By.cssSelector(".inputtext")).sendKeys("abc@gmail.com");
		
		//tag, class, attribute
		driver.findElement(By.cssSelector("input.inputtext[data-testid='royal_pass']")).sendKeys("xyz@gmail.com");
		
		//tag and attribute
		driver.findElement(By.cssSelector("input.[name='email']")).sendKeys("abc@gmail.com");
		


	}

}
