package day23;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;


public class HeadlessFireFox {

	public static void main(String[] args) {
		FirefoxOptions options=new FirefoxOptions();
		options.setHeadless(true);
		
		
		System.setProperty("webdriver.gecko.driver", "./Drivers\\geckodriver.exe");
		WebDriver driver=new FirefoxDriver(options);
		driver.get("https://demo.nopcommerce.com/");
		
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());


	}

}
