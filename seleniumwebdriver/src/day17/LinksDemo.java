package day17;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LinksDemo {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		//Find number of links
		List<WebElement>links=driver.findElements(By.tagName("a"));
		System.out.println(links.size());
		//driver.close();
		//capture all links
		/*for(WebElement l:list)
		{
			System.out.println(l.getText()+"====> "+l.getAttribute("href"));
			//l.getAttribute("href")//capture value of href attribute
		}*/
		/*for(int i=1;i<=links.size();i++)
		{
			WebElement link=links.get(i);
			System.out.println(link.getText()+"===>"+link.getAttribute("href"));
		}
//total number of images
		List<WebElement>images=driver.findElements((By.tagName("img")));
		System.out.println(images.size());*/
		//click on link
		System.out.println("Title of pagebefore clicking"+driver.getTitle());
		driver.findElement(By.linkText("Today's Deals")).click();
		System.out.println("Title of page after clicking"+driver.getTitle());
		
		
	}
	

}
