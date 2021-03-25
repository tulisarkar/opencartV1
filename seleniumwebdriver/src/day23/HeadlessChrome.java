package day23;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class HeadlessChrome {

	public static void main(String[] args)
	{
		ChromeOptions options=new ChromeOptions();
		options.setHeadless(true);
		
		
		System.setProperty("webdriver.chrome.driver", "./Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver(options);
		driver.get("https://demo.nopcommerce.com/");
		
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());

	}

}
