package Seleniumcoding;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Amazonchair {

	public static void main(String[] args) {

		Logger log = Logger.getLogger(Amazonchair.class);
		
		System.setProperty("webdriver.driver.silentOutput", "true");
		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver86.exe");
		WebDriver d = new ChromeDriver();
		log.info("Chrome driver launch");
		d.manage().window().maximize();
		d.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		d.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		d.manage().deleteAllCookies();
		d.get("https://www.amazon.in");

		WebElement choose = d.findElement(By.id("searchDropdownBox"));
		Select select = new Select(choose);
		select.selectByValue("search-alias=furniture");

		d.findElement(By.id("twotabsearchtextbox")).sendKeys("chairs for computer table");
		d.findElement(By.xpath("(//input[@type='submit'])[1]")).click();

		List<Integer> pricelist = new ArrayList<Integer>();
		List<WebElement> price = d.findElements(By.xpath("(//span[@class='a-price-symbol']/following-sibling::span)"));

		String prices;	
		int intprice;
		for(WebElement ele : price)
		{
			prices = ele.getText().trim().substring(0).replace(",", "");
			intprice = Integer.parseInt(prices);
			pricelist.add(intprice);
		}
		System.out.println("Size "+pricelist.size());
		System.out.println("Price "+pricelist);
	
		int maxprice = Collections.max(pricelist);
		
		for (int list: pricelist)
		{
			if(maxprice == list)
			{
				System.out.println("highest price : "+list);
			}
		}

		d.findElement(By.xpath("(//i[@class='a-icon a-icon-popover'])[1]")).click();
		String star = d.findElement(By.xpath("//a[@class='a-link-normal 5star']")).getText();
		String percentage = d.findElement(By.xpath("(//td[@class='a-text-right a-nowrap'])[1]")).getText();
		String webdetails = d.findElement(By.xpath("//a[@class='a-link-normal 5star']")).getAttribute("title");
		System.out.println("Webpage title shown as : "+webdetails);
		System.out.println("No of "+star+" valued custemer count is "+percentage);
		d.close();
	}

	
}
