package L4L.DD.pages;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import DD.l4l.base.L4lBaseClass;
import L4L.Util.DDUtil;
//import dd.live.base.L4LBaseclass;
//import dd.util.ExcelReader;
//import dd.util.TestUtil;
//import dd.util.Xls_Reader;

public class LearningPlan extends L4lBaseClass {

//	Xls_Reader reader = new Xls_Reader("\\Users\\AKBARALI\\eclipse-workspace\\DataDesign\\src\\main\\java\\dd\\live\\config\\LearnigplanStudent.xlsx");
//	public Actions act = new Actions(driver);

	By HomePageGreeting = By.xpath("//h1[@class='welcome-text']");
	By GreetingCloseButton = By.xpath("//button[@class='ant-btn']");
	By Distheader = By.xpath("(//span[contains(text(),'District ID')])[1]");
	By followupbutton = By.xpath("(//button[@class='ant-btn ant-btn-primary']//span)[1]");
	By districtid = By.xpath("(//a[contains(text(),'32')])[1]");
	By learningplantab = By.xpath("//div[normalize-space()='Learning Plan']");
	By Savebutton = By.xpath("//button[@class='ant-btn ant-btn-primary ant-btn-lg']");
	By Learningplantab = By.xpath("//div[normalize-space()='Learning Plan']");
	By useravatar = By.xpath("//img[@class='user-avatar']");

//   
//	public void navigateToStudentProfile() throws InterruptedException
//	{
//		TestUtil.explicitwait(driver, followupbutton);
//		WebElement sid = driver.findElement(districtid);
//		TestUtil.javascriptexecutorClick(sid);
//		TestUtil.explicitwait(driver, useravatar);
//		driver.findElement(learningplantab).click();
//		Thread.sleep(10000);
//		driver.findElement(Savebutton).click();
//		Thread.sleep(5000);				
//	}
//	

	public void navigateToStudentProfile() throws InterruptedException

	{

		DDUtil.explicitwait(driver, followupbutton);

		WebElement sid = driver.findElement(districtid);

		DDUtil.javascriptexecutorClick(sid);

		DDUtil.explicitwait(driver, useravatar);

		driver.findElement(learningplantab).click();

		Thread.sleep(10000);

		driver.findElement(Savebutton).click();

		Thread.sleep(5000);

		String sid1[] = { "6", "20" };

		for (int index = 0; index < sid1.length; index++) {

			String studentid = sid1[index];

			driver.navigate().to("https://qa-l4l.datadesign.io/student-profile/" + studentid);
			
			DDUtil.explicitwait(driver, useravatar);

			driver.findElement(learningplantab).click();

			Thread.sleep(10000);

			driver.findElement(Savebutton).click();

			Thread.sleep(5000);

		}

//	public boolean fillUserdetail() throws InterruptedException, IOException
//	{
//		int columncount = reader.getColumnCount("datadesingusers");
//		int rowcount = reader.getRowCount("datadesingusers");
//		boolean successMessag = false;
//
//		for(int i=2; i<=rowcount; i++)
//		{
//			String Ename = reader.getCellData("datadesingusers", "name", i);
//			String Eemail = reader.getCellData("datadesingusers", "email", i);
//			String Erole = reader.getCellData("datadesingusers", "role", i);
//			String Eregion = reader.getCellData("datadesingusers", "region", i);
//			String Esites = reader.getCellData("datadesingusers", "sites", i);
//		
//			TestUtil.explicitwait(driver, createuserbutton);
//			driver.findElement(createuserbutton).click();
//			TestUtil.explicitwait(driver, username);
//			driver.findElement(username).sendKeys(Ename);
//			Thread.sleep(2);
//			
//			driver.findElement(email).sendKeys(Eemail);
//			Thread.sleep(2);
//			
//			driver.findElement(role).click();
//			regularuser= By.xpath("//li[contains(text(),'"+Erole+"')]");
//			driver.findElement(regularuser).click();
//			Thread.sleep(2);
//						
//			driver.findElement(region).click();
//			Selectregion = By.xpath("//li[normalize-space()='"+Eregion+"']");
//			driver.findElement(Selectregion).click();
//			Thread.sleep(2);
//					
//			
//			driver.findElement(site).click();
//			selectsite = By.xpath("//li[contains(text(),'"+Esites+"')]");
//			driver.findElement(selectsite).click();
//			TestUtil.explicitwait(driver, sitelabel);
//			WebElement sitel = driver.findElement(By.xpath("//label[@title='Sites']"));
//			act.moveToElement(sitel).doubleClick().perform();
//			Thread.sleep(3);
//			
//			
//			WebElement submit = driver.findElement(By.cssSelector("div[class='ant-modal-root'] button:nth-child(2)"));
//			TestUtil.javascriptExecutorScroll(submit);
//			TestUtil.explicitwait(driver, Submitbutton);
//			driver.findElement(Submitbutton).click();
//			TestUtil.explicitwait(driver, successmessage);
//			successMessag = driver.findElement(successmessage).isDisplayed();
//			Thread.sleep(5);
//			File src = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
//			FileUtils.copyFile(src, new File("C:\\Users\\AKBARALI\\eclipse-workspace\\DataDesign\\Screenshots\\Screenshot.png"));
//			
//		}
//		
//		return successMessag;
//		}
//	

	}
}
