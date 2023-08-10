package dd.live.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import dd.live.base.Baseclass;
import dd.util.TestUtil;

public class StudentListEmailPage extends Baseclass
{
	
	By emailPopupTitle = By.xpath("//div[contains(text(),'Email')]");
    By quickkeys = By.xpath("(//span[@class='ant-form-item-children'])[7]/button[1]");
    By ClickonSendbutton = By.xpath("//button[@type='submit']");
	
    
    public boolean validateEmailPopupTitpe() 
    {
    	TestUtil.explicitwait(driver, emailPopupTitle);
    	boolean emailpopuptittlecheck =driver.findElement(emailPopupTitle).isDisplayed();
        return emailpopuptittlecheck;
    }
    
    
    public void selectAllQuickKeys()
    {
    TestUtil.explicitwait(driver, quickkeys);
	for(int i =1; i<=20; i++)
	{
	WebElement quickkeyss = driver.findElement(By.xpath("(//span[@class='ant-form-item-children'])[7]/button["+i+"]"));
	TestUtil.javascriptexecutorClick(quickkeyss);
	}
    }

	public void clickOnSendButton()
	{
		
		WebElement sendemail = driver.findElement(ClickonSendbutton);
		TestUtil.javascriptexecutorClick(sendemail);
	}
	
}














