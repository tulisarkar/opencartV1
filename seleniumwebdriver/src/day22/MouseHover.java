package day22;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseHover {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.get("https://opensource-demo.orangehrmlive.com/index.php/auth/login");
		driver.manage().window().maximize();
		
		driver.findElement(By.id("txtUsername")).sendKeys("Admin");
		driver.findElement(By.id("txtPassword")).sendKeys("admin123");
		driver.findElement(By.id("btnLogin")).click();
		
		//MouseOver
		//Admin-->UserManagement-->users(Mouse over+click)
		
		WebElement admin=driver.findElement((By.xpath("//a[@id='menu_admin_viewAdminModule']")));
		WebElement usermgmt=driver.findElement((By.xpath("//a[@id='menu_admin_UserManagement']")));
		WebElement users=driver.findElement((By.xpath("//a[@id='menu_admin_viewSystemUsers']")));
		
Actions action=new Actions(driver);
action.moveToElement(admin).moveToElement(usermgmt).moveToElement(users).click().perform();
driver.close();
	}

}
