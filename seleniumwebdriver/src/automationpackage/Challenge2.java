package automationpackage;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Challenge2 {

	public static void main(String[] args) 
	{
		WebDriver driver;
		String url="http://automationpractice.com/index.php";
		
		
	System.setProperty("webdriver.chrome.driver", "./Drivers\\chromedriver.exe");
	driver=new ChromeDriver();
	driver.get(url);
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
					
	//clicking on sign in link
	driver.findElement(By.xpath("//*[@id=\"header\"]/div[2]/div/div/nav/div[1]/a")).click();	
			
	//Entering email and password
	driver.findElement(By.xpath("//input[@id='email']")).sendKeys("foe@mailinator.com");
	driver.findElement(By.xpath("//input[@id='passwd']")).sendKeys("testautomation@123");
	driver.findElement(By.xpath("//span[normalize-space()='Sign in']")).click();
		 	   
	 //locating elements from app
	 WebElement women=driver.findElement(By.xpath("//*[@id=\"block_top_menu\"]/ul/li[1]/a"));	
	 WebElement tshirt=driver.findElement(By.xpath("//ul[@class='submenu-container clearfix first-in-line-xs']//ul//li//a[@title='T-shirts'][normalize-space()='T-shirts']"));	
	    			
	  Actions action=new Actions(driver);
	  action.moveToElement(women).moveToElement(tshirt).click().perform();
		
	   WebElement product=driver.findElement(By.xpath("//img[@title='Faded Short Sleeve T-shirts']"));
	   WebElement more=driver.findElement(By.xpath("//span[normalize-space()='More']"));
	   action.moveToElement(product).moveToElement(more).click().perform();
	    	   
	   //increase quantity to 2
	    	   
	   driver.findElement(By.xpath("//i[@class='icon-plus']")).click();
	    	   
	   //select size L
	   new Select(driver.findElement(By.xpath("//select[@id='group_1']"))).selectByValue("3");
	    	   
	   //select colour
	   driver.findElement(By.xpath("//a[@id='color_14']")).click();
	    	   
	   //add to cart
	   driver.findElement(By.xpath("//span[normalize-space()='Add to cart']")).click();
	    	   
	   //proceed to checkout
	    driver.findElement(By.xpath("//*[@id=\"layer_cart\"]/div[1]/div[2]/div[4]/a/span")).click();
	    
	    driver.findElement(By.xpath("//a[@class='button btn btn-default standard-checkout button-medium']//span[contains(text(),'Proceed to checkout')]")).click();
	    	      	   
	   driver.findElement(By.xpath("//button[@name='processAddress']//span[contains(text(),'Proceed to checkout')]")).click();
	   
	   
	   //click on Terms of service checkbox
	    driver.findElement(By.xpath("//input[@id='cgv']")).click();
	  	    	   
	    driver.findElement(By.xpath("//*[@id=\"form\"]/p/button/span")).click();
	   
	    
	    //click on pay by bankwire
	    driver.findElement(By.xpath("//a[@title='Pay by bank wire']")).click();
	    	   
	    //confirming the order
	    driver.findElement(By.xpath("//span[normalize-space()='I confirm my order']")).click();
	    	
	    //validation  
		WebDriverWait mywait= new WebDriverWait(driver,30);
		String exp="Your order on My Store is complete.";
		WebElement act=mywait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//strong[normalize-space()='Your order on My Store is complete.']")));
		
		
			if(exp.equals(act.getText()))
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


