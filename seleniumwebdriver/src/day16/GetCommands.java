package day16;

import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetCommands {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("http://demo.nopcommerce.com/");
		String title=driver.getTitle();
		System.out.println("Title of the page" +title);
		String url=driver.getCurrentUrl();
		System.out.println(url);
		//System.out.println(driver.getPageSource());
		String winid=driver.getWindowHandle();
		System.out.println(winid);
		Set<String>winids=driver.getWindowHandles();
		
		//loop statement to retieve win ids from winids variable.
		//driver.manage().window().maximize();
	}

}
