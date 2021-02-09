package TestNGPkg;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class TestNgRetryAnalyzer implements IRetryAnalyzer 
{
int startcount =0;
int maxlimit = 3;
	@Override
	public boolean retry(ITestResult result) 
	{
		if(startcount < maxlimit)
		{
			startcount++;
			return true;
		}
		return false;
	}
}