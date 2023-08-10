package dd.live.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import dd.live.base.Baseclass;
import dd.util.TestUtil;

public class StudentListSMSPage extends Baseclass
{

	
	By ClickOnSMSOption = By.xpath("//div[@class='ant-popover-inner-content']/button[7]/i");
	By SMSPopupTitle = By.xpath("//div[contains(text(),'SMS')]");
    By quickkeys = By.xpath("(//span[@class='ant-form-item-children'])[4]/span[1]/button");
    By ClickonSendbutton = By.xpath("//button[@type='submit']");
	
    public void clickOnSMS()
    {   
    	
    	TestUtil.explicitwait(driver, ClickOnSMSOption);
    	WebElement sms = driver.findElement(ClickOnSMSOption);
        TestUtil.javascriptexecutorClick(sms);
    }
    
    public boolean validateSMSPopupTitle()
    {
    	TestUtil.explicitwait(driver, SMSPopupTitle);
    	boolean emailpopuptittlecheck =driver.findElement(SMSPopupTitle).isDisplayed();
        return emailpopuptittlecheck;
    }
    
    
    public void selectAllQuickKeys()
    {
    TestUtil.explicitwait(driver, quickkeys);
	for(int i =1; i<=20; i++)
	{
	WebElement quickkeyss = driver.findElement(By.xpath("(//span[@class='ant-form-item-children'])[4]/span["+i+"]/button"));
	TestUtil.javascriptexecutorClick(quickkeyss);
	}
	
    }

	public void clickOnSendButton()
	{
		
		WebElement sendemail = driver.findElement(ClickonSendbutton);
		TestUtil.javascriptexecutorClick(sendemail);
	}
	
	
	
	
	
	
	
	
	
}
