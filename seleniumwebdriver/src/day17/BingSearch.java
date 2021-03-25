package day17;
//to find the no. of options in search box
//click on a particular link  
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BingSearch {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.bing.com/");
		driver.manage().window().maximize();
		driver.findElement(By.id("sb_form_q")).sendKeys("selenium training");
		Thread.sleep(3000);
		List<WebElement> list=driver.findElements(By.xpath("//ul[@id='sa_ul']/li"));
		System.out.println("No. of options in search box:" + list.size());
		for(WebElement l:list)
		{
			if(l.getText().contains("toronto"))
			{
				l.click();
			break;
		}
		
driver.close();
	}

	}
}
