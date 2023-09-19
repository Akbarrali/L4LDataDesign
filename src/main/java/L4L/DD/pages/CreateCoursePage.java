package L4L.DD.pages;

import java.io.IOException;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import DD.Excel.Utility.Xls_Reader;
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
	By AddCourseCatalog = By.xpath("//button[@type='button']/span[contains(text(),'Add Course Catalog')]");
	By AddCourseCatalogTital = By.xpath("(//div[@class='create-course-modal-title'])[2]");
	By NumberofCredit = By.xpath("//input[@class='ant-input height-40']");
	By AddButton = By.xpath("//span[@class='ant-form-item-children']//button[@type='button']");
	By Createcoursetitle = By.xpath("//div[contains(text(),'Create Course')]");
	By CourseCategory = By.xpath("(//input[@class='ant-input ant-select-search__field'])[1]");
	By CourseCatList = By.xpath("//div[@id='40c662a6-fb01-4f57-fc10-b2cd5ee6006b']//ul[@role='listbox']/li");
	By TranscriptCat = By.xpath("//div[@id='transcript']//input[@type='text']");
	By TranscriptCatList = By.xpath("//div[@id='40c662a6-fb01-4f57-fc10-b2cd5ee6006b']//li");
	By SubjectName = By.xpath("//input[@placeholder='Enter subject name']");
	By NumOfCredit = By.xpath("//input[@type='number']");
	By AddB = By.xpath("//div[@class='ant-col ant-col-6']//button[@type='button']");
	By CourseID = By.xpath("//input[@id='courseId-1']");
	By Sem1Course = By.xpath("//input[@id='courseName#1']");
	By SaveButton = By.xpath("//button[@type='submit']");
	By SelectCourse;
	By SelectTranCat;
	By SubjectN;
	By CourseIDEnter;
	By SemACourse;
	
	
	boolean listpresent;
	
	Xls_Reader reader = new Xls_Reader(System.getProperty("user.dir") + "\\src\\main\\java\\L4L\\config\\CandIModule.xlsx");
	public boolean navigateToCreateCoursePage() throws IOException
	{	
		//DDUtil.explicitwait(driver, CandIModule);
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
	
	public void fillCourseDetailsPage() throws InterruptedException
	{
		driver.findElement(EnterCourseName).click();
		Thread.sleep(2000);
		driver.findElement(EnterCourseName).sendKeys("0215");	
		
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
			//Thread.sleep(1000);
			DDUtil.explicitwait(driver, AddCourseCatalog);						
			WebElement AddC = driver.findElement(AddCourseCatalog);
			DDUtil.javascriptexecutorClick(AddC);
			DDUtil.explicitwait(driver, AddCourseCatalogTital);
		}	
	}
	
	public void addNewCourseCatalogPage() throws InterruptedException
	{
		int rowcount = reader.getRowCount("Addcourses");
		
		for(int i=2; i<=rowcount; i++)
		{
			String CrsCat = reader.getCellData("Addcourses", "courseCategory", i);
			String tranCat = reader.getCellData("datadesingusers", "transcriptCategory", i);
			String parntSub = reader.getCellData("datadesingusers", "parentSubject", i);
			String crsID = reader.getCellData("datadesingusers", "courseIDA", i);
			String SemA = reader.getCellData("datadesingusers", "semesterA", i);
				
		DDUtil.explicitwait(driver, CourseCategory);
		driver.findElement(CourseCategory).click();
		SelectCourse = (By.xpath("//li[contains(text(),'"+CrsCat+"')]"));
		driver.findElement(SelectCourse).click();
		Thread.sleep(1000);
		
		DDUtil.explicitwait(driver, TranscriptCat);
		driver.findElement(TranscriptCat).sendKeys("H");
		Thread.sleep(1000);
		SelectTranCat = (By.xpath("//li[normalize-space()='"+tranCat+"']"));
		driver.findElement(SelectTranCat).click();
		Thread.sleep(1000);
		
		DDUtil.explicitwait(driver, SubjectName);
		driver.findElement(SubjectName).click();
		SubjectN = (By.xpath("//input[@placeholder='"+parntSub+"']"));
		driver.findElement(SubjectN).click();
		Thread.sleep(1000);
		
		DDUtil.explicitwait(driver, NumOfCredit);
		driver.findElement(NumOfCredit).sendKeys("5");
		
		DDUtil.explicitwait(driver, CourseID);
		driver.findElement(CourseID).click();
		CourseIDEnter = (By.xpath("//input[@placeholder='"+crsID+"']"));
		driver.findElement(CourseIDEnter).click();
		Thread.sleep(1000);
		
		DDUtil.explicitwait(driver, Sem1Course);
		driver.findElement(Sem1Course).click();
		SemACourse = (By.xpath("//input[@placeholder='"+SemA+"']"));
		driver.findElement(SemACourse).click();
		Thread.sleep(1000);
		driver.findElement(SaveButton).click();
		
		
		
		}
		
		
	}
	
	
	
}
