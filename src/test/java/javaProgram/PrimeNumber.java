package javaProgram;

public class PrimeNumber {

	public static void main(String[] args) {
		int num = 14;
		//prime1(num);
		int start = 4;
		int end = 25;
		//primebetween2(start, end);
		primecheck(13);
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

	public static void primecheck(int n)
	{ 
		int i = 2;
		if(n == 1)
		{
			System.out.println("not prime");
		}
		else if(i<=n/2 && n%i == 0)
		{
			System.out.println("not prime");
		}
		else
		{
			System.out.println("prime only");
		}
		++i;
	}

	public static void hundredPrimeNumber()
	{		
		int i =0;
		int num =0;
		String  primeNumbers = "";
		for (i = 1; i <= 100; i++)         
		{ 		  	  
			int counter=0; 	  
			for(num =i; num>=1; num--)
			{
				if(i%num==0)
				{
					counter = counter + 1;
				}
			}
			if (counter ==2)
			{
				primeNumbers = primeNumbers + i + " ";
			}	
		}	
		System.out.println("Prime numbers from 1 to 100 are :");
		System.out.println(primeNumbers);
	}
}