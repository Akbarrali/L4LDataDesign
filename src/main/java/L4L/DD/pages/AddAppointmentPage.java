package L4L.DD.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import DD.l4l.base.L4lBaseClass;
import L4L.Util.DDUtil;
import L4L.Util.DDUtil;

public class AddAppointmentPage extends L4lBaseClass

{

	By AddEvent = By.xpath("//div[@class='ant-popover-inner-content']/button[1]/i[1]");
	By AddEventTitle = By.id("//div[@id='rcDialogTitle0']");
	By Title = By.xpath("//textarea[@placeholder='Title']");
	By Description = By.xpath("//textarea[@placeholder='Description']");
	By Category = By.xpath("//div[contains(text(),'Please select category')]");
	By SelectAppointment = By.xpath("//li[contains(text(),'Appointment')]");
	By Startdate = By.xpath("(//input[@placeholder='Select date'])[1]");
	By EndDate = By.xpath("//span[@id='end_date']//input[@placeholder='Select date']");
	By SelectStartdate = By.xpath("//div[@aria-selected='true']");
	By SelectEnddate = By.xpath("//div[@aria-disabled='false'][normalize-space()='30']");
	By Starttime = By.xpath("//input[@id='start_time']");
	By Endtime = By.xpath("//input[@id='end_time']");
	By Monthtitle = By.xpath("//a[@title='Choose a month']");
	By EnterStarttime = By.xpath("(//div[@class='ant-time-picker-panel-select']//li[6])[1]");
	By EnterEndtime = By.xpath("//div[@class='ant-time-picker-panel-select ant-time-picker-panel-select-active']//li[8]");
	By Yeartitle = By.xpath("//a[@title='Choose a year']");
	By YearNextbutton = By.xpath("//a[@title='Next year (Control + right)']']");
	By actionbar = By.xpath("//div[contains(text(),'Action Box')]");
	By actiontitle = By.xpath("//div[@class='ant-popover-title']");
	By EventActionbutton = By.xpath("//i[@class='anticon anticon-carry-out']");
	By EventPopupTitle = By.xpath("(//div[contains(text(),'Add Event')])[1]");
	By ActionAllbutton = By.xpath("//i[@class='anticon anticon-appstore']");
	By successValidation = By.xpath("//span[contains(text(),'Appointment added successfully')]");
	By AddButton = By.xpath("//div[@class='ant-modal-footer']//button[1]");

	
	public boolean clickOnEventActionButton()
	{
		DDUtil.explicitwait(driver, ActionAllbutton);
		WebElement actionb = driver.findElement(actionbar);
		DDUtil.actionclasshover(actionb);
		//DDUtil.explicitwait(driver, actiontitle);
		L4L.Util.DDUtil.explicitwait(driver, EventActionbutton);
	    WebElement EventAction = driver.findElement(EventActionbutton);
	    DDUtil.explicitwait(driver, ActionAllbutton);
	    DDUtil.explicitwait(driver, EventPopupTitle);
	    return driver.findElement(EventPopupTitle).isDisplayed();
	}
			
     public boolean AddAppointment(String Etitle, String Edescr, String exmonth, String exyear) throws InterruptedException
     {
    	 
        //boolean selecteddate = false;
        DDUtil.explicitwait(driver, Title);
 		driver.findElement(Title).sendKeys(Etitle);
 		driver.findElement(Description).sendKeys(Edescr);
 		driver.findElement(Category).click();
 		Thread.sleep(1000);
 		driver.findElement(SelectAppointment).click();
 		DDUtil.explicitwait(driver, Startdate);
 		driver.findElement(Startdate).click();
 		driver.findElement(By.xpath("//div[@class='ant-calendar-date'][normalize-space()='22']")).click();
 		Thread.sleep(2000);
 		DDUtil.explicitwait(driver, EndDate);
 		driver.findElement(EndDate).click();
 		driver.findElement(By.xpath("//div[normalize-space()='25']")).click();
 		Thread.sleep(2000);

 		//driver.findElement(By.xpath("//input[@value='05-25-2023']")).isDisplayed();
 		//05:34 pm
 		driver.findElement(Starttime).click();
 		driver.findElement(EnterStarttime).click();
 		Thread.sleep(2000);
        driver.findElement(Endtime).click();
 		driver.findElement(EnterEndtime).click();
 		Thread.sleep(2000);
 		DDUtil.explicitwait(driver, EndDate);
 		driver.findElement(AddButton).click();
 		Thread.sleep(3000);
 		DDUtil.explicitwait(driver, successValidation);
 		return driver.findElement(successValidation).isDisplayed();
 		
 		
 	
//    	String MonthT = driver.findElement(Monthtitle).getText();  
//    	String YearT = driver.findElement(Yeartitle).getText();  
//    	
//    	for(int i=1; i<5; i++)
//    	{
//    		if(!(MonthT.equals(exmonth)) && (YearT.equals(exyear)))
//       	 {
//       		 WebElement nextclick = driver.findElement(YearNextbutton);
//       		 nextclick.click();
//       	 }
//    		else 
//       	 { 
//       	      driver.findElement(By.xpath("//div[@class='ant-calendar-date'][normalize-space()='20']")).click();
//       		  selecteddate = driver.findElement(By.xpath("//input[contains(@class,'ant-calendar-input')]")).isDisplayed();
//       		  System.out.println(selecteddate);
//       	 {
//    	}
//    	 
//    	
//    	
//    	Thread.sleep(4000);	 
//    	 }
//     }
//		return selecteddate;
//}
     



}
} 
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     
