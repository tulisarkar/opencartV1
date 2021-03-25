package day19;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FramesDemo {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://www.selenium.dev/selenium/docs/api/java/index.html?org/openqa/selenium/chromium/package-summary.html");
		driver.manage().window().maximize();
		//to switch to first frame
		driver.switchTo().frame("packageListFrame");
		//click on  link on first frame
		driver.findElement(By.linkText("org.openqa.selenium")).click();
		//go back to the webpage
		driver.switchTo().defaultContent();
		//switch to second frame
		driver.switchTo().frame("packageFrame");
		//click on  link on second frame
		driver.findElement(By.linkText("WebDriver")).click();
		//go back ti webpage
		driver.switchTo().defaultContent();
		//switch to third frame
		driver.switchTo().frame("classFrame");
		//click on link in third frame
		driver.findElement(By.xpath("/html/body/header/nav/div[1]/div[1]/ul/li[7]/a")).click();
	
	
	}

}
