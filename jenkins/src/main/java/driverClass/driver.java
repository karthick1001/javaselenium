package driverClass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class driver 
{
	@Test
	public void initiate_driver()
	{
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\eclipse-workspace\\com.gurubank\\drivers\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	}
}
