package javaProgram;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class FBDropdown {

	@Test
	public void dobdropdown()
	{
		System.setProperty("webdriver.driver.silentOutput", "true");
		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver86.exe");
		//WebDriverManager.chromedriver().setup();
		WebDriver d = new ChromeDriver();
		d.manage().window().maximize();
		d.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		d.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		d.get("https://www.facebook.com");
		d.findElement(By.linkText("Create New Account")).click();
		
		WebElement day = d.findElement(By.xpath("//select[@name='birthday_day']"));
		Select se = new Select(day);
		System.out.println(se.isMultiple());
		
		List<WebElement> options = se.getOptions();
		System.out.println(options.size());
		
		for(int i=0; i<options.size(); i++)
		{
			String numb = options.get(i).getText();
			System.out.println(numb);
			if(numb.equals("15"))
			{
				options.get(i).click();
				break;
			}
		}
	}
	
	
	@Test
	public static void utildropdown(WebElement element, String value)
	{
		
	}
}
