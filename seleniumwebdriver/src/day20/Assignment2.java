package day20;
//count employees with their status
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class Assignment2 {

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
	int a=0;
	int b=0;
	int c=0;
	int d=0;
	int e=0;
	int f=0;
	
	for(int r=2;r<=rows;r++)
	{
		String status=driver.findElement(By.xpath("//table[@id='resultTable']/tbody/tr["+r+"]/td[6]")).getText();
				
		if(status.equals("Full-Time Contract"))
		{
			a++;
		
		}
		else if(status.equals("Full-Time Permanent"))
		{
			b++;
		}
		else if (status.equals("Full-Time Probation"))
				{
			c++;
				}
		else if (status.equals("Part-Time Contract"))
		{
			d++;
		}
		else if(status.equals("Part-Time Internship"))
				{
			      e++;
				}
		else if (status.equals("Freelance"))
		{
			f++;
		}
	}
		System.out.println("Number of Full Time Contract Employees:"+ a);
		System.out.println("Number of Full Time Permanent Employees:"+b);
		System.out.println("Number of Full Time Probation Employees:"+c);
		System.out.println("Number of Freelance"
				+ " Employees:"+d);
		System.out.println("Number of Part Time Contract Employees:"+e);
		System.out.println("Number of Part Time Internship Employees:"+f);
		System.out.println("Employees with no status=" +(rows-(a+b+c+d+e+f)));
	
		driver.close();
	}
		
		
	}


