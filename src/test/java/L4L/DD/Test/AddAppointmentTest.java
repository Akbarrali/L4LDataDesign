package L4L.DD.Test;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import DD.l4l.base.L4lBaseClass;
import DD.l4l.base.L4lBaseClass;
import DD.l4l.base.L4lBaseClass;
import L4L.DD.pages.AddAppointmentPage;
import L4L.DD.pages.LoginPage;
import L4L.DD.pages.StudentTrackerPage;
import L4L.Util.DDUtil;

public class AddAppointmentTest extends L4lBaseClass
{
	
	LoginPage login;
	StudentTrackerPage sttracker;
	AddAppointmentPage addApp;
	
	@Test(priority=0)
	public void setup() throws IOException, InterruptedException
	{
    	initialize();
    	login = new LoginPage();
    	login.ddlogin(prop.getProperty("ddusername"), prop.getProperty("ddpassword"));
    	sttracker = new StudentTrackerPage(); 	
    	addApp = new AddAppointmentPage();
	}

	@Test(priority=1)
    public void validateGreetingPopupTest()
    {
    	boolean Greetingpopup = sttracker.validateGreetingPopup();
    	Assert.assertTrue(Greetingpopup);
    }
	
	@Test (priority=2)
    public void studentTrackerabeltest()
    {
    	boolean label = sttracker.validateStudentTrackerLable();
    	Assert.assertTrue(label);
    }
    
    @Test (priority=3)
    public void selectcheckboxtest() throws InterruptedException
    {
    	boolean check = sttracker.selectcheckbox();
    	Assert.assertTrue(check);
    }
    
    @Test (dependsOnMethods = "selectcheckboxtest")
    public void actionbartest()
    {
    	boolean actioncheck = sttracker.validateaActionbar();
    	Assert.assertTrue(actioncheck);
    }
    
    @Test (priority=4)
    public void clickOnEventActionButtonTest()
    {
    	boolean eventTitleValidation = addApp.clickOnEventActionButton();
    	Assert.assertTrue(eventTitleValidation);
    }
    
    @Test (priority=5)
    public void addAppointmentTest() throws InterruptedException
    
    {
    	boolean AddApp = addApp.AddAppointment("This is Test Title", "This is Test Descritiopn", "May", "2026");
    	Assert.assertTrue(AddApp);
    }
    
}












    
    
    
 
    
    
    
    
    
    
    
    
    
    

