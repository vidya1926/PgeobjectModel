package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import baseclass.ProjectspecificMethods;

public class Myhomepage extends ProjectspecificMethods {

	public Myhomepage(ChromeDriver driver) {
		this.driver=driver;
	}
	public MyLeadPage clickLeadbutton() {
		driver.findElement(By.linkText("Leads")).click();
		return new MyLeadPage(driver);
	}	
	

}
