package javaProgram;

import java.util.Arrays;

import org.testng.Assert;

public class anagram {

	public static void main(String[] args) {

		String s = "anagram";
		String t = "nagaram";
		
		String a = "avajava";
		String b = "javaava";
		
		//method 1:
		String m = b+b;

		if(m.contains(b))
		{
			System.out.println("correct");
		}
		else
		{
			System.out.println("wrong");
		}
		
		//method 2
		
		String string1 = s.replaceAll("/s", "");
		String string2 = t.replaceAll("/s", "");
		
		char[] scharArray = string1.toLowerCase().toCharArray();
		char[] tcharArray = string2.toLowerCase().toCharArray();
		Arrays.sort(scharArray);
		Arrays.sort(tcharArray);
		if(scharArray.length != tcharArray.length)
		{
			System.out.println("wrong string");
		}
		else
		{
			//boolean equals = scharArray.equals(tcharArray);
			boolean equals2 = Arrays.equals(scharArray, tcharArray);
			Assert.assertTrue(equals2);
			System.out.println("Correct value");
		}
		}
}
