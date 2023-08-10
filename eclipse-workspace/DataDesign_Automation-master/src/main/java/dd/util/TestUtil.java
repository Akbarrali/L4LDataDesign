package dd.util;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import dd.live.base.Baseclass;


public class TestUtil extends Baseclass{
	
	
	public static long PAGE_LOAD_TIMEOUT = 20;
	public static long IMPLICIT_WAIT = 10;
	
	public static JavascriptExecutor jsexecutor = (JavascriptExecutor) driver;
	
	//static WebDriver driver;
	
	
	public static WebElement explicitwait(WebDriver driver, By locator) 
	{
        WebDriverWait wait = new WebDriverWait(driver, 100);
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
	
	
	public static WebDriver javascriptexecutorClick(WebElement checkbox)
	{
		
		
		jsexecutor.executeScript("arguments[0].click();", checkbox);
		return driver;
	}
	
	
	public static void actionclasshover(WebElement hover)
	{
		Actions action = new Actions(driver);
		action.moveToElement(hover).build().perform();
	}


	public static WebDriver javascriptExecutorScroll(WebElement scroll)
	{
		
		jsexecutor.executeScript("arguments[0].scrollIntoView();", scroll);
		return driver;
		
	}
	
	
	public static void screenshot() throws IOException
	{
		File src = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
	
		FileUtils.copyFile(src, new File("C:\\Users\\AKBARALI\\eclipse-workspace\\DataDesign\\Screenshots\\Screenshot.png"));
	
	    
	}	
	
	
	
	
}