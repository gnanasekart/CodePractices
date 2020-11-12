package Seleniumcoding;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Ajio extends TestBase{


	Ajio()
	{
		super();
	}
	@BeforeMethod
	public void setup()
	{
		Baseclass("chrome", "https://www.ajio.com/");
	}

	@AfterMethod
	public void teardowns()
	{
		//d.close();
	}

	@Test
	public void ajioWomen() throws InterruptedException 
	{
		//d.findElement(By.className("ic-close-quickview")).click();

		WebElement women = d.findElement(By.xpath("//a[@title='WOMEN']"));
		WebElement brand = d.findElement(By.xpath("//a[text()='BRANDS']"));

		Actions action = new Actions(d);
		action.moveToElement(women).build().perform();
		action.moveToElement(brand).build().perform();
		List<WebElement> items = d.findElements(By.xpath("(//a[text()='BRANDS']/following-sibling::div[@class='flyout-inner'])[2]//div[@class='items']//a"));
		List<String> arrayList = new ArrayList<>();
		int maxi =0;
		int k=0;
		System.out.println("total no of titles = "+items.size());
		for(int i=0; i<items.size(); i++)
		{
			String title = items.get(i).getAttribute("title");
			arrayList.add(title);
			int top = arrayList.get(i).replaceAll("[^a-z]", "").length();
			for(int j=i+1; j<=items.size()-1; j++)
			{
				String nexttitle = items.get(j).getAttribute("title");
				int nexttop = nexttitle.replaceAll("[^a-z]", "").length();
				if(nexttop >= top)
				{
					while(nexttop > maxi)
					{
						maxi = nexttop;
						k = j;
						break;
					}
				}
			}
			break;
		}		
		String morewords = items.get(k).getAttribute("title").trim().toLowerCase();
		System.out.println("maximum lower case letter is- "+maxi+ " and the word is = "+morewords);
		WebElement titlelink = d.findElement(By.xpath("((//a[text()='BRANDS']/following-sibling::div[@class='flyout-inner'])[2]//div[@class='items']//a)["+(k+1)+"]"));
		JavascriptExecutor js = (JavascriptExecutor)d;
		js.executeScript("arguments[0].click();", titlelink);


		String itemtitle = d.findElement(By.xpath("//div[@class='header2']")).getText().trim().toLowerCase();
		Assert.assertEquals(itemtitle, morewords);
		String firstfilter = d.findElement(By.xpath("//div[@class='filter']/div[@class='length']")).getText().trim().replaceAll("[^0-9]+", "");
		System.out.println("total count for "+morewords+" is "+firstfilter);
		int intfirst = Integer.parseInt(firstfilter);

		WebElement sizebutton = d.findElement(By.xpath("//span[text()='size & fit']"));
		js.executeScript("arguments[0].click()", sizebutton);
		WebElement s = d.findElement(By.xpath("//label[@for='S']"));
		js.executeScript("arguments[0].click();", s);

		Thread.sleep(2000);
		String sizefilter = d.findElement(By.xpath("//div[@class='filter']/div[@class='length']")).getText().trim().replaceAll("[^0-9]+", "");
		int intsize = Integer.parseInt(sizefilter);
		if(intsize <= intfirst) {
			System.out.println("total count for "+morewords+" is "+intsize);
		}

//		d.findElement(By.xpath("//label[@class='sortby-filter']/following-sibling::div//option[text()='Relevance']")).click();
//		WebElement drop = d.findElement(By.xpath("//label[@class='sortby-filter']/following-sibling::div//option[text()='Discount']"));
//		js.executeScript("arguments[0].click()", drop);
		
		List<WebElement> ddlist = d.findElements(By.xpath("//div[@class='filter-dropdown']//select//option"));
		for(int a = 0; a<ddlist.size(); a++)
		{
			String text = ddlist.get(a).getText().trim();
			if(text.equals("Discount"))
			{
				ddlist.get(a).click();
			}
		}

		List<WebElement> perctlist = d.findElements(By.xpath("//span[@class='discount']"));
		List<WebElement> arrlist = new ArrayList<>();
		String toppert = perctlist.get(0).getText().trim().replaceAll("[^0-9]+", "");
		int topnum = Integer.parseInt(toppert);
		Thread.sleep(2000);
		for(int i = 1; i<perctlist.size(); i++)
		{
			String percentage = perctlist.get(i).getText().trim().replaceAll("[^0-9]+", "");
			int sectop = Integer.parseInt(percentage);
			if(sectop > topnum)
			{
				System.out.println("Discount sorted by perecentage is "+sectop);
			}
		}

	}
}