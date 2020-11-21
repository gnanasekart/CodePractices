package Seleniumcoding;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class BankBazzar extends TestBase {

	public BankBazzar() {
	super();
	}
	
	@BeforeMethod
	public void setup()
	{
		Baseclass("chrome", "https://www.bankbazaar.com/personal-loan.html");
	}
	
	@AfterMethod
	public void teardown()
	{
		//d.close();
	}
	
	@Test
	public void Bazzar() throws InterruptedException
	{
		d.findElement(By.xpath("//span[text()='Salaried']")).click();
		Actions action = new Actions(d);
		WebElement input = d.findElement(By.xpath("//input[@placeholder='Start typing here....']"));
		input.sendKeys("infosys");
			Thread.sleep(2000);
			d.findElement(By.xpath("//body[@class='ln-pg personal-loan-landing cc-loan-landing Select-popup-open']/div"));
			JavascriptExecutor js = ((JavascriptExecutor)d);
			//js.executeScript(script, args)
			
			WebElement findElement = d.findElement(By.className("rangeslider rangeslider-horizontal"));
			
	}
	
	
}
