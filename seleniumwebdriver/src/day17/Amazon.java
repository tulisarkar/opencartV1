package day17;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

	 /*Find all links on the page that contain the words 'help' in the href
	 Print list with href value
	  Print the number of links on page*/

public class Amazon {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "./Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.ca/");
		driver.manage().window().maximize();
		List<WebElement> helplinks=driver.findElements(By.xpath("//a[contains(@href,'help')]"));
		System.out.println("Total Number of Help links:"+helplinks.size());
		for(WebElement hl:helplinks)
		{
			System.out.println(hl.getText()+"   "+hl.getAttribute("href"));
			
		}
		List<WebElement>links=driver.findElements(By.tagName("a"));
		System.out.println("Total links on the webpage is" +links.size());
		driver.close();
	}

}
