package javaProgram;

public class ArmStrongNumber {

	public static void main(String[] args) {

		int[] a = {153, 371, 407, 9474, 54748};

		armStrong(a);
		//threeDigit();
	}

	public static void armStrong(int[] a)
	{
		
	for(int j = 0; j<a.length; j++)
	{
		int value = a[j];
		int real = a[j];
		int digits = String.valueOf(value).length();
		int sum = 0;
		while(value != 0)
		{
			int lastvalue = value%10;
			int result = 1;
			for(int i=0; i<digits; i++)
			{
				result = result * lastvalue;
			}
			sum = sum+result;
			value = value/10;
		}
		if(sum == real)
		{
			System.out.println("correct");
		}
		else
		{
			System.out.println("wrong");
		}
	}
	}

	public static void threeDigit()
	{
		int n;
		for(n = 1; n<=1000; n++)
		{
			//int n = 153;
			int ac = n;
			double sum = 0;

			while(ac != 0)
			{
				int num = ac%10;
				sum = sum+ Math.pow(num, 3);
				ac = ac/10;
			}
			if(sum == n)
			{
				System.out.println(sum +" is Arms strong");
			}
			else{
				//System.out.println(sum+" is not arm strong");
			}
		}}
}


/*
 * A number is called an Armstrong number if it is equal to sum of its
 *  digits each raised to the power of number of digits in it. 
 *  For example: 153, 371, 407, 9474, 54748 are some Armstrong numbers.
153 = 13 + 53 + 33 = 1 + 125 + 27 = 153
9474 = 94 + 44 + 74 + 44 = 6561 + 256 + 2401 + 256 = 9474
54748 = 55 + 45 + 75 + 45 + 85 = 3125 + 1024 + 16807 + 1024 + 32768 = 54748
 */
