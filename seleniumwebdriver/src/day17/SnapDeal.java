package day17;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SnapDeal {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.snapdeal.com/");
		driver.manage().window().maximize();
		
		//find all the links on webpage
		List<WebElement> links=driver.findElements(By.tagName("a"));
		
		//to count the number of links on webpage
		System.out.println("Number of links on the webpage=" +links.size());
		
		//to capture the name of links with attributes on webpage
		
			/*(for(WebElement l:links)
			{
				System.out.println(l.getText()+"====>"+l.getAttribute("href"));
			}*/
		
		//to capture a particular link
		for(WebElement l:links)
		{
			if(l.getText().contains("Mobile & Tablets"))
			{
			System.out.println(l.getText()+"===>"+l.getAttribute("a"));
			break;
			}
		}
		
		//to find number of images on webpage
		List<WebElement>images=driver.findElements(By.tagName("img"));
		System.out.println("The number of images on the webpage is" + images.size());
		
		//to find the imagesliders on webpage
		List<WebElement> imagesliders=driver.findElements(By.className("banner-image"));
		System.out.println("Number of image sliders:"+imagesliders.size());
		driver.close();
		

}
	}

