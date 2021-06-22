package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import baseclass.ProjectspecificMethods;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

  public class MergeLeadpage extends ProjectspecificMethods{
	  
	  public MergeLeadpage(ChromeDriver driver) {
			this.driver=driver;
		}
    public Leadwindowpage clickfromfirstlead() {
    	driver.findElement(By.xpath("//img[@alt='Lookup']")).click();
    	return new Leadwindowpage(driver);
}
}

