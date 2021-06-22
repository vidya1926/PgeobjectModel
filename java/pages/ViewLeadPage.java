package pages;

import org.openqa.selenium.chrome.ChromeDriver;

import baseclass.ProjectspecificMethods;

public class ViewLeadPage extends ProjectspecificMethods {
	public ViewLeadPage(ChromeDriver driver) {
		this.driver=driver;
}
	public ViewLeadPage displayViewLead() {
		String Title1=driver.getTitle();
		System.out.println(Title1);
	return this;
}
	
	
}