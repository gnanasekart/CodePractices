package javaProgram;

public class ArmStrongNumber {

	public static void main(String[] args) {
		
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

