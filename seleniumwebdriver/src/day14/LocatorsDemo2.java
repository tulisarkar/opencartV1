package day14;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorsDemo2 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://automationpractice.com/");
		driver.manage().window().maximize();
		
		//classNameLocator
		List<WebElement>sliderimages=driver.findElements(By.className("homeslider-container"));
		System.out.println("Number of imagesliders: "+sliderimages.size());
		
		
		
		
		
		//tagName locator
		List<WebElement>links=driver.findElements(By.tagName("a"));
		System.out.println("Number of links present on homepage" +links.size());
		
		//Total Images
		int noofimages=driver.findElements(By.tagName("img")).size();
		System.out.println("Number of images present on homepage" +noofimages);		
		driver.close();
		

	}

}
