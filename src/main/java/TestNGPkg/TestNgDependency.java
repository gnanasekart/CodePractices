package TestNGPkg;

import org.testng.Assert;
import org.testng.ITestContext;
import org.testng.ITestResult;
import org.testng.SkipException;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

//@Listeners(TestNGPkg.TestNgIInvokedMethodListener.class)
public class TestNgDependency
{	
	
	@Test()
	public void openBrowser(ITestContext context)
	{
		int add = TestNgSkip.add(2, 2);
		context.setAttribute("addition", add);
		Assert.assertEquals(TestNgSkip.add(2, 2), 4);
		//depends on method from another class
		//if that method comes update @Test means it will not consider it need to be out of annotations
		
		System.out.println("first");
	}

	@Test(dependsOnMethods= { "openBrowser" })
	public void login()
	{
		System.out.println("login");
		Assert.assertTrue(false);
		
	}
	
	@Test(dependsOnMethods= { "openBrowser", "login" })
	public void update(ITestContext context)
	{
		System.out.println("update value = "+context.getAttribute("addition"));
		Assert.assertTrue(true);
		
	}
	
	@Test(dependsOnMethods= { "update" }, alwaysRun=true)
	public void update1()
	{
		System.out.println("update1");
		Assert.assertTrue(true);
		
	}
	
	@Test(dependsOnMethods= { "update1" }, alwaysRun=true)
	public void update2()
	{
		String name = "a";
		if(name.contains("a"))
		{
		System.out.println("update2");}
		else
		{
			throw new SkipException("skip");
		}
	}

	@Test(dependsOnMethods= { "login", "update2" }, alwaysRun = true)
	public void logout()
	{
		System.out.println("logged out");	
	}
	
	/*
	@AfterMethod
	public void afterMethod(ITestResult result) {
		if(result.getStatus() == ITestResult.SUCCESS)
		{
			System.out.println(result.getMethod().getMethodName()+ " is Successfully passed");
		}else if(result.getStatus() == ITestResult.FAILURE)
		{
			System.out.println(result.getMethod().getMethodName()+" test is failed");
		}else if(result.getStatus() == ITestResult.SKIP) {
			System.out.println(result.getMethod().getMethodName()+" is skipped");
		}
	}
	*/
}
