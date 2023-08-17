package L4L.DD.Test;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import DD.l4l.base.L4lBaseClass;
import L4L.DD.pages.LoginPage;
import L4L.DD.pages.StudentListSMSPage;
import L4L.DD.pages.StudentTrackerPage;
//import dd.live.base.L4LBaseclass;

public class StudentListSMSTest extends L4lBaseClass
{

	LoginPage login;
	StudentTrackerPage sttracker; 
	StudentListSMSPage stsms;
	
	@Test(priority=0)
	public void setup() throws IOException, InterruptedException
	{
		initialize();
		login = new LoginPage();
		sttracker = new StudentTrackerPage();
		stsms= new StudentListSMSPage();
		login.ddlogin(prop.getProperty("ddusername"), prop.getProperty("ddpassword")); 
		sttracker.selectcheckbox();
		sttracker.validateaActionbar();		
		sttracker.clickonSMS();
	}
	
	
	@Test(priority=1)
	public void smsPopupTitleCheck()
	{
		boolean smstitelcheck = stsms.validateSMSPopupTitle();
		Assert.assertTrue(smstitelcheck);
	}
	
	@Test (priority=2)
	public void QuickkeysSelectTest()
	{
		stsms.selectAllQuickKeys();
	}
	
	@Test (priority=3)
	public void clickonSendButtonTest()
	{
		stsms.clickOnSendButton();
	}
	
	
	
}
