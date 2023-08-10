package dd.live.pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import dd.live.base.Baseclass;
import dd.util.TestUtil;

public class CreateUserPage extends Baseclass
{
	By HomePageGreeting = By.xpath("//h1[@class='welcome-text']");
	By GreetingCloseButton = By.xpath("//button[@class='ant-btn']");
	By kpi = By.xpath("//div[@id='indicator-chart-2936']//img[@alt='icon']");
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
	By region = By.xpath("(//div[@id='regions'])");
	By regionoptions = By.xpath("(//ul[@role='listbox'])[2]/li");
	By site = By.xpath("//div[@id='sites']");
	By Sitelist = By.xpath("(//ul[@role='listbox'])[3]/li");
	By Submitbutton = By.xpath("//div[@class='ant-modal-root']//button[2]");
	
	
	public boolean validateGreetingPopup()
	{
		TestUtil.explicitwait(driver, GreetingCloseButton);
		driver.findElement(GreetingCloseButton).click();
		TestUtil.explicitwait(driver, kpi);
		boolean kpicheck = driver.findElement(kpi).isDisplayed();
		return kpicheck;			
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
		boolean userpagetitle = driver.findElement(UsersPageTitle).isDisplayed();
		
		return userpagetitle;
	}
	
	public void validateCreateUser(String name, String useremail, int roleval, int regionval, int siteval) throws InterruptedException
	{
		TestUtil.explicitwait(driver, createuserbutton);
		driver.findElement(createuserbutton).click();
		TestUtil.explicitwait(driver, username);
		driver.findElement(username).sendKeys(name);
		Thread.sleep(2);
		driver.findElement(email).sendKeys(useremail);
		
		driver.findElement(role).click();
		List<WebElement> roleoption = driver.findElements(rolelist);
		roleoption.get(roleval).click();
		
		driver.findElement(region).click();
		List<WebElement> regionlist = driver.findElements(regionoptions);
		regionlist.get(regionval).click();
		
		driver.findElement(site).click();
		List<WebElement> Siteoption = driver.findElements(Sitelist);
		Siteoption.get(siteval).click();
		
		TestUtil.explicitwait(driver, Submitbutton);
		driver.findElement(Submitbutton).click();
		
		Thread.sleep(5);
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
