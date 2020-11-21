package javaProgram;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class AnagramCompare {

	public static void main(String[] args) 
	{
		String s = "abab";
		String p = "ab";
		System.out.println(comp(s, p));
				}

public static List<Integer> comp(String s, String p)
{
	int sl = s.toCharArray().length;
	int pl = p.toCharArray().length;
	boolean equals = false;
	List<Integer> arrl = new ArrayList<>();
	
		for(int i =0; i<s.toCharArray().length; i++)
		{
			if(i+pl <= s.toCharArray().length) 
			{
			char[] sleng = s.toLowerCase().substring(i, i+pl).toCharArray();
			char[] pleng = p.toLowerCase().toCharArray();
			Arrays.sort(sleng);
			Arrays.sort(pleng);
			if(sleng.length != pleng.length)
			{
				System.out.println("wrong");
			}
			else
			{
				equals = Arrays.equals(sleng, pleng);
				if(equals == true)
				{
				arrl.add(i);
				}
			}
		}
		}
		pl++;
		return arrl;
}
}
