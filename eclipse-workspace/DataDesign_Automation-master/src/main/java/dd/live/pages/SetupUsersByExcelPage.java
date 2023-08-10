package dd.live.pages;

import java.io.File;
import java.io.IOException;
import java.util.List;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import dd.live.base.Baseclass;
import dd.util.TestUtil;
import dd.util.Xls_Reader;

public class SetupUsersByExcelPage extends Baseclass
{
	Xls_Reader reader = new Xls_Reader("\\Users\\AKBARALI\\eclipse-workspace\\DataDesign\\src\\main\\java\\dd\\live\\config\\DD_Datadriven.xlsx");
	public Actions act = new Actions(driver);
	
	
	By HomePageGreeting = By.xpath("//h1[@class='welcome-text']");
	By GreetingCloseButton = By.xpath("//button[@class='ant-btn']");
	By kpi = By.xpath("//div[@id='indicator-chart-2936']//img[@alt='icon']");
	By kpisettingbutton = By.xpath("//div[@id='indicator-chart-2936']//img[@alt='Settings']");
	By AdminSidemenu = By.xpath("//div[@class='ant-layout-sider-children']//ul//li[5]");
	By AdminConsole = By.xpath("//span[contains(text(),'Admin Console')]");
	By Permissiontab = By.xpath("//span[contains(text(),'Permissions')]");
	By UsersTab = By.xpath("//ul[@id='usersPermission$Menu']/li[1]");
	By UsersPageTitle = By.xpath("//span[@class='main-title__subtitle']");
	By createuserbutton = By.xpath("//div[@class='button-align']/button[1]");
	By CreateUserPopuptitle = By.xpath("//div[@id='rcDialogTitle1']");
	By username = By.xpath("//input[@id='name']");
	By email = By.xpath("//input[@id='email']");
	By role = By.xpath("//div[@id='roleid']");
	By rolelist = By.xpath("//ul[@role='listbox']/li");
	By regularuser;
	By region = By.xpath("(//div[@id='regions'])");
	By regionoptions = By.xpath("(//ul[@role='listbox'])[2]/li");
	By Selectregion;
	By site = By.xpath("//div[@id='sites']");
	By Sitelist = By.xpath("(//ul[@role='listbox'])[3]/li");
	By selectsite;
	By sitelabel = By.xpath("//label[@title='Sites']");
	By Submitbutton = By.cssSelector("div[class='ant-modal-root'] button:nth-child(2)");
	public By successmessage = By.cssSelector("div[class='ant-message-custom-content ant-message-success'] span");
	
	
	public boolean validateGreetingPopup()
	{
		TestUtil.explicitwait(driver, GreetingCloseButton);
		driver.findElement(GreetingCloseButton).click();
		//TestUtil.explicitwait(driver, kpisettingbutton);
		TestUtil.explicitwait(driver, AdminSidemenu);
		//boolean kpicheck = driver.findElement(kpi).isDisplayed();
		boolean Admin = driver.findElement(AdminSidemenu).isDisplayed();
		return Admin;			
	}
	
	public boolean navigateToUsersPage() throws InterruptedException
	{
		TestUtil.explicitwait(driver, AdminSidemenu);
		driver.findElement(AdminConsole).click();
		Thread.sleep(2);
		TestUtil.explicitwait(driver, Permissiontab);
		driver.findElement(Permissiontab).click();
		Thread.sleep(2);
		TestUtil.explicitwait(driver, UsersTab);
		driver.findElement(UsersTab).click();
		boolean usertitle = driver.findElement(UsersPageTitle).isDisplayed();
		
		return usertitle;
	}
	
	public boolean fillUserdetail() throws InterruptedException, IOException
	{
		int columncount = reader.getColumnCount("datadesingusers");
		int rowcount = reader.getRowCount("datadesingusers");
		boolean successMessag = false;

		for(int i=2; i<=rowcount; i++)
		{
			String Ename = reader.getCellData("datadesingusers", "name", i);
			String Eemail = reader.getCellData("datadesingusers", "email", i);
			String Erole = reader.getCellData("datadesingusers", "role", i);
			String Eregion = reader.getCellData("datadesingusers", "region", i);
			String Esites = reader.getCellData("datadesingusers", "sites", i);
		
			TestUtil.explicitwait(driver, createuserbutton);
			driver.findElement(createuserbutton).click();
			TestUtil.explicitwait(driver, username);
			driver.findElement(username).sendKeys(Ename);
			Thread.sleep(2);
			
			driver.findElement(email).sendKeys(Eemail);
			Thread.sleep(2);
			
			driver.findElement(role).click();
			regularuser= By.xpath("//li[contains(text(),'"+Erole+"')]");
			driver.findElement(regularuser).click();
			Thread.sleep(2);
						
			driver.findElement(region).click();
			Selectregion = By.xpath("//li[normalize-space()='"+Eregion+"']");
			driver.findElement(Selectregion).click();
			Thread.sleep(2);
					
			
			driver.findElement(site).click();
			selectsite = By.xpath("//li[contains(text(),'"+Esites+"')]");
			driver.findElement(selectsite).click();
			TestUtil.explicitwait(driver, sitelabel);
			WebElement sitel = driver.findElement(By.xpath("//label[@title='Sites']"));
			act.moveToElement(sitel).doubleClick().perform();
			Thread.sleep(3);
			
			
			WebElement submit = driver.findElement(By.cssSelector("div[class='ant-modal-root'] button:nth-child(2)"));
			TestUtil.javascriptExecutorScroll(submit);
			TestUtil.explicitwait(driver, Submitbutton);
			driver.findElement(Submitbutton).click();
			TestUtil.explicitwait(driver, successmessage);
			successMessag = driver.findElement(successmessage).isDisplayed();
			Thread.sleep(5);
			File src = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
			FileUtils.copyFile(src, new File("C:\\Users\\AKBARALI\\eclipse-workspace\\DataDesign\\Screenshots\\Screenshot.png"));
			
		}
		
		return successMessag;
		}
	
	
		}
