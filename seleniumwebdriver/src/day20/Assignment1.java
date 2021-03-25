package day20;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Assignment1 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.get("http://www.trycatchclasses.com/code/demo/angular4_crud/");
		driver.manage().window().maximize();
		
		driver.findElement(By.name("name")).sendKeys("Mary");
		driver.findElement(By.xpath("//input[@name='contact']")).sendKeys("101,Bronte Street,Milton");
		Select drpsub=new Select(driver.findElement(By.xpath("//select[@name='subject']")));
	drpsub.selectByVisibleText("CSS");
	driver.findElement(By.xpath("//input[@name='marks']")).sendKeys("97");
	driver.findElement(By.xpath("//input[@value='Submit']")).click();
	
	//to compare the values entered with the table values
	String name=driver.findElement(By.xpath("//table[@class='table table-bordered']/tbody/tr/td[2]")).getText();
	
	String address=driver.findElement(By.xpath("//table[@class='table table-bordered']/tbody/tr/td[3]")).getText();
	String subject=driver.findElement(By.xpath("//table[@class='table table-bordered']/tbody/tr/td[4]")).getText();
	String marks=driver.findElement(By.xpath("//table[@class='table table-bordered']/tbody/tr/td[5]")).getText();
	
		if(name.equals("Mary") && address.equals("101,Bronte Street,Milton") && subject.equals("CSS") && marks.equals("97"))
	{
		System.out.println("Testcase passed");
		}
	else
	{
		System.out.println("Testcase Failed");
	}
	//to edit the data
		driver.findElement(By.xpath("/html/body/app-root/div/div/div[2]/table/tbody/tr/td[6]/button")).click();
		drpsub.selectByVisibleText("HTML");
		driver.findElement(By.xpath("//input[@name='marks']")).clear();
		driver.findElement(By.xpath("//input[@name='marks']")).sendKeys("79");
		driver.findElement(By.xpath("//input[@value='Submit']")).click();
		
		//checking whether data has been edited properly
		String sub=driver.findElement(By.xpath("//td[4]")).getText();
		String mark=driver.findElement(By.xpath("//td[5]")).getText();
		
		
		if(name.equals("Mary") && address.equals("101,Bronte Street,Milton") && sub.equals("HTML") && mark.equals("79"))
		{
			System.out.println("Testcase passed");
			}
		else
		{
			System.out.println("Testcase Failed");
		}
		//delete data from table
		driver.findElement(By.xpath("//td[7]")).click();	
		
		//to check whether table data is deleted
		String msg=driver.findElement(By.xpath("//h6[normalize-space()='No Data Found']")).getText();
		if(msg.equals("No Data Found"))
		{
			System.out.println("Testcase passed");
		}
		else {
			System.out.println("Testcase Failed");
		}
				
		
		
		
		driver.close();
	}

	}

