package pages;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import baseclass.ProjectspecificMethods;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

  public class Leadwindowpageagain extends ProjectspecificMethods{
	  
	  public Leadwindowpageagain(ChromeDriver driver) {
			this.driver=driver;
		}
	  
	    	
	    	
   public Leadwindowpageagain enterFirname(String fnam) 
    
    	 throws InterruptedException {
	   //driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
    	driver.findElement(By.xpath("//input[@name='firstName']")).sendKeys(fnam);
    	
    	Thread.sleep(2000);
		return this;
    	}
    	public Leadwindowpageagain clickfindlead1() throws InterruptedException{
    		driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
    		Thread.sleep(2000);
    	return this;
    	}
    	public firstMergewindow clickfLead() {
		driver.findElement(By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a")).click();

    	return new firstMergewindow(driver);
    	}
    	
}

