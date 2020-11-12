package Seleniumcoding;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.Color;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Flipkart extends TestBase{

	Flipkart()
	{
		super();
	}
	@BeforeMethod
	public void setup()
	{
		Baseclass("ff", "https://www.flipkart.com/");
	}

	@AfterMethod
	public void teardown()
	{
			d.close();
	}

	@Test
	public void flipkartsort() throws InterruptedException
	{
		d.findElement(By.xpath("//button[text()='✕']")).click();

		WebElement search = d.findElement(By.xpath("//input[@placeholder='Search for products, brands and more']"));
		search.sendKeys("home theaters");
		search.sendKeys(Keys.ENTER);
		String result = d.findElement(By.xpath("//span[contains(text(),'Showing')]")).getText();
		System.out.println(result);
		String comma = result.replaceAll("[^0-9]", "");
		String totalcount = comma.substring(3);
		int firstcount = Integer.parseInt(totalcount);
		System.out.println("before sort = " +firstcount);

		d.findElement(By.xpath("//div[text()='Customer Ratings']//following::div[starts-with(@title, '4')]")).click();
		Thread.sleep(4000);

		String lesscount = d.findElement(By.xpath("//span[contains(text(),'Showing')]")).getText();
		System.out.println(lesscount);
		String sortfilter = lesscount.replaceAll("[^0-9]", "");
		String sortsubcount = sortfilter.substring(3);
		int sscount = Integer.parseInt(sortsubcount);
		System.out.println("After filter = "+sortsubcount);
		while(firstcount > sscount)
		{
			System.out.println("filtered value is less than initial count");
			break;
		}

		d.findElement(By.xpath("//div[contains(text(),'High to Low')]")).click();

		String value = d.findElement(By.xpath("//div[contains(text(),\"High to Low\")]")).getCssValue("font-weight");
		//System.out.println(value);
		String colorname = d.findElement(By.xpath("//div[contains(text(),\"High to Low\")]")).getCssValue("color");
		Color asRgb = Color.fromString(colorname);
		System.out.println(asRgb.getColor());
		//System.out.println(asRgb.toString());
		int intvalue = Integer.parseInt(value);
		while(intvalue > 100)
		{
			System.out.println("Font displayed in bold");
			break;
		}
		
		Actions action = new Actions(d);
		WebElement compare1 = d.findElement(By.xpath("(//div[text()='Black, Mono Channel'])[1]"));
		action.moveToElement(compare1).build().perform();
		d.findElement(By.xpath("((//span[contains(text(),'Add to Compare')]) | (//div[text()='Black, Mono Channel'])/parent::div[@class='_3liAhj'])[1]")).click();
		
		WebElement compare2 = d.findElement(By.xpath("(//div[text()='Black, Mono Channel'])[2]"));
		action.moveToElement(compare2).build().perform();
		d.findElement(By.xpath("((//span[contains(text(),'Add to Compare')]) | (//div[text()='Black, Mono Channel'])/parent::div[@class='_3liAhj'])[2]")).click();
		//price compare
		List<Integer> list = new ArrayList<Integer>();
		List<WebElement> pricelist = d.findElements(By.xpath("((//div[@class='_1uv9Cb']//div[@class='_1vC4OE']) | (//div[@class='_3auQ3N']//preceding-sibling::div[@class='_1vC4OE']))"));
		
		String price;
		int parse;
		
		for(WebElement ele : pricelist) {
			price = ele.getText().trim().replace(",", "");
			String price1 = price.replace("₹", "");
			System.out.println(price1);
			parse = Integer.parseInt(price1);
			list.add(parse);
		}
		System.out.println(list);
		
		d.findElement(By.xpath("//span[text()='COMPARE']")).click();
		String compare = d.findElement(By.xpath("//div[contains(text(),'Compare')]")).getText();
		while(compare.contains("Compare"))
		{
			System.out.println("product compare page");
			break;	
		}				
	}
}
