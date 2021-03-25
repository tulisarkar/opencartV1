package day26_jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import day25.XLUtils;

public class FixedDepositCalculator {

	public static void main(String[] args) throws InterruptedException, SQLException {
		System.setProperty("webdriver.chrome.driver", "./Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.get("https://www.moneycontrol.com/fixed-income/calculator/state-bank-of-india-sbi/fixed-deposit-calculator-SBI-BSB001.html");
		driver.manage().window().maximize();
		
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/mydb","root","root");
		Statement stmt=con.createStatement();
		ResultSet rs=stmt.executeQuery("select * from caldata");
		
		
		while(rs.next())
		{
			//getting the values from the cell
			int pric=rs.getInt("principle");
			int rateOfIntrest=rs.getInt("rateOfInterest");
			int per1=rs.getInt("per1");
			String per2=rs.getString("per2");
			String fre=rs.getString("frequency");
			double exp_mvalue=rs.getInt("maturityvalue");
			
						
			//App code
			driver.findElement(By.id("principal")).sendKeys(String.valueOf(pric));
			driver.findElement(By.id("interest")).sendKeys(String.valueOf(rateOfIntrest));
			driver.findElement(By.id("tenure")).sendKeys(String.valueOf(per1));
			
			Select perdrp=new Select(driver.findElement(By.id("tenurePeriod")));
			perdrp.selectByVisibleText(per2);
			
			Select fredrp=new Select(driver.findElement(By.id("frequency")));
			fredrp.selectByVisibleText(fre);
			
			driver.findElement(By.xpath("//div[@class='PT25']//a[1]//img[1]")).click(); //Calculate
			
			Thread.sleep(3000);
			
			String act_mvalue=driver.findElement(By.xpath("//*[@id='resp_matval']/strong")).getText();
			
			//validation
			if(exp_mvalue==Double.parseDouble(act_mvalue))
			{
				System.out.println("Test passed");
				//stmt.execute("update caldata set ressult='passed'");
								
			}
			else
			{
				System.out.println("Test failed");
				//stmt.execute("update caldata set ressult='failed'");
				
			}
			
			driver.findElement(By.xpath("//*[@id='fdMatVal']/div[2]/a[2]/img")).click();
		}
		
		driver.close();

	}

}