package L4L.DD.Test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class DemoClass 
{

	@Test
	public void testd()
	{
		WebDriver driver = new ChromeDriver();
		driver.get("https://qa-l4l.datadesign.io");
		System.out.println(driver.getTitle());
		
	}
	
	
	
}
