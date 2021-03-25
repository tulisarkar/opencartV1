package firsttestngpackage;

import org.testng.annotations.Test;

public class FirstTestNGFile {
	
	public String baseURL="http://www.newtours.demoaut.com";
	public System.setProperty("webdriver.chrome.driver","./Drivers\\chromedriver.exe");
	public Webdriver driver=new ChromeDriver();
  @Test
  public void f() {
  }
}
