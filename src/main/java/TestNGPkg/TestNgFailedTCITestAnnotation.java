package TestNGPkg;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

import org.testng.IAnnotationTransformer;
import org.testng.annotations.ITestAnnotation;

public class TestNgFailedTCITestAnnotation implements IAnnotationTransformer{

	public void transform(ITestAnnotation annotation, Class testclass, Constructor testcons, Method testmethod)
	{
		annotation.setRetryAnalyzer(TestNgRetryAnalyzer.class);
	}
}
