package day21;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class AssignmentFileUpload {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get(" https://testautomationpractice.blogspot.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		//switch to form
		driver.switchTo().frame(0);
		
		driver.findElement(By.xpath("//*[@id=\"RESULT_TextField-1\"]")).sendKeys("tuli");
		driver.findElement(By.id("RESULT_TextField-2")).sendKeys("mitra");
		driver.findElement(By.id("RESULT_TextField-3")).sendKeys("41767320802");
		driver.findElement(By.id("RESULT_TextField-4")).sendKeys("Canada");
		driver.findElement(By.id("RESULT_TextField-5")).sendKeys("Mississauga");
		driver.findElement(By.id("RESULT_TextField-6")).sendKeys("tuli.sarkar2008@gmail.com");
		driver.findElement(By.xpath("//*[@id=\"q26\"]/table/tbody/tr[2]/td/label")).click();
		driver.findElement(By.xpath("//label[@for='RESULT_CheckBox-8_0']")).click();
			
	Select drpdn=new Select(driver.findElement(By.id("RESULT_RadioButton-9")));
	drpdn.selectByIndex(0);
	
	//upload file
	driver.findElement(By.xpath("//input[@id='RESULT_FileUpload-10']")).sendKeys("C:\\Data\\Tuli\\abc.txt");
			
	driver.findElement(By.name("Submit")).click();
	driver.close();

	}

}
