package TestCase;

import static org.testng.Assert.assertTrue;

import java.io.IOException;

import org.openqa.selenium.JavascriptExecutor;
import org.testng.Assert;
import org.testng.annotations.Test;

import dd.live.base.Baseclass;
import dd.live.pages.AddStudentInRosterPage;
import dd.live.pages.LoginPage;
import dd.live.pages.StudentTrackerPage;

public class AddStudentINRosterTest extends Baseclass
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
	public void ValidateToClickOnPlusButton()
	{
		boolean rosterlabel = addstudent.clickOnPlusButton();
		Assert.assertTrue(rosterlabel);
	}
	@Test (priority=3)
	public void validateToselectStudentFromRoster() throws InterruptedException
	{
		boolean successmsgcheck = addstudent.verifyStudentIsAddedInRoster();
		Assert.assertTrue(successmsgcheck);
	}
	@Test (priority=4)
	public void validateStudentAddedIntoRoster() throws InterruptedException
	{
		boolean addstudentmsg= addstudent.verifyStudentIsAddedInRoster();
		Assert.assertTrue(addstudentmsg);
	}
	
	
	
	
	
	
}
