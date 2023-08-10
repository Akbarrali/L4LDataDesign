package practice.automation.page;

import java.io.IOException;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WindowHandeling 
{

public static WebDriver driver;

By link = By.xpath("//a[contains(text(),'Click Here')]");
By childwindowtitle = By.xpath("//h3[contains(text(),'New Window')]");
	
	@Test
	public void openbroser() 
	{
	driver = WebDriverManager.chromedriver().create();
	
	driver.get("https://the-internet.herokuapp.com/windows");
	
	String title =driver.findElement(By.xpath("//div[@id='content']//h3")).getText();
	
	System.out.println(title);
	
	String ParentWindowID = driver.getWindowHandle();
	
	//System.out.println("Parent WindowID is: "+ParentWindowID);
	
	driver.findElement(link).click();
	
	//System.out.println("Parent WindowID is: "+ParentWindowID);
	
	Set<String> Childwindow = driver.getWindowHandles();
	
	Iterator <String> itr = Childwindow.iterator();
	
	String parent = itr.next();
	String child = itr.next();
	
	//System.out.println("currentW1 is: "+ currentW1);
	//System.out.println("currentW2 is: "+ currentW2);
	
	//String chiiltitle = driver.findElement(childwindowtitle).getText();
	//Assert.assertEquals(chiiltitle, "New Window", "text does not match");
	
	driver.switchTo().window(child);
	
	String chiiltitle2 = driver.findElement(childwindowtitle).getText();
	Assert.assertEquals(chiiltitle2, "New Window", "text does not match");
	String chil = driver.getWindowHandle();
	System.out.println("child windowid is: "+chil);
	
	driver.switchTo().window(parent);
	String par = driver.getWindowHandle();
	System.out.println("parent windowid is: "+par);
	
	
	
	
}}
