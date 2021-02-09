package com.qa.LeafGround;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Seleniumcoding.TestBase;

public class BrokenLinks extends TestBase {

	BrokenLinks()
	{
		super();
	}

	@BeforeMethod
	public void setup()
	{
		Baseclass("chrome", "http://leafground.com/pages/Link.html");
	}

	@AfterMethod
	public void teardown()
	{
		d.close();
	}

	@Test
	public void brokenlinks() throws MalformedURLException, IOException
	{
		//link are available in a tag and img tag
		List<WebElement> linkedlist = d.findElements(By.tagName("a"));
		linkedlist.addAll(d.findElements(By.tagName("img")));

		//to find out active links
		List<WebElement> activelink = new ArrayList<>();
		
		for(int i=0; i<linkedlist.size(); i++)
		{
			String urllinks = linkedlist.get(i).getAttribute("href");
			System.out.println(urllinks);
			
			if(urllinks != null && (!urllinks.contains("#")) && (!urllinks.contains("script")))
			{
				activelink.add(linkedlist.get(i));
			}
		}
		//System.out.println("Total no of URL links = "+linkedlist.get(i).getAttribute("href").length());
		//System.out.println("no of Active links = " +activelink.size());
		
		for (int j = 0; j < linkedlist.size(); j++) 
		{
			HttpURLConnection connection = (HttpURLConnection) new URL(linkedlist.get(j).getAttribute("href"))
					.openConnection();
			connection.connect();
			int resp = connection.getResponseCode();
			connection.disconnect();
			System.out.println(linkedlist.get(j).getAttribute("href") + " ---> " + resp);
		}	
	}
}