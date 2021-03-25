package day22;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class AssignmentDragandDropImages {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.get("https://testautomationpractice.blogspot.com");
		driver.manage().window().maximize();
		
		WebElement john=driver.findElement(By.xpath("//*[@id='gallery']/li[1]/img"));
		WebElement mary=driver.findElement(By.xpath("//*[@id='gallery']/li[2]/img"));
		WebElement trash=driver.findElement(By.id("trash"));
		
		Actions action=new Actions(driver);
		
		//drags both images to trash
		action.dragAndDrop(john, trash).perform();
		action.dragAndDrop(mary, trash).perform();
		
		//puts images back to original position
		driver.findElement(By.xpath("//*[@id=\"trash\"]/ul/li[2]/a")).click();
		driver.findElement(By.xpath("//*[@id=\"trash\"]/ul/li[1]/a")).click();
		
		driver.close();
		
		
	}

}
