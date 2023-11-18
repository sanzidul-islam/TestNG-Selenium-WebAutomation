package Setup;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeTest;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Setup {

	
		public WebDriver driver;
		@BeforeTest
		public void Lunch_driver() {
			
			//WebDriverManager.chromedriver().setup();
			//driver =new ChromeDriver();
	    	//driver.manage().window().maximize();
			
			WebDriverManager.firefoxdriver().setup();
			driver =new FirefoxDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(60,TimeUnit.SECONDS);
			
		}


}
