package Excel;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestBase {

	static String filename = "sampledata";
	String sheetname = "login";
	static RemoteWebDriver driver;

	@BeforeMethod
	public void launchbrowser()
	{
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/main");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.manage().deleteAllCookies();
		driver.findElementById("username").sendKeys("demosalesmanager");
		driver.findElementById("password").sendKeys("crmsfa");
		driver.findElementByClassName("decorativeSubmit").click();
		driver.findElementByLinkText("CRM/SFA").click();
	}

	@AfterMethod
	public void teardown()
	{
		driver.quit();
	}

	@DataProvider(name = "fetchdata")
	public Object[][] readlogin() throws IOException
	{
		ReadExcelData excel = new ReadExcelData(filename);
		return excel.readExcel(sheetname);
	}

	@DataProvider(name = "create")
	public Object[][] readcreate() throws IOException
	{
		ReadExcelData excel = new ReadExcelData(filename);
		return excel.readExcel(sheetname);
	}

	@DataProvider(name ="update")
	public Object[][] update() throws IOException
	{
		ReadExcelData excel = new ReadExcelData(filename);
		return excel.readExcel(sheetname);
	}
}