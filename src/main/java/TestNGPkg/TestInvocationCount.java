package TestNGPkg;

import org.testng.ITestContext;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class TestInvocationCount {
	@Test(invocationCount=2)
	public void testing()
	{
		System.out.println("first");
		Reporter.log("first message");
		System.out.println("end ");
	}
	
	@Test
	public void testingtwo(ITestContext context)
	{
		System.out.println("second value = "+context.getAttribute("addition"));
		Reporter.log("second message");
		System.out.println("end ");
	}
	
	@Test
	public void testingthree()
	{
		System.out.println("third");
		Reporter.log("third message");
		System.out.println("end ");
	}
}
