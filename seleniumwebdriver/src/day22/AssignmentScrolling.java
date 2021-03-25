package day22;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AssignmentScrolling {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		driver.get("https://testautomationpractice.blogspot.com");
		driver.manage().window().maximize();
		
		JavascriptExecutor js = (JavascriptExecutor)driver;
		// scroll down page by pixel
			js.executeScript("window.scrollBy(0,1000)", "");
				
			// to capture how much pixels the scroll bar has scrolled.
			long value = (Long)js.executeScript("return window.pageYOffset;");
			System.out.println("Number of pixels moved:" +value);
			
		
		// 2. Scroll down page till the element is visible
		WebElement image = driver.findElement(By.xpath("//*[@id='gallery']/li[2]/img"));
		js.executeScript("arguments[0].scrollIntoView()", image);
		
		// to capture how much pixels the scroll bar has scrolled
		double value1 = (Double)js.executeScript("return window.pageYOffset;");
		System.out.println("Number of pixels moved:" +value1);
		
				
		//3.End of the page
				js.executeScript("window.scrollBy(0,document.body.scrollHeight)");
				double value2 = (Double)js.executeScript("return window.pageYOffset;");
				System.out.println("Number of pixels moved:" +value2);



		

	}

}
