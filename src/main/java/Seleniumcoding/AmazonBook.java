package Seleniumcoding;

import java.io.File;
import java.io.IOException;
import java.net.URL;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import javafx.util.Duration;

public class AmazonBook extends TestBase{
	/*
	 * set 1 - in headmode
	 * set 2 - after the headless mode
	 * 	dont use hardcode sleep
	 * 	use single chromedriver to run multiple tests
	 * 	
*/
 public AmazonBook() {

}
	
	@BeforeMethod
	public void startUp()
	{	//1. launch any one of the browser in private
		
		Baseclass("chrome", "http://amazon.in");
		
		//2. load url amazon.in
		
	}
	
	@AfterMethod
	public void teardown()
	{
		//19. close all windows
		//d.quit();
	}
	

	@Test
	public void amazonBookSearch()
	{
//	3. choose office products
		WebElement all = d.findElementById("searchDropdownBox");
		Select select = new Select(all);
		all.click();
		select.selectByVisibleText("Books");
		
		WebElement input = d.findElementById("twotabsearchtextbox");
		input.click();
		input.sendKeys("book");	
		
//	4. type book and choose the second suggested value
	WebElement secondsuggest = d.findElementByXPath("(//div[@id='suggestions']//div)[2]");
		secondsuggest.click();

		d.findElementByXPath("(//input[@type='submit'])[1]").click();
		String totalcount = d.findElementByXPath("(//div[@class='a-section a-spacing-small a-spacing-top-small']//span)[1]").getText();
		String[] split = totalcount.split("over");
		String countvalue = split[1].replaceAll("[^0-9]", "");
		int intcount = Integer.parseInt(countvalue);
		System.out.println("count value = "+intcount);
		
		//	5. choose sort by - price - high to low
		WebElement sortby = d.findElementByXPath("//label[contains(text(),'Sort by:')]");
		WebDriverWait wait = new WebDriverWait(d, 10);
		wait.until(ExpectedConditions.elementToBeClickable(sortby));
		sortby.click();
		//d.executeScript("arguments[0].click();", sortby);
		
		d.findElementByXPath("//ul[@class='a-nostyle a-list-link']//a[contains(text(),'Price: High to Low')]").click();
		
		String filtercount = d.findElementByXPath("(//div[@class='a-section a-spacing-small a-spacing-top-small']//span)[1]").getText();
		String[] filtersplit = totalcount.split("over");
		String filtervalue = split[1].replaceAll("[^0-9]", "");
		int intfilter = Integer.parseInt(filtervalue);
		System.out.println("filter value = "+intfilter);
		
		//	6. confirm total count matches with displayed count
		
		if(intfilter <= intcount)
		{
			System.out.println("counts are verify");
		}else
		{
			System.out.println("count missmatch");
		}
		
//	7. Get the href link of the first matching result
		
		WebElement href = d.findElementByXPath("(//a[@class='a-link-normal a-text-normal'])[1]");
		String hrefurl = href.getAttribute("href");
		
		String name = d.findElementByXPath("(//a[@class='a-link-normal a-text-normal'])[1]//span").getText();
		
//	8. Open a new tab by program
		input.sendKeys(Keys.CONTROL+"t");
		
//	9. load that href url and
		d.navigate().to(hrefurl);
		String title = d.getTitle();
		
//		confirm the title matches the first result text
		
		if(name.toLowerCase().contains(title.toLowerCase()))
		{
			System.out.println("product matches");
		}
		else
		{
			System.out.println("product not matches");
		}
		
//	10. confirm the available from in green color
		
		
//	11. click add to wish list- not use click method
		
		WebElement wishlist = d.findElementById("wishListMainButton");
		wishlist.click();
		
//	12. confirm sign in page is displayed

		String logintitle = d.getTitle();
		if(logintitle.contains("login"))
		{
			System.out.println("Login screen");
		}else
		{
			System.out.println("not in login screen");
		}
		
//	13. travel back to the previous page
		d.navigate().back();
		
//	14. click select delivery location
		
		d.findElementById("contextualIngressPtLabel_deliveryShortLine").click();
		
//	15. enter a pincode with random value between 500000 to 600000
		
		int a = (int)(1 + (Math.random()) * 100000);
		d.findElementById("GLUXZipUpdateInput").sendKeys("5"+a);

//	16. click apply

		d.findElementById("GLUXZipUpdate-announce").click();
		
//	17. if get error msg means then verify it
//		18. take a screenshot of the error only
		
		 WebElement error = d.findElementByXPath("//*[contains(text(),'Please enter a valid pincode')]");
				String errormsg = error.getText().toLowerCase();
				
		if(errormsg.contains("valid"))
		{
			 File screenshotAs = ((TakesScreenshot)error).getScreenshotAs(OutputType.FILE);
			 try {
				FileUtils.copyFile(screenshotAs, new File("./target/screenshot/"+System.currentTimeMillis()+".png"));
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			System.out.println("Entered pincode is not valid");
		}
		else
		{
			System.out.println("Pincode is valid");
		}
	}
}
