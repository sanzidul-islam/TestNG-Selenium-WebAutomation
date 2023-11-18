package Larner;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Ignore;
import org.testng.annotations.Test;
import Setup.Setup;

public class Registration extends Setup {
	 
	
	@Test()
	public void learner_registration_mobile() throws InterruptedException {
		
		driver.get("https://muktopaath.gov.bd");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[contains(text(),'EN')]")).click();
		
		driver.findElement(By.xpath("//a[@href='/registration']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[@href='/registration/learner']")).click();
		Thread.sleep(2000);
		driver.findElement(By.name("name")).sendKeys("Sanidul Islam");
		//Profession type selection
		Select drpCountry = new Select(driver.findElement(By.xpath("/html/body/div[3]/div/div/div[4]/div/div/div/div/div[2]/div/form/div[2]/select")));
		drpCountry.selectByVisibleText("Student");
		
		driver.findElement(By.name("certificate_name")).sendKeys("Sanidul Islam Siam");
		//gender selection
		Select selectgender = new Select(driver.findElement(By.xpath("/html/body/div[3]/div/div/div[4]/div/div/div/div/div[2]/div/form/div[4]/select")));
		selectgender.selectByVisibleText("Male");
		
		driver.findElement(By.name("email")).sendKeys("01765532849");
		//password
		driver.findElement(By.name("password")).sendKeys("12345678");
		//confirm password
		driver.findElement(By.name("password_confirmation")).sendKeys("12345678");
		//Physical disability selection
		Select Physical_disability = new Select(driver.findElement(By.xpath("/html/body/div[3]/div/div/div[4]/div/div/div/div/div[2]/div/form/div[8]/div[2]/select")));
		Physical_disability.selectByVisibleText("none");
		//Registration button
		driver.findElement(By.xpath("/html/body/div[3]/div/div/div[4]/div/div/div/div/div[2]/div/form/div[9]/button")).click();
		System.out.println("learner_registration_mobile");
		Thread.sleep(4000);
		//System.out.println("learner_registration_mobile"+ driver.getTitle());
		
		// Get the actual page title
        String actualmessage = driver.findElement(By.xpath("/html/body/div[3]/div/div/div[4]/div/div/div/div[1]/div[1]/div/span")).getText();
        String expectedmessage = "Enter the code sent to your phone / email below";
        if (actualmessage.equals(expectedmessage)) {
            System.out.println("Enter the code sent to your phone below.(done)");
        } else {
            System.out.println("Page message does not match the expected message.");
        }
		
	}
	
	@Test
	public void learner_registration_email() throws InterruptedException {
		
		driver.manage().timeouts().implicitlyWait(60,TimeUnit.SECONDS);
		driver.get("https://muktopaath.gov.bd");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[contains(text(),'EN')]")).click();
		
		driver.findElement(By.xpath("//a[@href='/registration']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[@href='/registration/learner']")).click();
		Thread.sleep(2000);
		driver.findElement(By.name("name")).sendKeys("Sanidul Islam");
		//Profession type selection
		Select drpCountry = new Select(driver.findElement(By.xpath("/html/body/div[3]/div/div/div[4]/div/div/div/div/div[2]/div/form/div[2]/select")));
		drpCountry.selectByVisibleText("Student");
		
		driver.findElement(By.name("certificate_name")).sendKeys("Sanidul Islam Siam");
		//gender selection
		Select selectgender = new Select(driver.findElement(By.xpath("/html/body/div[3]/div/div/div[4]/div/div/div/div/div[2]/div/form/div[4]/select")));
		selectgender.selectByVisibleText("Male");
		
		driver.findElement(By.name("email")).sendKeys("sanzidulislam16@gmail.com");
		//password
		driver.findElement(By.name("password")).sendKeys("12345678");
		//confirm password
		driver.findElement(By.name("password_confirmation")).sendKeys("12345678");
		//Physical disability selection
		Select Physical_disability = new Select(driver.findElement(By.xpath("/html/body/div[3]/div/div/div[4]/div/div/div/div/div[2]/div/form/div[8]/div[2]/select")));
		Physical_disability.selectByVisibleText("none");
		//Registration button
		driver.findElement(By.xpath("/html/body/div[3]/div/div/div[4]/div/div/div/div/div[2]/div/form/div[9]/button")).click();
		System.out.println("learner_registration_email");
		
		
	}
	
}
