package javaProgram;

public class Power {

	public static void main(String[] args) {
		
		//x power zero = 1
		int baseint = 2;
		int basepow = 4;
		int sum =1;
		for(int i = 0; i<basepow; i++)
		{
			sum = sum * baseint;
		}
		System.out.println(sum);
		
		//.....................................
		
		while(basepow != 0)
		{
			sum*=baseint;
			--basepow;
		}
		System.out.println(sum);
		
		//.................................
		double pow = Math.pow(baseint, basepow);
		System.out.println("power - "+pow);
	}

}
