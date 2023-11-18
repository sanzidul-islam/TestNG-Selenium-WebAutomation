package Larner;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.testng.annotations.Test;
import Setup.Setup;

public class Login extends Setup{

	@Test()
	public void Logintest() throws InterruptedException {
		
		driver.manage().timeouts().implicitlyWait(60,TimeUnit.SECONDS);
		driver.get("https://muktopaath.gov.bd");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[contains(text(),'EN')]")).click();
		driver.findElement(By.xpath("//a[@href='/login']")).click();
		driver.findElement(By.name("email")).sendKeys("01748693597");
		driver.findElement(By.name("password")).sendKeys("12345678");
		
		driver.findElement(By.xpath("//*[@id='login_form_details_id']/div/div/div/div[3]/form/div[4]/button")).click();
		System.out.println("Login success");
		Thread.sleep(2000);
	}
	

}
