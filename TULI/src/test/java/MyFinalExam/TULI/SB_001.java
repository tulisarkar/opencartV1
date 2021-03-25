package MyFinalExam.TULI;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class SB_001 {
	String baseurl = "https://slidebean.com/";
	WebDriver driver;
	

	 @BeforeTest

 	 //@Parameters("browser")
		public void launchWebsite() {
			
				System.setProperty("webdriver.chrome.driver", "./Drivers\\chromedriver.exe");
				driver=new ChromeDriver();
							
		
		driver.get(baseurl);
		driver.manage().window().maximize();
	 }
	@BeforeMethod
	public void verifycurrenturl()
	{
		
		
		String expected="https://slidebean.com/";
		String actual=driver.getCurrentUrl();
		Assert.assertEquals(actual,expected);
	}
			
	
  @AfterTest
  public void closewebsite()
 {
	  driver.quit();
  }
  
  @Test(priority=0)
  public void signup()
  {
	  driver.findElement(By.xpath("//a[contains(text(),'SIGN IN')]")).click();
	  driver.findElement(By.xpath("//input[@placeholder='example@email.com']")).sendKeys("bqatuser19@mailinator.com");
	  driver.findElement(By.xpath("//div[@class='input-group']//input[@class='form-control ng-untouched ng-pristine ng-invalid']")).sendKeys("test2plug19");
       driver.findElement(By.xpath("//button[@class='btn btn-lg btn-block btn-primary btn-rounded']")).click();
       driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
       
    driver.findElement(By.xpath("//i[@class='fal fa-angle-down d-none d-sm-inline-block ml-1']")).click();
    driver.findElement(By.xpath("//span[contains(text(),'Settings')]")).click();
    driver.findElement(By.xpath("//input[@placeholder='Jon Snow']")).clear();
    driver.findElement(By.xpath("//input[@placeholder='Jon Snow']")).sendKeys("TULI");
    driver.findElement(By.xpath("//span[contains(text(),'Save Changes')]")).click();
       
       
       WebDriverWait mywait = new WebDriverWait (driver,30);
	    WebElement a = mywait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[contains(text(),'Profile updated')]")));
	    String exp="Profile updated";
	   Assert.assertEquals(a.getText(), exp);
	   
	  
      
       


  }
  
  
}
