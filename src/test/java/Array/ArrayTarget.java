package Array;

import org.testng.annotations.Test;

public class ArrayTarget {
	static int target = 9;
	static int[] arr = {2, 7, 11, 15};
	
	@Test
	public static void method1() 
	{
		long start = System.currentTimeMillis();
		{	
			for(int i = 0; i < arr.length; i++)
			{
				for (int j = 1; j < arr.length; j++) 
				{
					if(arr[i]+arr[j]==target)
					{
						System.out.println("["+i+","+j+"]");
					}		
				}
			}
		}
		long end = System.currentTimeMillis();
		System.out.println("total time method 1: "+(start)+"ms");
		System.out.println("total time method 1: "+(end)+"ms");
	}

	@Test
	public static void method2()
	{
		long starts = System.currentTimeMillis();
		for(int i = 0; i < arr.length; i++)
		{
			int value = target - arr[i];
			for (int j = i+1; j < arr.length; j++) 
			{ 
				if(arr[j]==value)
				{
					System.out.println("["+i+","+j+"]");
				}
			}
		}
		long ends = System.currentTimeMillis();
		System.out.println("total time method2: "+(starts)+"ms");
		System.out.println("total time method2: "+(ends)+"ms");
	}	
}