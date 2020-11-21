package javaProgram;

public class SwapNumberAndString {

	public static void main(String[] args) {
		int a = 10; 
		int b = 20;
		
		//using temp
		int temp = b;
		b = a;
		a = temp;
		 System.out.println(a+" "+b);

		// without temp
		a = a+b;
		b = a-b;
		a = a-b;
		System.out.println(a+" "+b);
		
		//Swap string
		String aa = "Gnana";
		String bb = "sekar";
		String cc = aa+bb;
		String dd = cc.substring(5)+cc.substring(0, 5);
		System.out.println(dd);
	}
}
