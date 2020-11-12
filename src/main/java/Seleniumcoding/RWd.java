package Seleniumcoding;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

public class RWd {

	public static void main(String[] args) throws MalformedURLException {
		DesiredCapabilities dc = new DesiredCapabilities();
		
		dc.setBrowserName("chrome");
		dc.setPlatform(Platform.WINDOWS);
		
		ChromeOptions co = new ChromeOptions();
		//co.addArguments("C:\\selenium\\chromedriver\\chromedriver.exe");
		//co.addArguments("--whitelisted-ips 0.0.0.0");
		//co.addArguments("--port=28019");
		co.merge(dc);
		//co.setHeadless(true);
		
		String baseurl = "http://localhost:4444/wd/hub";
		WebDriver wd = new RemoteWebDriver(new URL(baseurl), dc);
		
		wd.get("http://google.com");
		System.out.println(wd.getTitle());	
		wd.close();
	}
}