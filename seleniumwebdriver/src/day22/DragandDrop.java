package day22;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragandDrop {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.get("http://www.dhtmlgoodies.com/scripts/drag-drop-custom/demo-drag-drop-3.html");
		driver.manage().window().maximize();
		
		//inspecting the source elements
		WebElement StockholmSource =driver.findElement(By.id("box2"));
		WebElement SourceCopenhagen =driver.findElement(By.id("box4"));
		WebElement SourceRome =driver.findElement(By.id("box6"));
		WebElement SourceMadrid =driver.findElement(By.id("box7"));
		WebElement SourceOslo =driver.findElement(By.id("box1"));
		WebElement SourceWashington =driver.findElement(By.id("box3"));
		WebElement SourceSeoul =driver.findElement(By.id("box5"));
		
		//inspecting target elements
		WebElement SwedenTarget =driver.findElement(By.id("box102"));
		WebElement DenmarkTarget =driver.findElement(By.id("box104"));
		WebElement ItalyTarget =driver.findElement(By.id("box106"));
		WebElement SpainTarget =driver.findElement(By.id("box107"));
		WebElement NorwayTarget =driver.findElement(By.id("box101"));
		WebElement UnitedStatesTarget =driver.findElement(By.id("box103"));
		WebElement SouthKoreaTarget =driver.findElement(By.id("box105"));
		
		//mouse actions
		
		Actions act=new Actions(driver);
		act.dragAndDrop(StockholmSource, SwedenTarget).perform();
		act.dragAndDrop(SourceCopenhagen, DenmarkTarget).perform();
		act.dragAndDrop(SourceRome, ItalyTarget).perform();
		act.dragAndDrop(SourceMadrid, SpainTarget).perform();
		act.dragAndDrop(SourceOslo, NorwayTarget).perform();
		act.dragAndDrop(SourceWashington, UnitedStatesTarget).perform();
		act.dragAndDrop(SourceSeoul, SouthKoreaTarget).perform();
		
		driver.close();
				
	}

}
