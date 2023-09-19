package L4L.DD.pages;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

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
    By welcometext = By.xpath("//h1[@class='welcome-text']");
    By loginuser = By.xpath("//span[contains(text(),'Regular Test')]");
    By TechLoginuser = By.xpath("//span[@class='dd-username']");
    By GreetingPopup = By.xpath("//div[@class='ant-result ant-result-info splash-wrapper']");
    By GreetingPopCloseButton = By.xpath("/(//button[@class='ant-btn'])[2]");
    
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
       
        String user = "Teacher";
        switch(user)
        {
        case "CI": 
        	driver.findElement(username).sendKeys("reg@mailinator.com");
        	String emailvalue = driver.findElement(username).getText();
        	System.out.println(emailvalue);
            Thread.sleep(2000);
            driver.findElement(password).sendKeys("NwBcX5R4V");
            Thread.sleep(2000);
			WebElement submit = driver.findElement(login);
            DDUtil.javascriptexecutorClick(submit);
			DDUtil.explicitwait(driver, welcometext);
        	String Welcomemsg = driver.findElement(welcometext).getText();
        	System.out.println("Login as RIS");
            break;
        case "Teacher":
        	driver.findElement(username).sendKeys(usr);
            Thread.sleep(1000);
            driver.findElement(password).sendKeys(pass);
            Thread.sleep(2000);
			WebElement Techloginbutton = driver.findElement(login);
            DDUtil.javascriptexecutorClick(Techloginbutton);
			DDUtil.explicitwait(driver, GreetingPopCloseButton);
        	WebElement closepopup = driver.findElement(GreetingPopCloseButton);
        	DDUtil.javascriptexecutorClick(closepopup);
        	System.out.println("Login as Teacher");
            break;
       default : 
            driver.findElement(username).sendKeys(usr);
            Thread.sleep(1000);
            driver.findElement(password).sendKeys(pass);
            Thread.sleep(2000);
			WebElement submitll = driver.findElement(login);
            DDUtil.javascriptexecutorClick(submitll);
			DDUtil.explicitwait(driver, GreetingPopup);
        	//String GreetingP1= driver.findElement(GreetingPopCloseButton).getText();
        	driver.findElement(GreetingPopCloseButton).click();
        	
            break;
        }
              
        return new StudentTrackerPage();
    	
    }
}
