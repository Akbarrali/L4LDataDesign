package dd.live.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import dd.live.base.Baseclass;
import dd.util.TestUtil;

public class StudentProfilepage extends Baseclass
{

	
	By districtid = By.xpath("(//a[contains(text(),'74')])[1]");
	By district = By.cssSelector("th[class='districtIdCol'] span[class='ant-table-column-title']");
	By studentphonetitle = By.xpath("//div[contains(text(),'Student Cell Phone:')]");
	By studentprofileemail = By.xpath("//div[@class='email-userid']/label");
	By emailpopuptitel = By.xpath("(//div[contains(text(),'Email')])[2]");
	
	



	public boolean clickOnDistrictId()
	{
		TestUtil.explicitwait(driver, district);
		WebElement studentnk =driver.findElement(districtid);
		TestUtil.javascriptexecutorClick(studentnk);
		TestUtil.explicitwait(driver, studentphonetitle);
	    return driver.findElement(studentphonetitle).isDisplayed();	
	}

	public TranslatingTextInEmailPage clickOnEmailInStudentProfile()
	{
		TestUtil.explicitwait(driver, studentprofileemail);
		WebElement profleemail =driver.findElement(studentprofileemail);
		TestUtil.javascriptexecutorClick(profleemail);
		TestUtil.explicitwait(driver, emailpopuptitel);
		
		return new TranslatingTextInEmailPage();
		
	}
	
}
