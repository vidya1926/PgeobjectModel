package pages;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import baseclass.ProjectspecificMethods;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

  public class Leadwindowpage extends ProjectspecificMethods{
	  
	  public Leadwindowpage(ChromeDriver driver) {
			this.driver=driver;
		}
    public Leadwindowpage firstwindowhandle() {
    	Set<String> allWindows = driver.getWindowHandles();
		List<String> allhandles = new ArrayList<String>(allWindows);
		driver.switchTo().window(allhandles.get(1));
		return this;
	}	
    public Leadwindowpage enterFirstname(String fname) 
    
    	 throws InterruptedException {
    		driver.findElement(By.xpath("//input[@name='firstName']")).sendKeys(fname);
    	    Thread.sleep(5000);
    	    return this;
    	}
    
    public Leadwindowpage clickfindlead()throws InterruptedException {
		driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
		Thread.sleep(1000);
	return this;
	}
    	
		public Mergewindow clickfirstlead()  {
			
			driver.findElement(By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a")).click();
			
    	return new Mergewindow(driver);
		}
		
		
    	
}

