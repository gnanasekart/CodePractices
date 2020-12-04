package TestNGPkg;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class TestNgListenerIItestL implements ITestListener
{

	public void onTestSuccess(ITestResult result) {
	   System.out.println("This "+result.getTestName()+" test is successfully passed");
	  }

	  
	public void onTestFailure(ITestResult result) 
	{
		   System.out.println("This "+result.getName()+" test is failed");
		   }


	public void onTestSkipped(ITestResult result) {
		   System.out.println("This "+result.getName()+" is skipped");
	  }

	  
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		   System.out.println("This "+result.getName()+" test is partially passed");
	  }

	  
	public void onTestFailedWithTimeout(ITestResult result) {
	    onTestFailure(result);
	  }

	 
	public void onStart(ITestContext context) {
		   System.out.println("This "+context.getName()+" is successfully passed");
	  }

	 
	public void onFinish(ITestContext context) {
		   System.out.println("This "+context.getName()+" is finished");	
		   		   }
}
