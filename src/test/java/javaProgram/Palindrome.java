package javaProgram;

import org.testng.annotations.Test;

public class Palindrome {

	@Test(enabled = false)
	public void palindromeNumber(){
		int num = 809889921;
		int r=0;
		while(num!=0)
		{
			int n= num%10;
			num = num/10;
			r= r * 10 + n;
		}
		System.out.println(r);
		if(r == num)
		{
			System.out.println("this is palindrome");
		}else
		{
			System.out.println("This is not palindrome");
		}
	}
	//.................................................	
	@Test(enabled = false)
	public void PalindromeString() {
		String name = "gnana";
		call(name);
	}
	
	public static boolean call(String name)
	{
		char[] charArray = name.toCharArray();
		int l = charArray.length;
		int i = 0;

		if(charArray[0] == 0 || charArray[1] == 1)
		{
			return true;
		}
		if(charArray[i] == charArray[l-1])
		{
			++i;
			--l;
		}	
		return false;
	}
}