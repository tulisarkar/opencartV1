package day16;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;



public class Assignmenttestautomation {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.manage().window().maximize();
		
		Select drpdn=new Select(driver.findElement(By.xpath("//select[@id='speed']")));
		//to get number of options in dropdown1
		List<WebElement>options=drpdn.getOptions();
		System.out.println("No. of elements in the dropdown : "+ options.size());
		
		//to print options under dropdown 1
		for(WebElement o:options)
		{
			System.out.println(o.getText());
		}
		//select an option 
		drpdn.selectByIndex(0);
		
		Select drpdn1=new Select(driver.findElement(By.cssSelector("select#files")));
		
		//to get number of options in dropdown 2
		List<WebElement> option1=drpdn1.getOptions();
				System.out.println("No. of elements in the dropdown :" +option1.size());
				
				//to print options under dropdown 2
				for(WebElement o1:option1)
				{
					System.out.println(o1.getText());
				}
				//select a particular option
				drpdn1.selectByVisibleText("Other file"); 
				
				//to get number of options in dropdown 3
				Select drpdn2=new Select(driver.findElement(By.xpath("//select[@name='number']")));
					List<WebElement> option=drpdn2.getOptions();
					System.out.println("No. of elements in the dropdown :" +option.size());
				
					//to print options under dropdown 3
					for(WebElement o2:option)
					{
						System.out.println(o2.getText());
					}
					//select a particular option
					drpdn2.selectByVisibleText("2");
					
			Select drpdn3=new Select(driver.findElement(By.xpath("//select[@name='products']")));
			drpdn3.selectByVisibleText("Iphone");
			
			Select drpdn4=new Select(driver.findElement(By.xpath("//select[@name='animals']")));
			drpdn4.selectByVisibleText("Cat");
			
			driver.close();
	}

}
