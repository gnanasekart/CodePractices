package TestNGPkg;

import org.testng.annotations.DataProvider;

public class DataProviderClass {

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
	}
}
