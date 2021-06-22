package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import baseclass.ProjectspecificMethods;


public class MyLeadPage extends ProjectspecificMethods{
	public MyLeadPage(ChromeDriver driver) 
	   {
		this.driver=driver;
		}
	
	public CreateLeadPage clickCreateLeadbutton() {
		
		driver.findElement(By.linkText("Create Lead")).click();		
		return new CreateLeadPage(driver);
		
	}
	public FindLeadpage clickfindLeadbt() {
		driver.findElement(By.linkText("Find Leads")).click();
		return new FindLeadpage(driver);
	}
	
	
	public MergeLeadpage clickmergeLead() {
		driver.findElement(By.linkText("Merge Leads")).click();
		return new MergeLeadpage(driver);
		
	}
	
	
	}
