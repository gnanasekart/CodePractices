package String;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
public class AnagramCompare {

	public static void main(String[] args) 
	{
		String s = "keEp";// "abab";
		String p = "peeK"; //"ab";
		//System.out.println(comp(s, p));
		//arraysSort(s, p);
		//isAnagram(s, p);
		//anagram(s, p);
		mapAnagram(s, p);
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

	public static void arraysSort(String s, String t) {

		String string1 = s.replaceAll("/s", "");
		String string2 = t.replaceAll("/s", "");

		char[] scharArray = string1.toLowerCase().toCharArray();
		char[] tcharArray = string2.toLowerCase().toCharArray();
		Arrays.sort(scharArray);
		Arrays.sort(tcharArray);
		Boolean status = Arrays.equals(scharArray, tcharArray);

		if(status)
		{
			System.out.println("correct string");
		}
		else
		{
			System.out.println("wrong value");
		}
	}

	static void isAnagram(String s1, String s2)
	{//Using Iterative Method
		String copyOfs1 = s1.replaceAll("\\s", "").toLowerCase();
		String copyOfs2 = s2.replaceAll("\\s", "").toLowerCase();
		boolean status = true;

		if(copyOfs1.length() != copyOfs2.length())
		{
			status = false;
		}else
		{
			char[] s1ToArray = copyOfs1.toCharArray();
			for (char c : s1ToArray)
			{
				int index = copyOfs2.indexOf(c); 
				if(index != -1)
				{
					copyOfs2 = copyOfs2.substring(0, index)+copyOfs2.substring(index+1, copyOfs2.length());
				}else{
					status = false; 
					break;
				}
			}
		}
		if(status)
		{
			System.out.println(s1+" and "+s2+" are anagrams");
		}else{
			System.out.println(s1+" and "+s2+" are not anagrams");
		}
	}

	static void anagram(String s1,String s2)
	{
		String copyOfs1 = s1.replaceAll("\\s", "").toLowerCase(); 
		String copyOfs2 = s2.replaceAll("\\s", "").toLowerCase();
		boolean status = true;

		if(copyOfs1.length() != copyOfs2.length())
		{
			status = false;
		}
		else
		{
			char[] s1Array = copyOfs1.toCharArray();
			StringBuilder sb = new StringBuilder(copyOfs2);
			for (char c : s1Array)
			{
				int index = sb.indexOf(""+c);
				if (index != -1)
				{
					sb = sb.deleteCharAt(index);
				}
				else
				{
					status = false; 
					break;
				}
			}
		}
		if(status)
		{
			System.out.println(s1+" and "+s2+" are anagrams");
		}
		else
		{
			System.out.println(s1+" and "+s2+" are not anagrams");
		}	
	}

	static void mapAnagram(String s1, String s2)
	{
		String copyOfs1 = s1.replaceAll("\\s", "").toLowerCase();
		String copyOfs2 = s2.replaceAll("\\s", "").toLowerCase();
		boolean status = true;
		if(copyOfs1.length() != copyOfs2.length())
		{
			status = false;
		}
		else
		{
			HashMap<Character, Integer> map = new HashMap<Character, Integer>();
			for (int i = 0; i < copyOfs1.length(); i++)
			{
				char charAsKey = copyOfs1.charAt(i);
				int charCountAsValue = 0;
				if(map.containsKey(charAsKey))
				{
					charCountAsValue = map.get(charAsKey);
				}
				map.put(charAsKey, ++charCountAsValue);
				charAsKey = copyOfs2.charAt(i);
				charCountAsValue = 0;
				if(map.containsKey(charAsKey))
				{
					charCountAsValue = map.get(charAsKey);
				}
				map.put(charAsKey, --charCountAsValue);
			}
			for (int value : map.values())
			{
				if(value != 0)
				{
					status = false;
				}
			}
		}
		if(status)
		{
			System.out.println(s1+" and "+s2+" are anagrams");
		}
		else
		{
			System.out.println(s1+" and "+s2+" are not anagrams");
		}
	}
}