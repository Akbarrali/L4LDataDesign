package JavaProg;

import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import L4L.Util.DDUtil;

public class TestClass 
{
	public static void calendarTest(String usernam, String pass) throws InterruptedException
	{
		By username = By.xpath("//input[@placeholder='Username']");
	    By password = By.id("password");
	    By login = By.xpath("//button[@type='submit']");
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://qa-l4l.datadesign.io");
		driver.findElement(username).sendKeys(usernam);
    	String emailvalue = driver.findElement(username).getText();
    	System.out.println(emailvalue);
        Thread.sleep(2000);
        driver.findElement(password).sendKeys(pass);
        Thread.sleep(2000);
		WebElement submit = driver.findElement(login);
        DDUtil.javascriptexecutorClick(submit);
		
	}
	
	
	public static void main(String[] args) throws InterruptedException 
	{
		TestClass.calendarTest("", "");

	}


}