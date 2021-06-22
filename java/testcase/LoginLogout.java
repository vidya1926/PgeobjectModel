package testcase;

import java.io.IOException;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import baseclass.ProjectspecificMethods;
import pages.Loginpage;

public class LoginLogout extends ProjectspecificMethods{
	@BeforeTest
	public void setfile()
	{ 
		callexcelfile="Login";
	    testName="Loginwithvaliddata";
	    testDescription="Verify the Login page";
	    testCategory="Functional";
	    testAuthor=" Vidya";
	}
	@Test(dataProvider="fetchdata")
	public void loginlogout(String uname,String pwd) throws IOException {
		new Loginpage(driver).enterUsername(uname).enterPasssword(pwd).clickLoginbutton();
		
	 }

}
