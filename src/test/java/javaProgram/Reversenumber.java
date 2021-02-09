package javaProgram;

public class Reversenumber {

	public static void main(String[] args) {
		int num = 1234567;
		
		while(num != 0 ) {
		int n = num%10;
		num = num/10;
		System.out.print(n);}
		//...........................
	
		int r = 0;
		while(num!=0)
		{
			int n = num%10;
			num = num/10;
			r = r*10+n;
		}
		System.out.println(r);
		
		//...........................
		
		char[] charArray = String.valueOf(num).toCharArray();
		for(int i=charArray.length-1; i>=0; i--)
		{
			System.out.print(charArray[i]);
		}
	}
}