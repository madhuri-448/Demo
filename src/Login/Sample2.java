package Login;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Sample2 
{
   @Test
	
   public void OpenApp()
	{
		System.setProperty("webdriver.chrome.driver", "/Users/madhurivare/Desktop/New/chromedriver");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		
	}
	
	
	
}
