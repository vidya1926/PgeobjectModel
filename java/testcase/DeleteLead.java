package testcase;


import java.io.IOException;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import baseclass.ProjectspecificMethods;
import pages.Loginpage;

public class DeleteLead extends ProjectspecificMethods{
	@BeforeTest
	public void setfile()
	{ 
		callexcelfile="DuplicateLead";
	}
	@Test(dataProvider="fetchdata")
	public  void deletelead (String uname,String pwd,String Phno) throws InterruptedException, IOException {
		new Loginpage(driver).enterUsername(uname).enterPasssword(pwd).clickLoginbutton().Crmsfa().
		clickLeadbutton().clickfindLeadbt().clickphno().enterphno(Phno).clickfindLeads().clickfirstname()
		.clickdeletelink().clickfindLeadsbt().leadId().displaydeleterecord();

}
}