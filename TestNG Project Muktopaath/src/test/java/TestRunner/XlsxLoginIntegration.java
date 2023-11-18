package TestRunner;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import Larner.ExcelDataSupllierLogin;
import Setup.Setup;

public class XlsxLoginIntegration extends Setup{
	@Test(priority = 1,dataProvider = "data1", dataProviderClass = ExcelDataSupllierLogin.class)
	public void LoginRun(String username, String password) throws InterruptedException {
		
		driver.get("https://muktopaath.gov.bd");		
		Thread.sleep(2000);
		WebElement btnLanguageChange =driver.findElement(By.xpath("//span[contains(text(),'EN')]"));
		btnLanguageChange.click();
		WebElement btnLogin = driver.findElement(By.xpath("//a[@href='/login']"));
		btnLogin.click();
		WebElement txtPhone =driver.findElement(By.name("email"));
		txtPhone.sendKeys(username);
		WebElement txtPassword=driver.findElement(By.name("password"));
		txtPassword.sendKeys(password);
		WebElement btnSubmit=driver.findElement(By.xpath("/html/body/div[3]/div/div/div[4]/div/div/div/div/div[3]/form/div[4]/button"));
		btnSubmit.click();
		String getText = driver.findElement(By.xpath("/html/body/div[6]/div/div/div[4]/div/div[2]/div[1]/div[2]/div/div[1]/div[1]/h1")).getText();
		String actualtext = "Profile Info";
		if(getText.equals(actualtext)) {
			System.out.println("Login success  "+username);
		}
		else {
			System.out.println("Login fail"+username);
		}
		WebElement profileSelect = driver.findElement(By.xpath("/html/body/div[6]/div/div/div[4]/div/div[1]/div/div/ul/li[4]/a/span"));
		profileSelect.click();
		WebElement otherInfoSelect = driver.findElement(By.xpath("/html/body/div[6]/div/div/div[4]/div/div[1]/div/div/ul/li[4]/ul/li[2]/a"));
		otherInfoSelect.click();
		WebElement txtAboutYou = driver.findElement(By.xpath("/html/body/div[6]/div/div/div[4]/div/div[2]/div[1]/div/div/div/form/div/div[5]/div/div/textarea"));
		txtAboutYou.sendKeys("my name is siam .");
		WebElement txtJobExperiance = driver.findElement(By.xpath("/html/body/div[6]/div/div/div[4]/div/div[2]/div[1]/div/div/div/form/div/div[7]/div/div[1]/div/div/input"));
		txtJobExperiance.sendKeys("Sqa Engineer");
		WebElement txtCompanyName = driver.findElement(By.xpath("/html/body/div[6]/div/div/div[4]/div/div[2]/div[1]/div/div/div/form/div/div[7]/div/div[2]/div/div/input"));
		txtCompanyName.sendKeys("Oragebd");
 		//driver.quit();
		
	}

}
