package javaProgram;

public class Factorialnumber {

	public static void main(String[] args) {
		int fact = 5;
		int num = 1;
		for(int i = 1; i<=fact; i++)
				{
					num = num*i;
				}
		//System.out.println(num);
		//fact(5);
		System.out.println("fact "+recursivefactorial(5));
		System.out.println("fact "+recursivefactorial(-4));
	}
	
	public static void fact(int num)
	{
		int sum = 1;
		for(int i = 1; i<=num; i++)
		{
			sum*=i;
		}
		//System.out.println("in method " +sum);
	}
	
	public static int recursivefactorial(int num)
	{
		if(num >= 1)
		{
			return num * recursivefactorial(num-1);
		}
		else 
		{
		return 1;
	}}
}
