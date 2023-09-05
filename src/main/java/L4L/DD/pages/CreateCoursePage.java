package L4L.DD.pages;

import java.io.IOException;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import DD.l4l.base.L4lBaseClass;
import L4L.Util.DDUtil;


public class CreateCoursePage extends L4lBaseClass
{
	By username = By.xpath("//input[@placeholder='Username']");
    By password = By.id("password");
    By login = By.xpath("//button[@type='submit']");
	By Dashboardtitle = By.xpath("//h1[@class='welcome-text']");
	By CandIModule = By.xpath("//span[contains(text(),'C & I Module')]");
	By CreateCoursesubmenu = By.xpath("//a[normalize-space()='Course Creation']");
	By CreateCourseButton = By.xpath("//button[@class='ant-btn dashboard__action-btn create-btn ant-btn-primary']");
	By pagetitel = By.xpath("(//span[contains(text(),'Course Creation')])[2]");
	By CreatecourseTitle = By.xpath("//div[@class='create-course-modal-title']");
	By EnterCourseName = By.xpath("//input[@placeholder='Enter name of course']");
	By ExistCourses = By.xpath("//ul[@class='ant-select-dropdown-menu-item-group-list']/li");
	By Model = By.xpath("//div[@class='ant-spin-container']//form[@class='ant-form ant-form-horizontal']");
	By AddCourseCatalog = By.xpath("//button[@class='ant-btn ant-popover-open ant-btn-primary']");
	By AddCourseCatalogTital = By.xpath("(//div[@class='create-course-modal-title'])[2]");
	By NumberofCredit = By.xpath("//input[@class='ant-input height-40']");
	By AddButton = By.xpath("//span[@class='ant-form-item-children']//button[@type='button']");
	By Createcoursetitle = By.xpath("//div[contains(text(),'Create Course')]");
	
	boolean listpresent;
	public boolean navigateToCreateCoursePage() throws IOException
	{	
		DDUtil.explicitwait(driver, Dashboardtitle);
		WebElement CnIMainMenu = driver.findElement(CandIModule);
		DDUtil.javascriptexecutorClick(CnIMainMenu);
		WebElement clickOnCNISubMenu = driver.findElement(CreateCoursesubmenu);
		DDUtil.javascriptexecutorClick(clickOnCNISubMenu);
		DDUtil.explicitwait(driver, CreateCourseButton);
		driver.findElement(CreateCourseButton).click();
		DDUtil.explicitwait(driver, CreatecourseTitle);
		DDUtil.screenshotOfElement(CreatecourseTitle, "Title1.png");
		return driver.findElement(CreatecourseTitle).isDisplayed();	
	}
	
	public void fillCourseDetails() throws InterruptedException
	{
		driver.findElement(EnterCourseName).click();
		Thread.sleep(2000);
		driver.findElement(EnterCourseName).sendKeys("Test");	
		
		try 
		{
		List<WebElement> courseList = driver.findElements(ExistCourses);
		listpresent = courseList.isEmpty();
		}
		catch(Exception e)
		{	
		}
				
		if(!listpresent)
		{
			List<WebElement> selectCourse = driver.findElements(ExistCourses);
			selectCourse.get(2).click();	
		}		
		else
		{
			driver.findElement(Model).click();
			DDUtil.explicitwait(driver, AddCourseCatalog);
			driver.findElement(AddCourseCatalog).click();	
			DDUtil.explicitwait(driver, AddCourseCatalogTital);
		}
		
		
	}
	
	
	
	
	
}
