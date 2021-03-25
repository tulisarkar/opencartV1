package day20;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS); // wait
		driver.get("https://opensource-demo.orangehrmlive.com/index.php/auth/login");
		driver.manage().window().maximize();
	//login
		driver.findElement(By.id("txtUsername")).sendKeys("Admin");
		driver.findElement(By.id("txtPassword")).sendKeys("admin123");
		driver.findElement(By.id("btnLogin")).click();
		//
		driver.findElement(By.id("menu_pim_viewPimModule")).click();
		driver.findElement(By.id("menu_pim_viewEmployeeList")).click();
int rows=driver.findElements(By.xpath("//table[@id='resultTable']/tbody/tr")).size();
 int col=driver.findElements(By.xpath("//*[@id=\"resultTable\"]/tbody/tr[1]/td")).size();

	for(int r=2;r<=rows;r++)
	{
		String employ_status =driver.findElement(By.xpath("//tbody/tr["+r+"]/td[6]")).getText();
if(employ_status.equals("Full-Time Contract")||employ_status.equals("Full-Time Contract")||employ_status.equals("Full-Time Permanent")|| employ_status.equals("Part-Time Contract")||employ_status.equals("Full-Time Probation"))
{
			String name	=driver.findElement(By.xpath("//*[@id=\"resultTable\"]/tbody/tr["+r+"]/td[3]")).getText();
			System.out.print("The Employ staus: "+name+"--- "+employ_status);
		}
	
		System.out.println();}
	
	driver.close();
	}

 
	}


