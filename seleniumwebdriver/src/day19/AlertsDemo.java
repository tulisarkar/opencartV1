package day19;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertsDemo {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//button[contains(text(),'Click Me')]")).click();
		Thread.sleep(5000);
		Alert alertwindow=driver.switchTo().alert();
		System.out.println("Message displayed on alert window"+alertwindow.getText());
		alertwindow.accept();//close alert window using ok button
		//alertwindow.dismiss();//close alert window using cancel button
	}

}
