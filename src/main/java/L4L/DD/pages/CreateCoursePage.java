package L4L.DD.pages;

import org.openqa.selenium.By;

import DD.l4l.base.L4lBaseClass;
import L4L.Util.DDUtil;

public class CreateCoursePage extends L4lBaseClass

{
	By username = By.xpath("//input[@placeholder='Username']");
    By password = By.id("password");
    By login = By.xpath("//button[@type='submit']");
	By Dashboardtitle = By.xpath("//h1[@class='welcome-text']");
	By CandIModule = By.xpath("//span[contains(text(),'C & I Module')]");
	By CreateCourse = By.xpath("//a[normalize-space()='Course Creation']");
	By pagetitel = By.xpath("(//span[contains(text(),'Course Creation')])[2]");
	By CreateCourseButton = By.xpath("//button[@class='ant-btn dashboard__action-btn create-btn ant-btn-primary']");
	By CreatecourseTitle = By.xpath("//div[@class='create-course-modal-title']");
	By coursename = By.xpath("//input[@value='Digital Skills']");
	By NumberofCredit = By.xpath("//input[@class='ant-input height-40']");
	By AddButton = By.xpath("//span[@class='ant-form-item-children']//button[@type='button']");
	
	
	
	
	
	
	
	
	public boolean navigateToCreateCoursePage()
	{
		
		DDUtil.explicitwait(driver, Dashboardtitle);
		driver.findElement(CandIModule).click();
		driver.findElement(CreateCourse).click();
		DDUtil.explicitwait(driver, pagetitel);
		driver.findElement(CreateCourseButton).click();
		DDUtil.explicitwait(driver, CreatecourseTitle);
		return driver.findElement(CreatecourseTitle).isDisplayed();
		
	}
	
	
	
	
	
}
