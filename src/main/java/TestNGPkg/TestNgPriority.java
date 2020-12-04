package TestNGPkg;

import org.testng.annotations.Test;

public class TestNgPriority {

	@Test(priority=1)
	public void testing()
	{
		System.out.println("first");
	}
	
	@Test(priority=1)
	public void testingtwo()
	{
		System.out.println("second");
	}
	
	@Test(priority=0)
	public void testingthree()
	{
		System.out.println("third");
	}
	
	@Test(priority=-1)
	public void negative()
	{
		System.out.println("negative");
	}
	
	@Test(priority=0)
	public void zero()
	{
		System.out.println("zero");
	}

	@Test
	public void emptyvaluetwo()
	{
		System.out.println("emptyvalue2");
	}
	
	@Test
	public void emptyvalueone()
	{
		System.out.println("emptyvalue1");
	}
}
