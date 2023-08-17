package L4L.DD.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import DD.l4l.base.L4lBaseClass;
import L4L.Util.DDUtil;


public class StudentListEmailPage extends L4lBaseClass
{
	
	By emailPopupTitle = By.xpath("//div[contains(text(),'Email')]");
    By quickkeys = By.xpath("(//span[@class='ant-form-item-children'])[7]/button[1]");
    By ClickonSendbutton = By.xpath("//button[@type='submit']");
	
    
    public boolean validateEmailPopupTitpe() 
    {
    	DDUtil.explicitwait(driver, emailPopupTitle);
    	boolean emailpopuptittlecheck =driver.findElement(emailPopupTitle).isDisplayed();
        return emailpopuptittlecheck;
    }
    
    
    public void selectAllQuickKeys()
    {
    DDUtil.explicitwait(driver, quickkeys);
	for(int i =1; i<=20; i++)
	{
	WebElement quickkeyss = driver.findElement(By.xpath("(//span[@class='ant-form-item-children'])[7]/button["+i+"]"));
	DDUtil.javascriptexecutorClick(quickkeyss);
	}
    }

	public void clickOnSendButton()
	{
		
		WebElement sendemail = driver.findElement(ClickonSendbutton);
		DDUtil.javascriptexecutorClick(sendemail);
	}
	
}














