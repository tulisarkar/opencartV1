package day22;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DoubleClick {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.get("https://testautomationpractice.blogspot.com");
		driver.manage().window().maximize();
		
		WebElement field1=driver.findElement(By.xpath("//input[@id='field1']"));
		field1.clear();
		field1.sendKeys("Welcome123");
		
		 WebElement button=driver.findElement(By.xpath("//*[@id=\"HTML10\"]/div[1]/button"));
		 
		Actions act=new Actions(driver);
		act.doubleClick(button).perform();//double click action
		
		//get text()-capture message from field 2
		//String text=driver.findElement(By.xpath("//input[@id='field2']")).getText();//not working
		//System.out.println(text);
		
		String text=driver.findElement(By.xpath("//input[@id='field2']")).getAttribute("value");
		System.out.println(text);
		
		driver.close();


	}

}
