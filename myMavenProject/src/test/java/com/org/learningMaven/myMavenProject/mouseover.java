
			
			package com.org.learningMaven.myMavenProject;

			import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
			import org.openqa.selenium.WebElement;
			import org.openqa.selenium.chrome.ChromeDriver;
			import org.openqa.selenium.firefox.FirefoxDriver;
			import org.openqa.selenium.interactions.Actions;

			public class mouseover {

				public static void main(String[] args) {
					
					System.setProperty("webdriver.chrome.driver", "./Drivers\\chromedriver.exe");
					String baseURL="http://flex.apache.org/";
					WebDriver driver= new ChromeDriver();
					driver.get(baseURL);
					driver.manage().window().maximize();
					
					WebElement mouse= driver.findElement(By.linkText("ABOUT FLEX"));
					Actions actions= new Actions(driver);
					actions.moveToElement(mouse);
					actions.click().build().perform();
					WebElement mouse1=driver.findElement(By.linkText("FEATURES"));
					actions=new Actions(driver);
					actions.moveToElement(mouse1);
					actions.click().build().perform();
					
					
					
					
					
					
					
					
					
					
					
					
					
					
					
					
					
					
					
					
					
					// TODO Auto-generated method stub
					//String baseURL = "http://flex.apache.org/";
					//System.setProperty("webdriver.chrome.driver","./Drivers\\chromedriver.exe");
					//WebDriver driver = new ChromeDriver();
					//driver.get(baseURL);
					//driver.manage().window().maximize();
					
										
					//WebElement mouse = driver.findElement(By.xpath("//a[contains(text(),'About Flex')]"));
					//Actions actions = new Actions(driver);
					//actions.moveToElement(mouse);
					//actions.click().build().perform();
					
					//WebElement mouse2 = driver.findElement(By.xpath("//a[contains(text(),'The Team')]"));
					//actions = new Actions(driver);
					//actions.moveToElement(mouse2);
					//actions.click().build().perform();
							
					
				
					



				}



	}


