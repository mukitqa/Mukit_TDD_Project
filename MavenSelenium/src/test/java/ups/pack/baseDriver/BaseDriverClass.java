package ups.pack.baseDriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseDriverClass {

	public WebDriver getChromeDriver() {
		//System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		return driver;
	}

	
	
	
	
}
