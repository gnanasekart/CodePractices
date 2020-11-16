package Seleniumcoding;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import javax.imageio.ImageIO;

import org.apache.commons.io.FileUtils;
import org.apache.commons.math3.util.MathArrays;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class SnapdealWatch extends TestBase{

	SnapdealWatch()
	{
		super();
	}

	@BeforeMethod
	public void setup()
	{
		Baseclass("edge", "https://www.snapdeal.com/");
	}

	@AfterTest
	public void teardown()
	{
		d.quit();
	}

	@Test
	public void snapdeal() throws IOException
	{
		d.findElement(By.id("pushDenied")).click();
		Actions action = new Actions(d);
		WebElement alloffer = d.findElement(By.xpath("//span[text()='All Offers']"));
		action.moveToElement(alloffer).build().perform();
		d.findElement(By.xpath("(//span[text()='Watches'])[1]")).click();

		List<WebElement> images = d.findElements(By.xpath("//picture[@class='picture-elem']//img"));
		for (int i = 0; i < images.size(); i++) {
			
			File screenshotAs = ((TakesScreenshot)d).getScreenshotAs(OutputType.FILE);
			// Convert the screenshot into BufferedImage
			BufferedImage fullScreen = ImageIO.read(screenshotAs);
			
			WebElement image = d.findElement(By.xpath("(//picture[@class='picture-elem']//img)["+(i+1)+"]"));
			int x = image.getLocation().getX();
			int y = image.getLocation().getY();
			int width = image.getSize().getWidth();
			int height = image.getSize().getHeight();

			//cropping the full image to get only the logo screenshot
			BufferedImage logoImage = fullScreen.getSubimage(x, y, width, height);
			ImageIO.write(logoImage, "png", screenshotAs);
			long start = System.currentTimeMillis();
			//Save cropped Image at destination location physically.
			FileUtils.copyFile(screenshotAs, new File("./TestleafCodePractices/"+start+".PNG"));
		}
		//trending watch name
		//WebElement trending = d.findElement(By.className("nudge-image-top-left"));
		
		List<WebElement> rating = d.findElements(By.className("product-rating-count"));

		List<Integer> arrList = new ArrayList<Integer>();
		for(int i=0; i<rating.size(); i++)
		{
			String number = rating.get(i).getText().replaceAll("[^0-9]", "").trim();
			int parseInt = Integer.parseInt(number);
			arrList.add(parseInt);
		}
		Collections.max(arrList);
		Integer top = arrList.get(0);
		for(int j=0; j<arrList.size(); j++)
		{
			if(arrList.get(j)>= top)
			{
				String title = d.findElement(By.xpath("(//p[@class='product-title '])["+(j+1)+"]")).getAttribute("title");		
				System.out.println("trending watch name = "+title);
			}
		}
		List<WebElement> rate = d.findElements(By.xpath("//span[@class='lfloat product-price']"));
		List<Integer> alrate = new ArrayList<>();
		int total = 0;

		for(int k=0; k<rate.size(); k++)
		{
			String trim = rate.get(k).getAttribute("display-price").trim();
			int parseInt = Integer.parseInt(trim);
			alrate.add(parseInt);
			total = total + alrate.get(k);
		}
		int avg = total/alrate.size();

		for(int m=0; m<alrate.size(); m++)
		{
			if(alrate.get(m) >= avg)
			{
				System.out.println("above the average watch price = "+alrate.get(m));
				String tit = d.findElement(By.xpath("(//p[@class='product-title '])["+(m+1)+"]")).getAttribute("title");		
				System.out.println("watch name = "+tit);
				d.findElement(By.xpath("(//i[@class='sd-icon sd-icon-like-outline heart-icon animated-font-pre'])["+(m+1)+"]")).click();
			}
		}
		System.out.println("page title = " +d.getTitle());
	}
}
