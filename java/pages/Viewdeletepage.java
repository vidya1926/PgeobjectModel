package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import baseclass.ProjectspecificMethods;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

  public class Viewdeletepage extends ProjectspecificMethods{
	  
	  public Viewdeletepage(ChromeDriver driver) {
			this.driver=driver;
		}
public Viewdeletepage selectfindld() {
	 
		driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
		return this;
}

public Viewdeletepage displaydeleterecord()
{
	String text = driver.findElement(By.className("x-paging-info")).getText();
    System.out.println(text);
if (text.equals("No records to display")) {
	System.out.println("Text matched");
} else {
	System.out.println("Text not matched");
	System.out.println("The Lead gets deleted");
	
	
}
return this;

}

}