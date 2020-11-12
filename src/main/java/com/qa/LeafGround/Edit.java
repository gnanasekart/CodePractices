package com.qa.LeafGround;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Seleniumcoding.TestBase;

public class Edit extends TestBase {

	Edit()
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
		d.close();
	}
	
	@Test
	public void Edit()
	{
		d.findElement(By.xpath("//h5[text()='Edit']")).click();

		String header = d.findElement(By.xpath("//h1[@itemprop='name']")).getText();
		System.out.println("Page header is -"+header);

		d.findElement(By.xpath("//input[@id='email']")).sendKeys("tgs@gmail.com");

		WebElement append = d.findElement(By.xpath("//input[@value='Append ']"));
		append.sendKeys(" text");
		append.sendKeys(Keys.TAB);

		String getText = d.findElement(By.xpath("//input[@value='TestLeaf']")).getAttribute("value");
		System.out.println(getText);

		d.findElement(By.xpath("//input[@value='Clear me!!']")).clear();

		boolean displayed = d.findElement(By.xpath("//input[@disabled='true']")).isDisplayed();
		Assert.assertTrue(displayed);
		System.out.println(displayed);
	}

	@AfterMethod
	public void teardown()
	{
		d.close();
	}
}
