package TestRunner;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import Larner.ExcelDataSupllierSearch;
import Setup.Setup;

public class search extends Setup {
	@Test(dataProvider = "data2",dataProviderClass = ExcelDataSupllierSearch.class)
	public void searchrun(String phone) throws InterruptedException {
		driver.get("https://muktopaath.gov.bd");		
		Thread.sleep(2000);
		WebElement btnLanguageChange =driver.findElement(By.xpath("//span[contains(text(),'EN')]"));
		btnLanguageChange.click();
		WebElement btnLogin = driver.findElement(By.xpath("//a[@href='/login']"));
		btnLogin.click();
		WebElement txtPhone =driver.findElement(By.name("email"));
		txtPhone.sendKeys("mukto********.com");
		WebElement txtPassword=driver.findElement(By.name("password"));
		txtPassword.sendKeys("***************");
		WebElement btnSubmit=driver.findElement(By.xpath("/html/body/div[3]/div/div/div[4]/div/div/div/div/div[3]/form/div[4]/button"));
		btnSubmit.click();
		WebElement admin = driver.findElement(By.xpath("/html/body/div[6]/div/div/div[1]/div[2]/div[2]/div[6]/div[3]/i"));
		admin.click();
		WebElement superadmiSelect = driver.findElement(By.xpath("/html/body/div[6]/div/div/div[1]/div[2]/div[2]/div[6]/div[4]/div/div[2]/div[1]/a/div/div[1]"));
		superadmiSelect.click();
		WebElement userManagementSelect = driver.findElement(By.xpath("/html/body/div[6]/div/div/div[4]/div/div[1]/div/div/ul/li[8]/a/span"));
		userManagementSelect.click();
		WebElement userSelect = driver.findElement(By.xpath("/html/body/div[6]/div/div/div[4]/div/div[1]/div/div/ul/li[8]/ul/li[2]/a"));
		userSelect.click();
		WebElement searchPohone =driver.findElement(By.xpath("/html/body/div[6]/div/div/div[4]/div/div[2]/div[1]/div/div[2]/div[1]/div[2]/div[1]/input"));
		searchPohone.sendKeys(phone);
		searchPohone.sendKeys(Keys.ENTER);
		Thread.sleep(9000);
		WebElement btnActionSelect = driver.findElement(By.xpath("/html/body/div[6]/div/div/div[4]/div/div[2]/div[1]/div/div[2]/form/table/tbody/tr/td[5]/div/i"));
		btnActionSelect.click();
		WebElement approveNumber =driver.findElement(By.xpath("/html/body/div[6]/div/div/div[4]/div/div[2]/div[1]/div/div[2]/form/table/tbody/tr/td[5]/div/div/button[1]"));
		approveNumber.click();
	}

}
