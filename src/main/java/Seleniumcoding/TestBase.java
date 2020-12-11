package Seleniumcoding;

import java.io.File;
import java.io.IOException;
import java.sql.DriverManager;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.opera.OperaDriver;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.safari.SafariDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestBase {
	public static RemoteWebDriver d;
	public static FirefoxDriver fd;
	public TestBase()
	{

	}

	public static void Baseclass(String browser, String URL)
	{
		if(browser == "chrome")
		{
			WebDriverManager.chromedriver().setup();
			//System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver86.exe");
			d= new ChromeDriver();
		}
		else if(browser == "chromeoptions")
		{
			WebDriverManager.chromedriver().setup();

			DesiredCapabilities cap = new DesiredCapabilities();
			
			cap.setCapability(ChromeOptions.CAPABILITY, cap);
			
			ChromeOptions options = new ChromeOptions();
			options.addArguments("--disable-popup-blocking");
			options.addArguments("start-maximized");
			options.addArguments("--incognito");
			
			d = new ChromeDriver(options);
		}
//		else if(browser == "chromeheadless")
//		{
//			WebDriverManager.chromedriver().setup();
//			
//			DesiredCapabilities cap = DesiredCapabilities.chrome();
//			cap.setCapability(URL, CapabilityType);
//			
//			ChromeOptions option - new ChromeOptions(cap);
//		}
		else if(browser == "ff")
		{
			WebDriverManager.firefoxdriver().setup();
			d = new FirefoxDriver();
		}
		else if(browser =="cff")
		{
			WebDriverManager.firefoxdriver().setup();
			DesiredCapabilities cap = DesiredCapabilities.firefox();
			cap.setCapability("browser.privatebrowsing.autostart", true);
			FirefoxOptions option = new FirefoxOptions(cap);
			
			FirefoxDriver fd = new FirefoxDriver(option);
			fd.get(URL);
		}		
		else if(browser == "edge")
		{
			WebDriverManager.edgedriver().setup();
			d = new EdgeDriver();
		}

		else if(browser == "safari")
		{
			System.getProperty("webdriver.safari,driver", "");
			d = new SafariDriver();
		}

		else if(browser == "opera")
		{
			WebDriverManager.operadriver().setup();
			d = new OperaDriver();
		}

		else if(browser == "ie")
		{
			WebDriverManager.iedriver().setup();
			d = new InternetExplorerDriver();
		}

		d.manage().window().maximize();
		d.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		d.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		d.manage().deleteAllCookies();
		d.get(URL);
	}

	public static WebElement getWhenVisible(WebElement element, int timeout, String text)
	{
		WebDriverWait wait = new WebDriverWait(d, timeout);
		Boolean until =wait.until(ExpectedConditions.textToBePresentInElement(element, text));
		return element;
	}

	public static WebElement Elementclickable(WebElement element, int timeout)
	{
		WebDriverWait wait  = new WebDriverWait(d, timeout);
		WebElement until = wait.until(ExpectedConditions.elementToBeClickable(element));
		return until;
	}

	public static Boolean staleElement(List<WebElement> pricelist, int timeout)
	{
		WebDriverWait wait  = new WebDriverWait(d, timeout);
		Boolean until = wait.until(ExpectedConditions.stalenessOf((WebElement) pricelist));
		return until;
	}

	public static File screenshot()
	{
		long start = System.currentTimeMillis();
		File screenshotAs = ((TakesScreenshot)d).getScreenshotAs(OutputType.FILE);
		try {
			FileUtils.copyFile(screenshotAs, new File("./TestleafCodePractices/"+start+".jpg"));

		} catch (IOException e) {

			e.printStackTrace();
		}
		return screenshotAs;
	}




}
