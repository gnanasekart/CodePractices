package com.qa.LeafGround;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.Color;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Seleniumcoding.TestBase;

public class Button extends TestBase {

	
	Button()
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
	public void button()
	{
		d.findElement(By.xpath("//h5[text()='Button']")).click();
		String header = d.findElement(By.xpath("//h1[@itemprop='name']")).getText();
		System.out.println("Page header is - "+header);
		
//		d.findElement(By.xpath("//button[text()='Go to Home Page']")).click();
//		WebElement homebutton = d.findElement(By.xpath("//h5[text()='Button']"));
//		Elementclickable(homebutton, 10);
//		homebutton.click();
		
		WebElement position = d.findElement(By.xpath("//button[text()='Get Position']"));
		Point location = position.getLocation();
		System.out.println("X = "+location.x+ " Y = "+location.y );
		
		String cssValue = d.findElement(By.xpath("//button[@id='color']")).getCssValue("background-color");
		java.awt.Color color = Color.fromString(cssValue).getColor();
		
		//System.out.println(cssValue);
		
		WebElement height = d.findElement(By.xpath("//button[text()='What is my size?']"));
		System.out.println(height.getLocation());
		
	}
	
}
