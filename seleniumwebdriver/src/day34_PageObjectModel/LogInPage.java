package day34_PageObjectModel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LogInPage {
	//we do not initiate driver here but driver instance will be initiated in actual testcase
	WebDriver driver;
	
	//constructor will be automatically invoked at the time of object creation of login page
	//constructor will receive driver argument and this driver is initiated into local driver
	
	LogInPage(WebDriver driver)
	{
		this.driver=driver;//whenever object of login page is created, driver instance should be passed.
		//constructor will receive driver instance and reassign to local driver.
	}
	
	//locators
	
	By txtUserName_loc=By.id("txtUsername");
	By txtPassword_loc=By.name("txtPassword");
	By logIn_loc=By.name("Submit");
	By logo_loc=By.xpath("//div[@id='divLogo']//img");
	By noOfLinks=By.tagName("a");
	
	//action methods
	
	public void setupUserName(String user)
	{
		driver.findElement(txtUserName_loc).sendKeys(user);;
		
	}
	
	public void setupPassword(String pwd)
	{
		driver.findElement(txtPassword_loc).sendKeys(pwd);
		
	}
	
	public void clickLogInButton()
	{
		driver.findElement(logIn_loc).click();
	}
	
	public  boolean logoDisplay()
	{
		boolean status=driver.findElement(logo_loc).isDisplayed();
		return status;
	}
	
	public  int noOfLinksInHomePage()
	{
		 return driver.findElements(noOfLinks).size();
	}
}
