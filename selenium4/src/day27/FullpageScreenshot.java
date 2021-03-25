package day27;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FullpageScreenshot {

	public static void main(String[] args) throws IOException {
	System.setProperty("webdriver.chorome.driver", "./Drivers\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	driver.get("https://demo.nopcommerce.com/");
	driver.manage().window().maximize();
	
	
	TakesScreenshot ts=(TakesScreenshot)driver;
	File src= ts.getScreenshotAs(OutputType.FILE);
	File trg=new File(System.getProperty("user.dir"+"\\Screenshots\\homepage.png"));
	
	FileUtils.copyFile(src, trg);
	driver.close();
	
	
	
	

	}

}
