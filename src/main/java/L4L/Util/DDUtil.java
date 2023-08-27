package L4L.Util;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


import DD.l4l.base.L4lBaseClass;


public class DDUtil extends L4lBaseClass{
	
	
	public static long PAGE_LOAD_TIMEOUT = 20;
	public static long IMPLICIT_WAIT = 10;
	
	public static JavascriptExecutor jsexecutor = (JavascriptExecutor) driver;
	
	//static WebDriver driver;
	
	
	public static WebElement explicitwait(WebDriver driver, By locator) 
	{
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(IMPLICIT_WAIT));
        WebElement element = null;

        try 
        {
            element = wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
        } 
        catch (Exception e) 
        {
            element = wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
        }
        return element;
    }
	
	
	public static WebDriver javascriptexecutorClick(WebElement element)
	{
		jsexecutor.executeScript("arguments[0].click();", element);
		return driver;
	}
	

	public static WebElement javascriptExecutorScroll(WebElement element)
	{
		jsexecutor.executeScript("arguments[0].scrollIntoView();", element);
		return element;		
	}
	
	public static WebElement drawBorderJS(WebDriver driver, WebElement element)
	{
		//jsexecutor.executeScript("arguments[0].style.border='3px solid read';", element);
		jsexecutor.executeScript("arguments[0].style.border = 4px + ' solid ' + red;", element);
        return element;		
	}
	
	
	public static void actionclasshover(WebElement hover)
	{
		Actions action = new Actions(driver);
		action.moveToElement(hover).build().perform();
	}


	
	
	public static void screenshot() throws IOException
	{
		File src = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
	
		FileUtils.copyFile(src, new File("C:\\Users\\akbarali\\L4LDataDesign\\DDST\\Screenshots\\Screenshot.png"));
	
	    
	}	
	
	
	
	
}