package L4L.DD.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import DD.l4l.base.L4lBaseClass;
import L4L.Util.DDUtil;
//import dd.live.base.L4LBaseclass;
//import dd.util.TestUtil;

public class StudentProfilepage extends L4lBaseClass
{

	
	By districtid = By.xpath("(//a[contains(text(),'74')])[1]");
	By district = By.cssSelector("th[class='districtIdCol'] span[class='ant-table-column-title']");
	By studentphonetitle = By.xpath("//div[contains(text(),'Student Cell Phone:')]");
	By studentprofileemail = By.xpath("//div[@class='email-userid']/label");
	By emailpopuptitel = By.xpath("(//div[contains(text(),'Email')])[2]");
	
	
	public boolean clickOnDistrictId()
	{
		DDUtil.explicitwait(driver, district);
		WebElement studentnk =driver.findElement(districtid);
		DDUtil.javascriptexecutorClick(studentnk);
		DDUtil.explicitwait(driver, studentphonetitle);
	    return driver.findElement(studentphonetitle).isDisplayed();	
	}

	public TranslatingTextInEmailPage clickOnEmailInStudentProfile()
	{
		DDUtil.explicitwait(driver, studentprofileemail);
		WebElement profleemail =driver.findElement(studentprofileemail);
		DDUtil.javascriptexecutorClick(profleemail);
		DDUtil.explicitwait(driver, emailpopuptitel);
		
		return new TranslatingTextInEmailPage();
		
	}
	
}
