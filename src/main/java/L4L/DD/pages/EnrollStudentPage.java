package L4L.DD.pages;

import java.util.List;

//import org.apache.batik.css.engine.value.StringValue;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import DD.l4l.base.L4lBaseClass;
import L4L.Util.DDUtil;
import DD.l4l.base.L4lBaseClass;
import L4L.Util.DDUtil;
//import DD.l4l.base.L4lBaseClass;
//import L4L.Util.DDUtil;
//import dd.live.base.HideoBaseclass;
//import dd.live.base.L4LBaseclass;
//import dd.util.DDUtil;

public class EnrollStudentPage extends L4lBaseClass
{
	By Studentsubmenu = By.xpath("//a[normalize-space()='Students']");
	By Enrollstudentbutton = By.xpath("//button[@title='Enroll Student']");
	By Enrollstudentpagetitle = By.xpath("//div[@id=':r0:']");
	By Summercheckbox = By.xpath("//input[@id='summer_session']");
	By PrevSem = By.xpath("//input[@id='prev_sem']");
	By Firstname = By.id("first_name");
	By Latname = By.id("last_name");
	By grade = By.xpath("//input[@id='grade']");
	By DOB = By.id("dob");
	By Age = By.id("age");
	By Gender = By.xpath("//input[@value='M']");
	By IssiblingregisteredinHIDOE  = By.id("is_sibling_reg");
	By Parentsname = By.id("parents_name");
	By StudentPickUp = By.id("students_pickup");
	By Howwilltheygethome = By.id("get_home");
	By EmergencyContact = By.id("emergency_contact");
	By Authorizedpickup = By.id("emergency_pickup");
	By Participatedin21CCLCbefore = By.id("participated_21cclc");
	By afterschoolactivities = By.id("after_school_activity");
	By otheractivitiesoutofschool = By.id("out_of_school_activity");
	By FERPAPolicy = By.id("ferpa_policy");
	By MediaRelease = By.id("media_release");
	By Submitbutton = By.xpath("//button[@type='submit']");
	By Verificationtitle = By.xpath("//div[contains(text(),'Verification')]");
	By selectStudentTitle = By.xpath("//label[@title='Please select a student for verification']");
	By selectstudentdropdown = By.xpath("//input[@class='ant-select-selection-search-input']");
	By SelectStudent = By.xpath("//div[@title='87 - Naleiaulii Kaai (Kaunakakai Elementary)']//div");
	By Program = By.xpath("//div[@class='ant-select-selection-overflow']");
	By selectProgram = By.xpath("(//div[@class='rc-virtual-list-holder-inner'])[2]/div");
	By Registerbutton = By.xpath("//button[@type='submit']//span");
	By registertitle = By.xpath("//div[@class='ant-modal-title']");
	
	public boolean navigateToEnrollStudentpage()
	{
		 DDUtil.explicitwait(driver, Studentsubmenu); 
		 driver.findElement(Studentsubmenu).click();
		 DDUtil.explicitwait(driver, Enrollstudentbutton);
		 boolean EnrStdcheck = driver.findElement(Enrollstudentbutton).isDisplayed();
		 return EnrStdcheck;
	}
	
	
	public void studentdeatilform(String fname, String lname, String dob, int studentage, String parentsname, String pickup, String gethome, int Econtact, String AuthPickup) throws InterruptedException
	{
		DDUtil.explicitwait(driver, Enrollstudentbutton);
		driver.findElement(Enrollstudentbutton).click(); 
		Thread.sleep(1000);
		driver.findElement(Summercheckbox).click();
		Thread.sleep(1000);
		driver.findElement(PrevSem).click();
		Thread.sleep(1000);
		driver.findElement(Firstname).sendKeys(fname);
		Thread.sleep(1000);
		driver.findElement(Latname).sendKeys(lname);
		Thread.sleep(1000);
		driver.findElement(grade).click();
		Thread.sleep(1000);
		List<WebElement> gradelist = driver.findElements(By.xpath("//div[@class='rc-virtual-list-holder-inner']/div"));
		gradelist.get(3).click();
		Thread.sleep(1000);
		//WebElement selectgrade = driver.findElement(grade);
		driver.findElements(Age);
		Thread.sleep(1000);
		///driver.findElement(grade);
		driver.findElement(DOB).sendKeys(dob);
		Thread.sleep(1000);
		driver.findElement(Age).sendKeys(String.valueOf(studentage));
		Thread.sleep(1000);
		driver.findElement(Gender).click();
		driver.findElement(IssiblingregisteredinHIDOE).click();
		driver.findElement(Parentsname).sendKeys(parentsname);
		driver.findElement(StudentPickUp).sendKeys(pickup);
		driver.findElement(Howwilltheygethome).sendKeys(gethome);
		driver.findElement(EmergencyContact).sendKeys(String.valueOf(Econtact));
		driver.findElement(Authorizedpickup).sendKeys(AuthPickup);
		driver.findElement(Participatedin21CCLCbefore).click();
		driver.findElement(afterschoolactivities).click();
		driver.findElement(FERPAPolicy).click();
		Thread.sleep(2000);
		driver.findElement(MediaRelease).click();
		Thread.sleep(2000);
		driver.findElement(Submitbutton).click();
		DDUtil.explicitwait(driver, selectstudentdropdown);
		
		driver.findElement(By.xpath("//div[@class='ant-modal-body']"));
		WebElement title = driver.findElement(By.xpath("registertitle"));
		System.out.println("Title is"+ title.getText());
		DDUtil.explicitwait(driver, registertitle);
		driver.findElement(selectstudentdropdown).click();
		List<WebElement> studentlist = driver.findElements(SelectStudent);
		studentlist.get(1).click();
		DDUtil.explicitwait(driver, Program);
		driver.findElement(Program).click();  
		List<WebElement> studentprogram = driver.findElements(selectProgram);
		studentprogram.get(1).click();
		Thread.sleep(2000);
		DDUtil.explicitwait(driver, Registerbutton);
		driver.findElement(By.xpath("Registerbutton")).click();
		}

	public void verifyStudent() throws InterruptedException
	{
		WebElement title = driver.findElement(By.xpath("registertitle"));
		System.out.println("Title is"+ title.getText());
		DDUtil.explicitwait(driver, registertitle);
		driver.findElement(selectstudentdropdown).click();
		List<WebElement> studentlist = driver.findElements(SelectStudent);
		studentlist.get(1).click();
		DDUtil.explicitwait(driver, Program);
		driver.findElement(Program).click();  
		List<WebElement> studentprogram = driver.findElements(selectProgram);
		studentprogram.get(1).click();
		Thread.sleep(2000);
		DDUtil.explicitwait(driver, Registerbutton);
		driver.findElement(By.xpath("Registerbutton")).click();
		
	}
    }
	
	
	
	
	
	
	
	
	
	

