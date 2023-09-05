package L4L.DD.Test;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import DD.l4l.base.L4lBaseClass;
import L4L.DD.pages.CreateUserPage;
import L4L.DD.pages.LoginPage;
import L4L.DD.pages.StudentTrackerPage;


public class CreateUserTest extends L4lBaseClass

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
	
	
	//@Test (priority=1)
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
