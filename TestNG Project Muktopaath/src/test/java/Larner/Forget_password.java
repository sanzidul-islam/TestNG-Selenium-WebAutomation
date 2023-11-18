package Larner;

import java.util.concurrent.TimeUnit;
import Setup.Setup;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class Forget_password extends Setup{
	
	@Test()
	public void Forget_password_otp() throws InterruptedException {
		driver.manage().timeouts().implicitlyWait(60,TimeUnit.SECONDS);
		driver.get("https://muktopaath.gov.bd");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[contains(text(),'EN')]")).click();
		driver.findElement(By.xpath("//a[@href='/login']")).click();
		//forget pass link
		driver.findElement(By.xpath("//a[@href='/forgot-password']")).click();
		//type mobile number
		driver.findElement(By.xpath("/html/body/div[3]/div/div/div[4]/div/div/div/div[2]/div/input")).sendKeys("01533753563");
		//click submit button
		driver.findElement(By.xpath("/html/body/div[3]/div/div/div[4]/div/div/div/div[3]/button")).click();
		System.out.println("Forget_password");
		
		
		String actualmessage = driver.findElement(By.xpath("/html/body/div[3]/div/div/div[4]/div/div/div/div[1]/p")).getText();
        String expectedmessage = "A code will be send to your phone/email";
        if (actualmessage.equals(expectedmessage)) {
            System.out.println("A code will send to your phone/email.(done)");
        } else {
            System.out.println("A code will send to your phone/email.(fail)");
        }
	}

}
