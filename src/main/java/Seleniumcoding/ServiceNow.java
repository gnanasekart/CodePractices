package Seleniumcoding;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.NoSuchElementException;
import java.util.Date;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class ServiceNow extends TestBase{

	ServiceNow()
	{
		super();
	}
	
	@BeforeMethod
	public void startup()
	{
	Baseclass("chrome", "http://dev96572.service-now.com");
	}
	@AfterMethod
	public void teardown()
	{
		d.close();
	}
	
	@Test
	public void Services() throws InterruptedException
	{
	WebElement ifm = d.findElement(By.xpath("//iframe[@id='gsft_main']"));
		d.switchTo().frame(ifm);
		
		try {
		d.findElement(By.xpath("//input[@name='user_name']")).sendKeys("admin");
		d.findElementByXPath("//input[@id='user_password']").sendKeys("Tuna@123");
		d.findElementByXPath("//button[@id='sysverb_login']").click();
		}
		catch(NoSuchElementException e) {
			System.out.println("no such element present in this page");
		}
		
		d.findElementById("filter").sendKeys("OAuth");
		d.findElementByXPath("//div[contains(text(),'Application Registry')]").click();
		
		WebElement newlink = d.findElement(By.xpath("//iframe[@id='gsft_main']"));
		d.switchTo().frame(newlink);
		d.findElementByXPath("//button[@id='sysverb_new']").click();
		d.findElementByXPath("//a[contains(text(),'Create an OAuth API')]").click();

		DateFormat dateFormat = new SimpleDateFormat("ddMMyyyy ");
		 Date date = new Date();
		 String today= dateFormat.format(date);		 
		Thread.sleep(3000);
		WebElement input = d.findElement(By.xpath("//iframe[@id='gsft_main']"));
		d.switchTo().frame(input);

//		WebElement nametxt = d.findElementByXPath("//div[@id='element.oauth_entity.name']");
		WebDriverWait wait = new WebDriverWait(d, 20);
		WebElement until = wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//div[@id='element.oauth_entity.name']")));
		until.click();
		until.sendKeys("sekar_"+today);
		d.findElement(By.xpath("(//button[@type='submit'])[2]")).click();
		
		WebElement verify = d.findElement(By.xpath("//iframe[@id='gsft_main']"));
		d.switchTo().frame(verify);
		String nametext = d.findElement(By.xpath("//td[@class='vt']//following::a[contains(text(),'sekar')]")).getText();
		if(nametext.equals("sekar_"+today))
		{
			System.out.println("name correct");
		}
		else
		{
			System.out.println("wrong name");
		}
	}
}
