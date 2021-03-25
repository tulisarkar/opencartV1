package day16;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Assignmentfb {
	//https://www.facebook.com/r.php
		//2) https://demo.opencart.com/index.php?route=account/register
		//3) https://testautomationpractice.blogspot.com/

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/r.php");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys("Mary");
		driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys("Brown");
		driver.findElement(By.name("reg_email__")).sendKeys("mary.brown@gmail.com");
		driver.findElement(By.xpath("//input[@name='reg_passwd__']")).sendKeys("abc@test");
		Select date=new Select(driver.findElement(By.xpath("//select[@id='month']")));
		List<WebElement>options=date.getOptions();
		//prints number of options present in month dropdown
		System.out.println(options.size());
		
		//prints the options under month dropdown
		for(WebElement d:options)
		{
			System.out.println(d.getText());
		}
		date.selectByVisibleText("Jul");
		Select day=new Select(driver.findElement(By.cssSelector("#day")));
		day.selectByVisibleText("25");
		List<WebElement>op=day.getOptions();
		
		//prints number of options under date dropdown
		System.out.println(op.size());
		
		//prints the  all dates in the dropdown
		for(WebElement n:op)
		{
			System.out.println(n.getText());
		}
		
Select year= new Select(driver.findElement(By.cssSelector("select#year")));
year.selectByVisibleText("1990");

//prints all the year options present in the dropdown
List<WebElement>y=year.getOptions();

//prints number of years present under dropdown
System.out.println(y.size());

//prints all the years in the dropdown
for(WebElement x:y)
{
	System.out.println(x.getText());
}
driver.findElement(By.xpath("//input[@value='2']")).click();
	//clicks on submit button
	
	driver.findElement(By.xpath("//button[@name='websubmit']")).click();
	//close browser
	driver.close();
	}
}
