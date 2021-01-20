package javaProgram;

public class SumofNaturalNumbers {

	public static void main(String[] args) {
		
		long start = System.nanoTime();
		int max = 100000;
		int sum = 0;
		for(int i = 1; i<=max; i++)
		{
			sum = sum+i;
		}
		System.out.println(sum);
		System.out.println("total time = "+(System.nanoTime() - start));
		
		long start1 = System.nanoTime();
		int max1 = 100000;
		int sum1 = 0;
		int k = 1;
		while(k<=max1)
		{
			sum1 = sum1 + k;
			k++;
		}
		System.out.println(sum1);
		System.out.println("total time = "+(System.nanoTime() - start1));
	}
}
