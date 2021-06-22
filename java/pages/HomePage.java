package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import baseclass.ProjectspecificMethods;

public class HomePage extends ProjectspecificMethods {
	public HomePage(ChromeDriver driver) {
		this.driver=driver;
	}
	
	public Myhomepage Crmsfa() {	
		driver.findElement(By.linkText("CRM/SFA")).click();
		return new Myhomepage(driver);
	
	}
}
