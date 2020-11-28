package Seleniumcoding;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class LensKartFrameCount extends TestBase {

	public LensKartFrameCount() {
		super();
	}

	@BeforeMethod
	public void startup()
	{
		Baseclass("chrome", "https://www.lenskart.com/");
	}

	@AfterMethod
	public void teardown()
	{
		//d.close();
	}

	@Test
	public void LensKart() throws InterruptedException
	{
		d.findElementByXPath("//button[@class='No thanks']").click();
		WebElement main = d.findElementByXPath("//a[text()='Computer Glasses']");
		Actions action = new Actions(d);
		action.moveToElement(main).build().perform();

		WebElement men = d.findElementByXPath("(//div[@class='gender_info']//following::span[text()='men'])[1]");
		action.moveToElement(men).build().perform();

		WebElement range = d.findElementByXPath("(//span[text()='PREMIUM RANGE'])[1]");
		JavascriptExecutor js = ((JavascriptExecutor)d);
		js.executeScript("arguments[0].click();", range);

		WebElement round = d.findElementByXPath("(//span[text()='Round'])");
		action.doubleClick(round).build().perform();

		List<WebElement> color = d.findElementsByXPath("//div[contains(text(),'FRAME COLOR')]//following::ul//li[@class='list-checkbox']//span");
		Thread.sleep(2000);
		List<Integer> count = new ArrayList<>();
		String number ="";
		for(int i = 0; i<color.size(); i++)
		{
			number = color.get(i).getText().toString().replaceAll("[^0-9]", "");
			int parseInt = Integer.parseInt(number);
			count.add(parseInt);
		}
		int top = count.get(0);
		System.out.println("max count = "+top);

		for(int j=1; j<=color.size(); j++)
		{
			String text = d.findElementByXPath("(//div[contains(text(),'FRAME COLOR')]//following::ul//li[@class='list-checkbox']//span)["+j+"]").getText();
			String t = text.replaceAll("[^0-9]", "");
			int tt = Integer.parseInt(t);
			System.out.println("value = " +tt);
			if(top == tt)
			{
				WebElement tick = d.findElementByXPath("(//div[contains(text(),'FRAME COLOR')]//following::ul//li[@class='list-checkbox']//input)["+j+"]");
				action.click(tick).build().perform();
				
			}
			break;
		}
		String result = d.findElementByXPath("//div[@class='show_count']").getText().replaceAll("[^0-9]", "").substring(1);
		System.out.println(result);
		int resulttop = Integer.parseInt(result);
		if(resulttop == top)
		{
			System.out.println("correct count");
		}
		else
		{
			System.out.println("wrong count");
		}
	}
}
