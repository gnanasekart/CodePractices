package TestNGPkg;
import org.testng.annotations.Test;
public class TestNgGroups 
{
	@Test(groups = {"smoke", "regression"})
	public void smokeTest1()
	{
		System.out.println("smoke test one");
	}
	
	@Test(groups = {"smoke", "regression"})
	public void smokeTest2()
	{
		System.out.println("smoke test two");
	}
	
	@Test(groups = {"smoke"})
	public void smoketest3()
	{
		System.out.println("smoke test three");
	}
	
	@Test()
	public void normalSmokeTest()
	{
		System.out.println("normal smoke test");
	}
	
	@Test(groups = {"sanity", "regression"})
	public void sanitytest1()
	{
		System.out.println("snaity test one");
	}
	
	@Test(groups = {"sanity", "regression"})
	public void sanitytest3()
	{
		System.out.println("snaity test three");
	}
	
	@Test(groups = {"sanity", "regression"})
	public void sanitytest2()
	{
		System.out.println("snaity test one");
	}
	
	@Test(groups = {"regression"})
	public void regressionTest()
	{
		System.out.println("Regression test");
	}
}