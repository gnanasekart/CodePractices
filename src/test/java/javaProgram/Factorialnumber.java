package javaProgram;

public class Factorialnumber {

	public static void main(String[] args) {
		int fact = 5;
		int num = 1;
		for(int i = 1; i<=fact; i++)
				{
					num = num*i;
				}
		System.out.println(num);
		fact(5);
	}
	
	public static void fact(int num)
	{
		int sum = 1;
		for(int i = 1; i<=num; i++)
		{
			sum*=i;
		}
		System.out.println("in method " +sum);
	}
}
