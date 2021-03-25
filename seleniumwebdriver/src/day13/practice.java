package day13;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

/*1) Open Web Browser(Chrome/firefox/Edge).
2) Open URL  https://opensource-demo.orangehrmlive.com/
3) Enter username  (Admin).
4) Enter password  (admin123).   
5) Click on Login.
6) Capture title of the home page.(Actual title) 
7) Verify title of the page: OrangeHRM    (Expected)
8) close browser
 */

public class practice {

	public static void main(String[] args) {
		
		//launch the browser with chrome,firefox or edge
		System.setProperty("webdriver.chrome.driver", "./Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		//maximize the window
		driver.manage().window().maximize();
		
		//System.setProperty("webdriver.gecko.driver", "./Drivers\\geckodriver.exe");
		//WebDriver driver1=new FirefoxDriver();
		
		//System.setProperty("webdriver.edge.driver", "./Drivers\\msedgedriver.exe");
		//WebDriver driver2=new EdgeDriver();
		
		//open url		
		driver.get("https://opensource-demo.orangehrmlive.com/");
		//Enter username
		driver.findElement(By.cssSelector("#txtUsername")).sendKeys("Admin");
		//store password element in pass variable
		WebElement pass=driver.findElement(By.xpath("//input[@name='txtPassword' and contains(@id,'txtPassword')]"));
		pass.sendKeys("admin123");
		//click log in
		driver.findElement(By.cssSelector("input.button")).click();
		//Capture title of the home page.
		String ActTitle=driver.getTitle();
		String ExpTitle="OrangeHRM";
		//verify the actual title with expected title
		if(ActTitle.equals(ExpTitle))
		{
			System.out.println("Test Case passed");
		}
		//close teh driver
		driver.close();
		
	}

}
