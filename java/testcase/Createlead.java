package testcase;

import java.io.IOException;

import org.openqa.selenium.remote.service.DriverService;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import baseclass.ProjectspecificMethods;
import pages.CreateLeadPage;
import pages.Loginpage;

public class Createlead extends ProjectspecificMethods {
	@BeforeTest
	public void setfile()
	{ 
		callexcelfile="createLead";
		testName="CreateLead";
	    testDescription="Verify the createLead";
	    testCategory="Functional";
	    testAuthor=" Vidya";
	}
	@Test(dataProvider="fetchdata")
public void runCreatelead(String uname,String pwd,String cname,String fname,String lname) throws IOException {
		new Loginpage(driver).enterUsername(uname).enterPasssword(pwd).clickLoginbutton().Crmsfa().
		clickLeadbutton().clickCreateLeadbutton().enterCompanyname(cname).enterFname(fname).enterLname(lname).clickCreateLead().displayViewLead();

}}