package day20;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Assignment2a {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS); 
		driver.get("https://opensource-demo.orangehrmlive.com/index.php/auth/login");
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.findElement(By.id("txtUsername")).sendKeys("Admin");
		driver.findElement(By.id("txtPassword")).sendKeys("admin123");
		driver.findElement(By.xpath("//div[@id='divLoginButton']/input")).click();
		driver.findElement(By.id("menu_pim_viewPimModule")).click();
		driver.findElement(By.id("menu_pim_viewEmployeeList")).click();
		
		//locate the Employment status dropdown 
		
		WebElement empStatDrpDown = driver.findElement(By.xpath("//form[@id='search_form']/fieldset/ol/li/select[@id='empsearch_employee_status']"));
		Select empStatus = new Select(empStatDrpDown);
		empStatus.selectByVisibleText("All");
		
		driver.findElement(By.id("searchBtn")).click();
		int totalEmployees = driver.findElements(By.xpath("//table[@id='resultTable']/tbody/tr")).size();
		System.out.println("Total Employees : " + totalEmployees);
		
				
		empStatDrpDown = driver.findElement(By.xpath("//form[@id='search_form']/fieldset/ol/li/select[@id='empsearch_employee_status']"));
		empStatus = new Select(empStatDrpDown);
		empStatus.selectByVisibleText("Freelance");
		driver.findElement(By.id("searchBtn")).click();
		int totalFreelance = driver.findElements(By.xpath("//table[@id='resultTable']/tbody/tr")).size();
		System.out.println("Total Freelance Employees : " + totalFreelance);
		
		empStatDrpDown = driver.findElement(By.xpath("//form[@id='search_form']/fieldset/ol/li/select[@id='empsearch_employee_status']"));
		empStatus = new Select(empStatDrpDown);
		empStatus.selectByVisibleText("Full-Time Contract");
		driver.findElement(By.id("searchBtn")).click();
		int totalFTContract = driver.findElements(By.xpath("//table[@id='resultTable']/tbody/tr")).size();
		System.out.println("Total Full Time Contract Employees : " + totalFTContract);
		
				
		empStatDrpDown = driver.findElement(By.xpath("//form[@id='search_form']/fieldset/ol/li/select[@id='empsearch_employee_status']"));
		empStatus = new Select(empStatDrpDown);
		empStatus.selectByVisibleText("Full-Time Permanent");
		driver.findElement(By.id("searchBtn")).click();
		int totalFTPerm = driver.findElements(By.xpath("//table[@id='resultTable']/tbody/tr")).size();
		System.out.println("Total Full Time Permanent Employees : " + totalFTPerm);
		
		empStatDrpDown = driver.findElement(By.xpath("//form[@id='search_form']/fieldset/ol/li/select[@id='empsearch_employee_status']"));
		empStatus = new Select(empStatDrpDown);
		empStatus.selectByVisibleText("Full-Time Probation");
		driver.findElement(By.id("searchBtn")).click();
		int totalFTProb = driver.findElements(By.xpath("//table[@id='resultTable']/tbody/tr")).size();
		System.out.println("Total Full Time Probation Employees : " + totalFTProb);
		
		
		empStatDrpDown = driver.findElement(By.xpath("//form[@id='search_form']/fieldset/ol/li/select[@id='empsearch_employee_status']"));
		empStatus = new Select(empStatDrpDown);
		empStatus.selectByVisibleText("Part-Time Contract");
		driver.findElement(By.id("searchBtn")).click();
		int totalPTContract = driver.findElements(By.xpath("//table[@id='resultTable']/tbody/tr")).size();
		System.out.println("Total Part Time Contract Employees : " + totalPTContract);
		
				
		empStatDrpDown = driver.findElement(By.xpath("//form[@id='search_form']/fieldset/ol/li/select[@id='empsearch_employee_status']"));
		empStatus = new Select(empStatDrpDown);
		empStatus.selectByVisibleText("Part-Time Internship");
		driver.findElement(By.id("searchBtn")).click();
		int totalPTIntern = driver.findElements(By.xpath("//table[@id='resultTable']/tbody/tr")).size();
		System.out.println("Total Part Time Internship Employees : " + totalPTIntern);
		
		int noStatusEmployees = totalEmployees - (totalFreelance + totalFTContract + totalFTPerm + totalFTProb + totalPTContract + totalPTIntern);
		System.out.println("Employees with no Employment status: " + noStatusEmployees);
		
		driver.close();

	}

	}


