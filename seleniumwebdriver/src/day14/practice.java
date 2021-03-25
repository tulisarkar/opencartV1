package day14;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeDriverInfo;

//
public class practice {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://automationpractice.com/index.php");
		driver.manage().window().maximize();
		//driver.findElement(By.cssSelector("input#search_query_top")).sendKeys("T-Shirts");
		//driver.findElement(By.cssSelector("button.btn ")).click();
		List<WebElement> li=driver.findElements(By.tagName("a"));
		System.out.println(li.size());
		
		/*for(WebElement l:links)
		{
			System.out.println(l.getText()+"====>"+l.getAttribute("href"));
		}*/
	/*for(int i=1;i<li.size();i++)
	{
		WebElement link=li.get(i);
		System.out.println(link.getText()+"======>"+link.getAttribute("href"));
	}*/
		List<WebElement> imagesliders=driver.findElements(By.className("homeslider-description"));
		System.out.println(imagesliders.size());
		List<WebElement> images=driver.findElements(By.tagName("img"));
		System.out.println(images.size());

	}

}
