package javaProgram;
public class BinaryToDecimal {
	/*
	 * 1 0 0 1 1 0 1 1  
	2^0*1 =   1
	2^1*1 =   2
	2^2*0 =   0  
	2^3*1 =   8 
	2^4*1 =  16 
	2^5*0 =   0 
	2^6*0 =   0 
	2^7*1 = 128
	------------
	 * 
	 */

	public static void main(String[] args) {
		long num = 10011011;
		System.out.println(BtoD(num));
	}
	public static int BtoD(long num)
	{
		int i = 0;
		int sum =0;
		while(num != 0) 
		{
			long n = num % 10;
			num = num / 10;
			sum += (n * (Math.pow(2, i)));
			++i;
		}
		return sum;
	}
}