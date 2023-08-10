package dd.live.base;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.HTMLReporter;

import dd.util.TestUtil;
import io.github.bonigarcia.wdm.WebDriverManager;


public class Baseclass
{
	public Properties prop;
	public static WebDriver driver;
	public static HTMLReporter httmlreport;
	public static ExtentReports report;
	public static ExtentTest reporttest;
	
	
	public WebDriver initialize() throws IOException
	{
		prop = new Properties();
		FileInputStream fis = new FileInputStream("C:\\Users\\AKBARALI\\eclipse-workspace\\DataDesign\\src\\main\\java\\dd\\live\\config\\data.properties");
		prop.load(fis);	
		
		String browsername = prop.getProperty("browser");
		
		if(browsername.equals("chrome"))
			{
			driver =WebDriverManager.chromedriver().create();
			}
		
		else if(browsername.equals("firefox"))
			{
			driver =WebDriverManager.firefoxdriver().create();
			}
		else 
		   {
			driver =WebDriverManager.chromedriver().create();
		   }
		
		driver.get(prop.getProperty("QAurl"));
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(TestUtil.IMPLICIT_WAIT, TimeUnit.SECONDS);
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(TestUtil.PAGE_LOAD_TIMEOUT, TimeUnit.SECONDS);
		
		
		return driver;
		
	}
	
	
	
	
	
}
