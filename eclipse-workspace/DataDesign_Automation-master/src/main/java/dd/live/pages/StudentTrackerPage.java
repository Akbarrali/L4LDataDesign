package dd.live.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import dd.live.base.Baseclass;
import dd.util.TestUtil;

public class StudentTrackerPage extends Baseclass
{
	By GreetingPopup = By.xpath("(//div[@class='ant-select-selection__rendered'])[2]");
	By CloseGreetingPopup = By.xpath("(//button[@class='ant-btn'])[2]");
	By studenttrackerlabel = By.xpath("//span[@class='main-title__subtitle']");
	By selectcheckbox = By.xpath("(//tr//input)[3]");
	By district = By.cssSelector("th[class='districtIdCol'] span[class='ant-table-column-title']");
	By actionbar = By.xpath("//div[@class='action-buttons']/button[1]");
	By actiontitle = By.xpath("//div[@class='ant-popover-title']");
	By emailactionbutton = By.xpath("//div[@class='ant-popover-inner-content']//button[8]/i");
	By ClickOnSMSOption = By.xpath("//div[@class='ant-popover-inner-content']/button[7]/i");
	By emailPopupTitle = By.xpath("//div[contains(text(),'Email')]");
	By SMSPopupTitle = By.xpath("//div[contains(text(),'SMS')]");
	
	
	public boolean validateGreetingPopup()
	{
		TestUtil.explicitwait(driver, CloseGreetingPopup);
		driver.findElement(CloseGreetingPopup).click();
		TestUtil.explicitwait(driver, district);
		boolean districcheck = driver.findElement(district).isDisplayed();
		return districcheck;	
	}
	
	public boolean validateStudentTrackerLable()
	{	
	 TestUtil.explicitwait(driver, studenttrackerlabel);
     boolean sttile = driver.findElement(studenttrackerlabel).isDisplayed();
     return sttile; 
	}
	
	public boolean selectcheckbox()
	{
		TestUtil.explicitwait(driver, district);
		for(int i =1; i<=4; i++)
		{
			WebElement checkbox = driver.findElement(By.xpath("(//tr//input)["+i+"]"));
			TestUtil.javascriptexecutorClick(checkbox);
		}
		return driver.findElement(selectcheckbox).isSelected();
	}
	
	
	public boolean validateaActionbar()
	{
		TestUtil.explicitwait(driver, actionbar);
		WebElement actionb = driver.findElement(actionbar);
		TestUtil.actionclasshover(actionb);
		TestUtil.explicitwait(driver, actiontitle);
		boolean acttitle = driver.findElement(actiontitle).isDisplayed();
		
		return  acttitle;
	}
	 
	
	public StudentListEmailPage clickonemail()
	{
		TestUtil.explicitwait(driver, emailactionbutton);
	    WebElement emailinactionbar = driver.findElement(emailactionbutton);
	    TestUtil.javascriptexecutorClick(emailinactionbar);
	    TestUtil.explicitwait(driver, emailPopupTitle);
	    
	    return new StudentListEmailPage();
	}

	public StudentListSMSPage clickonSMS()
	{
		TestUtil.explicitwait(driver, ClickOnSMSOption);
	    WebElement clickonSMS = driver.findElement(ClickOnSMSOption);
	    TestUtil.javascriptexecutorClick(clickonSMS);
	    TestUtil.explicitwait(driver, SMSPopupTitle);
	    
	    return new StudentListSMSPage();  
	}
	
	
	
	
	
	
	
}
