package com.qa.LeafGround;

import org.testng.annotations.BeforeMethod;
import org.openqa.selenium.interactions.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

public class jqueryui 
{
static ChromeDriver d;
static Actions action ;
public static void main(String[] args)
{
	System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver84.exe");
	d = new ChromeDriver();
	d.get("https://swisnl.github.io/jQuery-contextMenu/demo.html");
	//d.get("https://jqueryui.com/droppable/");
	d.manage().window().maximize();
	action = new Actions(d);
//	WebElement right = d.findElement(By.cssSelector(".context-menu-list"));
	WebElement right = d.findElementByXPath("//span[text()='right click me']");
	action.contextClick(right).build().perform();
	WebElement cut = d.findElement(By.cssSelector(".context-menu-icon-cut"));
	String cu = cut.getText();
	System.out.println(cu);
	cut.click();
	
	
	
	
//	d.switchTo().frame(0);
//	WebElement source = d.findElement(By.id("draggable"));
//	WebElement target = d.findElement(By.id("droppable"));
//	action = new Actions(d);
//	action.clickAndHold(source).moveToElement(target).release().build().perform();
//	d.quit();
}
}