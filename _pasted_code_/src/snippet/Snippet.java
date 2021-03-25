package snippet;

public class Snippet {
	System.setProperty("webdriver.chrome.driver", "./Drivers\\chromedriver.exe");
			WebDriver driver = new ChromeDriver();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			
			driver.get("https://www.cit.com/cit-bank/resources/calculators/certificate-of-deposit-calculator/");
			driver.manage().window().maximize();
}

