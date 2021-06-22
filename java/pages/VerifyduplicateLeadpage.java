package pages;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import baseclass.ProjectspecificMethods;

public class VerifyduplicateLeadpage extends ProjectspecificMethods{
	public VerifyduplicateLeadpage(ChromeDriver driver) {
		this.driver=driver;
	}
	public VerifyduplicateLeadpage displayduplicatedLead()
	{
		
		String Title=driver.getTitle();
		System.out.println(Title);
		System.out.println("Lead is duplicated");
		
		return this;
		
	}
}