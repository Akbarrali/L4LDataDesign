package L4L.DD.Test;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;



import DD.l4l.base.L4lBaseClass;
import DD.l4l.base.L4lBaseClass;
import L4L.DD.pages.LoginPage;
import L4L.Util.DDUtil;

public class LoginPageTest extends L4lBaseClass
{
	LoginPage login;
	
	
	@Test(priority=0)
	public void setup() throws IOException {
	    initialize();
		login = new L4L.DD.pages.LoginPage();
		
	}
	
	@Test(priority=1)
	public void validateLoginUrlTest()
	{
		String currenturl = login.verifyLoginUrl();
		Assert.assertEquals(currenturl, "https://qa-l4l.datadesign.io/", "Login url does not match");
	}
	
	//@Test(priority=3)
	public void loginWithBlankCredentialsTest() throws InterruptedException
	{
		boolean blanckcredential = login.loginWithBlankCredentials();
		Assert.assertTrue(blanckcredential);
	}
	
	
	@Test(priority=2)
	public void logintitletest()
	{
		String ltitle = login.validatetitel();
		Assert.assertEquals(ltitle, "Data+Design", "DD login title does not match");
	}
	
    @Test(priority=3)
    public void ddlogintest() throws InterruptedException
    {
    	login.ddlogin(prop.getProperty("ddusername"), prop.getProperty("ddpassword"));
    	
    }
    
//   public void teardown() throws InterruptedException
//    {
//    	
//    	//driver.close();
//    }
	
}
