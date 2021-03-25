package day22;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class RightClick {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.get("http://swisnl.github.io/jQuery-contextMenu/demo.html");
		driver.manage().window().maximize();
		
		//inspecting the right click button
		WebElement button=driver.findElement(By.xpath("//span[contains(text(),'right click me')]"));
        
		Actions action=new Actions(driver);
		action.contextClick(button).perform();//right click action
		
		WebElement copy=driver.findElement(By.xpath("//span[normalize-space()='Copy']"));
		copy.click();//click action on copy
		
		Alert alert=driver.switchTo().alert();//switches to alert window
		System.out.println("The text in alert window is" +alert.getText());//displays text inside alert window
		alert.accept(); //clicks on ok buttion of alert window
		
		driver.close();
		

	}

}
