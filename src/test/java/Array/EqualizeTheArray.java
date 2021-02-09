package Array;

import java.util.Scanner;

public class EqualizeTheArray 
{
	public static void main(String[] args) 
	{
		Scanner in = new Scanner(System.in);
		System.out.println("enter the size");
		int n = in.nextInt();
		int[] arr = new int[n];
		System.out.println("enter input based on size");
		for(int arr_i = 0; arr_i < n; arr_i++)
		{
			arr[arr_i] = in.nextInt();
		}
		int result = equalizeArray(arr);
		System.out.println(result);
		in.close();
	}

	static int equalizeArray(int[] arr) 
	{
		int cache[] = new int[100];
		for (int i = 0; i < arr.length; i++) 
		{
			cache[arr[i] - 1]++; 
		}
		int max = 0;
		for (int i = 0; i < cache.length; i++) 
		{
			max = Math.max(max, cache[i]);
		}
		return arr.length - max;
	}
}