package DD.l4l.base;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.HTMLReporter;

public class L4lBaseClass 
{
	public Properties prop;
	public static WebDriver driver;
	public static HTMLReporter httmlreport;
	public static ExtentReports report;
	public static ExtentTest reporttest;
	
	
	public WebDriver initialize() throws IOException
	{
		
		prop = new Properties();
		FileInputStream fis = new FileInputStream(System.getProperty("user.dir")+"\\src\\main\\java\\dd\\excel\\utility\\data.properties");
		prop.load(fis);	
		
		String browsername = prop.getProperty("browser");
		
		if(browsername.equals("chrome"))
			{
			//driver =WebDriverManager.chromedriver().create();
			driver = new ChromeDriver();
			}
		
		else if(browsername.equals("firefox"))
			{
			//driver =WebDriverManager.firefoxdriver().create();
			driver = new FirefoxDriver();
			}
		else 
		   {
			//driver =WebDriverManager.chromedriver().create();
			driver = new ChromeDriver();
		   }
		
		driver.get(prop.getProperty("QAurl"));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(30));  
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		
		return driver;
		
	}
	
	
	
	
	

	
}
