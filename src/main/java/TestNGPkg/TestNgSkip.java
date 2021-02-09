package TestNGPkg;

import org.testng.SkipException;
import org.testng.annotations.Test;

public class TestNgSkip {

	@Test(enabled=true)
	public void testing()
	{
		System.out.println("first");
	}
	
	@Test()
	public void testingtwo()
	{
		throw new SkipException("skip this test");
	}
	
	@Test(enabled=true)
	public void testingthree()
	{
		System.out.println("true");
	}
	
	@Test()
	public void skipExecp()
	{
		String name = "gnana";
		if(name.contains("gnanas"))
		{
			System.out.println("name present");
		}
		else
		{
			throw new SkipException("skip this test");
		}
	}
	
	public static int add(int a, int b)
	{
		return a+b;
	}
}