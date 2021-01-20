package javaProgram;

public class ContinuousSubArray {

	public static void main(String[] args) 
	{
		int arr1[] = {1,1,1};
		int arr[] = {-5, 4, -2, 16, 8, 9};
		int i ;
		int j ;
		int k = 15;
		for(i=0; i<=arr.length-1; i++)
		{
			for(j = 1; j<arr.length;j++)
			{
				if((arr[i]+arr[j]) == k)
				{
					System.out.println("arr["+i+"] and arr["+j+"]");
				}
				else if(arr[i] == k)
				{
					System.out.println("arr["+i+"]");
				}
				else if(arr[j] == k)
				{
					System.out.println("arr["+j+"]");
				}
			}
		}
	}
}