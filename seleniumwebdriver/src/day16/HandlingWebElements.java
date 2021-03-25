package day16;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class HandlingWebElements {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("http://www.practiceselenium.com/practice-form.html");
		WebElement firstname=driver.findElement(By.name("firstname"));
		System.out.println("Display Status" +firstname.isDisplayed());
		System.out.println("Enabled Status" +firstname.isEnabled());
		firstname.sendKeys("John");
		
		//firstname.clear();
		//radio button
		WebElement radiobutton=driver.findElement(By.cssSelector("input[value='Male']"));
		System.out.println("Display Status" +radiobutton.isDisplayed());
		System.out.println("Enabled Status" +radiobutton.isEnabled());
		System.out.println("Enabled Status" +radiobutton.isSelected());
		driver.findElement(By.cssSelector("input[value='Female']")).click();
		System.out.println("Enabled Status" +radiobutton.isSelected());
		
		//checkboxes
		
		WebElement checkbox=driver.findElement(By.xpath("//input[@id='tea1']"));
		System.out.println("Display Status" +checkbox.isDisplayed());
		System.out.println("Enabled Status" +checkbox.isEnabled());
		//checkbox.click();
		System.out.println("Enabled Status" +checkbox.isSelected());
		List<WebElement> checkboxes=driver.findElements(By.xpath("//input[@type='checkbox' and contains(@id,'tea')]"));
		for(WebElement chbox:checkboxes) 
		{
			chbox.click();
		//Dropdowns
			WebElement drpdown=driver.findElement(By.id("continents"));
			Select drpselect=new Select(drpdown);
			//Select drpselect=new Select(driver.findElement(By.id("continents"));
			//count number of options
			List<WebElement> options=drpselect.getOptions();//duplicate values allowed so list is used
			System.out.println("Number of options:" +options.size());
		//capture all options
			for(WebElement e:options)
			{
				System.out.println(e.getText());
			}
		//select an option
			//drpselect.selectByVisibleText("USA");
			drpselect.selectByIndex(3);
			//drpselect.selectByValue();
			
			//listbox multiple options can be selected
			WebElement listbox=driver.findElement(By.id("selenium_commands"));
			Select listselect=new Select(listbox);
			List<WebElement>listoptions=listselect.getOptions();
			System.out.println(listoptions.size());
			for(WebElement e:listoptions)
			{
				System.out.println(e.getText());
			}
			
			
			
		}
		}
		

	}


