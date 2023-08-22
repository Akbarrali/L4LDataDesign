package L4L.DD.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import DD.l4l.base.L4lBaseClass;
import L4L.Util.DDUtil;
import DD.l4l.base.L4lBaseClass;
import L4L.Util.DDUtil;


public class HDLoginPage extends L4lBaseClass
{
	By logo = By.xpath("");
    By username = By.xpath("//input[@placeholder='Username']");
    By password = By.id("password");
    By login = By.xpath("//button[@type='submit']");
    By HomepageUsername = By.xpath("//div[contains(text(),'Test SG Admin')]");
    
    
    public String verifyLoginUrl()
    {
    	DDUtil.explicitwait(driver, username);
    	String HDloginurl = driver.getCurrentUrl();
    	return HDloginurl;
    }
  
    public boolean validatelogo()
	{
    	return driver.findElement(logo).isDisplayed();	
	}
	
    public EnrollStudentPage ddlogin(String hdusr, String hdpass) throws InterruptedException
    {
        DDUtil.explicitwait(driver, username);
        driver.findElement(username).sendKeys(hdusr);
        Thread.sleep(2000);
        driver.findElement(password).sendKeys(hdpass);
        Thread.sleep(3000);
        WebElement loginbutton = driver.findElement(login);
        loginbutton.click();
        DDUtil.explicitwait(driver, HomepageUsername);
        Thread.sleep(3000);
        return new EnrollStudentPage();
    	
    }
}
