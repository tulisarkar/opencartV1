package day25;

import java.io.IOException;
import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CitiBankCalculator {

	public static void main(String[] args) throws IOException, InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "./Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://www.cit.com/cit-bank/resources/calculators/certificate-of-deposit-calculator/");
		driver.manage().window().maximize();
		
		//locate elements in app
		WebElement inideposit=driver.findElement(By.xpath("//input[@id='mat-input-0']"));
		WebElement length=driver.findElement(By.xpath("//input[@id='mat-input-1']"));
		WebElement intrate=driver.findElement(By.xpath("//input[@id='mat-input-2']"));
		WebElement calbutton=driver.findElement(By.xpath("//button[@id='CIT-chart-submit']"));
		
		
		String path="C:\\DemoFile\\practice.xlsx";
		
		//get rowcount from utility file
		int row=XUtils.getRowCount(path, "Data");
		
		//read data from utility file
		
		for(int i=1;i<=row;i++)
		{
				
		String inidepo=XUtils.getCellData(path, "Data", i, 0);
		String ir=XUtils.getCellData(path, "Data", i, 1);
		String len=XUtils.getCellData(path, "Data", i, 2);
		String compounding=XUtils.getCellData(path, "Data", i, 3);
		String total=XUtils.getCellData(path, "Data", i, 4);
		
	
		
		//passing data into application
		
		inideposit.clear();
		length.clear();
		intrate.clear();
		inideposit.sendKeys(inidepo);
		length.sendKeys(len);
		intrate.sendKeys(ir);
		
		//location the compounding dropdown box
		WebElement compoundrp = driver.findElement(By.xpath("//mat-select[@id='mat-select-0']"));   //select class object compounddrp will find elelment by id
		compoundrp.click();
				
				//getting all the options under compounding dropdown
		List<WebElement> options=driver.findElements(By.xpath("//div[@id='mat-select-0-panel']//mat-option"));
		
		for(WebElement option:options)
		{
			if(option.getText().equals(compounding))
				option.click();
		}
		
				
		calbutton.click();   ///click on button to calculate cd calculation based on xl cell data
		String acttotal = driver.findElement(By.xpath("//span[@id='displayTotalValue']")).getText();
		
		System.out.println("act total is: " + acttotal);
		System.out.println("exp total is: " + total);
		
					
				if(total.equals(acttotal))
				{
					System.out.println("Test passed");
					XUtils.setCellData(path,"Data", i, 6, "Passed");
					XUtils.fillGreenColor(path,"Data", i, 6);
					
				}
				else
				{
					System.out.println("Test failed");
					XUtils.setCellData(path,"Data", i, 6, "Failed");
					XUtils.fillRedColor(path,"Data", i, 6);
				}
		}	
				driver.close();
				}		
			

}
