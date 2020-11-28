package com.qa.StepDefinition;

import org.openqa.selenium.WebElement;

import Seleniumcoding.TestBase;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class NivarCyclone extends TestBase 
{
	
	public NivarCyclone() 
	{
	super();
	}
	
	@Before
	public void startup()
	{
		Baseclass("chrome", "http://google.co.in");
	}
	@After
	public void teardown()
	{
		d.close();
	}

	@Given("Type cyclone nivar")
	public void searchInput()
	{
		WebElement input = d.findElementByXPath("//input[@name='q']");
		input.click();
		input.sendKeys("cyclone nivar");
	}

	@And("Choose nivar tracking live link")
	public void suggestion()
	{
		d.findElementByXPath("//ul[@role='listbox']//span//b[contains(text(),'live tracking')]").click();
	}

	@When("Choose ZoomEarth Link found")
	public void zoomEarth()
	{
		d.findElementByXPath("//div[@class='g']//span[contains(text(),'Zoom Earth')]").click();
	}

	@Then("Land On the Page")
	public void webPage()
	{
		System.out.println("landed on = "+d.getTitle()+ " webpage");
	}

	@And("Print Highlighted Pressure")
	public void highLighted()
	{
		String type = d.findElementByXPath("//tr[@class='rank1 selected']//td[@class='type']").getText().trim();
		String wind = d.findElementByXPath("//tr[@class='rank1 selected']//td[@class='wind']").getText().trim();
		String pressure = d.findElementByXPath("//tr[@class='rank1 selected']//td[@class='pressure']").getText().trim();
		System.out.println("current wind type = "+type+" wind speed = "+wind+" km/h and wind pressure = "+pressure+" mb");
	}

	@Then("Forecasted land hitting time")
	public void foreCaste()
	{
		WebElement landing = d.findElementByXPath("(//tr[@title='Low Pressure Area'])[1]");
		landing.click();
	}

	@And("Print the estimated wind speed")
	public void estimation()
	{
		String fwind = d.findElementByXPath("(//tr[@title='Low Pressure Area'])[1]//td[@class='wind']").getText().trim();
		System.out.println("Landing forcasted wind speed is = "+fwind+"km/h");
	}
}
