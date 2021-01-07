package Seleniumcoding;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ShadowDom {


	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		RemoteWebDriver d = new ChromeDriver();
		d.get("http://sandbox-sponsors.pointsville.com/");
		d.manage().window().maximize();

		JavascriptExecutor js = (JavascriptExecutor)d;
		WebElement user = (WebElement) js.executeScript("return document.querySelector(\"amplify-authenticator > amplify-sign-in\").shadowRoot.querySelector(\"amplify-form-section > amplify-auth-fields\").shadowRoot.querySelector(\"div > amplify-username-field\").shadowRoot.querySelector(\"amplify-form-field\").shadowRoot.querySelector(\"#username\")");

		WebElement pass = (WebElement) js.executeScript("return document.querySelector(\"amplify-authenticator > amplify-sign-in\").shadowRoot.querySelector(\"amplify-form-section > amplify-auth-fields\").shadowRoot.querySelector(\"div > amplify-password-field\").shadowRoot.querySelector(\"amplify-form-field\").shadowRoot.querySelector(\"#password\")");
		
		String scp = "argument[0].setAttribute('value', 'gnana')";
		String pss = "argument[0].setAttribute('value', 'sekar')";
		((JavascriptExecutor)d).executeScript(scp, user);
		((JavascriptExecutor)d).executeScript(pss, pass);
		
	}
}