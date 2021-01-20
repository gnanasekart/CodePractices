package javaProgram;

public class DecimalToBinary {

	/*
	156/2 = q-78 r-0
	78/2 = q-36 r-0
	36/2 = q-19 r=1
	19/2 = q-9 r=1
	9/2 = q-4 r=1
	4/2 = q-2 r=0
	2/2       1    0
			1 0 0 1 1 1 0 0
	 */
	public static void main(String[] args) {
		//System.out.println(DtoB(15611));
		System.out.println(DectoOctal(109));
		System.out.println(OctaltoDec(DectoOctal(109)));
	}

	public static long DtoB(int n)
	{
		int i = 1;
		long b = 0;
		while(n != 0 )
		{
			int rem = n%2;
			n = n/2;
			b += rem * i;
			i*=10;
		}
		return b;
	}
	
	public static int DectoOctal(int n)
	{
		int oc = 0;
		int i = 1;
		while(n != 0)
		{
			int r = n%8;
			n = n/8;
			oc += r * i;
			i*=10;
		}
		return oc;
	}

	public static int OctaltoDec(int n)
	{
		int d = 0;
		int i = 0;
		while(n != 0)
		{
			int r = n % 10;
			n = n/10;
			d += r * Math.pow(8, i);
			++i;
		}
		return d;
	}
}
