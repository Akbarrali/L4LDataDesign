package L4L.DD.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import DD.l4l.base.L4lBaseClass;
import L4L.Util.DDUtil;
import DD.l4l.base.L4lBaseClass;
import L4L.Util.DDUtil;

public class LoginPage extends L4lBaseClass
{
	
    By logo = By.xpath("//img[@alt=‘D+D’])");
    By username = By.xpath("//input[@placeholder='Username']");
    By password = By.id("password");
    By login = By.xpath("//button[@type='submit']");
    By usernamevalidaton = By.xpath("//div[contains(text(),'Please input your username')]");
    By GreetingPopup = By.xpath("//div[@class='ant-result-extra']");
    
    public String verifyLoginUrl()
    {
    	DDUtil.explicitwait(driver, username);
    	String loginurl = driver.getCurrentUrl();
    	return loginurl;
    }
   
    public boolean loginWithBlankCredentials() throws InterruptedException
	{
    	DDUtil.explicitwait(driver, login);
    	WebElement uname = driver.findElement(username);
    	DDUtil.javascriptexecutorClick(uname);
    	WebElement upass = driver.findElement(password);
    	DDUtil.javascriptexecutorClick(upass);
    	WebElement Dlogin = driver.findElement(login);
    	DDUtil.javascriptexecutorClick(Dlogin);
    	DDUtil.explicitwait(driver, login);
    	return driver.findElement(usernamevalidaton).isDisplayed(); 		
	}
  
	
	public String validatetitel()
	{
		return driver.getTitle();	
	}
	
    public StudentTrackerPage ddlogin(String usr, String pass) throws InterruptedException
    {
        DDUtil.explicitwait(driver, username);
        driver.findElement(username).sendKeys(usr);
        Thread.sleep(2000);
        driver.findElement(password).sendKeys(pass);
        Thread.sleep(3000);
        WebElement submit = driver.findElement(login);
        DDUtil.javascriptexecutorClick(submit);
        DDUtil.explicitwait(driver, GreetingPopup);
        return new StudentTrackerPage();
    	
    }
}
