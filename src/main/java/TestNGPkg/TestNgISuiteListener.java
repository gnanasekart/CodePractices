package TestNGPkg;

import org.testng.ISuite;
import org.testng.ISuiteListener;

public class TestNgISuiteListener implements ISuiteListener{
	public void onStart(ISuite suite) {
		System.out.println("Suite start correctly");
	}

	public void onFinish(ISuite suite) {
		System.out.println("Suite ends correctly");
	}
}
