package automationpackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;



public class Challenge1 {
	public static void main(String[] args) {
	
	WebDriver driver;
	String url="http://automationpractice.com/index.php";
	
	
		System.setProperty("webdriver.chrome.driver", "./Drivers\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get(url);
		driver.manage().window().maximize();
	
	//locating elements from app
	WebElement women=driver.findElement(By.xpath("//*[@id=\"block_top_menu\"]/ul/li[1]/a"));	
	WebElement tshirt=driver.findElement(By.xpath("//ul[@class='submenu-container clearfix first-in-line-xs']//ul//li//a[@title='T-shirts'][normalize-space()='T-shirts']"));	
		
	//using actions class for mouseover actions
	Actions action= new Actions(driver);
	action.moveToElement(women).moveToElement(tshirt).click().perform();
	
	//getting name of product displayed on tshirts page
	String expproductname=driver.findElement(By.xpath("//a[normalize-space()='Faded Short Sleeve T-shirts']")).getText();
	
	//entering productname into searchbox
	WebElement searchbox=driver.findElement(By.xpath("//input[@id='search_query_top']"));
	searchbox.sendKeys(expproductname);
	
	//clicking on search button
	driver.findElement(By.xpath("//button[@name='submit_search']")).click();
	
	
	//validation(comparing whether same product name is displayed on tshirts page and search page)
	WebDriverWait mywait=new WebDriverWait(driver,30);
	WebElement act=mywait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[@title='Faded Short Sleeve T-shirts'][normalize-space()='Faded Short Sleeve T-shirts']")));
	
	
	if (expproductname.equals(act.getText())) 
	{
		System.out.println("Testcase passed");
	}
	else
	{
		System.out.println("Testcase Failed");
	}
	
		driver.close();

}
}
