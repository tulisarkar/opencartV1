package day23practice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;

public class HeadlessEdge {

	public static void main(String[] args) {
		EdgeOptions options=new EdgeOptions();
		options.setHeadless(true);
		
		
		System.setProperty("webdriver.edge.driver", "./Drivers\\msedgedriver.exe");
		WebDriver driver=new EdgeDriver(options);
		driver.get("https://demo.nopcommerce.com/");
		
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());

		

	}
	}


