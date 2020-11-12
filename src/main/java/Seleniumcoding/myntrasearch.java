package Seleniumcoding;

import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Capabilities;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class myntrasearch{


	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver86.exe");
		ChromeOptions options = new ChromeOptions();
		options.addArguments("incognito");
		DesiredCapabilities cap = DesiredCapabilities.chrome();
		cap.setCapability(ChromeOptions.CAPABILITY, options);
		WebDriver driver = new ChromeDriver(cap);
		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.manage().deleteAllCookies();		

		Dimension size = driver.manage().window().getSize();
		System.out.println("before maximize = " +size);
		driver.manage().window().maximize();
		Dimension size1 = driver.manage().window().getSize();
		System.out.println("After maximize = " +size1);

		driver.get("https://www.myntra.com/");

		WebElement searchox = driver.findElement(By.xpath("//input[@class='desktop-searchBar']"));
		searchox.sendKeys("sunglasses");
		searchox.sendKeys(Keys.ENTER);

		driver.findElement(By.xpath("//div[@class='brand-more']")).click();
		driver.findElement(By.xpath("//input[@class='FilterDirectory-searchInput']")).sendKeys("polaroid");

		driver.findElement(By.xpath("//ul[@class='FilterDirectory-list']//label[1]")).click();
		driver.findElement(By.xpath("//div[@class='FilterDirectory-titleBar']//span")).click();

		Actions action = new Actions(driver);
		WebDriverWait wait = new WebDriverWait(driver, 2);
		System.out.println("Item size is: L");
//		List<WebElement> menscount = driver.findElements(By.xpath("//h4[text()='Men Rectangle Sunglasses' and @class='product-product']"));
//		int no_of_size = menscount.size();
//		WebElement target = driver.findElement(By.xpath("//h4[text()='Men Rectangle Sunglasses']"));
//		action.moveToElement(target).build().perform();
//		
//		for(int i = 1; i<= no_of_size; i++) 
//		{
//			WebElement sss = driver.findElement(By.xpath("(//h4[text()='Men Rectangle Sunglasses']//following-sibling::h4//span)["+i+"]"));
//			wait.until(ExpectedConditions.visibilityOf(sss));
//			System.out.println("Item("+i+") size is: "+sss.getText());
//		}

		WebElement image = driver.findElement(By.xpath("//ul[@class='results-base']//li[1]"));
		WebElement icon  = driver.findElement(By.xpath("(//div[@class='image-grid-similarColorsCta product-similarItemCta'])[1]"));
		WebElement similar = driver.findElement(By.xpath("(//span[text()='VIEW SIMILAR'])[1]"));
		wait.until(ExpectedConditions.visibilityOf(image));
		action.moveToElement(image).build().perform();

		wait.until(ExpectedConditions.visibilityOf(icon));
		action.moveToElement(icon).build().perform();
		icon.click();

		List<WebElement> similarcount = driver.findElements(By.xpath("//ul[@class='results-base results-similarGrid']//li"));
		System.out.println("similar count is = "+similarcount.size());

		driver.close();
	}	

}
