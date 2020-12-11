package Seleniumcoding;

import java.io.File;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AddExtension {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		
		DesiredCapabilities cap = new DesiredCapabilities();
		ChromeOptions option = new ChromeOptions();
		option.addExtensions(new File("C:\\Users\\gnana.sekar\\Downloads\\extension.crx"));
		
		option.merge(cap);
	
		WebDriver d = new ChromeDriver(option);
		d.get("https://www.guru99.com/desired-capabilities-selenium.html");
		d.manage().window().maximize();
		
	}

}
