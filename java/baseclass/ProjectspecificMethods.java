package baseclass;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

import io.github.bonigarcia.wdm.WebDriverManager;
import utils.ReadExcel;


public class ProjectspecificMethods {

	public  ChromeDriver driver;
	public String callexcelfile;
	 
	public static   ExtentHtmlReporter reporter;
	public static	ExtentReports extent;
	public static ExtentTest test;
	public String testName,testDescription,testCategory,testAuthor;
	
	
	public int takesnap() throws IOException
	{
		int rannum=(int) (Math.random()*99999);
		File snapshot = driver.getScreenshotAs(OutputType.FILE);
	    File file = new File("./snap/img"+rannum+".png");
	    FileUtils.copyFile(snapshot, file);
	    return rannum;
	}
	@BeforeSuite 
	 public void strartReport() {
	    reporter =new ExtentHtmlReporter("./reports/result.html");
		reporter.setAppendExisting(true);
		 extent=new ExtentReports();
		extent.attachReporter(reporter);
	 }
	@BeforeClass
	public void testDetails() {
		
        test=extent.createTest(testName,testDescription);	
		test.assignCategory(testCategory);
		test.assignAuthor(testAuthor);
	}
	public void reportStep(String msg,String Status) throws IOException {
		if (Status.equalsIgnoreCase("pass"))
		            {
			test.pass(msg,MediaEntityBuilder.createScreenCaptureFromPath(".././snap/img"+takesnap()+".png").build());
		            }
		else if(Status.equalsIgnoreCase("fail")){
			test.fail(msg,MediaEntityBuilder.createScreenCaptureFromPath(".././snap/img"+takesnap()+".png").build());
			throw new RuntimeException();
		 }
		}		
	
	 @DataProvider(name="fetchdata")

	 public String[][] sendData() throws IOException{

	 return ReadExcel.exceldata(callexcelfile);
	 } 
	 
    @BeforeMethod()
    public void startBrowser() throws IOException {
    	
    	
     	  WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
	
		driver.get("http://leaftaps.com/opentaps/control/main");
		driver.manage().window().maximize();
		
       }  
 @AfterMethod()
    public void closeBrowser()
          {
  	         driver.close();
          }
 @AfterSuite
 public void reportClose() {
 extent.flush();
 
}

 
 
}