package L4L.DD.Test;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import DD.l4l.base.L4lBaseClass;
import L4L.DD.pages.CreateCoursePage;
import L4L.DD.pages.LoginPage;
import L4L.DD.pages.StudentTrackerPage;
import L4L.Util.DDUtil;

//import net.bytebuddy.implementation.bind.annotation.BindingPriority;

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
    	login.ddlogin(prop.getProperty("CIemail"), prop.getProperty("CIpass"));
    	sttracker = new StudentTrackerPage(); 	
    	course = new CreateCoursePage();
	}
    
    @Test(priority=1)
	public void navigateToCreateCourseTest()
	{
		boolean CreatecourseTitlecheck = course.navigateToCreateCoursePage();
		Assert.assertTrue(CreatecourseTitlecheck);
	}
   
	
	
	
	
	
	
	
	
	
	
}
