package com.qa.LeafGround;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.*;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.testng.annotations.AfterTest;

import io.github.bonigarcia.wdm.WebDriverManager;

import org.openqa.selenium.*;
public class Actionsclass
{
	ChromeDriver d;
	Actions action;

	@BeforeTest
	public void starttest()
	{
		//WebDriverManager.chromedriver().browserVersion("83.0.4103.116").setup();
		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		d = new ChromeDriver();
		d.get("https://www.browserstack.com/");
		d.manage().window().maximize();
		d.findElement(By.xpath("//button[@id='accept-cookie-notification']")).click();
		d.findElement(By.xpath("//div[@class='accept-promo-notification-cross promo-notification__actions promo-notification__elements custom-btn-amp-events']")).click();
	}

	@Test(enabled=false)
	public void moveandclick()
	{
		action = new Actions(d);
		//clicking get started button
		WebElement element = d.findElement(By.xpath("//a[text()='Get started free']"));
		action.contextClick(element).build().perform();
		//action.moveToElement(element).click().perform();
	}

	@Test
	public void preceding()
	{
		WebElement texts = d.findElement(By.xpath("//a[@title='Developers Dropdown']//parent::li[@class='dropdown-holder clear']//preceding-sibling::li[@class='dropdown-holder clear']//a[@title='Product Dropdown']"));
		String text = texts.getText();
		System.out.println(texts.toString());
	}

	@Test(enabled=false)
	public void ddclick() throws InterruptedException
	{
		
		action = new Actions(d);
		
	//clicking the status in developer dropdown
	WebElement dd = d.findElement(By.xpath("//span[text()=' Developers ']"));
	action.moveToElement(dd).build().perform();
	Thread.sleep(3000);
	d.findElement(By.xpath("//ul[@id='developers-menu-dropdown']//li[3]//a[text()=\"Status\"]")).click();
	}

	@AfterTest
	public void closebrowser()
	{
		d.quit();
	}
}
