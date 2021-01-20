package javaProgram;

import java.util.HashSet;
import java.util.Set;

public class PalindromeSubstring {

	public static void main(String[] args) {
		String ch = "google";
		Set<String> set = new HashSet<>();
		subStringPalindrome(ch, set);
	}
	
	public static void subStringPalindrome(String ch, Set<String> set)
	{
		for(int i=0; i<ch.length(); i++)
		{
			substr(ch, i, i, set);//e, g, l, o
			substr(ch, i, i+1, set);//oo, goog
		}
		System.out.println(set);
	}
	
	public static void substr(String ch, int i, int j, Set<String> set)
	{
		while(i>=0 && j<ch.length() && ch.charAt(i) == ch.charAt(j))
		{
			set.add(ch.substring(i, j+1));
			i--;
			j++;
		}
	}
}