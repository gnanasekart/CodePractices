package TestNGPkg;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestNgParallelBrowser {

	public static RemoteWebDriver d;
	String text ="";
	@Test
	@Parameters({ "text" })
	public void chromeBrowser() throws InterruptedException
	{
		this.text = text;
		System.out.println(text+"chrome browser = "+Thread.currentThread().getId());
		WebDriverManager.chromedriver().setup();
		d = new ChromeDriver();
		d.get("https://www.google.co.in");
		Thread.sleep(1000);
		d.quit();
	}
	
	@Test
	public void ffBrowser() throws InterruptedException
	{
		System.out.println("ff browser = "+Thread.currentThread().getId());
		WebDriverManager.firefoxdriver().setup();
		d = new FirefoxDriver();
		d.get("https://www.amazon.in");
		Thread.sleep(1000);
		d.quit();
	}

	@Test
	public void edgeBrowser() throws InterruptedException
	{
		System.out.println("edge browser = "+Thread.currentThread().getId());
		WebDriverManager.edgedriver().setup();
		d = new EdgeDriver();
		d.get("https://www.facebook.com");
		Thread.sleep(1000);
		d.quit();
	}

	@Test
	public void edgeBrowser1() throws InterruptedException
	{
		System.out.println("edge1 browser = "+Thread.currentThread().getId());
		WebDriverManager.edgedriver().setup();
		d = new EdgeDriver();
		d.get("https://www.naukri.com");
		Thread.sleep(1000);
		d.quit();
	}
	
	@Test
	public void chromeBrowser1() throws InterruptedException
	{
		System.out.println("chrome1 browser = "+Thread.currentThread().getId());
		WebDriverManager.chromedriver().setup();
		d = new ChromeDriver();
		d.get("https://www.linkedin.com");
		Thread.sleep(1000);
		d.quit();
	}
}
