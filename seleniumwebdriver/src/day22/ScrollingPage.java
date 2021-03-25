package day22;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScrollingPage {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
		driver.get("https://www.countries-ofthe-world.com/flags-of-the-world.html");
		driver.manage().window().maximize();
		
		//scroll down by pixel
		JavascriptExecutor js=(JavascriptExecutor) driver;//type casting
		js.executeScript("window.scrollby(0,3000)", "");
		
		long value= (Long)js.executeScript("return window.pageYOffset;");
		System.out.println("Number of pixels moved:" +value);
		
		//scroll down till element is located
		
		WebElement flag=driver.findElement(By.xpath("//*[@id='content']/div[2]/div[2]/table[1]/tbody/tr[51]/td[2]"));
		js.executeScript("arguments[0].scrollIntoView",flag);
		long value1= (Long)js.executeScript("return window.pageYOffset;");
		System.out.println("Number of pixels moved:" +value1);
		
		//scroll till end of page
		
		js.executeScript("window.scrollBy(0,document.body.scrollHeight)");
		long value2=(Long)js.executeScript("return window.pageYOffset;");
		System.out.println("Number of pixels moved:"+value2);//5894
		
	}
		
		
	}


