package L4L.DD.Test;

import static org.testng.Assert.assertTrue;

import java.io.IOException;

import org.openqa.selenium.JavascriptExecutor;
import org.testng.Assert;
import org.testng.annotations.Test;

import DD.l4l.base.L4lBaseClass;
import L4L.DD.pages.AddStudentInRosterPage;
import L4L.DD.pages.LoginPage;
import L4L.DD.pages.StudentTrackerPage;


public class AddStudentINRosterTest extends L4lBaseClass
{

	LoginPage login;
	StudentTrackerPage sttracker;
	AddStudentInRosterPage addstudent;
	
	
	@Test (priority=0)
	public void initilizeBrowser() throws IOException, InterruptedException 
	{
		initialize();
    	login = new LoginPage();
    	login.ddlogin(prop.getProperty("ddusername"), prop.getProperty("ddpassword"));
    	sttracker = new StudentTrackerPage(); 
    	addstudent = new AddStudentInRosterPage();	
	}
	
	
	@Test(priority=1)
    public void validateGreetingPopuppTest()
    {
		addstudent.validateGreetingpopup();
    }
	
	@Test (priority=2)
	public void ValidateToClickOnPlusButtonandSelectStudentFromRoster() throws InterruptedException
	{
		boolean successmsgcheck = addstudent.clickOnPlusButtonandselectStudentFromRosterList();
		Assert.assertTrue(successmsgcheck);
	}
	@Test (priority=3)
	public void validateStudentAddedIntoRoster() throws InterruptedException
	{
		boolean addstudentmsg= addstudent.verifyStudentIsAddedInRoster();
		Assert.assertTrue(addstudentmsg);
	}
	
	
	
	
	
	
}
