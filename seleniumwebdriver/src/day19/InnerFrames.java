package day19;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class InnerFrames {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("http://demo.automationtesting.in/Frames.html");
		driver.manage().window().maximize();
		//click the button
		driver.findElement(By.xpath("//a[contains(text(),\"Iframe with in an Iframe\")]")).click();
//inspecting the outer frame
		WebElement outerframe=driver.findElement(By.xpath("//iframe[@src='MultipleFrames.html']"));
		//to switch to outerframe
		driver.switchTo().frame(outerframe);
		//inspecting the innerframe
		WebElement innerframe=driver.findElement(By.xpath("/html/body/section/div/div/iframe"));
		//switch to innerframe
		driver.switchTo().frame(innerframe);
		//interact with element inside the frame
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("welcome");
		
	}

}
