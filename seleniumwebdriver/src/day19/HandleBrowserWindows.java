package day19;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleBrowserWindows {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("http://demo.automationtesting.in/Windows.html");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//*[@id=\"Tabbed\"]/a/button")).click();
		Set<String> windowid=driver.getWindowHandles();
		for(String winid:windowid)
		{
			String title=driver.switchTo().window(winid).getTitle();
			if(title.equals("SeleniumHQ Browser Automation"))
			{
				driver.findElement(By.xpath("//*[@id=\"navbar\"]/a[3]")).click();
			}
		}

	}

}
