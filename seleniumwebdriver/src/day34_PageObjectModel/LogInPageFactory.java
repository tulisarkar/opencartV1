package day34_PageObjectModel;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LogInPageFactory {
	
	WebDriver driver;
	LogInPageFactory(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	//elements
	
	
	@FindBy(id="txtUsername") 
	WebElement txt_Username; 
	
	@FindBy(name="txtPassword")
	WebElement txt_Password;
	
	@FindBy(id="btnLogin")
	WebElement button;
	
	@FindBy(xpath="//div[@id='divLogo']//img")
	WebElement logo;
	
	@FindBy(tagName="a")
	List<WebElement> links;
	
	//action methods
	
	public void setUserName(String user)
	{
	txt_Username.sendKeys(user);
	}
	
	public void setPassword(String pwd)
	{
	txt_Password.sendKeys(pwd);
	}
	
	public void submitButton()
	{
		button.click();
	}
	
	public boolean checkLogo()
	{
		boolean status=logo.isDisplayed();
		return status;
	}
	
	public int  noOfLinks()
	{
	return links.size();
	}
	
	

	

}
