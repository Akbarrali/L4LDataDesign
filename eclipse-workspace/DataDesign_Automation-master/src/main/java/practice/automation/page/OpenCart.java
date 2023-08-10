package practice.automation.page;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class OpenCart 
{
	public static WebDriver driver;
	
	@Test
	public void openbroser() throws InterruptedException, IOException 
	{
	driver = WebDriverManager.chromedriver().create();
	
	driver.get("https://naveenautomationlabs.com/opencart/");
	
	String validatetitle = driver.getCurrentUrl();
	
	Assert.assertEquals(validatetitle, "https://naveenautomationlabs.com/opencart/", "URL does not match");
	
    Thread.sleep(5000);
	
	driver.findElement(By.linkText("Desktops")).click();
	
	File src = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
	
	FileUtils.copyFile(src, new File("C:\\Users\\AKBARALI\\eclipse-workspace\\DataDesign\\Screenshots\\Screenshot.png"));

    
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
