package com.qa.LeafGround;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class IncognitoBrowser {

	RemoteWebDriver d;

	@BeforeMethod
	public void start()
	{
		WebDriverManager.firefoxdriver().setup();
		//WebDriverManager.chromedriver().setup();
		WebDriverManager.edgedriver().setup();
	}

	@AfterMethod
	public void teardown()
	{
		//d.close();
	}

	@Test(enabled=false)
	public void ff()
	{
		DesiredCapabilities cap = DesiredCapabilities.firefox();
		cap.setCapability("browser.privatebrowsing.autostart", true);
		FirefoxOptions option = new FirefoxOptions(cap);
		option.addArguments("--incognito");
		d = new FirefoxDriver(option);
		d.get("https://google.com/");
	}
	
	@Test(enabled=true)
	public void pff()
	{
		//FirefoxProfile profile = new FirefoxProfile();
		//profile.setPreference("browser.privatebrowsing.autostart", true);
		DesiredCapabilities cap = new DesiredCapabilities();
		cap.setCapability("browser.private.browsing.autostart", true);
		FirefoxOptions option = new FirefoxOptions(cap);
		//option.setCapability("browser.privatebrowsing.autostart", true);
		//option.setCapability(FirefoxOptions.FIREFOX_OPTIONS, option);
		//option.merge(cap);
		d = new FirefoxDriver(option);
		d.get("https://google.com/");
	}

	@Test(enabled=false)
	public void chrome()
	{
		ChromeOptions option = new ChromeOptions();
		option.addArguments("--incognito");

		d = new ChromeDriver(option);
		d.get("http://google.com");
	}
	
	@Test(enabled=false)
	public void edge()
	{
		DesiredCapabilities cap = new DesiredCapabilities();
		cap.setCapability("browser.privatebrowsing.autostart", true);
		EdgeOptions option = new EdgeOptions();
		option.merge(cap);
		d = new EdgeDriver(option);
		d.get("https://google.com/");
	}
}