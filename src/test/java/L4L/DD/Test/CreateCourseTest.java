package L4L.DD.Test;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import DD.l4l.base.L4lBaseClass;
import L4L.DD.pages.CreateCoursePage;
import L4L.DD.pages.LoginPage;
import L4L.DD.pages.StudentTrackerPage;


public class CreateCourseTest extends L4lBaseClass
{

	LoginPage login;
	StudentTrackerPage sttracker;
	CreateCoursePage course;
	
    @Test(priority=0)
	public void setup() throws IOException, InterruptedException
	{
    	initialize();
    	login = new LoginPage();
    	//login.ddlogin(prop.getProperty("CIemail"), prop.getProperty("CIpass"));
    	login.ddlogin(prop.getProperty("ddusername"), prop.getProperty("ddpassword"));
    	sttracker = new StudentTrackerPage(); 	
    	course = new CreateCoursePage();  	
	}
     
    @Test(priority=1)
	public void navigateToCreateCourseTest() throws IOException
	{
		boolean CreatecourseTitlecheck = course.navigateToCreateCoursePage();
		Assert.assertTrue(CreatecourseTitlecheck);
	}
   
    @Test(dependsOnMethods = { "navigateToCreateCourseTest" })
    public void fillCourseDetailsTest() throws InterruptedException
    {
    	course.fillCourseDetailsPage();
    }
	
    @Test(priority = 2)
    public void addnewCourseCatalogTest() throws InterruptedException
    {
    	course.addNewCourseCatalogPage();
    }
    

}
