package day23practice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class WorkingwithTabsandWindows {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://demo.nopcommerce.com/");
		
		
		//driver.switchTo().newWindow(WindowType.TAB); //opens the new tab  // selenium4
		driver.switchTo().newWindow(WindowType.WINDOW); //opens the new WINDOW  // selenium4
		
		driver.get("https://www.orangehrm.com/");
		

	}

}
