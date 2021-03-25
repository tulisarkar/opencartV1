package day17;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GoogleSearch {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.google.com/");
		//enter "java training in search box"
		driver.findElement(By.name("q")).sendKeys("java training");
		Thread.sleep(3000);
		List<WebElement> options=driver.findElements(By.xpath("//ul[@class='erkvQe']/li"));
		//to find the number of webelements under search box
System.out.println("The list of elements displayed inder searchbox is" + options.size());
for(WebElement i:options)
{
	if(i.getText().contains("near me"))
	{
		i.click();
		break;
	}
	}
	
}
	}


