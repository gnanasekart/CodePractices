package javaProgram;

public class AdditionOfTwoPrime {

	public static void main(String[] args) {
		int n = 34;
		Boolean flags = false;

		for(int i =2; i<=n/2; i++)
		{
			if(isPrime(i) && isPrime(n-i))
			{
				System.out.println(n+" = "+i+" + "+(n-i));
				flags = true;
			}
		}

		if(!flags)
		{
			System.out.println("it is nothing");
		}
	}

	public static boolean isPrime(int n)
	{
		Boolean flag = true;
		for(int i =2; i<=n/2; i++)
		{
			if(n%i == 0)
			{
				flag = false;
				break;
			}
		}
		return flag;
	}
}
