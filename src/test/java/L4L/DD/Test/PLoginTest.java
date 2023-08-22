package L4L.DD.Test;
import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import DD.l4l.base.L4lBaseClass;
import L4L.DD.pages.PloginPage;

//import L4L.DD.pages.PloginTest;


public class PLoginTest extends L4lBaseClass{

    PloginPage plogin;
	
	@Test(priority=0)
	public void initiliseBrowser() throws IOException
	{
	initialize();
	driver.get(prop.getProperty("practicesite"));
	plogin = new PloginPage();
	}

	@Test(priority=1)
	public void validateShopTest()
	{
	boolean shopcheck = plogin.clickOnShopMenu();
	Assert.assertTrue(shopcheck);
	}

	@Test(priority=2)
	public void validateHomeTest()
	{
	boolean homecheck = plogin.clickOnHome();
	Assert.assertTrue(homecheck);
	}

	@Test(priority=3)
	public void validateFirstSliderTest()
	{
	boolean firstslidercheck = plogin.verifyFirstSlideImage();
	Assert.assertTrue(firstslidercheck);
	}


	@Test(priority=4)
	public void validatesecondSliderTest()
	{
	boolean secondslidercheck = plogin.verifySecondSlideImage();
	Assert.assertTrue(secondslidercheck);
	}

	@Test(priority=5)
	public void validatethirdSliderTest()
	{
	boolean thirdslidercheck = plogin.verifyFirstSlideImage();
	Assert.assertTrue(thirdslidercheck);
	}



}
