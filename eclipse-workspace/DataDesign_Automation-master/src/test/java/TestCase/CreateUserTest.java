package TestCase;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import dd.live.base.Baseclass;
import dd.live.pages.CreateUserPage;
import dd.live.pages.LoginPage;
import dd.live.pages.StudentTrackerPage;

public class CreateUserTest extends Baseclass

{
	CreateUserPage users;
	LoginPage login;
	StudentTrackerPage sttracker;
	
	@Test (priority=0)
	public void setup() throws IOException, InterruptedException
	{
		initialize();
		driver.get("https://qa-l4l.datadesign.io/");
		login = new LoginPage();
		login.ddlogin(prop.getProperty("qaadmin"), prop.getProperty("ddpassword"));
		sttracker =new StudentTrackerPage(); 
		users = new CreateUserPage();	
	}
	
	
	@Test (priority=1)
	public void validateGreetingPopupTest()
    {
    	boolean indicatorcheck = users.validateGreetingPopup();
    	Assert.assertTrue(indicatorcheck);
    }
	
	
	@Test (priority=2)
	public void navigateToUserTest() throws InterruptedException
	{
		boolean userpagetitlecheck = users.navigateToUsersPage();
		Assert.assertTrue(userpagetitlecheck);
	}
	
	@Test (priority=3)
	public void createUserTest() throws InterruptedException
	{
	   users.validateCreateUser(prop.getProperty("username"), prop.getProperty("email"), 1, 3, 1);
	   Thread.sleep(5);
	}
	
	
	
	
	
	
	
}
