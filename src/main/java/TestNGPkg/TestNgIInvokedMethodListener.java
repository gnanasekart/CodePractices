package TestNGPkg;

import org.testng.IInvokedMethod;
import org.testng.IInvokedMethodListener;
import org.testng.ITestResult;

public class TestNgIInvokedMethodListener implements IInvokedMethodListener {

	public void beforeInvocation(IInvokedMethod method, ITestResult testResult) {
		    System.out.println("this test "+testResult.getMethod().getMethodName()+" --> is invoked before "+method.getTestMethod().getMethodName());
		  }

	public void afterInvocation(IInvokedMethod method, ITestResult testResult) {
		System.out.println("this test "+testResult.getMethod().getMethodName()+" --> is invoked after "+method.getTestMethod().getMethodName());		  }
}
