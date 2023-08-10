package TestCase;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import dd.live.base.Baseclass;
import dd.live.pages.LoginPage;
import dd.live.pages.StudentListSMSPage;
import dd.live.pages.StudentTrackerPage;

public class StudentListSMSTest extends Baseclass
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
