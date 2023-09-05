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
	public static Actions action = new Actions(driver);
	public static JavascriptExecutor jsexecutor = (JavascriptExecutor) driver;
	
	
	//Explicitwait Wait
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
	
	//JavaScriptExecutor Click 
	public static WebElement javascriptexecutorClick(WebElement element)
	{
		jsexecutor.executeScript("arguments[0].click();", element);
		return element;
	}
	
	//JavaScriptExecutor Scroll 
	public static WebElement javascriptExecutorScroll(WebElement element)
	{
		jsexecutor.executeScript("arguments[0].scrollIntoView();", element);
		return element;		
	}
	
	//JavaScriptExecutor DrawLine
	public static WebElement drawBorderJS(WebDriver driver, WebElement element)
	{
		jsexecutor.executeScript("arguments[0].style.border='3px solid red'", element);
        return element;		
	}
	
	

	
	
	//Action Class Hover
	public static void actionclasshover(WebElement element)
	{		
		action.moveToElement(element).build().perform();		
	}

	
	//Action Class Click 
	public static WebElement actionClassClick(WebElement element)
	{		
		action.moveToElement(element).click().perform();
		return element;
	}
	
	
	//Screenshot
	public static void screenshotOfWebpage() throws IOException
	{
		File src = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);	
		FileUtils.copyFile(src, new File("Screenshot.png"));	    
	}	
	
	public static void screenshotOfElement(By locator, String srt) throws IOException
	{
		WebElement element = driver.findElement(locator);
		File src = element.getScreenshotAs(OutputType.FILE);
		File trg = new File((System.getProperty("user.dir") + "/Screenshots/" + srt));
		FileUtils.copyFile(src, trg);
	}
	
	
}