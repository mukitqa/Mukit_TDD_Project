package UPSLogin;

import static org.testng.Assert.fail;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class UPSTestRunner {
   WebDriver driver;
   
    UPSLoginTest loginUPS;
   
	@BeforeMethod
	void chromeDriverMethod() {
		this.driver = new ChromeDriver();
		this.loginUPS =new UPSLoginTest(driver);
		System.setProperty("webdriver.chrome.diver", "chromedriver.exe");
		driver.get("https://www.ups.com/lasso/login?");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		
	}
		
		@Test
		void loginErrorTest() {
			String msg=loginUPS.upsLoginerrorTest();
			if  (msg.contains("unsuccessful ")) {
			System.out.println(" PASSED ");
				
		}else{
			
			fail();
		}
		}	
		
		
		@Test
		void loginSuccessTest() throws InterruptedException {
			
			String sMsg=loginUPS.upsLoginSuccessfulTest();
			if(sMsg.contains("information")) {
				System.out.println(" PASSED ");
			}else {
				fail();
			}
			
		}
		/*
		 * @Test void noTest(){ System.out.println("No Test"); }
		 */
	
      @AfterTest
      void afterMethod() {
    	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS) ; 
        driver.quit();
      }
      

}
