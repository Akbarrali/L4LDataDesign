package TestCase;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import dd.live.base.Baseclass;
import dd.live.pages.CreateUserPage;
import dd.live.pages.LoginPage;
import dd.live.pages.SetupUsersByExcelPage;
import dd.live.pages.StudentTrackerPage;

public class SetupUserTest extends Baseclass
{

	CreateUserPage users;
	LoginPage login;
	StudentTrackerPage sttracker;
	SetupUsersByExcelPage setupuser;
	
	@Test (priority=0)
	public void setup() throws IOException, InterruptedException
	{
		initialize();
		//driver.get("https://qa-l4l.datadesign.io/");
		login = new LoginPage();
		login.ddlogin(prop.getProperty("qaadmin"), prop.getProperty("ddpassword"));
		sttracker =new StudentTrackerPage(); 
		users = new CreateUserPage();	
		setupuser = new SetupUsersByExcelPage();
	}
	
	
	@Test (priority=1)
	public void validateGreetingPopupTest()
    {
    	Assert.assertTrue(setupuser.validateGreetingPopup());
    }
	
	
	@Test (priority=2)
	public void navigateToUserTest() throws InterruptedException
	{
		boolean usertitlecheck = users.navigateToUsersPage();
		Assert.assertTrue(usertitlecheck);
	}
	
	
	@Test (priority=3)
	public void createUserTest() throws InterruptedException, IOException
	{
		boolean response = setupuser.fillUserdetail();
		Assert.assertTrue(response);
				
	}
	
	
	
	
	
	
}
