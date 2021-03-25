package day25;

import java.io.IOException;
import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Assignment {

	public static void main(String[] args) throws IOException, InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "./Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://www.cit.com/cit-bank/resources/calculators/certificate-of-deposit-calculator/");
		driver.manage().window().maximize();
		
		String path="C:\\DemoFile\\practice.xlsx";
		int rows=XUtils.getRowCount(path, "Data");
		
		//extracting values from cells
		
		for(int i=1;i<=rows;i++)
		{
			String inideposit=XUtils.getCellData(path,"Data", i, 0);
			String intrate=XUtils.getCellData(path, "Data", i, 1);
			String length=XUtils.getCellData(path, "Data", i, 2);
			String comp=XUtils.getCellData(path, "Data", i, 3);
			String Total=XUtils.getCellData(path, "Data", i, 4);
			
					
		//locating elements in app and passing values
		driver.findElement(By.xpath("//input[@id='mat-input-0']")).clear();
		driver.findElement(By.xpath("//input[@id='mat-input-0']")).sendKeys(inideposit);
		
		driver.findElement(By.xpath("//input[@id='mat-input-1']")).clear();
		driver.findElement(By.xpath("//input[@id='mat-input-1']")).sendKeys(length);
		
		driver.findElement(By.xpath("//input[@id='mat-input-2']")).clear();
		driver.findElement(By.xpath("//input[@id='mat-input-2']")).sendKeys(intrate);
		
		Thread.sleep(2000);
		
		//xpath not working. Since compounded monthly is selected by default skipping this element. then script works
		//new Select(driver.findElement(By.xpath("//div[@id='mat-select-value-1']"))).selectByVisibleText("Compounded Monthly");
		
		//
		//location the compounding dropdown box
		WebElement compounddrp=driver.findElement(By.xpath("//*[@id=\"mat-select-value-1\"]/span/span"));
		compounddrp.click();
		
		//getting all the options under compounding dropdown
		List<WebElement> options=driver.findElements(By.xpath("//span[normalize-space()='Compounded Monthly']"));
	for(WebElement option:options)
	{
		if(option.getText().equals (comp))
		{
			option.click();
		}
		//click on lets run numbers button
		driver.findElement(By.xpath("//button[normalize-space()=\"Let's run the numbers\"]")).click();
	}
		
		Thread.sleep(4000);
		String acttotal=driver.findElement(By.xpath("//span[@id='displayTotalValue']")).getText();
			
		if(Total.equals(acttotal))
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
		driver.quit();
		}		
	}


