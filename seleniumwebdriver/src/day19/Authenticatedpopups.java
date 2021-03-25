package day19;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

//http://the-internet.herokuapp.com/basic_auth
	//http://user:password@the-internet.herokuapp.com/basic_auth
		
public class Authenticatedpopups {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "./Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		//inject username and password along with url for authenticated pop ups
		//driver.get("http://admin:admin@the-internet.herokuapp.com/basic_auth");
		driver.get("http://the-internet.herokuapp.com/basic_auth");

	}

	
}
