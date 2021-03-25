package MyFinalExamMaven.TuliFinalExam;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class FinalTest<WebDriver> {
	String baseurl=" ";
	WebDriver driver;

@BeforeTest
	public void launchwebsite()
	{
		System.setProperty("webdriver.chrome.driver","./Drivers\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get(baseurl);
		driver.manage().window().maximize();
	}
  @BeforeMethod
  public void verifypagetitle()
  {
	  String exppagetitle=" ";
	  String actpagetitle=driver.getTitle();
	  Assert.assertEquals(actpagetitle,exppagetitle);
  }
@AfterMethod
	 public void gobackhome()
	 {
		 driver.findElement(By.xpath)).click();
	 }

@AfterTest
 public void closewebsite()
 {
	 driver.close();
 }

}
