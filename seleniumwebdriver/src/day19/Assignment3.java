package day19;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

// Single frame



public class Assignment3 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get(" http://demo.automationtesting.in/Frames.html");
		driver.manage().window().maximize();
		WebElement outerframe=driver.findElement(By.xpath("//*[@id=\"singleframe\"]"));
		driver.switchTo().frame(outerframe);
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("welcome");
	}

}
