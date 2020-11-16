package Seleniumcoding;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

import javax.imageio.ImageIO;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;
import ru.yandex.qatools.ashot.AShot;
import ru.yandex.qatools.ashot.Screenshot;
import ru.yandex.qatools.ashot.shooting.ShootingStrategies;
import ru.yandex.qatools.ashot.shooting.ShootingStrategy;

public class Espn extends TestBase{

	Espn()
	{
		super();
	}

	@BeforeMethod
	public void setup()
	{
		Baseclass("chrome", "https://www.espncricinfo.com/");
	}

	@AfterMethod
	public void teardowns()
	{
		//d.close();
	}

	@Test
	public void manOfTheMatch() throws IOException, InterruptedException
	{
		WebElement ipl2020 = d.findElement(By.xpath("(//span[text()='IPL 2020'])[1]"));
		JavascriptExecutor js  = ((JavascriptExecutor)d);
		js.executeScript("arguments[0].click();", ipl2020);
		d.findElement(By.xpath("//a[text()='View All Results']")).click();

		List<Integer> arrayList = new ArrayList<>();
		List<WebElement> array = d.findElements(By.xpath("//span[@class='extra-score']/following-sibling::span"));

		for(int i=0; i<array.size(); i++)
		{		
			String run = array.get(i).getText().trim().replaceAll("[^0-9]\\d", "");
			int intrun = Integer.parseInt(run);
			arrayList.add(intrun);
		}

		Integer max = Collections.max(arrayList);
		System.out.println("highest scrore: "+max);

		int matches = d.findElements(By.xpath("//div[@class='row no-gutters']/div")).size();

		d.findElement(By.xpath("//div[@class='row no-gutters']/div["+matches+"]//a[text()='Summary']")).click();
		String playername = d.findElement(By.xpath("//div[@class='best-player-name']/a")).getAttribute("data-hover");
		System.out.println("best player of the match is goes to : " +playername);
	}
}
