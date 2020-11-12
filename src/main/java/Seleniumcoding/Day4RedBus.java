package Seleniumcoding;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Capabilities;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;

public class Day4RedBus extends TestBase{

	public Day4RedBus()
	{
		super();
	}
	@Test
	public void RedBus() throws InterruptedException, NoSuchElementException
	{
		Baseclass("edge", "https://www.redbus.in/");
		Capabilities cap = ((RemoteWebDriver)d).getCapabilities();
		System.out.println("We Running in browser "+cap.getBrowserName()+" and version is "+cap.getVersion());

		d.get("https://www.redbus.in/");

		d.findElement(By.xpath("//input[@data-message='Please enter a source city']")).sendKeys("bangalore");
		d.findElement(By.xpath("//ul[@class='autoFill']//li")).click();

		d.findElement(By.xpath("//input[@data-message='Please enter a destination city']")).sendKeys("chennai");
		d.findElement(By.xpath("//ul[@class='autoFill']//li")).click();

		d.findElement(By.xpath("//td[@class='next']")).click();

		List<WebElement> days = d.findElements(By.xpath("//tr[@class='rb-monthHeader']/following-sibling::tr"));
		for(int i=2; i<days.size()-1; i++)
		{
			List<WebElement> rows = d.findElements(By.xpath("//tr[@class='rb-monthHeader']/following-sibling::tr["+i+"]"));
			for(int j=0; j<=rows.size(); j++)
			{
				List<WebElement> column = d.findElements(By.xpath("//tr[@class='rb-monthHeader']/following-sibling::tr["+i+"]/td"));
				for(int k= 0; k<column.size(); k++)
				{
					String value = column.get(k).getAttribute("class");

					if(value.equals("empty day"))
					{	
						int nextrow = i+1;
						int nextcolumn = k+1;

						WebElement ds = d.findElement(By.xpath("//tr[@class='rb-monthHeader']/following-sibling::tr["+nextrow+"]/td["+nextcolumn+"]"));
						ds.click();
						break;
					}

					else if(value != "empty day")
					{
						break;
					}
				}
				break;
			}
			d.findElement(By.xpath("//button[text()='Search Buses']")).click();
			d.findElement(By.xpath("//a[text()='Fare']")).click();
			String co = d.findElement(By.xpath("//div[@class='f-bold ']")).getText();
			System.out.println("no of bus is = "+co);
		}
	}
}