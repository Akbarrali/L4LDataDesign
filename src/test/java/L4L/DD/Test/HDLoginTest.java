package L4L.DD.Test;

import static org.testng.Assert.assertTrue;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import DD.l4l.base.L4lBaseClass;
import L4L.DD.pages.HDLoginPage;
//import L4L.DD.pages.HideoBaseclass;

public class HDLoginTest extends L4lBaseClass
{

	HDLoginPage hdlogin;
	
	
	@Test(priority=0)
	public void setup() throws IOException {
	    initialize();
	    hdlogin = new HDLoginPage();
		
	}
	
	@Test(priority=1)
	public void validateLoginUrlTest()
	{
		String currenturl = hdlogin.verifyLoginUrl();
		Assert.assertEquals(currenturl, "https://qa-ceb-hidoe.datadesign.io/login?action=unauthorized", "Login url does not match");
	}
	
	@Test(priority=2)
	public void datadesignlogotest()
	{
		boolean ltitle = hdlogin.validatelogo();
		Assert.assertTrue(ltitle);
	}
	
    @Test(priority=3)
    public void ddlogintest() throws InterruptedException
    {
    	hdlogin.ddlogin(prop.getProperty("SubGranteeAdmin"), prop.getProperty("hdpassword")); 	
    }
    
   
    public void teardown() throws InterruptedException
    {
    	
    	driver.close();
    }
	
	
	
}
