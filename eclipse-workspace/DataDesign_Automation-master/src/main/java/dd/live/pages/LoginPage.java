package dd.live.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import dd.live.base.Baseclass;
import dd.util.TestUtil;

public class LoginPage extends Baseclass
{
	
    By logo = By.xpath("//img[@alt=‘D+D’])");
    By username = By.xpath("//input[@placeholder='Username']");
    By password = By.id("password");
    By login = By.xpath("//button[@type='submit']/span");
    By usernamevalidaton = By.xpath("//div[contains(text(),'Please input your username')]");
    
    
    public String verifyLoginUrl()
    {
    	TestUtil.explicitwait(driver, username);
    	String loginurl = driver.getCurrentUrl();
    	return loginurl;
    }
    
    public boolean loginWithBlankCredentials() throws InterruptedException
	{
    	TestUtil.explicitwait(driver, login);
    	WebElement uname = driver.findElement(username);
    	TestUtil.javascriptexecutorClick(uname);
    	WebElement upass = driver.findElement(password);
    	TestUtil.javascriptexecutorClick(upass);
    	WebElement Dlogin = driver.findElement(login);
    	TestUtil.javascriptexecutorClick(Dlogin);
    	return driver.findElement(usernamevalidaton).isDisplayed(); 		
	}
  
	
	public String validatetitel()
	{
		return driver.getTitle();	
	}
	
    public StudentTrackerPage ddlogin(String usr, String pass) throws InterruptedException
    {
        TestUtil.explicitwait(driver, username);
        driver.findElement(username).sendKeys(usr);
        Thread.sleep(5);
        driver.findElement(password).sendKeys(pass);
        Thread.sleep(5);
        WebElement submit = driver.findElement(login);
        TestUtil.javascriptexecutorClick(submit);
        return new StudentTrackerPage();
    	
    }
}
