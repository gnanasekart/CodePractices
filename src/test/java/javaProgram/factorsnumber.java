package javaProgram;

import java.util.stream.IntStream;

public class factorsnumber {

	public static void main(String[] args) {
		int n = 60;
		fact1(n);

	}

	public static void fact1(int n)
	{
		for(int i = 1; i<=n; i++)
		{
			if(n%i == 0)
			{
				System.out.println(i+" ");
			}
		}
	}
}
