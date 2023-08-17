package L4L.DD.pages;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import DD.l4l.base.L4lBaseClass;
import L4L.Util.DDUtil;
import DD.l4l.base.L4lBaseClass;

public class StudentListSMSPage extends L4lBaseClass
{

	
	By ClickOnSMSOption = By.xpath("//div[@class='ant-popover-inner-content']/button[7]/i");
	By SMSPopupTitle = By.xpath("//div[contains(text(),'SMS')]");
    By quickkeys = By.xpath("(//span[@class='ant-form-item-children'])[4]/span[1]/button");
    By ClickonSendbutton = By.xpath("//button[@type='submit']");
	
    public void clickOnSMS()
    {   
    	
    	DDUtil.explicitwait(driver, ClickOnSMSOption);
    	WebElement sms = driver.findElement(ClickOnSMSOption);
        DDUtil.javascriptexecutorClick(sms);
    }
    
    public boolean validateSMSPopupTitle()
    {
    	DDUtil.explicitwait(driver, SMSPopupTitle);
    	boolean emailpopuptittlecheck =driver.findElement(SMSPopupTitle).isDisplayed();
        return emailpopuptittlecheck;
    }
    
    
    public void selectAllQuickKeys()
    {
    DDUtil.explicitwait(driver, quickkeys);
	for(int i =1; i<=20; i++)
	{
	WebElement quickkeyss = driver.findElement(By.xpath("(//span[@class='ant-form-item-children'])[4]/span["+i+"]/button"));
	DDUtil.javascriptexecutorClick(quickkeyss);
	}
	
    }

	public void clickOnSendButton()
	{
		
		WebElement sendemail = driver.findElement(ClickonSendbutton);
		DDUtil.javascriptexecutorClick(sendemail);
	}
	
	
	
	
	
	
	
	
	
}
