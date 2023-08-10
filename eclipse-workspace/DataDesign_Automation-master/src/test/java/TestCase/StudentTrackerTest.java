package TestCase;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import dd.live.base.Baseclass;
import dd.live.pages.LoginPage;
import dd.live.pages.StudentListEmailPage;
import dd.live.pages.StudentTrackerPage;
import dd.util.TestUtil;

public class StudentTrackerTest extends Baseclass
{
	
	LoginPage login;
	StudentTrackerPage sttracker;
	
    @Test(priority=0)
	public void setup() throws IOException, InterruptedException
	{
    	initialize();
    	login = new LoginPage();
    	login.ddlogin(prop.getProperty("ddusername"), prop.getProperty("ddpassword"));
    	sttracker = new StudentTrackerPage(); 	
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
    public void selectcheckboxtest()
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
   public void emailactiontest()
   {
	  sttracker.clickonemail();
	
   }
    
    
	public void teardown() throws InterruptedException
	{ 
    	
		driver.quit();
	}
	
}
