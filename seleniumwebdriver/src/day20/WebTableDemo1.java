package day20;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTableDemo1 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.manage().window().maximize();
		
		//rows in a table
		int rows=driver.findElements(By.xpath("//table[@name='BookTable']/tbody/tr")).size();
		//int rows=driver.findElements(By.tagName("tr")).size();//if there is only one table on the webpage
		System.out.println("No. of rows in the table is:" +rows);	
		
		//Columns in a table
		int cols=driver.findElements(By.xpath("//table[@name='BookTable']/tbody/tr/th")).size();
		//int cols=driver.findElements(By.tagName("th")).size();//if there is only one table on the webpage
		System.out.println("No. of clolumns in the table is:"+cols);
		
		//retrieve specific row and column data
		
		String value=driver.findElement(By.xpath("//table[@name='BookTable']/tbody/tr[6]/td[1]")).getText();
		System.out.println(value);//Master In Java
		
		//to retrieve all data from the table
		/*System.out.println("BookName"+"     "+"Author"+"    "+"Subject"+"     "+"Price");
		for(int r=2;r<=rows;r++)
		{
			
			for(int c=1;c<=cols;c++)
			{
			 value=driver.findElement(By.xpath("//table[@name='BookTable']/tbody/tr["+r+"]/td["+c+"]")).getText();
			 System.out.print(value+"       ");
			}
			System.out.println();
			}
		
		//print booknames whose author is Mukesh
		for(int r=2;r<=rows;r++)
		{
		String author_name=driver.findElement(By.xpath("//table[@name='BookTable']/tbody/tr["+r+"]/td[2]")).getText();
		if(author_name.equals("Mukesh"))
		{
			String book_name=driver.findElement(By.xpath("//table[@name='BookTable']/tbody/tr["+r+"]/td[1]")).getText();
		System.out.println(book_name);
		}*/
		
		//sum of price of all books listed
	
		int total=0;
		for(int r=2;r<=rows;r++) 
		{
			String price=driver.findElement(By.xpath("//table[@name='BookTable']/tbody/tr["+r+"]/td[4]")).getText();
		total=total+Integer.parseInt(price);
				
		}
		System.out.println(total);
		driver.close();
		}
			

	}


