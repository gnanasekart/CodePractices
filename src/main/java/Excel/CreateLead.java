package Excel;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.WebElement;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class CreateLead extends TestBase
{
	@BeforeTest
	public void start()
	{
		filename = "sampledata";
		sheetname = "create";
	}

	@Test(dataProvider = "create")
	public void createLeadrecord(String cname, String fname, String lname)
	{
		driver.findElementByLinkText("Create Lead").click();		
		driver.findElementById("createLeadForm_companyName").sendKeys(cname);
		driver.findElementById("createLeadForm_firstName").sendKeys(fname);
		driver.findElementById("createLeadForm_lastName").sendKeys(lname);


		driver.findElementByXPath("//input[@class='smallSubmit']").click();
	}

	@Test(dataProvider ="update")
	public String updatefile()
	{
		ArrayList<String> arrayList = new ArrayList<>();
		List<WebElement> list = driver.findElementsByXPath("//ul[@class='shortcuts']//a");
		Iterator<WebElement> iterator = list.iterator();
		String name ="";
		while(iterator.hasNext())
		{
			name = iterator.next().getText();
			arrayList.add(name);
			System.out.println(name);
		}
		return name;
	}
}
