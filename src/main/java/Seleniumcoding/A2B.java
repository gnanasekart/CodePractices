package Seleniumcoding;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.NoSuchElementException;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class A2B extends TestBase {

	A2B()
	{
		super();
	}
	
	@BeforeMethod
	public void startup() {
		Baseclass("chrome", "https://www.zomato.com/chennai");
	}
	
	@AfterMethod
	public void teardown()
	{
		//d.close();
	}
	
	@Test
	public void CostlySweet()
	{
		d.findElementByXPath("//span[text()='Accept']").click();
		WebElement textfield = d.findElementByXPath("//input[@placeholder='Search for restaurant, cuisine or a dish']");
		textfield.click();
		textfield.sendKeys("A2B");
		JavascriptExecutor js = ((JavascriptExecutor)d);
		WebElement a2b = d.findElementByXPath("//p[contains(text(),'A2B')]");
		js.executeScript("arguments[0].click();", a2b);
		
		WebElement orderonline = null;
		try 
		{
			orderonline = d.findElementByXPath("//a[text()='Order Online']");
		} 
		catch (NoSuchElementException e)
		{	e.printStackTrace();	
		if(orderonline.isDisplayed()== true)
		{
		
		String location = d.findElementByXPath("//div[contains(text(), 'Delivering')]//span").getText();
		String status = d.findElementByXPath("(//h1[contains(text(),'A2B ')]//following::section)[3]//span[1]").getText();
		if(status.contains("Open now"))
		{
			System.out.println("shop is"+status+" and our shop delivery location is "+location);
		}
		else if(status.contains("Closes"))
		{
			System.out.println("shop is "+status+" and our shop delivery location is "+location);
		}
		else
		{
			System.out.println("shop is "+status+" and our shop delivery location is "+location);	
		}
		
		
		List<WebElement> sweetnames = d.findElementsByXPath("//div[text()='MUST TRY']//preceding::div//h4");
		List<WebElement> prices = d.findElementsByXPath("(//div[text()='MUST TRY']//preceding::div//h4)//following::span[contains(text(),'₹')]");
		
		Map<String, String> value = new HashMap<>();
		List<String> priceList = new ArrayList<>();
		for(int i=0; i<sweetnames.size(); i++)
		{
			String name = sweetnames.get(i).getText();
			String price = prices.get(i).getText().replaceAll("[^0-9]&&.", "");
			value.put(name, price);
			String pricevalue = value.get(name);
			priceList.add(pricevalue);
			System.out.println(name+" = "+pricevalue);
		}
		Collections.sort(priceList);
		Collections.reverse(priceList);		
		String top = priceList.get(0);
		int maxprice = Integer.parseInt(top);
		for(int j=1; j<priceList.size(); j++)
		{
			String mini = priceList.get(j);
			int miniprice = Integer.parseInt(mini);
			if(miniprice > maxprice)
			{
				maxprice = miniprice;
			}	
		}
		Set<Entry<String,String>> entrySet = value.entrySet();
		System.out.println(entrySet.contains(top));
		for(Entry<String,String> es : entrySet)
		{
			if(es.setValue(top) == top)
			{
				System.out.println("costly sweet name = "+es.getKey());
			}
		}
		
		d.findElementByXPath("//a[text()='Photos']").click();
		int photocount = d.findElements(By.xpath("//img[@alt='Gallery Image']")).size();
		String count = String.valueOf(photocount);
		String showingcount = d.findElementByXPath("//div[contains(text(),'Showing')]").getText();
		if(showingcount.contains(count) == true)
		{
		System.out.println("same count of photos available");
		}else
		{
			System.out.println("photo count miss match");
		}
	
		}else
	{
		System.out.println("total online order close....");
	}
	}}
}
