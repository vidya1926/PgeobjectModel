package pages;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import baseclass.ProjectspecificMethods;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

  public class Mergewindow extends ProjectspecificMethods{
	  
	  public Mergewindow(ChromeDriver driver) {
			this.driver=driver;
		}
    
    public Leadwindowpageagain clicktoLead() { 
    	Set<String> allWindows1= driver.getWindowHandles();
    	List<String> allhandles1 = new ArrayList<String>(allWindows1);
    	driver.switchTo().window(allhandles1.get(0)); 
    	
		driver.findElement(By.xpath("(//img[@alt='Lookup'])[2]")).click();
    
		Set<String> allWindows2= driver.getWindowHandles();
    	List<String> allhandles2 = new ArrayList<String>(allWindows2);
    	driver.switchTo().window(allhandles2.get(1));	
    	return new Leadwindowpageagain(driver);
    	}
}

