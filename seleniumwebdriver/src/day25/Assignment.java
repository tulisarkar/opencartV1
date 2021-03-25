package day25;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Assignment {

	public static void main(String[] args) throws IOException, InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		
		driver.get("https://www.cit.com/cit-bank/resources/calculators/certificate-of-deposit-calculator/");
		driver.manage().window().maximize();
		
		
		String path="C:\\DemoFile\\practice.xlsx";//location ofxl file
		
		int rows=XLUtils.getRowCount(path, "Data");//to find no. of rows
		System.out.println(rows);
		
		for(int i=1;i<=rows;i++) //i is row
		{
			//extract values from cells
			String idepo=XLUtils.getCellData(path, "Data", i, 0);
			String ir=XLUtils.getCellData(path, "Data", i, 1);
			String len=XLUtils.getCellData(path, "Data", i, 2);
			String comp=XLUtils.getCellData(path, "Data", i, 3);
			String exptot=XLUtils.getCellData(path, "Data", i, 4);
			
						
			//pass values in app
			driver.findElement(By.xpath("//input[@id='mat-input-0']")).clear();
			driver.findElement(By.xpath("//input[@id='mat-input-0']")).sendKeys(idepo);
			
			driver.findElement(By.xpath("//input[@id='mat-input-1']")).clear();
			driver.findElement(By.xpath("//input[@id='mat-input-1']")).sendKeys(len);
			
			driver.findElement(By.xpath("//input[@id='mat-input-2']")).clear();
			driver.findElement(By.xpath("//input[@id='mat-input-2']")).sendKeys(ir);
			
			//xpath not working
			//new Select(driver.findElement(By.xpath("//select[@id='cdCompounding']"))).selectByVisibleText(comp);
			driver.findElement(By.xpath("//button[normalize-space()=\"Let's run the numbers\"]")).click();
			
			Thread.sleep(3000);
			
			String acttot=driver.findElement(By.xpath("//span[@id='displayTotalValue']")).getText();
			
			//validation
			
			if(acttot.equals(exptot))
			{
				System.out.println("Testcase passed");
				XLUtils.setCellData(path, "Data", i, 6, "passed");
				XLUtils.fillGreenColor(path, "Data", i, 6);
				
			}
			else
			{
				System.out.println("Testcase failed");
				XLUtils.setCellData(path, "Data", i, 6, "fail");
				XLUtils.fillRedColor(path, "Data", i, 6);
			}
			
		
		}
		
		driver.close();
	}

}
