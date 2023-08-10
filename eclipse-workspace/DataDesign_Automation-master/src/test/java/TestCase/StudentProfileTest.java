package TestCase;

import java.io.IOException;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

import dd.live.base.Baseclass;
import dd.live.pages.LoginPage;
import dd.live.pages.StudentProfilepage;
import dd.live.pages.StudentTrackerPage;

public class StudentProfileTest extends Baseclass

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