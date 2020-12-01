package UPSLogin;



import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


public class UPSLoginTest {
	
	
	 WebDriver driver;

   public UPSLoginTest(WebDriver driver) {
		this.driver=driver;
	}
	

	
		
		
	public String upsLoginerrorTest() {	
		WebElement closeCokieBanner;
		WebElement userID;
		WebElement passWord;
		WebElement logInBtn;
		WebElement errorMsg;
		String msg=null;
		
		closeCokieBanner=driver.findElement(By.xpath("//*[@id=\"__tealiumImplicitmodal\"]/div/button/span[1]"));
		userID=driver.findElement(By.id("email"));
		passWord=driver.findElement(By.name("password"));
		logInBtn=driver.findElement(By.cssSelector("#submitBtn"));
		
		
		
		closeCokieBanner.click();
		userID.clear();
		userID.sendKeys("userid");
		passWord.clear();
		passWord.sendKeys("password");
		logInBtn.click();
		
		errorMsg=driver.findElement(By.cssSelector("#errorMessages"));
		msg=errorMsg.getText();
		return msg;

		
		
	}	
		public String upsLoginSuccessfulTest() throws InterruptedException {	
			WebElement closeCokieBanner;
			WebElement userID;
			WebElement passWord;
			WebElement logInBtn;
			WebElement successfulMsg;
			String msg;
			
			
			closeCokieBanner=driver.findElement(By.xpath("//*[@id=\"__tealiumImplicitmodal\"]/div/button/span[1]"));
			userID=driver.findElement(By.id("email"));
			passWord=driver.findElement(By.name("password"));
			logInBtn=driver.findElement(By.cssSelector("#submitBtn"));
			
			
			
			closeCokieBanner.click();
			userID.clear();
			userID.sendKeys("mohmukit@gmail.com");
			passWord.clear();
			passWord.sendKeys("Shamollik12#");
			logInBtn.click();
			successfulMsg=driver.findElement(By.cssSelector("#ups-main > div > div > form > h2"));
			msg=successfulMsg.getText();
			return msg;
						
				
			}
			
			/*successfulMsg=driver.findElement(By.cssSelector("#ups-main > div > div > form > h2"));
			msg=successfulMsg.getText();
			return msg;*/
		
		//		try {
//		if(errorMsg.isDisplayed()) {
//			String msg=errorMsg.getText();
//			System.out.println(msg);
//			if  (msg.contains("unsuccessful")) {
//				System.out.println(" PASSED ");
//				
//			}else{
//				System.out.println(" FAILED ");
//			}
//			
//		}
//		}catch(Exception e) {
//			System.out.println(" Error Message Element Not Found! ");
//		}
		//driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	//	driver.quit();

	}


