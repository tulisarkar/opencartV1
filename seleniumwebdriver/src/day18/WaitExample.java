package day18;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WaitExample {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);//selenium 3
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));//selenium 4
		
		
		WebElement searchbox=driver.findElement(By.name("q"));
				//xpath("//h3//span[text()='Selenium Webdriver']"));
		
		searchbox.sendKeys("Selenium");
		searchbox.sendKeys(Keys.RETURN);
		//Thread.sleep(3000);//before getting the element we use this
		driver.findElement(By.xpath("//h3//span[text()='Selenium Webdriver']")).click();
	}

	

}
