package com.qa.LeafGround;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Seleniumcoding.TestBase;

public class HyperLink extends TestBase{

	HyperLink()
	{
		super();
	}
	@BeforeMethod
	public void setup()
	{
		Baseclass("chrome", "http://leafground.com/");
	}

	@AfterMethod
	public void teardowns()
	{
		//d.close();
	}
	
	@Test
	public void button() throws InterruptedException
	{
		d.findElement(By.xpath("//h5[text()='HyperLink']")).click();
		String header = d.findElement(By.xpath("//h1[@itemprop='name']")).getText();
		System.out.println("Page header is - "+header);
		Thread.sleep(2000);
		 d.findElement(By.xpath("(//a[text()='Go to Home Page'])[1]")).click();;
//		Elementclickable(click, 10);
//		click.click();
		System.out.println(d.getTitle());
		d.findElement(By.xpath("//h5[text()='HyperLink']")).click();
		
		String href = d.findElement(By.xpath("(//a[text()='Find where am supposed to go without clicking me?'])")).getAttribute("href");
		System.out.println("href = "+href);
		d.get("http://leafground.com/pages/Button.html");
		System.out.println(d.getTitle());
		d.navigate().back();
		System.out.println(d.getTitle());
		
		

}
}