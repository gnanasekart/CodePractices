package Seleniumcoding;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import io.github.bonigarcia.wdm.WebDriverManager;
import io.github.sukgu.Shadow;

public class OlaCab extends TestBase {

	public RemoteWebDriver d;

	@BeforeMethod
	public void startup()
	{
		WebDriverManager.chromedriver().setup();
		d = new ChromeDriver();
		d.manage().window().maximize();
		int width = d.manage().window().getSize().getWidth();
		int height = d.manage().window().getSize().getHeight();
		Dimension ds = new Dimension(width/2, height/2);

		d.manage().window().setSize(ds);
		d.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		d.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		d.manage().deleteAllCookies();
		d.get("https://www.olacabs.com/");
	}

	@AfterMethod
	public void teardown()
	{
		d.quit();;
	}

	@Test
	public void olacabbook() throws InterruptedException
	{
		JavascriptExecutor js = ((JavascriptExecutor)d);
		WebDriverWait wait = new WebDriverWait(d, 20);
		d.manage().window().maximize();

		Actions action = new Actions(d);
		WebElement target = d.findElement(By.xpath("//a[text()='Outstation']"));
		action.click(target).build().perform();

		WebElement iframe = d.findElementByClassName("city-iframe");
		d.switchTo().frame(iframe);

		d.findElementByCssSelector("div.middle.h-full.text.value").click();
		Thread.sleep(2000);
		WebElement start = d.findElementByXPath("//input[@placeholder='Enter address...']");
		WebElement until = wait.until(ExpectedConditions.visibilityOf(start));
		until.sendKeys("chennai one");
		WebElement dd = d.findElementByXPath("(//div[@class='card bg-white']//div[@class='row results ola-ripple ptr'])[1]");
		wait.until((ExpectedConditions.visibilityOf(dd)));
		dd.click();

		d.findElementByCssSelector("div.middle.h-full.text.placeholder").click();
		Thread.sleep(2000);
		WebElement end = d.findElementByXPath("//input[@placeholder='Enter address...']");
		WebElement enduntil = wait.until(ExpectedConditions.visibilityOf(end));
		enduntil.sendKeys("bangalore");

		WebElement dd1 = d.findElementByXPath("(//div[@class='card bg-white']//div[@class='row results ola-ripple ptr'])[1]");
		wait.until((ExpectedConditions.visibilityOf(dd1)));
		dd1.click();
		Thread.sleep(2000);
		d.findElement(By.xpath("//span[text()='Search Outstation Cabs']")).click();

		String oldTab = d.getWindowHandle();
		ArrayList<String> newTab = new ArrayList<String>(d.getWindowHandles());
		newTab.remove(oldTab);  
		d.switchTo().window(newTab.get(0));

		Shadow s = new Shadow(d);
		s.findElement("a.ptr.link").click();
		int sum=0;
		List<WebElement> p = s.findElements("span.text.value.price");
		String string="";
		List<Integer> arrayList = new ArrayList<>();
		for(int i=0; i<p.size()-1; i++)
		{
			string = p.get(i).getText().toString().replaceAll("[^0-9]", "");
			if(string != null && string != "")
			{
				int parseInt = Integer.parseInt(string);
				sum = sum +parseInt;
				arrayList.add(parseInt);
			}else
			{
				System.out.println("empty values");
			}
		}

		String key="";
		int avg = sum/p.size();
		int i=0;

		if(arrayList.get(i) > avg)
		{
			System.out.println("above average = "+arrayList.get(i));
		}
		++i;
		s.findElement("div.text.value.cab-name").click();
		Thread.sleep(2000);
		s.findElement("button.nxt-btn-active.ola-ripple").click();

		List<WebElement> text = s.findElements("div.sso__title");
		for(WebElement t: text)
		{
			String mob = t.getText().toLowerCase().trim();
			if(mob.concat("mobile") != null)
			{
				System.out.println("this is mobile number entry pages");
			}
		}
	}
	}
