package L4L.DD.Test;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Schanges {

	public static void main(String[] args) 
	{
	
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.youtube.com");
		
		List<WebElement> link = driver.findElements(By.tagName("a"));
		int totallink = link.size();
		System.out.println(totallink);
		
		driver.manage().timeouts().implicitlyWait(Duration.ofMinutes(totallink));
		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(3000));
		wait.until(ExpectedConditions.visibilityOf(null));
		
		
		
		for (int i=1; i<=totallink; i++)
		{
			WebElement a = link.get(i);
			System.out.println(a.getText());
			WebElement b = link.get(i-1);
			b.click();
			
		
		}
		
		
		
		
		
		
		
		
		
	}

}
