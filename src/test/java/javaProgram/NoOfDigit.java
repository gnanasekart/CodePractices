package javaProgram;

public class NoOfDigit {

	public static void main(String[] args) {
		//no of digit in integer
		
	int num = 1234567;
		int count = 0;
		while(num != 0)
		{
			num = num/10;
			++count;
		}
		System.out.println(count);
		
		String string = Integer.toString(num);
		int charArray = string.toCharArray().length;
		System.out.println(charArray);

	}

}
