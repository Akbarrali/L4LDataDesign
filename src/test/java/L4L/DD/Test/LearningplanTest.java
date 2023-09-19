package L4L.DD.Test;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import L4L.DD.pages.LearningPlan;
import L4L.DD.pages.LoginPage;
import L4L.DD.pages.StudentTrackerPage;
import DD.l4l.base.L4lBaseClass;

public class LearningplanTest extends L4lBaseClass
{

	LoginPage login;
	StudentTrackerPage sttracker;
	LearningPlan LP;
	
	
	@Test(priority=1)
	public void setup() throws IOException, InterruptedException
	{
		initialize();
    	login = new LoginPage();
    	login.ddlogin(prop.getProperty("ddusername"), prop.getProperty("ddpassword"));
    	sttracker = new StudentTrackerPage(); 	
    	LP = new LearningPlan();
	}
	    
	@Test(priority=2)
	public void validateGreetingPopupTest() throws InterruptedException
    {
    	boolean Greetingpopup = sttracker.validateGreetingPopup();
    	Assert.assertTrue(Greetingpopup);
    }
	
	@Test(priority=3)
	public void studentprofile() throws InterruptedException
	{
		LP.navigateToStudentProfile();
	}
	
	
	
	
	
	
}
