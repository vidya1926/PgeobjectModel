package testcase;

import java.io.IOException;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import baseclass.ProjectspecificMethods;
import pages.Loginpage;

public class MergeLead extends ProjectspecificMethods {
	
	@BeforeTest
	public void setfile()
	{ 
		callexcelfile="Mergelead";
	}
	@Test(dataProvider="fetchdata")
public void mergelead(String uname,String pwd,String fname,String fnam) throws InterruptedException, IOException {
		new Loginpage(driver).enterUsername(uname).enterPasssword(pwd).clickLoginbutton().Crmsfa().
		 clickLeadbutton()
		.clickmergeLead().clickfromfirstlead().firstwindowhandle().enterFirstname(fname).clickfindlead()
		.clickfirstlead().clicktoLead().enterFirname(fnam)
		.clickfindlead1().clickfLead().clickMergelead().clickfinLead().verifyMerge();
}
}