package day21;

import java.io.File;
import java.util.HashMap;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.firefox.FirefoxProfile;

public class FiledownloadFireFox {

	public static void main(String[] args) throws InterruptedException {
		FirefoxProfile profile=new FirefoxProfile();
		profile.setPreference("browser.helperApps.neverAsk.saveToDisk", "text/plain");
		profile.setPreference("pdfjs.disabled",true);
		
		FirefoxOptions options=new FirefoxOptions();
		options.setProfile(profile);
	
		
		System.setProperty("webdriver.gecko.driver", "./Drivers\\geckodriver.exe");
		
		WebDriver driver=new FirefoxDriver(options);
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.get("http://demo.automationtesting.in//FileDownload.html");
		driver.manage().window().maximize();
		
		//download text file
		driver.findElement(By.id("textbox")).sendKeys("Testing");
		driver.findElement(By.xpath("//button[@type='button']")).click();
		driver.findElement(By.id("link-to-download")).click();
		
		Thread.sleep(5000);
		//call isFileexist method
		if(isFileExist("C:\\Users\\tulis\\Downloads\\info.txt"))
		{
			System.out.println("Text file exists");
		}
		else
		{
			System.out.println("Text file does not exist");
		}
	
		
		//download pdf file
		
				driver.findElement(By.id("pdfbox")).sendKeys("Testing");
				driver.findElement(By.xpath("//button[@id='createPdf']")).click();
				driver.findElement(By.id("pdf-link-to-download")).click();
				
				//calling static method directly
				if(isFileExist("C:\\Users\\tulis\\Downloads\\info.pdf"))
				{
					System.out.println("pdf File exists");
				}
				else
				{
					System.out.println("File does not exist");
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
