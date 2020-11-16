package JavaCollection;

import org.testng.annotations.Test;

public class BoolTest {

	@Test(enabled=true)
	public void Bool()
	{
		int result = 0;
		Boolean b1 = new Boolean("TRUE");
		Boolean b2 = new Boolean("true");
		Boolean b3 = new Boolean("TrUe");
		Boolean b4 = new Boolean("tRUE");
		
		if(b1 == b2)
		{
			System.out.println("equals");
		}
		
		if(b1.equals(b2))
		{
			System.out.println("equals1");
		}
		
		if(b2 == b3)
		{
			System.out.println("equals23");
		}
		
		if(b2.equals(b3))
		{
			System.out.println("equals232");
		}
	}
	
	@Test
	public void tomorrow()
	{
		String day = "tomorrow";
		
		String day1 = day.replaceFirst("o", "x");
		//String day1 = day.replaceAll("o", "x");
		String day2 = day1.replaceFirst("o", "xx");
		String day3 = day2.replaceFirst("o", "xxx");
		System.out.println(day3);
	}
}
