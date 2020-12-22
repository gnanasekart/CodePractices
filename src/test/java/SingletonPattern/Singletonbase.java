package SingletonPattern;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Singletonbase {

	private static Singletonbase instance = null;
	private  RemoteWebDriver driver;
	
	private Singletonbase()
	{
		
	}
	
	public RemoteWebDriver openBrowser()
	{
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		return driver;
	}
	
	public static Singletonbase getInstance()
	{
		if(instance == null)
			instance = new Singletonbase();
		return instance;
	}	
}