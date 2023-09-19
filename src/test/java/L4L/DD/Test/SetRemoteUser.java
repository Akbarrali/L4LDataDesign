package L4L.DD.Test;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import DD.l4l.base.L4lBaseClass;
import L4L.DD.pages.CreateCoursePage;
import L4L.DD.pages.CreateUserPage;
import L4L.DD.pages.LoginPage;
import L4L.DD.pages.SetupUsersByExcelPage;
import L4L.DD.pages.StudentTrackerPage;

public class SetRemoteUser extends L4lBaseClass

{
	LoginPage login;
	StudentTrackerPage sttracker;
	CreateCoursePage course;
	CreateUserPage users;
	SetupUsersByExcelPage setupuser;
	
    @Test(priority=0)
	public void setup() throws IOException, InterruptedException
	{
    	initialize();
    	login = new LoginPage();
    	//login.ddlogin(prop.getProperty("CIemail"), prop.getProperty("CIpass"));
    	login.ddlogin(prop.getProperty("ddusername"), prop.getProperty("qaadminpass"));
    	sttracker = new StudentTrackerPage(); 	
    	course = new CreateCoursePage();  	
    	setupuser = new SetupUsersByExcelPage();
	}
    
    @Test (priority=1)
	public void validateGreetingPopupTest()
    {
		
		boolean popuppass = setupuser.validateGreetingPopup();
		Assert.assertTrue(popuppass);
    	
    }
    @Test (priority=2)
	public void navigateToUserTest() throws InterruptedException
	{
		boolean usertitlecheck = users.navigateToUsersPage();
		Assert.assertTrue(usertitlecheck);
	}
    
    
    
    
    
    
    
    
    
}
