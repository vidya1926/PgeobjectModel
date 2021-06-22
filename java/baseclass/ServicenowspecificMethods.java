package baseclass;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;

import io.github.bonigarcia.wdm.WebDriverManager;


public class ServicenowspecificMethods {
	public  ChromeDriver driver;
	
	@BeforeMethod
	
    public void startBrowser() throws IOException {
    	
    
         WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();

		driver.get("https://dev103117.service-now.com");
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(15));
		driver.manage().window().maximize();
		
       }  
      @AfterMethod
    public void closeBrowser()
          {
  	       System.out.println("successful");
          }

}

