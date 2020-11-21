package javaProgram;

import java.util.Arrays;

import org.testng.annotations.Test;

public class FibonacciSeries {


	@Test(enabled = false)
	public void UsingForLoop()
	{
		int n = 10;
		int t1 = 0;
		int t2 = 1;
		for(int i = 1; i<=n; i++)
		{
			System.out.print(t1 +" ");
			int sum = t1 + t2;
			t1 = t2;
			t2 = sum;
		}
	}

	@Test(enabled = false)
	public void UsingWhile()
	{
		int n = 10;
		int t = 1;
		int t1 = 0;
		int t2 = 1;
		while(t <= n)
		{
			System.out.print(t1 +" ");
			int sum = t1 + t2;
			t1 = t2;
			t2 = sum;
			t++;
		}
	}

	@Test(enabled = false)
	public void UsingRecursion()
	{
		int n = 10;
		for(int i = 0; i<=n; i++) {
			System.out.print(fibrec(i)+ " ");
		}
	}
	public static int fibrec(int n)
	{
		if(n == 0) 
		{
			return 0;
		}
		else if(n == 1 || n == 2) 
		{
			return 1;
		}
		return fibrec(n-2)+fibrec(n-1);
	}

	@Test
	public void UsingArray()
	{
		int[] arr = new int[100];
		arr[0] = 0;
		arr[1] = 1;
		for(int i = 2; i<=arr.length-1; i++)
		{
			arr[i] = arr[i-2] + arr[i-1];	
		}
		System.out.println(Arrays.toString(arr));
	}
}
