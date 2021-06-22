package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import baseclass.ProjectspecificMethods;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

  public class Deletepage extends ProjectspecificMethods{
	  
	  public Deletepage(ChromeDriver driver) {
			this.driver=driver;
		}
public Verifydeletepage clickfindLeadsbt() {
	driver.findElement(By.linkText("Find Leads")).click();
	return new Verifydeletepage(driver);
}
}

