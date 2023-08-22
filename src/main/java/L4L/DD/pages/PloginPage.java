package L4L.DD.pages;

import org.openqa.selenium.By;

import DD.l4l.base.L4lBaseClass;
import L4L.Util.DDUtil;

public class PloginPage extends L4lBaseClass
{
	
	By shop = By.xpath("//a[contains(text(),'Shop')]");
	By home = By.xpath("//a[contains(text(),'Home')]");
	By firstslide = By.xpath("//img[@alt='Shop Selenium Books']");
	By secondslide = By.xpath("(//img[@alt='HTML'])");
	By thirdslide = By.xpath("(//img[@alt='JavaScript'])");
	By rightarrow = By.xpath("(//img[@alt='Arrow'])[2]");
	By filterbutton = By.xpath("//button[contains(text(),'Filter')]");


	public boolean clickOnShopMenu()
	{
	   DDUtil.explicitwait(driver, shop);
	   driver.findElement(shop).click();
	   DDUtil.explicitwait(driver, filterbutton);
	   boolean filercheck = driver.findElement(filterbutton).isDisplayed();

	   return filercheck;
	}

	public boolean clickOnHome()
	{
	 DDUtil.explicitwait(driver, home);
	 driver.findElement(home).click();
	 DDUtil.explicitwait(driver, firstslide);
	 boolean homecheck = driver.findElement(firstslide).isDisplayed();
	 
	 return homecheck;
	}


	public boolean verifyFirstSlideImage()
	{
	DDUtil.explicitwait(driver, firstslide);
	boolean firstSlid = driver.findElement(firstslide).isDisplayed();
	return firstSlid;

	}

	public boolean verifySecondSlideImage()
	{
	driver.findElement(rightarrow).click();
	DDUtil.explicitwait(driver, secondslide);
	boolean secondSlid=driver.findElement(secondslide).isDisplayed();
	return secondSlid;

	}

	public boolean verifyThirdSlideImage()
	{
	driver.findElement(rightarrow).click();

	DDUtil.explicitwait(driver, thirdslide);
	boolean thirdSlid =driver.findElement(thirdslide).isDisplayed();
	return thirdSlid;

	}
	}


