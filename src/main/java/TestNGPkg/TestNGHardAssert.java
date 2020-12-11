package TestNGPkg;

import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

//@Listeners(TestNGPkg.TestNgListenerIItestL.class)
public class TestNGHardAssert {

	//@Test(retryAnalyzer = TestNGPkg.TestNgRetryAnalyzer.class)
	@Test
	public void hardAssert1()
	{
		System.out.println("start");
		String name = "man";
		
		Assert.assertEquals(name, "sman");
		System.out.println("end");
	}
	
	@Test
	public void softAssert1()
	{
		System.out.println("start");
		String name = "man";
		SoftAssert soft = new SoftAssert();
		soft.assertEquals(true, false);
		
		System.out.println("end");
		soft.assertAll();//if we dont use this stmt means soft assert will show failed cases as pass only
		
	}
}
