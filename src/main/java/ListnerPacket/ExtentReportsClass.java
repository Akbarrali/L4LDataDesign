package ListnerPacket;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.TestListenerAdapter;
import org.testng.annotations.*;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.markuputils.ExtentColor;
import com.aventstack.extentreports.markuputils.MarkupHelper;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;
	
public class ExtentReportsClass extends TestListenerAdapter
{
	public WebDriver driver;
	public ExtentHtmlReporter htmlReporter;
	public ExtentReports extent;
	public ExtentTest exTest;

	@BeforeTest
	public void startReport() 
	{		
		htmlReporter = new ExtentHtmlReporter(System.getProperty("user.dir") + "/test-output/MyExtentreport.html");
		htmlReporter.config().setDocumentTitle("DataDesign Automation Report");       
		htmlReporter.config().setReportName("DD Report");                 
		htmlReporter.config().setTheme(Theme.DARK);
		
		extent = new ExtentReports();
		extent.attachReporter(htmlReporter);
		extent.setSystemInfo("Environment", "QA");
		extent.setSystemInfo("OS", "Windows11");
		extent.setSystemInfo("Browser", "Chrome");
		extent.setSystemInfo("Author Name", "Akbar");		
	}
	
	@AfterTest
	public void endReport()
	{
		extent.flush();
	}
	
	//This method is to capture the screenshot and return the path of the screenshot.
	@AfterMethod
	public static String getScreenShot(WebDriver driver, String screenshotName) throws IOException 
	{
		String dateName = new SimpleDateFormat("yyyyMMddhhmmss").format(new Date());
		TakesScreenshot ts = (TakesScreenshot) driver;
		File source = ts.getScreenshotAs(OutputType.FILE);
		// after execution, you could see a folder "FailedTestsScreenshots" under src folder
		String destination = System.getProperty("user.dir") + "/Screenshots/" + screenshotName + dateName + "test.png";
		File finalDestination = new File(destination);
		FileUtils.copyFile(source, finalDestination);
		return destination;
	}

//	@BeforeMethod
//	public void setup() {
//		System.setProperty("webdriver.chrome.driver","C://AutomationFramework//Drivers//chromedriver.exe");
//		driver = new ChromeDriver();
//		driver.manage().window().maximize();
//		driver.get("https://www.google.com/");
//	}
//	
//	@Test
//	public void verifyTitle() {
//		logger = extent.createTest("To verify Google Title");
//		Assert.assertEquals(driver.getTitle(),"Google");
//	}
//	
//	@Test
//	public void verifyLogo() {
//		logger = extent.createTest("To verify Google Logo");
//		boolean img = driver.findElement(By.xpath("//img[@id='hplogo']")).isDisplayed();
//		logger.createNode("Image is Present");
//		Assert.assertTrue(img);
//		logger.createNode("Image is not Present");
//		Assert.assertFalse(img);
//	}
	
	@AfterMethod
	public void getResult(ITestResult result) throws Exception
	{
		if(result.getStatus() == ITestResult.FAILURE)
		{
			//MarkupHelper is used to display the output in different colors
			exTest.log(Status.FAIL, MarkupHelper.createLabel(result.getName() + " - Test Case Failed", ExtentColor.RED));
			exTest.log(Status.FAIL, MarkupHelper.createLabel(result.getThrowable() + " - Test Case Failed", ExtentColor.RED));
			//To capture screenshot path and store the path of the screenshot in the string "screenshotPath"
			//We do pass the path captured by this method in to the extent reports using "logger.addScreenCapture" method. 
			//String Scrnshot=TakeScreenshot.captuerScreenshot(driver,"TestCaseFailed");
			String screenshotPath = getScreenShot(driver, result.getName());
			//To add it in the extent report 
			exTest.fail("Test Case Failed Snapshot is below " + exTest.addScreenCaptureFromPath(screenshotPath));
		}
		else if(result.getStatus() == ITestResult.SKIP){
			exTest.log(Status.SKIP, MarkupHelper.createLabel(result.getName() + " - Test Case Skipped", ExtentColor.ORANGE)); 
		} 
		else if(result.getStatus() == ITestResult.SUCCESS)
		{
			exTest.log(Status.PASS, MarkupHelper.createLabel(result.getName()+" Test Case PASSED", ExtentColor.GREEN));
		}
		driver.quit();
	}

	
}
	

