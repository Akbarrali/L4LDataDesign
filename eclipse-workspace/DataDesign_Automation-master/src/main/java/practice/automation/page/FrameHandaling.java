package practice.automation.page;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import dd.live.base.Baseclass;
import dd.live.pages.LoginPage;
import dd.util.TestUtil;
import io.github.bonigarcia.wdm.WebDriverManager;

public class FrameHandaling extends Baseclass
{
	
public static WebDriver driver;
LoginPage login = new LoginPage();

By Id = By.xpath("//a[@class='ant-popover-open']");
	
	@Test
	public void openbroser() throws InterruptedException, IOException 
	{
	initialize();
	
	login.ddlogin(prop.getProperty("ddusername"), prop.getProperty("ddpassword")); 
	
	//driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	
	TestUtil.explicitwait(driver, Id);
	
	driver.findElement(By.xpath("//button[@class='btn-iframe']")).click();
	
	System.out.println(driver.findElement(By.xpath("//div[@id='rcDialogTitle0']")).getText());
	
	

}}
