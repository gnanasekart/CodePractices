package com.qa.LeafGround;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ByIdOrName;
import org.openqa.selenium.support.pagefactory.ByAll;
import org.openqa.selenium.support.pagefactory.ByChained;

public class LocatorsAll {

	public static void main(String[] args) 
	{
	System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver84.exe");
	WebDriver d = new ChromeDriver();
	d.get("https://www.facebook.com/");
	//finding element by using ByAll method which includes all the locator finding methods
	//d.findElement(new ByAll(By.id("u_0_m"), By.xpath("//input[@name='firstname']"), By.xpath("input[@type='text']"))).sendKeys("gnana");
	
	//finding element by using ByIdOrName method to find value by Id or Name
	//d.findElement(new ByIdOrName("firstname")).sendKeys("gnana");
	
	//finding element by parent and child hierarchy
	d.findElement(new ByChained(By.id("fullname_field"), By.className("uiStickyPlaceholderInput uiStickyPlaceholderEmptyInput"),
		By.xpath("//div[text()='First name']"), By.xpath("//input[@name='firstname']"))).sendKeys("gnana");
	}

}
