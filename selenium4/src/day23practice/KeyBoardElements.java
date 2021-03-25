package day23practice;

import java.time.Duration;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class KeyBoardElements {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "./Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		driver.get("http://the-internet.herokuapp.com/key_presses");
		driver.manage().window().maximize();
		
		Actions action=new Actions(driver);
		action.sendKeys(Keys.ENTER).perform();
		
		Thread.sleep(4000);
		action.sendKeys(Keys.BACK_SPACE).perform();
		
		Thread.sleep(4000);
		action.sendKeys(Keys.CLEAR).perform();
		
		Thread.sleep(4000);
		action.sendKeys(Keys.ESCAPE).perform();
	}

}
