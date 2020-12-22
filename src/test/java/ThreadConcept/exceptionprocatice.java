package ThreadConcept;

import java.util.Set;

import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class exceptionprocatice {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		System.setProperty("WebDriver.gecko.driver", "./Drivers/geckodriver.exe");
		String property = System.getProperty("WebDriver.gecko.driver");
		System.out.println(property);
				//FirefoxDriver ff = new FirefoxDriver(new URL("https://google.co.in"));
			
		}
	}

