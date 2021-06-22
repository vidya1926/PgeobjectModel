package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import baseclass.ProjectspecificMethods;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

  public class EditLeadPage extends ProjectspecificMethods{
	  
	  public EditLeadPage(ChromeDriver driver) {
			this.driver=driver;
		}
	  public EditLeadPage enterUpdateleadform(String cname) {
		  driver.findElement(By.id("updateLeadForm_companyName")).sendKeys(cname);
		  return this;
	  }
	 
	  
	  public updatedpage clickeditSubmit() {
		  
			driver.findElement(By.name("submitButton")).click();
			return new updatedpage(driver);
			
	  }

  }