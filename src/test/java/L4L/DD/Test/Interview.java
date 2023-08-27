package L4L.DD.Test;

import static org.testng.Assert.assertEquals;

import java.awt.HeadlessException;
import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;

//import bsh.Capabilities;
//import dd.util.TestUtil;
//import jakarta.xml.bind.Element;

public class Interview {

	public static void main(String[] args) throws InterruptedException, IOException 
	{
		WebDriver driver = new ChromeDriver();
		driver.get("https://qa-l4l.datadesign.io/student-crm");
		System.out.println("page title is " + driver.getTitle());
		//Common Command
		driver.manage().window().maximize();
		driver.navigate().refresh();
		//driver.findElement(By.linkText("I'm Feeling Lucky")).click();
		WebElement tes = driver.findElement(By.xpath("(//input[@class='RNmpXc'])[2]"));
		System.out.println(driver.getTitle());
		
		//Implicit Wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		//PageLoadtime
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(30));
		//Explicit Wait
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(100));		
		//wait.until(ExpectedConditions.elementToBeClickable(By.linkText("Forgot Password?");
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.linkText("Forgot Password?")));
		
		
		//Dropdown By SelectClass
		Select select = new Select(tes);
		select.selectByIndex(0);
		select.selectByValue(null);
		select.selectByVisibleText(null);
		
		//Dropdown By Collection List<>
		//Fatch the common locator for all the dropdown options
		
		List<WebElement> dropdown = driver.findElements(By.xpath(null));
		dropdown.size();
		
		
		
		
		//Windows Authantication Popup
		//We just need to enter the username and password in url 
		
		//driver.get("https://admin:admin@qa-l4l.datadesign.io/student-crm");
		
		// isselected - to check checkbox is selected or not
		//isdisplayed - to check element displayed or note
		//isenable - check filed is enable or not
		
		//Javascript Executor : Is use for click, Scroll by coordinate, Scroll by Element, 
		                        //Insert text, Draw borderline on element, Get title of page,  
		                        // Generate Alert Pop Window
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		
		js.executeScript("arguments[0].click();", dropdown);
		
		js.executeScript("arguments[0].scollIntoView();", dropdown);
		
		//Keys Check : 
		//SendKeys is a method where all the mouse keys methods are store.
		
		driver.findElement(null).sendKeys(Keys.ENTER);

		
		//Action Class : Is use to handle multiple actions
		
		Actions act = new Actions(driver);
		
		act.moveToElement(null).click().perform();  // -- To click on Element 
		act.moveToElement(tes).doubleClick().perform(); // -- Double click 
		act.moveToElement(null).build().perform();  // -- Hover on element 
		act.contextClick().perform(); // -- Right CLick 
		//act.dragAndDrop(sourseelement, destinationelement).build().perform(); // -- Drag and Drop
		///act.dragAndDropBy(WebElemtn, X , Y); // -- Horizontal slide
		act.moveToElement(tes).click().sendKeys("abc").keyDown(Keys.SHIFT).sendKeys("abc").keyUp(Keys.SHIFT).perform();
		
		
		//Download : Use file class and provide the file path in argument with file name, Use file class method to check file exist and delete.
		driver.findElement(By.xpath("(//input[@class='RNmpXc'])[2]")).click();
		
		File f = new File("C:\\Users\\akbarali\\Downloads\\test.png"); 
		
		f.exists(); // -- To check file present or note
		f.delete(); // -- To delete the file
		
		//Desired Capabilities : To bypass the Insecure Licence and certification we use desired capabilities
		
		DesiredCapabilities DC = new DesiredCapabilities();
		DC.setCapability(CapabilityType.ACCEPT_INSECURE_CERTS, true);
		DC.setCapability(CapabilityType.PAGE_LOAD_STRATEGY, true);
		
		//Chrome Options : there is one method in Chrome option that use to run the script without open the browser.
		ChromeOptions co = new ChromeOptions();
		co.merge(DC);
		co.addArguments("headless");
		//WebDriver driver = new ChromeDriver(co);
		
		// Windows Handling : Get different windows Id and Switch to window where we are intended to work on.
		
		String Windowid = driver.getWindowHandle();  // -- To get current window ID
		Set<String> AllWindowsID = driver.getWindowHandles();  // -- To get all open windows ID
		Iterator<String> itr = AllWindowsID.iterator();
		driver.switchTo().window("Provide chile Window ID"); // -- TO switch window control on child window
		
		// Frame Handling
		// There are three way to switch into fram 
		   //driver.switchTo().frame(Framname); -- By frame name
		   //driver.switchTo().frame(framindex); -- By frame index number
		   //driver.switchTo().frame(WebElementof frame); -- By frame web Element 
		
		// TO navigate on parent frame -- outside of frame
		   driver.switchTo().defaultContent(); 
		   
		// Alert 
		   driver.switchTo().alert().accept();
		   driver.switchTo().alert().dismiss();
		   driver.switchTo().alert().getText();
		   driver.switchTo().alert().sendKeys("Test");
		  
		   
		// Screenshots : To take screenshot we need to Common IO dependancy in pom.xml file
		   //There is methods Takescreenshot
		   
		   
	    // Assertion : Hard Assertion and Soft Assertion
		   // Hard Assertion : Execution will stop in Hard Assertion
		   //assert.assertEquals(false, null);
		   //Assert.assertTrue(false);
		   
		   //Soft Assettion : Excecution is not stop even fail the condtion and show the result at the end of execution.
		   // In Soft Assertion we have to create Object for Soft Assertion 
		   
		   SoftAssert softassert = new SoftAssert();
		   
		   softassert.assertEquals(false, false);
		   softassert.assertTrue(false);
		   
		//Parallel Test : We Just need to add the parallel tag in testng. Parallel = Method, Parallel = Class, Parallel = Test
		   //By Methos
		   // BY Class
		   //By Test 
		   
		// Listener Class
		  // We have to create one ListenerClass and Implement with ITestListene interface
		   
		//Property File 
		  // First we have to create object of Properties file -- Properties pop = new Properties();
		  // Then need to create object of FileInputStream to store the datafile path  -- FileInputStream fs = new FileInputStream("Data.propretied file path")
		  // Then load the file  -- pop.load(fs) 
		   
		   // driver.get(pop.getproperties("URL"));
		   
		   
		   
		  
		   
		  
	
		
		
		Thread.sleep(3000);
		//driver.navigate().refresh();
		driver.quit();
		
		
		
		
	}

}
