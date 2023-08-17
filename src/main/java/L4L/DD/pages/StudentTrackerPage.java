package L4L.DD.pages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import DD.l4l.base.L4lBaseClass;
//import dd.live.base.L4LBaseclass;
//import dd.util.TestUtil;
import L4L.Util.DDUtil;

public class StudentTrackerPage extends L4lBaseClass
{
	By GreetingPopup = By.xpath("(//div[@class='ant-select-selection__rendered'])[2]");
	By CloseGreetingPopup = By.xpath("(//button[@class='ant-btn'])[2]");
	By studenttrackerlabel = By.xpath("//span[@class='main-title__subtitle']");
	By selectcheckbox = By.xpath("(//tr//input)[3]");
	By district = By.xpath("(//span[text()='District ID'])[1]");
	By actionbar = By.xpath("//div[@class='action-buttons']/button[1]");
	By actiontitle = By.xpath("//div[@class='ant-popover-title']");
	By emailactionbutton = By.xpath("//div[@class='ant-popover-inner-content']//button[11]/i");
	By ClickOnSMSOption = By.xpath("//div[@class='ant-popover-inner-content']/button[10]/i");
	By emailPopupTitle = By.xpath("//div[contains(text(),'Email')]");
	By SMSPopupTitle = By.xpath("//div[contains(text(),'SMS')]");
	By selectstudent = By.xpath("(//input[@name='32'])[2]");
	By followupbutton = By.xpath("(//button[@class='ant-btn ant-btn-primary']//span)[1]");
	

	
	
	public boolean validateGreetingPopup()
	{
		DDUtil.explicitwait(driver, CloseGreetingPopup);
		driver.findElement(CloseGreetingPopup).click();
		DDUtil.explicitwait(driver, followupbutton);
		boolean districcheck = driver.findElement(followupbutton).isDisplayed();
		return districcheck;	
	}
	
	public boolean validateStudentTrackerLable()
	{	
	 DDUtil.explicitwait(driver, studenttrackerlabel);
     boolean sttile = driver.findElement(studenttrackerlabel).isDisplayed();
     return sttile; 
	}
	
	public boolean selectcheckbox() throws InterruptedException
	{
		DDUtil.explicitwait(driver, selectstudent);
		
		WebElement Scheck = driver.findElement(selectstudent);
		DDUtil.javascriptexecutorClick(Scheck);
		return driver.findElement(selectstudent).isSelected();
		
//		for(int i =1; i<=4; i++)
//		{
//			WebElement checkbox = driver.findElement(By.xpath("(//tr//input)["+i+"]"));
//			Thread.sleep(1000);
//			TestUtil.javascriptexecutorClick(checkbox);
//		}
//		//TestUtil.explicitwait(driver, selectcheckbox);
		
	}
	
	
	public boolean validateaActionbar()
	{
		DDUtil.explicitwait(driver, actionbar);
		WebElement actionb = driver.findElement(actionbar);
		DDUtil.actionclasshover(actionb);
		DDUtil.explicitwait(driver, actiontitle);
		boolean acttitle = driver.findElement(actiontitle).isDisplayed();
		
		return  acttitle;
	}
	 
	
	public StudentListEmailPage clickonemail()
	{
		DDUtil.explicitwait(driver, emailactionbutton);
	    WebElement emailinactionbar = driver.findElement(emailactionbutton);
	    DDUtil.javascriptexecutorClick(emailinactionbar);
	    DDUtil.explicitwait(driver, emailPopupTitle);
	    
	    return new StudentListEmailPage();
	}

	public StudentListSMSPage clickonSMS()
	{
		DDUtil.explicitwait(driver, ClickOnSMSOption);
	    WebElement clickonSMS = driver.findElement(ClickOnSMSOption);
	    DDUtil.javascriptexecutorClick(clickonSMS);
	    DDUtil.explicitwait(driver, SMSPopupTitle);
	    
	    return new StudentListSMSPage();  
	}
	
	
	
	
	
	
	
}
