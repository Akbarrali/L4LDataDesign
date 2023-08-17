package L4L.DD.Test;

import java.io.IOException;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

import DD.l4l.base.L4lBaseClass;
import L4L.DD.pages.LoginPage;
import L4L.DD.pages.StudentProfilepage;
import L4L.DD.pages.StudentTrackerPage;
//import dd.live.base.L4LBaseclass;

public class StudentProfileTest extends L4lBaseClass

{
   
	LoginPage login;
	StudentTrackerPage sttracker;
	StudentProfilepage stdprofile;
      
	
	@Test(priority=0)
	public void setup() throws IOException, InterruptedException
	{
		initialize();
    	login = new LoginPage();
    	login.ddlogin(prop.getProperty("ddusername"), prop.getProperty("ddpassword"));
    	sttracker = new StudentTrackerPage();
    	sttracker.validateStudentTrackerLable();
    	
    	
	}

    @Test(priority=1)
	public void clickOnStudentnkTest()
	{
		boolean studentprofilecheck =stdprofile.clickOnDistrictId();
		Assert.assertTrue(studentprofilecheck);
	}
	
    @Test(priority=2)
    public void clickOnEmailLinkTest()
    {
    	stdprofile.clickOnEmailInStudentProfile();
    }
	
    public void teardown() throws InterruptedException
    {
    	driver.close();
    }
	

}