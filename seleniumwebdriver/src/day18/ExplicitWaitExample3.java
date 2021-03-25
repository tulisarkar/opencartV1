package day18;

import java.time.Duration;
import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;
import java.util.function.Function;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplicitWaitExample3 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		 WebDriverWait mywait=new WebDriverWait(driver,30);//sel 3
			
			//WebdriverWait mywait=new WebDriverWait(driver,Duration.ofSeconds(10));//sel 4
			
		
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();
		WebElement searchbox=driver.findElement(By.name("q"));
		searchbox.sendKeys("Selenium");
		searchbox.sendKeys(Keys.RETURN); //searchbox.sendKeys(Keys.ENTER);
		try()
		{
				WebElement a=mywait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//h3//span[text()='SeleniumHQ Browser Automation']")));
		a.click();
		}
		catch(Exception e)
		{
			System.out.println("No Element is found");
		}
		
	}

	

}
