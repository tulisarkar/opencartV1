package day21;

import java.io.File;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class practice {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.get("http://demo.automationtesting.in//FileDownload.html");
		driver.manage().window().maximize();
		
		//download text file
		driver.findElement(By.id("textbox")).sendKeys("Testing");
		driver.findElement(By.xpath("//button[@type='button']")).click();
		driver.findElement(By.id("link-to-download")).click();
		
		//calling static method directly
		if(isFileExists("C:\\Users\\tulis\\Downloads\\info.txt"))
		{
			System.out.println("File exists");
		}
		else
		{
			System.out.println("File does not exist");
		}
	

		//download pdf file
		driver.findElement(By.id("pdfbox")).sendKeys("Testing");
		driver.findElement(By.xpath("//button[@id='createPdf']")).click();
		driver.findElement(By.id("pdf-link-to-download")).click();
		
		//calling static method directly
		if(isFileExists("C:\\Users\\tulis\\Downloads\\info.pdf"))
		{
			System.out.println("File exists");
		}
		else
		{
			System.out.println("File does not exist");
		}
	
	}
	
	
public static boolean isFileExists(String loc)
{
	File f=new File(loc);
	if(f.exists())
	{
		return true;
	}
	else
	{
		return false;
	}
}

}
