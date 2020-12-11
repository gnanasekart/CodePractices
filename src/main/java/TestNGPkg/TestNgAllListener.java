package TestNGPkg;

import org.testng.IInvokedMethod;
import org.testng.IInvokedMethodListener;
import org.testng.ISuite;
import org.testng.ISuiteListener;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class TestNgAllListener implements ISuiteListener, IInvokedMethodListener, ITestListener {

	public void beforeInvocation(IInvokedMethod method, ITestResult testResult) 
	{
		System.out.println("this test "+testResult.getMethod().getMethodName()+" --> is invoked before "+method.getTestMethod().getMethodName());
	}

	public void afterInvocation(IInvokedMethod method, ITestResult testResult) 
	{
		System.out.println("this test "+testResult.getMethod().getMethodName()+" --> is invoked after "+method.getTestMethod().getMethodName());		  
	}

	public void onStart(ISuite suite) {
		System.out.println("Suite start correctly");
	}

	public void onFinish(ISuite suite) {
		System.out.println("Suite ends correctly");
	}
	
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
