package SingletonPattern;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class LoginDemo {
	
	RemoteWebDriver driver;
	@BeforeMethod
	public void startup()
	{
		Singletonbase driverinstance = Singletonbase.getInstance();
		driver = driverinstance.openBrowser();
		driver.get("http://leaftaps.com/opentaps/");
			driver.manage().window().maximize();
	}
	
	@AfterMethod
	public void tearDown()
	{
		driver.quit();
	}
		
	@Test
	public void LoginStep()
	{
		driver.findElement(By.id("username")).sendKeys("demosalesmanager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
	}
}