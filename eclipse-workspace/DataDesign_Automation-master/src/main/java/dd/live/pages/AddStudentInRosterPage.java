package dd.live.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

import dd.live.base.Baseclass;
import dd.util.TestUtil;

public class AddStudentInRosterPage extends Baseclass
{
	By GreetingPopup = By.xpath("//div[@class='ant-result ant-result-info splash-wrapper']");
	By CloseGreetingPopup = By.xpath("//div[@class='ant-result ant-result-info splash-wrapper']//button[2]");
	By Plusbutton = By.xpath("//button[@class='ant-btn btn add_student']");
	By checkbox = By.xpath("//div[@class='ant-list ant-list-sm ant-list-split']//li[1]//span[2]");
	By label = By.xpath("(//div[@class='ant-modal-content']//div)[1]/div");
	By studentearchbox = By.cssSelector("div[class='search-container-sec'] input[placeholder='Search']");
	By Studentsearched = By.xpath("//li[@class='ant-list-item']//input[@type='checkbox']");
	By student = By.xpath("//span[contains(text(),'641768 - Adam Florez')]");
	By Okbutton = By.xpath("//span[contains(text(),'OK')]");
	By Searchbox = By.xpath("(//input[@placeholder='Search'])[2]");
	By Searchstudent = By.xpath("(//span[contains(text(),'Florez')])[2]");
	By successmessage = By.xpath("//span[contains(text(),'All students assigned successfully']");
	
	JavascriptExecutor jsexecutor = (JavascriptExecutor) driver;
	
	public void validateGreetingpopup()
	{
		
		TestUtil.explicitwait(driver, CloseGreetingPopup);
		WebElement greetinP =driver.findElement(CloseGreetingPopup);
		jsexecutor.executeScript("arguments[0].scrollIntoView();", greetinP);
		TestUtil.javascriptexecutorClick(greetinP);
	}
	
	public boolean clickOnPlusButton()
	{
		TestUtil.explicitwait(driver, Plusbutton);
		driver.findElement(Plusbutton).click();
		TestUtil.explicitwait(driver, checkbox);
		boolean labeldeisplay=driver.findElement(label).isDisplayed();
		return labeldeisplay;
		
	}
	
	public boolean selectStudentFromRosterList() throws InterruptedException
	{
		TestUtil.explicitwait(driver, studentearchbox);
		driver.findElement(studentearchbox).click();
		driver.findElement(studentearchbox).sendKeys("Aaliyah Stamps");
		WebElement searchedStudent = driver.findElement(Studentsearched);
		TestUtil.javascriptexecutorClick(searchedStudent);
		Thread.sleep(3);
		WebElement OK = driver.findElement(Okbutton);
		TestUtil.javascriptexecutorClick(OK);
		Thread.sleep(2);
		TestUtil.explicitwait(driver, successmessage);
		boolean successmsg = driver.findElement(successmessage).isDisplayed();
		return successmsg;
	}
	
	public boolean verifyStudentIsAddedInRoster() throws InterruptedException
	{
		driver.findElement(Searchbox).sendKeys("Aaliyah Stamps");
		Thread.sleep(3);
		boolean studentdisplay = driver.findElement(Searchstudent).isDisplayed();
		return studentdisplay;

	}
	
}
