package Seleniumcoding;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class bootstrapDropDown {

	@Test
	public void BootDropDown()
	{
		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver86.exe");
		WebDriver d = new ChromeDriver();

		d.manage().window().maximize();
		d.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		d.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		d.manage().deleteAllCookies();
		d.get("https://www.jquery-az.com/jquery/demo.php?ex=152.0_1");
		d.findElement(By.xpath("//button[@class='btn btn-info btn-sm dropdown-toggle']")).click();
		List<WebElement>dd = d.findElements(By.xpath("//ul[@class='dropdown-menu']//label"));
		for(int i=0; i<dd.size(); i++)
		{
			String ddname = dd.get(i).getText();
			System.out.println(ddname);
			if(ddname.contains("HTML"))
			{
				dd.get(i).click();
				break;
			}
		}
		d.findElement(By.xpath("//button[text()='Save']")).click();
	}
}
