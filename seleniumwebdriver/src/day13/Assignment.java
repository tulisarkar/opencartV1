package day13;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

/*Open Web Browser(Chrome/firefox/IE).
2) Open URL  https://admin-demo.nopcommerce.com/login
3) Provide Email  (admin@yourstore.com).
4) Provide password  (admin).   
5) Click on Login.
		6) Capture title of the dashboad page.(Actual title)
7) Verify title of the page: "Dashboard / nopCommerce administration" (Expected)
8) close browser*/

public class Assignment {

	public static void main(String[] args) {
		//Open Web Browser(Chrome)
		System.setProperty("webdriver.chrome.driver", "./Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		
		//Open Web Browser(firefox)
		//System.setProperty("webdriver.gecko.exe", "./Drivers\\geckodriver.exe");
		//WebDriver driver1=new FirefoxDriver();
		
		//Open Web Browser(edge)
		//System.setProperty("webdriver.edge.exe", "./Drivers\\msedgedriver.exe");
		//WebDriver driver2=new EdgeDriver();
		
		//open URL  
			driver.get("https://admin-demo.nopcommerce.com/login");
			driver.manage().window().maximize();
			
			//clear and Provide Email  
			WebElement email=driver.findElement(By.xpath("//input[@value='admin@yourstore.com']"));
			email.clear();			
			email.sendKeys("admin@yourstore.com");
			
			//clear and Provide password
			WebElement password=driver.findElement((By.xpath("//input[@name='Password' or contains(@class,'password')]")));
			password.clear();
			password.sendKeys("admin");
			
			//click on login
			driver.findElement(By.cssSelector("input[value='Log in']")).click();
			
		//Capture title of the dashboad page
			String ActualTitle=driver.getTitle();
			String ExpTitle="Dashboard / nopCommerce administration";
			
			//compare actual with expected
			if(ActualTitle.equals(ExpTitle))
			{
				System.out.println("Testcase Passed");
			}
			
driver.close();
	}

}
