package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import baseclass.ProjectspecificMethods;


 public class  FindLeadpage extends ProjectspecificMethods{
	public FindLeadpage(ChromeDriver driver) 
	   {
		this.driver=driver;
		}
	
	public FindLeadpage clickphno() {
		driver.findElement(By.xpath("//span[text()='Phone']")).click();
			return this;
		}	  
	 public FindLeadpage enterphno(String Phno) {
		 driver.findElement(By.xpath("//input[@name='phoneNumber']")).sendKeys(Phno);
		 			return this;
	}

	  public FindLeadpage clickfindLeads() throws InterruptedException
	        {
		  driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
			Thread.sleep(2000);
			return this;
	          }

	   public FindLeadpage clickfirstname() {
		   driver.findElement(By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a")).click();	
			return this;
			}	
	 
	   public EditLeadPage clickEditbt() {
		   driver.findElement(By.linkText("Edit")).click();
		   return new EditLeadPage(driver);
			}	
	   
	   public ViewduplicateLeadpage clickduplicateLead() {
		   driver.findElement(By.linkText("Duplicate Lead")).click();
		   return new ViewduplicateLeadpage (driver);
	   }
		public Deletepage clickdeletelink() {
			driver.findElement(By.linkText("Delete")).click();
			return new Deletepage(driver);
		}
			
	   }
	   
	   

 
