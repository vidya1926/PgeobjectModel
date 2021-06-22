package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import baseclass.ProjectspecificMethods;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

  public class ViewduplicateLeadpage extends ProjectspecificMethods{
	  
	  public ViewduplicateLeadpage(ChromeDriver driver) {
			this.driver=driver;
		}
public VerifyduplicateLeadpage clickduplicatecreatelead() {
	driver.findElement(By.name("submitButton")).click();
	return new VerifyduplicateLeadpage(driver);
}
}

