package day25;

import java.io.IOException;
import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.List;



public class citibank {

	public static void main(String[] args) throws InterruptedException, IOException {
		
		System.setProperty("webdriver.chrome.driver", "./Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
		driver.get("https://www.cit.com/cit-bank/resources/calculators/certificate-of-deposit-calculator/");
		driver.manage().window().maximize();
		
		
		WebElement inideposit = driver.findElement(By.xpath("//input[@id='mat-input-0']"));		
		WebElement length = driver.findElement(By.xpath("//input[@id='mat-input-1']"));	
		WebElement ir = driver.findElement(By.xpath("//input[@id='mat-input-2']"));
		WebElement calbutton = driver.findElement(By.xpath("//button[@id='CIT-chart-submit']")); // 'Lets run the numbers' button
		
		System.out.println("user has identified all elements to calculate CD");
	
		String path="C:\\DemoFile\\practice.xlsx";   // giving path to file to start reading
		int rows=XLUtils.getRowCount(path, "Data");				// get a row count from the sheet
		System.out.println("row count is : " + rows);
		
		for(int i=1;i<=rows;i++)
		{			
			//Reading data from excel
			String inidepo= XLUtils.getCellData(path,"Data",i,0);				//file,sheet,row #, col zero for initial deposit
			String interestrate=XLUtils.getCellData(path,"Data",i, 1);		//interest rate
			String monthlength=XLUtils.getCellData(path,"Data",i, 2);			//length
			String compoundingmonths=XLUtils.getCellData(path,"Data",i, 3);	//compounding
			String exptotal=XLUtils.getCellData(path,"Data",i, 4);	//expected total , will be compared with actual total

			//passing the data into the application
			inideposit.clear();
			length.clear();
			ir.clear();
			//Thread.sleep(3000);
			inideposit.sendKeys(inidepo);   //using webelement and passing the values from xl cell data
			length.sendKeys(monthlength);
			ir.sendKeys(interestrate);
						
			//Dropdown (Boostrap) - Not having Select Tag
			WebElement compoundrp = driver.findElement(By.xpath("//mat-select[@id='mat-select-0']"));   //select class object compounddrp will find elelment by id
			compoundrp.click();
			
			List<WebElement> options=driver.findElements(By.xpath("//div[@id='mat-select-0-panel']//mat-option"));
			
			for(WebElement option:options)
			{
				if(option.getText().equals(compoundingmonths))
					option.click();
			}
			
					
			calbutton.click();   ///click on button to calculate cd calculation based on xl cell data
			String acttotal = driver.findElement(By.xpath("//span[@id='displayTotalValue']")).getText();
			
			System.out.println("act total is: " + acttotal);
			System.out.println("exp total is: " + exptotal);
			
			if(exptotal.equals(acttotal)) 
			{			//if expected total = actual total then			
				
				XLUtils.setCellData(path, "Data",i, 6,"Passed");	//setting passed in 6th column (index start with zero)
				XLUtils.fillGreenColor(path, "Data",i, 6);	//filling the color in 6th column if passed then greeen or faile then red.
			}
			else
			{
				XLUtils.setCellData(path, "Data",i, 6,"Failed");
				XLUtils.fillRedColor(path, "Data",i, 6);
			}
		}
			System.out.println("calculation has been completed");
			driver.close();
		}


	}


