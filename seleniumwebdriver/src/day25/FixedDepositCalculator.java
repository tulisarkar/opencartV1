package day25;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class FixedDepositCalculator {

	public static void main(String[] args) throws IOException, InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.get("https://www.moneycontrol.com/fixed-income/calculator/state-bank-of-india-sbi/fixed-deposit-calculator-SBI-BSB001.html");
		driver.manage().window().maximize();
		
		String path="C:\\DemoFile\\caldata.xlsx";
		
		int row=XLUtils.getRowCount(path, "Data");
		System.out.println(row);
		
		for(int i=1;i<=row;i++)
		{
			//getting the values from the cell
			String principal=XLUtils.getCellData(path,"Data", i, 0);
			String roi=XLUtils.getCellData(path,"Data",i, 1);
			String p1=XLUtils.getCellData(path,"Data",i, 2);
			String p2=XLUtils.getCellData(path,"Data",i, 3);
			String freq=XLUtils.getCellData(path,"Data",i, 4);
			
			String mv=XLUtils.getCellData(path,"Data",i, 5);
			
			//passing the values in app
			driver.findElement(By.xpath("//input[@id='principal']")).sendKeys(principal);
			driver.findElement(By.xpath("//input[@id='interest']")).sendKeys(roi);
			driver.findElement(By.xpath("//input[@id='tenure']")).sendKeys(p1);
			
			new Select(driver.findElement(By.id("tenurePeriod"))).selectByVisibleText(p2);
			new Select(driver.findElement(By.id("frequency"))).selectByVisibleText(freq);
			
			driver.findElement(By.xpath("//div[@class='PT25']//a[1]//img[1]")).click();//calculate
			Thread.sleep(3000);
			
			//since getText method is used data type is string
			
			String ActMV=driver.findElement(By.xpath("//*[@id=\"resp_matval\"]/strong")).getText();//capture the total maturity value
			
			//validation
			if(Double.parseDouble(mv)==Double.parseDouble(ActMV))
			{
				System.out.println("TestCase passed");
				XLUtils.setCellData(path, "Data", i, 7, "passed");
				XLUtils.fillGreenColor(path, "Data", i, 7);
			}
			else
			{
				System.out.println("Testcase failed");
				XLUtils.setCellData(path, "Data", i, 7, "failed");
				XLUtils.fillRedColor(path, "Data",i, 7);
			}
			
			driver.findElement(By.xpath("//*[@id=\"fdMatVal\"]/div[2]/a[2]/img")).click();
		}
		driver.close();
				
		}
	
	}


