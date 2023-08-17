package L4L.DD.Test;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import DD.l4l.base.L4lBaseClass;
import L4L.DD.pages.LoginPage;
import L4L.DD.pages.StudentListEmailPage;
import L4L.DD.pages.StudentTrackerPage;
//import L4L.DD.pages.L4LBaseclass;
import L4L.Util.DDUtil;

public class StudentTrackerTest extends L4lBaseClass
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
    public void selectcheckboxtest() throws InterruptedException
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
