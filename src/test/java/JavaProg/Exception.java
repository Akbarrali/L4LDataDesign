package JavaProg;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chromium.ChromiumDriver;

import L4L.Util.DDUtil;

public class Exception {

	public static void main(String[] args) throws IOException 
	{
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://l4l.datadesign.io/");
		
		WebElement login = driver.findElement(By.xpath("//button[@type='submit']"));
		
		DDUtil.drawBorderJS(driver, login);
		
		//DDUtil.screenshot();
		
		
		
		

	}

}
