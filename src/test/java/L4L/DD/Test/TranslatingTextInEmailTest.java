package L4L.DD.Test;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import DD.l4l.base.L4lBaseClass;
import  L4L.DD.pages.LoginPage;
import L4L.DD.pages.StudentListSMSPage;
import L4L.DD.pages.StudentProfilepage;
import L4L.DD.pages.StudentTrackerPage;
import L4L.DD.pages.TranslatingTextInEmailPage;
//import dd.live.base.L4LBaseclass;

public class TranslatingTextInEmailTest extends L4lBaseClass
{

	LoginPage login;
	StudentTrackerPage sttracker;
	StudentProfilepage stdprofile;
	TranslatingTextInEmailPage stprofileemail;
      
	
	@Test(priority=0)
	public void setup() throws IOException, InterruptedException
	{
		initialize();
    	login = new LoginPage();
    	login.ddlogin(prop.getProperty("ddusername"), prop.getProperty("ddpassword"));
    	sttracker = new StudentTrackerPage();
    	sttracker.validateStudentTrackerLable();
    	stdprofile = new StudentProfilepage();
    	stdprofile.clickOnDistrictId();
    	stdprofile.clickOnEmailInStudentProfile();
    	stprofileemail = new TranslatingTextInEmailPage();
	}
	
	@Test(priority=1)
	public void checkEmailPopupTitleTest()
	{
		boolean popuptitle = stprofileemail.validateEmailPopupTitle();
		Assert.assertTrue(popuptitle);
	}
	
	@Test(priority=2)
	public void selectWeeklyProgressInEmailTest()
	{
		boolean weeklytext = stprofileemail.clickOnWeeklyProgress();
		Assert.assertTrue(weeklytext);
	}
	
	@Test(dependsOnMethods = "selectWeeklyProgressInEmailTest")
	public void selectTranslattingButtonTest()
	{
		boolean translatetexttitle = stprofileemail.clickOnTranslateTextButton();
		Assert.assertTrue(translatetexttitle);
	}

	@Test(priority=3)
	public void selectSpanishLanguageTest() throws InterruptedException
	{
		boolean spanishlanguagecheck = stprofileemail.validateSpanishLanguage();
		Assert.assertTrue(spanishlanguagecheck);
		
	}
	@Test(priority=4)
	public void selectHindiLanguageTest() throws InterruptedException
	{
		boolean hindilanguagecheck =stprofileemail.validateHindiLanguage();
		Assert.assertTrue(hindilanguagecheck);
	}
	
	@Test(priority=5)
	public void selectArabicLanguageTest() throws InterruptedException
	{
		boolean arabiclanguagecheck =stprofileemail.validateArabicLanguage();
		Assert.assertTrue(arabiclanguagecheck);
	}
	
	@Test(priority=6)
	public void selectPunjabiLanguageTest() throws InterruptedException
	{
		boolean punjabilanguagecheck =stprofileemail.validatePunjabiLanguage();
		Assert.assertTrue(punjabilanguagecheck);
	}
	
	@Test(priority=7)
	public void selectArmanianLanguageTest() throws InterruptedException
	{
		boolean ArmainLanguagecheck =stprofileemail.validateArmainLanguage();
		Assert.assertTrue(ArmainLanguagecheck);
	}
	
	@Test(priority=8)
	public void selectSomaliLanguageTest() throws InterruptedException
	{
		boolean SomaliLanguagecheck =stprofileemail.validateSomaliLanguage();
		Assert.assertTrue(SomaliLanguagecheck);
	}
	
	@Test(priority=9)
	public void selectRussianLanguageTest() throws InterruptedException
	{
		boolean RussianLanguagecheck =stprofileemail.validateRussianLanguage();
		Assert.assertTrue(RussianLanguagecheck);
	}
	
}
