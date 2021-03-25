package day21;

import java.io.File;
import java.util.HashMap;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class FiledownloadChrome {

	public static void main(String[] args) throws InterruptedException {
		
		//script for downoading file in desired location
		HashMap chromPref=new HashMap();
		chromPref.put("download.default_directory", "C:\\Downloads");
		
		ChromeOptions options=new ChromeOptions();
		options.setExperimentalOption("prefs",chromPref);
		//end of script
		
		
		System.setProperty("webdriver.chrome.driver", "./Drivers\\chromedriver.exe");
		//pass option variable in chrome driver
		//WebDriver driver=new ChromeDriver(options);
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.get("http://demo.automationtesting.in//FileDownload.html");
		driver.manage().window().maximize();
		
		//download text file
		driver.findElement(By.id("textbox")).sendKeys("Testing");
		driver.findElement(By.id("createTxt")).click();
		driver.findElement(By.id("link-to-download")).click();
		
		//download pdf file
		
		Thread.sleep(5000);
		//call isFileexist method
		if(isFileExist("C:\\Users\\tulis\\Downloads\info.txt"))
		{
			System.out.println("Text file exists");
		}
		else
		{
			System.out.println("Text file does not exist");
		}
	}
	
	public static boolean isFileExist(String loc)
	{
		File f=new File(loc);
		if(f.exists())
		{
			return true;
		}
		else {
			return false;
		}
	}

}
