package day22;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class SliderElement {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
	
		driver.get("https://jqueryui.com/slider/");
		driver.manage().window().maximize();
		
		//switchh to frame
		
		driver.switchTo().frame(0);
		
		//inspect the slider element
		WebElement slider=driver.findElement(By.xpath("//*[@id=\"slider\"]/span"));
		
		Actions action=new Actions(driver);
		action.dragAndDropBy(slider, 300, 0).perform();
		
		Thread.sleep(3000);
		action.dragAndDropBy(slider, -300, 0).perform();
		
		driver.close();
		
	}

}
