package L4L.DD.Test;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;
import L4L.DD.pages.LoginPage;
import L4L.DD.pages.StudentListEmailPage;
import L4L.DD.pages.StudentTrackerPage;
import DD.l4l.base.L4lBaseClass;

public class StudentListEmailTest extends L4lBaseClass 
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
