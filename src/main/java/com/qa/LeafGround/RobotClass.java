package com.qa.LeafGround;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.InputEvent;
import java.awt.event.KeyEvent;

import org.apache.log4j.Level;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import io.github.bonigarcia.wdm.WebDriverManager;
public class RobotClass 
{
	@Test
	public void robotMathod() throws AWTException, InterruptedException
	{
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		Logger logger = Logger.getLogger("Robot class");
			//	PropertyConfigurator.configure("log4j.properties");
				

		driver.get("http://spreadsheetpage.com/index.php/file/C35/P10/"); // sample url	
        Robot robot = new Robot();	
        robot.mouseMove(630, 420); 
        logger.debug("move mouse point to specific location");
        
        robot.delay(1500);        
        logger.debug("delay is to make code wait for mentioned milliseconds before executing next step");
        
        robot.mousePress(InputEvent.BUTTON1_DOWN_MASK); 
        logger.debug("press left click");
        
        robot.mouseRelease(InputEvent.BUTTON1_DOWN_MASK); 
        logger.debug("release left click");
        
        robot.delay(1500);	
        robot.keyPress(KeyEvent.VK_DOWN); 
        logger.info("press keyboard arrow key to select Save radio button");
        
        Thread.sleep(2000);	
        robot.keyPress(KeyEvent.VK_ENTER);	
        logger.info("press enter key of keyboard to perform above selected action");
        
        driver.close();
	}
}