package day16;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignmentopencart {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.opencart.com/");
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//a[@title='My Account']")).click();
		driver.findElement(By.linkText("Register")).click();
		driver.findElement(By.xpath("//input[@id='input-firstname' and contains(@name,'firstname')]")).sendKeys("Tuli");
		driver.findElement(By.cssSelector("input#input-lastname")).sendKeys("Mitra");
		driver.findElement(By.cssSelector("input#input-email")).sendKeys("abc@gmail.com");
		driver.findElement(By.xpath("//input[@id='input-telephone']")).sendKeys("4178320907");
		driver.findElement(By.cssSelector("input#input-password")).sendKeys("test@abc");
		driver.findElement(By.cssSelector("input[name='confirm']")).sendKeys("test@abc");
		
		//radiobutton enabled,displayed and selected
		WebElement rb=driver.findElement(By.xpath("//*[@id=\"content\"]/form/fieldset[3]/div/div/label[1]/input"));
		System.out.println("Radio Button is enabled"+ rb.isEnabled());//true
		System.out.println("Radio Button is displayed"+ rb.isDisplayed());//true
		System.out.println("Radio Button is selected"+ rb.isSelected());//false
		
		
		rb.click();
		//After clicking on radiobutton
		System.out.println("Radio Button is selected"+ rb.isSelected());//true
		
		driver.findElement(By.xpath("//input[@name='agree']")).click();
		driver.findElement(By.cssSelector("input.btn")).click();
		driver.close();
	}

}
