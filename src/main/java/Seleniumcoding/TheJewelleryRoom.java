package Seleniumcoding;

import java.awt.image.BufferedImage;
import java.awt.image.DataBuffer;
import java.awt.image.RenderedImage;
import java.io.File;
import java.io.IOException;
import java.net.URL;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import javax.imageio.ImageIO;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TheJewelleryRoom
{
	public FirefoxDriver d;

	@BeforeMethod
	public void startup()
	{
		WebDriverManager.firefoxdriver().setup();
		DesiredCapabilities cap = DesiredCapabilities.firefox();
		cap.setCapability("browser.privatebrowsing.autostart", true);
		d = new FirefoxDriver(cap);
		d.get("https://thejewelleryroom.com/");
	}

	@AfterMethod
	public void teardown()
	{
		//d.quit();
	}

	@Test
	public void jewelleryRoom() throws InterruptedException, IOException
	{
		Actions action = new Actions(d);
		WebElement link = d.findElementByXPath("(//a[contains(text(),'Bracelets')])[1]");
		action.moveToElement(link).build().perform();
		d.findElementByXPath("(//a[contains(text(),'Bangles')])[1]").click();

		WebDriverWait wait = new WebDriverWait(d, 20);
		JavascriptExecutor js = ((JavascriptExecutor)d);
		Thread.sleep(3000);
		WebElement dd = d.findElementByXPath("(//span[contains(text(),'Sort by')]//span)[1]");
		//wait.until(ExpectedConditions.elementToBeClickable(dd));
		js.executeScript("arguments[0].click();", dd);
		WebElement dd1 = d.findElementByXPath("//div[@class='dropdown-content']//following-sibling::a[contains(text(),'Price (high-low)')]");
		js.executeScript("arguments[0].click();", dd1);

		List<WebElement> names = d.findElementsByXPath("//div[@class='product-information has-text-centered']//div[@class='product-name']");
		List<WebElement> prices = d.findElementsByXPath("//span[@class='currency-dkk']");
		Map<String,Integer> map = new LinkedHashMap<>();
		for(int i=0; i<names.size(); i++)
		{
			String name = names.get(i).getText().toString().trim();
			String price = prices.get(i).getText().toString().replaceAll("[^0-9]", "");
			int intprice = Integer.parseInt(price);
			map.put(name, intprice);
		}

		Set<Entry<String, Integer>> entry = map.entrySet();
		for(Entry<String, Integer> es: entry)
		{
			System.out.println(es.getKey()+" = "+es.getValue());
		}
		d.findElementByXPath("(//div[@class='product-information has-text-centered']//div[@class='product-name'])[1]").click();

		//----------------------------------------------------------------------------------------
		
		File screenshotAs = ((TakesScreenshot)d).getScreenshotAs(OutputType.FILE);
		// Convert the screenshot into BufferedImage
		BufferedImage fullScreen = ImageIO.read(screenshotAs);
		
		WebElement image = d.findElement(By.xpath("(//div[@class='glide__slide glide__slide--active']//a/div)"));
		int x = image.getLocation().getX();
		int y = image.getLocation().getY();
		int width = image.getSize().getWidth();
		int height = image.getSize().getHeight();

		//cropping the full image to get only the logo screenshot
		BufferedImage logoImage = fullScreen.getSubimage(x, y, width, height);
		ImageIO.write(logoImage, "png", screenshotAs);
		//long start = System.currentTimeMillis();
		//Save cropped Image at destination location physically.
		File f1 = new File("./TestleafCodePractices/start.PNG");
		FileUtils.copyFile(screenshotAs, f1);

		//----------------------------------------------------------------------------------------
		
		String beforename = d.findElementByXPath("//h1[@class='title']//a").getText().trim();
		String beforeprice = d.findElementByXPath("(//div[@class='product-price']//span[@class='currency-dkk'])[1]").getText().replaceAll("[^0-9]", "").trim();

		d.findElementByXPath("//div[@class='language-switcher flags-only']//a[2]").click();

		String enabled = d.findElementByXPath("//div[@class='language-switcher flags-only']//a[2]").getAttribute("aria-selected").trim();
		//boolean equals = enabled.equals("true");
		if(enabled.equals("true")==true)
		{
			System.out.println("Confirm page in Dutch language");
		}
		else
		{
			System.out.println("Still in English language");
		}
		
		//------------------------------------------------------------------------------
		File screenshotAs1 = ((TakesScreenshot)d).getScreenshotAs(OutputType.FILE);
		// Convert the screenshot into BufferedImage
		BufferedImage fullScreen1 = ImageIO.read(screenshotAs);
		
		WebElement image1 = d.findElement(By.xpath("(//div[@class='glide__slide glide__slide--active']//a/div)"));
		int x1 = image.getLocation().getX();
		int y1 = image.getLocation().getY();
		int width1 = image.getSize().getWidth();
		int height1 = image.getSize().getHeight();

		//cropping the full image to get only the logo screenshot
		BufferedImage logoImage1 = fullScreen.getSubimage(x1, y1, width1, height1);
		ImageIO.write(logoImage1, "png", screenshotAs1);
		//long start = System.currentTimeMillis();
		//Save cropped Image at destination location physically.
		File f2 = new File("./TestleafCodePractices/end.PNG");
		FileUtils.copyFile(screenshotAs, f2);
		//---------------------------------------------------------------------------
		
//		File screenshot = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
//        Thread.sleep(3000);
//        FileUtils.copyFile(screenshot, new File("GoogleOutput.jpg"));
//
//        File fileInput = new File("GoogleInput.jpg");
//        File fileOutPut = new File("GoogleOutput.jpg");

        BufferedImage bufferfileInput = ImageIO.read(f1);
        DataBuffer bufferfileInput1 = (bufferfileInput).getData().getDataBuffer();
        int sizefileInput = bufferfileInput1.getSize();                     
        BufferedImage bufferfileOutPut = ImageIO.read(f2);
        DataBuffer datafileOutPut = bufferfileOutPut.getData().getDataBuffer();
        int sizefileOutPut = datafileOutPut.getSize();
        Boolean matchFlag = true;
        if(sizefileInput == sizefileOutPut) {                         
           for(int i=0; i<sizefileInput; i++) {
                 if(bufferfileInput1.getElem(i) != datafileOutPut.getElem(i)) {
                       matchFlag = false;
                       break;
                 }
            }
        }
        else {                           
           matchFlag = false;
        Assert.assertTrue(matchFlag, "Images are not same");    
        }
		//-----------------------------------------------------------------------------

		String aftername = d.findElementByXPath("//h1[@class='title']//a").getText().trim();
		String afterprice = d.findElementByXPath("(//div[@class='product-price']//span[@class='currency-dkk'])[1]").getText().replaceAll("[^0-9]", "").trim();

		if(beforename.equals(aftername) && beforeprice.equals(afterprice))
		{
			System.out.println("product and price are same after language changes");
		}
	}
}
