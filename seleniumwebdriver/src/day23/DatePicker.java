package day23;



import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DatePicker {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://jqueryui.com/datepicker/");
		driver.manage().window().maximize();
		
		driver.switchTo().frame(0);
		
		//driver.findElement(By.id("datepicker")).sendKeys("03/23/2001");
		
		String month="July";
		String date="23";
		String year="2021";
		driver.findElement(By.xpath("//input[@id='datepicker']")).click(); // opens the Date Picker
		
		while(true)
		{
			//capture the month and date displayed on the datepicker
			String m=driver.findElement(By.xpath("//span[@class='ui-datepicker-month']")).getText();
			String y=driver.findElement(By.xpath("//span[@class='ui-datepicker-year']")).getText();
			if(month.equals(m)&& year.equals(y))
			{
				break;
			}
			//to click forward button on datepicker
			driver.findElement(By.xpath("//*[@id=\"ui-datepicker-div\"]/div/a[2]/span")).click();

			//to click on prev button on datepicker
			//driver.findElement(By.xpath("//span[@class='ui-icon ui-icon-circle-triangle-w']")).click();
		}
			//selecting date
			List<WebElement> alldates=driver.findElements(By.xpath("//table[@class='ui-datepicker-calendar']/tbody/tr/td"));
			for(WebElement d:alldates)
			{
				String dt=d.getText();
				if(dt.equals(date))
				{
					
					d.click();
					break;
				}
			}
			
			
			
		}
		
	}


