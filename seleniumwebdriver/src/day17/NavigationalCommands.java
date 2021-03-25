package day17;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NavigationalCommands {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.in/");
		//driver.manage().window().maximize();
		System.out.println(driver.getCurrentUrl());
		
		driver.navigate().to("https://www.snapdeal.com/");
		driver.get("https://www.snapdeal.com/");
		System.out.println(driver.getCurrentUrl());
		driver.navigate().back();//Amazon
		System.out.println(driver.getCurrentUrl());
		driver.navigate().forward();//snapdeal
		System.out.println(driver.getCurrentUrl());
		driver.navigate().refresh();//refresh or reload
		

	}

}
