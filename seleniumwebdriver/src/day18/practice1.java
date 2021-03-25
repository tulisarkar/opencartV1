package day18;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class practice1 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./Drivers.\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		//implicit wait
		//driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		//explicit wait
		
		
		
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();
		
		
		WebElement searchbox=driver.findElement(By.name("q"));
		searchbox.sendKeys("Selenium");
		//press enter from keyboard
		searchbox.sendKeys(Keys.ENTER);
		//searchbox.sendKeys(Keys.RETURN);
		WebDriverWait mywait= new WebDriverWait(driver,30);
		WebElement a= mywait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//h3//span[text()='SeleniumHQ Browser Automation']")));
		//driver.findElement(By.xpath("//h3//span[text()='SeleniumHQ Browser Automation']")).click();
	a.click();
	}

}
