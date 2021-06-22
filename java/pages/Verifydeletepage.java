package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import baseclass.ProjectspecificMethods;

public class Verifydeletepage extends ProjectspecificMethods{
	public Verifydeletepage(ChromeDriver driver) {
		this.driver=driver;
	}
	public Viewdeletepage leadId() {
		String leadID = driver.findElement(By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a")).getText();
		driver.findElement(By.xpath("//input[@name='id']")).sendKeys(leadID);
		return new Viewdeletepage(driver);
	}
	
		
}	
		