package javaProgram;

public class RecursiveNaturalno {

	public static void main(String[] args) 
	{
		System.out.println(rec(5));
	}

	public static int rec(int n)
	{
		if(n != 0)
		{
			return n + rec(n-1);
		}
		else
		{
			return n;
		}
	}
}
