package day21;

import java.io.File;
import java.util.HashMap;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.firefox.FirefoxProfile;

public class FiledownloadEdge {

	public static void main(String[] args) throws InterruptedException {
		
		//browser profile-browser settings
		FirefoxProfile profile=new FirefoxProfile();
		profile.setPreference("browser.helperApps.neverAsk.saveToDisk", "text/plain,application/pdf");//mime type
		profile.setPreference("pdfjs.disabled", "true");//only for pdfs
		//end of script
		
		//to dowload file in desired location
		profile.setPreference("browser.download.folderList", 2);//0-desktop,1-downloads,2-desired location
		profile.setPreference("browser.download.dir", "C:\\Downloads");//req if above option is 2
		
		FirefoxOptions options=new FirefoxOptions();
		options.setProfile(profile);
		System.setProperty("webdriver.gecko.driver", "./Drivers\\geckodriver.exe");
		
		WebDriver driver=new FirefoxDriver(options);//add options variable to the driver
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
		if(isFileExist("C:\\Users\\tulis\\Downloads\\info.txt"))
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
