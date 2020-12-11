package TestNGPkg;

import java.util.ArrayList;

import org.testng.TestNG;
import org.testng.annotations.AfterSuite;

public class FailedTestRun {

	@AfterSuite
	public void afterTestCaseFailed()
	{
		TestNG t = new TestNG();
		ArrayList<String> list = new ArrayList<>();
		list.add("D:\\eclipse\\workspace\\TestleafCodePractices\\test-output\\Suite\\testng-failed.xml");
		t.setTestSuites(list);
		t.run();
	}
	
}
