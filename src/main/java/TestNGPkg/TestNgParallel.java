package TestNGPkg;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class TestNgParallel {
			String text="";
			
		@Test(threadPoolSize = 5, invocationCount = 5,timeOut = 1000, groups = {"smoke", "regression"})
		@Parameters({ "text" })
		public void smokeTest1(String text)
		{
			this.text = text;
			System.out.println(text+" smoke test one = "+Thread.currentThread().getId());
		}
		
		@Test(threadPoolSize = 5, invocationCount = 5,timeOut = 1000, groups = {"smoke", "regression"})
		public void smokeTest2()
		{
			System.out.println("smoke test two = "+Thread.currentThread().getId());
		}
		
		@Test(threadPoolSize = 5, invocationCount = 5,timeOut = 1000, groups = {"smoke"})
		public void smoketest3()
		{
			System.out.println("smoke test three = "+Thread.currentThread().getId());
		}
		
		@Test(threadPoolSize = 5, invocationCount = 5,timeOut = 1000)
		public void normalSmokeTest()
		{
			System.out.println("normal smoke test = "+Thread.currentThread().getId());
		}
		
		@Test(groups = {"sanity", "regression"}, threadPoolSize = 5,timeOut = 1000, invocationCount = 5)
		public void sanitytest1()
		{
			System.out.println("snaity test one = "+Thread.currentThread().getId());
		}
		
		@Test(threadPoolSize = 5, invocationCount = 5,timeOut = 1000, groups = {"sanity", "regression"})
		public void sanitytest3()
		{
			System.out.println("snaity test three = "+Thread.currentThread().getId());
		}
		
		@Test(threadPoolSize = 5, invocationCount = 5,timeOut = 1000, groups = {"sanity", "regression"})
		public void sanitytest2()
		{
			System.out.println("snaity test one = "+Thread.currentThread().getId());
		}
		
		@Test(threadPoolSize = 5, timeOut = 1000, invocationCount = 5, groups = {"regression"})
		public void regressionTest()
		{
			System.out.println("Regression test = "+Thread.currentThread().getId());
		}
	}