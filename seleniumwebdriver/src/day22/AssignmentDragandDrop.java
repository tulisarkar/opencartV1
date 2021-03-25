package day22;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class AssignmentDragandDrop{

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "./Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.get("https://testautomationpractice.blogspot.com");
		driver.manage().window().maximize();
		
		WebElement source=driver.findElement(By.xpath("//*[@id='draggable']/p"));
		WebElement target=driver.findElement(By.xpath("//div[@id='droppable']"));
		
		Actions action=new Actions(driver);
		action.dragAndDrop(source, target).perform();
		
		driver.close();
		
		
		
	}

}
