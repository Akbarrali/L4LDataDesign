package TestCase;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import dd.live.base.Baseclass;
import dd.live.pages.StudentListEmailPage;
import dd.live.pages.LoginPage;
import dd.live.pages.StudentTrackerPage;

public class StudentListEmailTest extends Baseclass 
{

	LoginPage login;
	StudentTrackerPage sttracker;
	StudentListEmailPage emailpopup = new StudentListEmailPage();
	
	
	@Test (priority=0)
	public void setup() throws IOException, InterruptedException
	{
		initialize();
		login = new LoginPage();
		login.ddlogin(prop.getProperty("ddusername"), prop.getProperty("ddpassword"));
		sttracker = new StudentTrackerPage();
		sttracker.selectcheckbox();
		sttracker.validateaActionbar();
		sttracker.clickonemail();
	}
	
	@Test (priority=1)
	public void emailPopupTitleCheck()
	{
		boolean emailtitlecheck = emailpopup.validateEmailPopupTitpe();
		Assert.assertTrue(emailtitlecheck);
	}
	
	@Test (priority=2)
	public void QuickkeysSelectTest()
	{
		emailpopup.selectAllQuickKeys();
	}
	
	@Test (priority=3)
	public void clickonSendButtonTest()
	{
		emailpopup.clickOnSendButton();
	}
	

	
}
