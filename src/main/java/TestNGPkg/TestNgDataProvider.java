package TestNGPkg;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class TestNgDataProvider 
{
	@Test(dataProvider="Login", dataProviderClass = DataProviderClass.class)
	public void DataProviderData(String user, String password)
	{
		System.out.println(user+" --- "+password);
	}

	/*
	@DataProvider(name = "Login")
	public static Object[][] datas()
	{
		return new Object[][]
				{
			{"gnana", "admin"},
			{"gnana", "ad"},
			{"gnana", "admin@123"},
			{"gnana", "admin$56"}
				};
	}*/
}
