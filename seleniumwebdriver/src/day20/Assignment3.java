package day20;
//capture employee name with their status

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment3 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://opensource-demo.orangehrmlive.com/index.php/auth/login");
		driver.manage().window().maximize();
		
		driver.findElement(By.id("txtUsername")).sendKeys("Admin");
		driver.findElement(By.id("txtPassword")).sendKeys("admin123");
		driver.findElement(By.id("btnLogin")).click();
		
		
		driver.findElement(By.xpath("//a[@id='menu_pim_viewPimModule']")).click();
		driver.findElement(By.xpath("//a[@id='menu_pim_viewEmployeeList']")).click();
		
		int rows=driver.findElements(By.xpath("//table[@id='resultTable']/tbody/tr")).size();
		System.out.println("Totalnumber of employees: "+ rows);
		
		
		for(int r=1;r<=rows;r++)
		{
			String EmpStatus=driver.findElement(By.xpath("//table[@id='resultTable']/tbody/tr["+r+"]/td[6]")).getText();
		if(EmpStatus.equals("Full-Time Contract")||EmpStatus.equals("Full-Time Permanent")||EmpStatus.equals("Full-Time Probation")||EmpStatus.equals("Full-Time Contract")||EmpStatus.equals("Freelance"))
		{
			String EmpName=driver.findElement(By.xpath("//table[@id='resultTable']/tbody/tr["+r+"]/td[3]")).getText();
			System.out.println(EmpStatus+"    "+EmpName);
		}
		
	}

}
}
