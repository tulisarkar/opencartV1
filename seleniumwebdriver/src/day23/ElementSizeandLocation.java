package day23;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ElementSizeandLocation {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "./Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
	
		driver.get("https://opensource-demo.orangehrmlive.com/");
		
		WebElement logo=driver.findElement(By.xpath("//div[@id='divLogo']//img"));
		
		//height and width
		
		System.out.println("Height of the logo:"+logo.getRect().getDimension().getHeight());
		System.out.println("Width of the logo:"+logo.getRect().getDimension().getWidth());
	
		//x,y coordinates
		
		System.out.println("x-axis:"+logo.getRect().getX());
		System.out.println("y axis:"+logo.getRect().getY());

	}

}
