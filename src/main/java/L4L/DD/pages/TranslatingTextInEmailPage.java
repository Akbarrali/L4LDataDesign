package L4L.DD.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import DD.l4l.base.L4lBaseClass;
import L4L.Util.DDUtil;
//import dd.live.base.L4LBaseclass;
//import dd.util.TestUtil;

public class TranslatingTextInEmailPage extends L4lBaseClass
{
	public WebElement selectlan;

	By emailpopuptitle = By.xpath("(//div[contains(text(),'Email')])[2]");
	By weeklyprogress = By.xpath("(//span[@class='ant-form-item-children'])[10]//span[1]");
	By emailtext = By.xpath("//p[normalize-space()='This is Week {{currentWeek}} {{currentLP}}.']");
	By TranslateTextbutton = By.xpath("(//button[@role='switch'])[1]/span");
	By languagedwopdowntitle = By.xpath("//label[@title='Select Language']");
	By ClickOnLanguageDropdown = By.xpath("(//div[@class='ant-select-selection__rendered'])[4]");
	By SelectSpanishLanguage = By.xpath("//ul[@role='listbox']/li[1]");
	By SelectHindiLanguage = By.xpath("//ul[@role='listbox']/li[2]");
	By SelectArabicLanguage = By.xpath("//ul[@role='listbox']/li[3]");
	By SelectPunjabiLanguage = By.xpath("//ul[@role='listbox']/li[4]");
	By SelectArmenianLanguage = By.xpath("//ul[@role='listbox']/li[5]");
	By SelectSomaliLanguage = By.xpath("//ul[@role='listbox']/li[6]");
	By SelectRussianLanguage = By.xpath("//ul[@role='listbox']/li[7]");
	By Translatebutton = By.xpath("//div[@class='lang-select-section']//button[@type='button']");
	By Spanish = By.xpath("(//button[@class='ant-btn ant-btn-primary'])[6]");
	By TextEditor = By.xpath("(//div[@class='ql-toolbar ql-snow'])[1]");
	By Translationcheck = By.xpath("(//div[@class='ql-editor'])[3]/p[4]");
	
	
	
	public boolean validateEmailPopupTitle()
	{
		DDUtil.explicitwait(driver, emailpopuptitle);
		return driver.findElement(emailpopuptitle).isDisplayed();
	}
	
	public boolean clickOnWeeklyProgress()
	{
		DDUtil.explicitwait(driver, weeklyprogress);
		WebElement weeklyprogresskey = driver.findElement(weeklyprogress);
		DDUtil.javascriptexecutorClick(weeklyprogresskey);
		DDUtil.explicitwait(driver, emailtext);
		return driver.findElement(emailtext).isDisplayed();	
	}
	
	public boolean clickOnTranslateTextButton() 
	{
		
		DDUtil.explicitwait(driver, TranslateTextbutton);
		WebElement translate = driver.findElement(TranslateTextbutton);
		DDUtil.javascriptexecutorClick(translate);
		DDUtil.explicitwait(driver, languagedwopdowntitle);
		return driver.findElement(languagedwopdowntitle).isDisplayed();
	}
	
	public boolean validateSpanishLanguage() throws InterruptedException
	{
	    DDUtil.explicitwait(driver, languagedwopdowntitle);
		WebElement translatedropdown = driver.findElement(ClickOnLanguageDropdown);
		DDUtil.javascriptexecutorClick(translatedropdown);
		DDUtil.explicitwait(driver, SelectSpanishLanguage);
		WebElement selectlan = driver.findElement(SelectSpanishLanguage);
		DDUtil.javascriptexecutorClick(selectlan); 
		Thread.sleep(3);
		DDUtil.explicitwait(driver, Translatebutton);
		driver.findElement(Translatebutton).click();
	    DDUtil.explicitwait(driver, Translationcheck);
		boolean Spanishtext = driver.findElement(Translationcheck).isDisplayed();
	
		return Spanishtext;
	    
	}
	
	  public boolean validateHindiLanguage() throws InterruptedException
	  { 
		DDUtil.explicitwait(driver, languagedwopdowntitle);
		WebElement translatedropdown = driver.findElement(ClickOnLanguageDropdown);
		DDUtil.javascriptexecutorClick(translatedropdown);
		DDUtil.explicitwait(driver, SelectHindiLanguage);
		WebElement selectlan = driver.findElement(SelectHindiLanguage);
		DDUtil.javascriptexecutorClick(selectlan); 
		Thread.sleep(3);
		DDUtil.explicitwait(driver, Translatebutton);
		driver.findElement(Translatebutton).click();
		DDUtil.explicitwait(driver, Translationcheck);
		boolean Hinditext = driver.findElement(Translationcheck).isDisplayed();
		return Hinditext;
		    
	  }
	 
	  public boolean validateArabicLanguage() throws InterruptedException
	  { 
		DDUtil.explicitwait(driver, languagedwopdowntitle);
		WebElement translatedropdown = driver.findElement(ClickOnLanguageDropdown);
		DDUtil.javascriptexecutorClick(translatedropdown);
		DDUtil.explicitwait(driver, SelectArabicLanguage);
		WebElement selectlan = driver.findElement(SelectArabicLanguage);
		DDUtil.javascriptexecutorClick(selectlan); 
		Thread.sleep(3);
		DDUtil.explicitwait(driver, Translatebutton);
		driver.findElement(Translatebutton).click();
		DDUtil.explicitwait(driver, Translationcheck);
		boolean Arabictext = driver.findElement(Translationcheck).isDisplayed();
		return Arabictext;
		    
	  }
	 
	  public boolean validatePunjabiLanguage() throws InterruptedException
	  { 
		DDUtil.explicitwait(driver, languagedwopdowntitle);
		WebElement translatedropdown = driver.findElement(ClickOnLanguageDropdown);
		DDUtil.javascriptexecutorClick(translatedropdown);
		DDUtil.explicitwait(driver, SelectPunjabiLanguage);
		WebElement selectlan = driver.findElement(SelectPunjabiLanguage);
		DDUtil.javascriptexecutorClick(selectlan); 
		Thread.sleep(3);
		DDUtil.explicitwait(driver, Translatebutton);
		driver.findElement(Translatebutton).click();
		DDUtil.explicitwait(driver, Translationcheck);
		boolean punjabitext = driver.findElement(Translationcheck).isDisplayed();
		return punjabitext;	    
	  }
	
	  public boolean validateArmainLanguage() throws InterruptedException
	  { 
		DDUtil.explicitwait(driver, languagedwopdowntitle);
		WebElement translatedropdown = driver.findElement(ClickOnLanguageDropdown);
		DDUtil.javascriptexecutorClick(translatedropdown);
		DDUtil.explicitwait(driver, SelectArmenianLanguage);
		WebElement selectlan = driver.findElement(SelectArmenianLanguage);
		DDUtil.javascriptexecutorClick(selectlan); 
		Thread.sleep(3);
		DDUtil.explicitwait(driver, Translatebutton);
		driver.findElement(Translatebutton).click();
		DDUtil.explicitwait(driver, Translationcheck);
		boolean ArmainText = driver.findElement(Translationcheck).isDisplayed();
		return ArmainText;	    
	  }
	  
	  public boolean validateSomaliLanguage() throws InterruptedException
	  { 
		DDUtil.explicitwait(driver, languagedwopdowntitle);
		WebElement translatedropdown = driver.findElement(ClickOnLanguageDropdown);
		DDUtil.javascriptexecutorClick(translatedropdown);
		DDUtil.explicitwait(driver, SelectSomaliLanguage);
		WebElement selectlan = driver.findElement(SelectSomaliLanguage);
		DDUtil.javascriptexecutorClick(selectlan); 
		Thread.sleep(3);
		DDUtil.explicitwait(driver, Translatebutton);
		driver.findElement(Translatebutton).click();
		DDUtil.explicitwait(driver, Translationcheck);
		boolean Somaitext = driver.findElement(Translationcheck).isDisplayed();
		return Somaitext;	    
	  }
	  
	  public boolean validateRussianLanguage() throws InterruptedException
	  { 
		DDUtil.explicitwait(driver, languagedwopdowntitle);
		WebElement translatedropdown = driver.findElement(ClickOnLanguageDropdown);
		DDUtil.javascriptexecutorClick(translatedropdown);
		DDUtil.explicitwait(driver, SelectRussianLanguage);
		WebElement selectlan = driver.findElement(SelectRussianLanguage);
		DDUtil.javascriptexecutorClick(selectlan); 
		Thread.sleep(3);
		DDUtil.explicitwait(driver, Translatebutton);
		driver.findElement(Translatebutton).click();
		DDUtil.explicitwait(driver, Translationcheck);
		boolean Russintext = driver.findElement(Translationcheck).isDisplayed();
		return Russintext;	    
	  }
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	/*
	public String selectSpanishLanguage() 
	{
	    TestUtil.explicitwait(driver, languagedwopdowntitle);
		WebElement translatedropdown = driver.findElement(ClickOnLanguageDropdown);
		TestUtil.javascriptexecutorClick(translatedropdown);
		TestUtil.explicitwait(driver, SelectLanguage);
		
		for(int i=1; i<=8; i++)
		{
		WebElement difflanguage = driver.findElement(By.xpath("//ul[@role='listbox']/li["+i+"]"));
		TestUtil.javascriptexecutorClick(difflanguage);
		
		if(i==1)
		{
			TestUtil.explicitwait(driver, Translatebutton);
			driver.findElement(Translatebutton).click();
		    String spanishlan = driver.findElement(Spanishtranlation).getText();
		    return spanishlan;
		}
		
		else if(i==2)
		{
			TestUtil.explicitwait(driver, Translatebutton);
			driver.findElement(Translatebutton).click();
		    String spanishlan = driver.findElement(Spanishtranlation).getText();
		    return spanishlan;
		}
		
		else if(i==3)
		{
			TestUtil.explicitwait(driver, Translatebutton);
			driver.findElement(Translatebutton).click();
		    String spanishlan = driver.findElement(Spanishtranlation).getText();
		    return spanishlan;
		}
		
		else if(i==4)
		{
			TestUtil.explicitwait(driver, Translatebutton);
			driver.findElement(Translatebutton).click();
		    String spanishlan = driver.findElement(Spanishtranlation).getText();
		    return spanishlan;
		}
		
		else if(i==5)
		{
			TestUtil.explicitwait(driver, Translatebutton);
			driver.findElement(Translatebutton).click();
		    String spanishlan = driver.findElement(Spanishtranlation).getText();
		    return spanishlan;
		}
		
		else if(i==6)
		{
			TestUtil.explicitwait(driver, Translatebutton);
			driver.findElement(Translatebutton).click();
		    String spanishlan = driver.findElement(Spanishtranlation).getText();
		    return spanishlan;
		}
		
		else if(i==7)
		{
			TestUtil.explicitwait(driver, Translatebutton);
			driver.findElement(Translatebutton).click();
		    String spanishlan = driver.findElement(Spanishtranlation).getText();
		    return spanishlan;
		}
		
		else if(i==8)
		{
			TestUtil.explicitwait(driver, Translatebutton);
			driver.findElement(Translatebutton).click();
		    String spanishlan = driver.findElement(Spanishtranlation).getText();
		    return spanishlan;
		}
		
	   
	}
		
		return null;
}*/
}
	
	
