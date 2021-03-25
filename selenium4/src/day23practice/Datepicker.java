package day23practice;

import java.time.Duration;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Datepicker {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		driver.get("https://testautomationpractice.blogspot.com");
		driver.manage().window().maximize();
		
		//click on datepicker
		driver.findElement(By.xpath("//input[@id='datepicker']")).click();
		
		String month="March";
		String day="24";
		String year="2002";
		
		while(true)
		{
			//to capture month and year from datepicker
			String m=driver.findElement(By.xpath("//*[@id=\"ui-datepicker-div\"]/div/div/span[1]")).getText();
			String y=driver.findElement(By.xpath("//*[@id=\"ui-datepicker-div\"]/div/div/span[2]")).getText();			
			
			if(month.equals(m)&& year.equals(y))
			{
				break;
			}
			//to click the prev button
			driver.findElement(By.xpath("//span[@class='ui-icon ui-icon-circle-triangle-w']")).click();
		}
	
	//selecting the date capture all dates from table
		List<WebElement> alldates=driver.findElements(By.xpath("//table[@class='ui-datepicker-calendar']/tbody/tr/td"));
		for(WebElement dt:alldates)
		{
			String d=dt.getText();
			if(d.equals(day))
			{
				dt.click();
				break;
			}
		}
	
	}

}
