package pages;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import baseclass.ProjectspecificMethods;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

  public class CreateLeadPage extends ProjectspecificMethods{
	  
	  public CreateLeadPage(ChromeDriver driver) {
			this.driver=driver;
		}
public CreateLeadPage enterCompanyname(String cname) throws IOException {
		try {
			driver.findElement(By.id("createLeadForm_companyName")).sendKeys(cname);
			reportStep("Companyname is entered successfully","pass");
		} catch (Exception e) {
			reportStep("Companyname is not entered successfully","fail");
		}
		return this;
	}
  
 public CreateLeadPage enterFname(String fname) throws IOException {
	try {
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys(fname);
		reportStep("FirstName is entered successfully","pass");
	} catch (Exception e) {
		reportStep("FirstName is not entered successfully","fail");

	}
	return this;
}

  public CreateLeadPage enterLname(String lname)throws IOException
        {
         try {
			driver.findElement(By.id("createLeadForm_lastName")).sendKeys(lname);
			reportStep("LastName is entered successfully","pass");
		} catch (Exception e) {
			reportStep("LastName is not entered successfully","fail");

		}
        return this;
          }

   public ViewLeadPage clickCreateLead() {
	driver.findElement(By.name("submitButton")).click();
	return new ViewLeadPage(driver);
}	
}
