package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import baseclass.ProjectspecificMethods;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

  public class updatedpage extends ProjectspecificMethods{
	  
	  public updatedpage(ChromeDriver driver) {
			this.driver=driver;
		}
public updatedpage viewpage() {
	String Title1=driver.getTitle();
	System.out.println(Title1);
	System.out.println("Updated Lead");
return this;
}
}
