package day23;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class KeyBoardActions {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.get("https://the-internet.herokuapp.com/key_presses");
		driver.manage().window().maximize();
		
		Actions act=new Actions(driver);
		act.sendKeys(Keys.ENTER).perform();//enter
		Thread.sleep(4000);
		
		act.sendKeys(Keys.BACK_SPACE).perform();//backspace
		Thread.sleep(4000);
		
		act.sendKeys(Keys.ESCAPE).perform();//escape
		Thread.sleep(4000);
		
		act.sendKeys(Keys.SPACE).perform();//enter
		Thread.sleep(4000);
		
		act.sendKeys(Keys.CONTROL+"a").perform();	
	}

}
