package L4L.DD.Test;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import L4L.DD.pages.EnrollStudentPage;
import L4L.DD.pages.HDLoginPage;
import L4L.DD.pages.LoginPage;
import L4L.DD.pages.StudentListEmailPage;
import L4L.DD.pages.StudentTrackerPage;
import DD.l4l.base.L4lBaseClass;
import DD.l4l.base.L4lBaseClass;



public class EnrollStudentTest extends L4lBaseClass
{

	
	HDLoginPage hdlogin;
	EnrollStudentPage enrollstd;
	
	@Test(priority=0)
	public void setup() throws IOException, InterruptedException 
	{
	    initialize();
	    hdlogin = new HDLoginPage();
	    hdlogin.ddlogin(prop.getProperty("SubGranteeAdmin"), prop.getProperty("hdpassword"));
	    enrollstd = new EnrollStudentPage();
	}
	
	@Test(priority=1)
	public void navigateToStudentEnrollTest()
	{
		boolean enrstdbuttoncheck = enrollstd.navigateToEnrollStudentpage();
		Assert.assertTrue(enrstdbuttoncheck);
	}
	
	
	@Test(priority=2)
	public void enrollStudentTest() throws InterruptedException
	{
		enrollstd.studentdeatilform("Beaux", "Warring", "01-19-2000", 12, "Testing Parents", "Test Pickup", "By School Bus", +12365785, "Auto Pickup");
	}
	
	//@Test(priority=3)
	public void verifyStudentTest() throws InterruptedException
	{
		enrollstd.verifyStudent();
	}
	
	
	
	
}
