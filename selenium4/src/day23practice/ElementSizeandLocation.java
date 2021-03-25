package day23practice;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ElementSizeandLocation {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	
		driver.get("https://opensource-demo.orangehrmlive.com/");
		driver.manage().window().maximize();
		
		WebElement logo=driver.findElement(By.xpath("//div[@id='divLogo']//img"));
		System.out.println("Height of element is"+logo.getRect().getDimension().getHeight());//returns height of element
		System.out.println("Width of element is "+logo.getRect().getDimension().getWidth());//returns width of element
		
		System.out.println("X axis="+logo.getRect().getX());//returns location of x axis
		System.out.println("Y axis="+logo.getRect().getY());//returns location of y axis
		


	}

}
