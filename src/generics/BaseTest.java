package generics;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;


public class BaseTest implements AutoConstants{
	
	public WebDriver driver;
	@BeforeMethod
	public void openBrowser()
	{
		System.setProperty(Chrome_key, Chrome_value);
		driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get(url);
		
	}

	
	@AfterMethod
	public void closingBrowser()
	{
		//driver.quit;
	}
	
	
}
