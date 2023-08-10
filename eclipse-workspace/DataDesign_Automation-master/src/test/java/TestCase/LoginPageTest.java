package TestCase;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.HTMLReporter;

import dd.live.base.Baseclass;
import dd.live.pages.LoginPage;

public class LoginPageTest extends Baseclass
{
	LoginPage login;
	
//	@BeforeSuite
//	public void beforSuit()
//	{
//		httmlreport = new HTMLReporter("C:\\Users\\AKBARALI\\eclipse-workspace\\DataDesign\\Reports\\ExtentReports.html");
//		report = new ExtentReports(null);	
//		reporttest = new ExtentTest(null, null);
//	
//	}
	
	
	@Test(priority=0)
	public void setup() throws IOException {
	    initialize();
		login = new LoginPage();
		
	}
	
	@Test(priority=1)
	public void validateLoginUrlTest()
	{
		String currenturl = login.verifyLoginUrl();
		Assert.assertEquals(currenturl, "https://l4l.datadesign.io/", "Login url does not match");
	}
	
	@Test(priority=3)
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
	
    @Test(priority=4)
    public void ddlogintest() throws InterruptedException
    {
    	login.ddlogin(prop.getProperty("ddusername"), prop.getProperty("ddpassword")); 	
    }
    
   
    public void teardown() throws InterruptedException
    {
    	
    	driver.close();
    }
	
}
