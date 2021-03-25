package day34_PageObjectModel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LogInPage {
	//make driver a global variable
	WebDriver driver;
	
	//declare a constructor
	LogInPage(WebDriver driver)
	{
		this.driver=driver;
	}
	
	//locators
	 By txt_Username_loc=By.id("txtUsername");
	By txt_Password_loc=By.name("txtPassword");
	By button_loc=By.id("btnLogin");
	By logo_loc=By.xpath("//div[@id='divLogo']//img");
	By links_loc=By.tagName("a");
	
	//action methods
	
	public void setUserName(String user)
	{
		driver.findElement(txt_Username_loc).sendKeys(user);
	}
	
	public void setPassword(String pwd)
	{
		driver.findElement(txt_Password_loc).sendKeys(pwd);
	}
	
	public void submitButton()
	{
		driver.findElement(button_loc).click();
	}
	
	public boolean checkLogo()
	{
		boolean status=driver.findElement(logo_loc).isDisplayed();
		return status;
	}
	
	public int  noOfLinks()
	{
	return driver.findElements(links_loc).size();
	}
	
	

}
