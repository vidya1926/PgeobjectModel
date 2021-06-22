package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import baseclass.ProjectspecificMethods;

public class ViewMergewindow extends ProjectspecificMethods{
	public ViewMergewindow (ChromeDriver driver) {
		this.driver=driver;
	}
	
	public ViewMergewindow clickfinLead() {
	driver.findElement(By.linkText("Find Leads")).click();
	return this;
	}
	public ViewMergewindow verifyMerge() {
		String leadID = driver.findElement(By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a")).getText();	
	driver.findElement(By.xpath("//input[@name='id']")).sendKeys(leadID);
	driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
	String text = driver.findElement(By.className("x-paging-info")).getText();
	if (text.equals("No records to display")) {
		System.out.println("Text matched");

	} else {
		System.out.println("Text not matched");
		System.out.println("Leads are Merged");
	}
	return this;
}
}
