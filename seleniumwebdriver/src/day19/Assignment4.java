package day19;
/*
	1) search for a string then find out how many links displayed

	2) Click on each link
	3) switch to each browser window then capture titles
	4) close specific browser windows*/

import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment4 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get(" https://testautomationpractice.blogspot.com/");
		driver.manage().window().maximize();
		driver.findElement(By.id("Wikipedia1_wikipedia-search-input")).sendKeys("Selenium");
		driver.findElement(By.xpath("//input[@class='wikipedia-search-button']")).click();
		List<WebElement> options=driver.findElements(By.xpath("//div[@id='wikipedia-search-result-link']"));
System.out.println("Number of options present under searchbox:"+ options.size());
driver.findElement(By.linkText("Selenium")).click();
driver.findElement(By.linkText("Selenium in biology")).click();
driver.findElement(By.linkText("Selenium (software)")).click();
driver.findElement(By.linkText("Selenium disulfide")).click();
driver.findElement(By.linkText("Selenium dioxide")).click();
Set<String> winids=driver.getWindowHandles();
for(String wd:winids)
{
	String title=driver.switchTo().window(wd).getTitle();
	System.out.println(title);
	if(title.equals("Selenium disulfide - Wikipedia")||title.equals("Selenium in biology - Wikipedia"))
	{
		driver.close();
	}
}


}
}
