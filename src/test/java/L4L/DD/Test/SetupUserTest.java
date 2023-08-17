//package L4L.DD.Test;
//
//import static org.testng.Assert.assertTrue;
//
//import java.io.IOException;
//
//import org.testng.Assert;
//import org.testng.annotations.Test;
//
//import L4L.DD.pages.CreateUserPage;
//import L4L.DD.pages.LoginPage;
//import L4L.DD.pages.SetupUsersByExcelPage;
//import L4L.DD.pages.StudentTrackerPage;
//import DD.l4l.base.L4lBaseClass;
//
//public class SetupUserTest extends L4lBaseClass
//{
//
//	CreateUserPage users;
//	LoginPage login;
//	StudentTrackerPage sttracker;
//	SetupUsersByExcelPage setupuser;
//	
//	@Test (priority=0)
//	public void setup() throws IOException, InterruptedException
//	{
//		initialize();
//		//driver.get("https://qa-l4l.datadesign.io/");
//		login = new LoginPage();
//		login.ddlogin(prop.getProperty("qaadmin"), prop.getProperty("ddpassword"));
//		sttracker = new StudentTrackerPage(); 
//		users = new CreateUserPage();	
//		setupuser = new SetupUsersByExcelPage();
//	}
//	
//	@Test (priority=1)
//	public void validateGreetingPopupTest()
//    {
//		
//		boolean popuppass = setupuser.validateGreetingPopup();
//		Assert.assertTrue(popuppass);
//    	
//    }
//	
//	
//	@Test (priority=2)
//	public void navigateToUserTest() throws InterruptedException
//	{
//		boolean usertitlecheck = users.navigateToUsersPage();
//		Assert.assertTrue(usertitlecheck);
//	}
//	
//	
//	@Test (priority=3)
//	public void createUserTest() throws InterruptedException, IOException
//	{
//		boolean response = setupuser.fillUserdetail();
//		Assert.assertTrue(response);
//				
//	}
//	
//	
//	
//	
//	
//	
//}
