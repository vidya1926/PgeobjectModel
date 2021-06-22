package pages;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import baseclass.ProjectspecificMethods;

public class Loginpage extends ProjectspecificMethods{
	public Loginpage(ChromeDriver driver) {
		this.driver=driver;
	}
	public Loginpage enterUsername(String uname) throws IOException {
		try {
			driver.findElement(By.id("username")).sendKeys(uname);
			reportStep("username is entered Successfully","pass");
		   } catch (Exception e) {
			reportStep("username is not entered Successfully","fail");
		}
		return this;
	}
	public Loginpage enterPasssword(String pwd) throws IOException{
		try {
			driver.findElement(By.id("password")).sendKeys(pwd);
			reportStep("password is entered Successfully","pass");
		} catch (Exception e) {
			reportStep("password is not entered Successfully","fail");
		}
		return this;
	}
	
	public HomePage clickLoginbutton() throws IOException
	{
		try {
		driver.findElement(By.className("decorativeSubmit")).click();
		reportStep("Login clicked sucessfully","pass");
	} catch (Exception e) {
		reportStep("Login clicked sucessfully","fail");
	}
		
		return new HomePage(driver);
		}
}
