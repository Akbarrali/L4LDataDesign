package L4L.DD.pages;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import DD.l4l.base.L4lBaseClass;
import L4L.Util.DDUtil;
import DD.l4l.base.L4lBaseClass;
import L4L.Util.DDUtil;

public class AddStudentInRosterPage extends L4lBaseClass
{
	By GreetingPopup = By.xpath("//div[@class='ant-result ant-result-info splash-wrapper']");
	By CloseGreetingPopup = By.xpath("//div[@class='ant-result ant-result-info splash-wrapper']//button[2]");
	By Plusbutton = By.xpath("//button[@class='ant-btn btn add_student']");
	By checkbox = By.xpath("//div[@class='ant-list ant-list-sm ant-list-split']//li[1]//span[2]");
	By Studettrackertitle = By.xpath("//span[@class='main-title__subtitle']");
	By studentearchbox = By.cssSelector("div[class='search-container-sec'] input[placeholder='Search']");
	By Studentsearched = By.xpath("//li[@class='ant-list-item']//input[@type='checkbox']");
	By student = By.xpath("//span[contains(text(),'641768 - Adam Florez')]");
	By Okbutton = By.xpath("//span[contains(text(),'OK')]");
	By Searchbox = By.xpath("//div[@class='search-container-sec']//input[@placeholder='Search']");
	By SelectStudent = By.xpath("//span[normalize-space()='651049 - Aaliyah Stamps']");
	By STrackerSearch = By.xpath("//span[@class='ant-input-search ant-input-affix-wrapper']//input[@placeholder='Search']");
	//By STstudent = By.xpath("(//span[contains(text(),'Aaliyah')])[2]");
	By RosterStudent = By.xpath("//td[@class='districtIdCol']//a[contains(text(),'651049')]");
	By successmessage = By.xpath("//span[contains(text(),'All students assigned successfully']");
	
	JavascriptExecutor jsexecutor = (JavascriptExecutor) driver;
	
	
	public void validateGreetingpopup()
	{
		
		DDUtil.explicitwait(driver, CloseGreetingPopup);
		WebElement greetinP =driver.findElement(CloseGreetingPopup);
		jsexecutor.executeScript("arguments[0].scrollIntoView();", greetinP);
		DDUtil.javascriptexecutorClick(greetinP);
	}
	
	public boolean clickOnPlusButtonandselectStudentFromRosterList() throws InterruptedException
	{
		DDUtil.explicitwait(driver, Plusbutton);
		driver.findElement(Plusbutton).click();
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(100));
		wait.until(ExpectedConditions.elementToBeClickable(Searchbox));
		driver.findElement(Searchbox).sendKeys("Aaliyah Stamps");
		Thread.sleep(2000);
		WebElement SelectedStudent = driver.findElement(SelectStudent);
		DDUtil.javascriptexecutorClick(SelectedStudent);
		Thread.sleep(2000);
		DDUtil.explicitwait(driver, Okbutton);
		WebElement OK = driver.findElement(Okbutton);
		DDUtil.javascriptexecutorClick(OK);
		Thread.sleep(3);
		DDUtil.explicitwait(driver, Studettrackertitle);
		boolean STTitle = driver.findElement(Studettrackertitle).isDisplayed();
		return STTitle;
	}
	
	public boolean verifyStudentIsAddedInRoster() throws InterruptedException
	{
		//wait.until(ExpectedConditions.elementToBeClickable(STrackerSearch));
		Thread.sleep(3000);
		driver.findElement(STrackerSearch).sendKeys("Aaliyah Stamps");
		
		DDUtil.explicitwait(driver, RosterStudent);
		boolean studentdisplay = driver.findElement(RosterStudent).isDisplayed();
		return studentdisplay;

	}
	
}
