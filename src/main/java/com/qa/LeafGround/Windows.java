package com.qa.LeafGround;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Seleniumcoding.TestBase;

public class Windows extends TestBase {
	Windows()
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
		// d.close(); // clos only current window
		//d.quit(); //to close all the windows
	}
	
	@Test
	public void button() throws InterruptedException
	{
		d.findElement(By.xpath("//h5[text()='Window']")).click();
		String header = d.findElement(By.xpath("//h1[@itemprop='name']")).getText();
		System.out.println("Page header is - "+header);
		
		d.findElement(By.id("home")).click();
		Set<String> handles = d.getWindowHandles();
		Iterator<String> id = handles.iterator();
		
		String parent = id.next();
		
		String child = id.next();
		
		d.switchTo().window(child);
		System.out.println("3"+d.getTitle());
		d.close();
		d.switchTo().window(parent);
		System.out.println("4"+d.getTitle());
		d.quit();
		//d.switchTo().window(parent);
			
			/*d.findElement(By.xpath("//button[text()='Open Multiple Windows']")).click();
			Set<String> count = d.getWindowHandles();
			System.out.println(count.size());
			
			d.findElement(By.id("color")).click();
			Thread.sleep(5000);*/
	}
}