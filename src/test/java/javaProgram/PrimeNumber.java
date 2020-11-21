package javaProgram;

public class PrimeNumber {

	public static void main(String[] args) {
		int num = 14;
		//prime1(num);
		int start = 4;
		int end = 25;
		primebetween2(start, end);
	}
	
	public static void prime1(int n)
	{
		boolean s = false;
		for(int i=2; i<=n/2; i++)  //for(int i=2; i<=Math.sqrt(n); i++)
		{
			if(n%2 == 0)
			{
				s = true;
				break;
			}
		}
			if(s != true)
			{
				System.out.println("prime number");
			}else
			{
				System.out.println("not a prime number");
			}

		}
	
	public static void primebetween2(int start, int end)
	{
		while(start < end)
		{
			boolean f = false;
			for(int i=2; i<=start/2; i++)
			{
				if(start%2 == 0)
				{
					f= true;
					break;
				}
			}
			if(!f)
			{
				System.out.println(start+" prime numbers");
			}
			start++;
		}	
	}
	}

