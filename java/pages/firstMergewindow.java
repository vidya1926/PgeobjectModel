package pages;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import baseclass.ProjectspecificMethods;

public class firstMergewindow extends ProjectspecificMethods{
	public firstMergewindow (ChromeDriver driver) {
		this.driver=driver;
	}
	public ViewMergewindow clickMergelead() {
		Set<String> allWindows4= driver.getWindowHandles();
		List<String> allhandles4= new ArrayList<String>(allWindows4);
		driver.switchTo().window(allhandles4.get(0));
		
			driver.findElement(By.xpath("//a[text()='Merge']")).click();
		driver.switchTo().alert().accept();
		return new ViewMergewindow(driver);
	}

}
