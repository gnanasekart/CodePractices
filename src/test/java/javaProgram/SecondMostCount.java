package javaProgram;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class SecondMostCount {

	public static void main(String[] args) {
		String txt = "welcome to";
		char[] t = txt.toLowerCase().toCharArray();
		int i=0;
		Map<Character, Integer> map = new LinkedHashMap<>();

		while(i != t.length)
		{
			if(map.containsKey(t[i])==false)
			{
				map.put(t[i], 1);
			}
			else
			{
				int old = map.get(t[i]);
				map.put(t[i], old+1);
			}
			++i;
		}

		Set<Entry<Character, Integer>> entrySet = map.entrySet();
		char k=' ';
		int v=0;
		int secondv=0;
		char secondc=k;
		for(Entry<Character, Integer> es : entrySet)
		{
			if(es.getValue() > v)
			{
				v = es.getValue();
				k = es.getKey();
			}
		}

		for(Entry<Character, Integer> sec : entrySet)
		{
			int vs = v-1;
			if(sec.getValue().equals(vs))
			{
				secondv = sec.getValue();
				secondc = sec.getKey();
			}
		}

		System.out.println("first large count is : "+k+" = "+v);
		System.out.println("Second large count is  : "+secondv+" = "+secondc);














		/*
		String text = "Welcome to TestLEaf";

		char[] t = text.toLowerCase().replaceAll("[^a-z]", "").toCharArray();
		Map<Character, Integer> ch = new HashMap<>();
		int count =0;
		int j = 0;
		int i=0;
		for(j=0; j<t.length; ) 
		{
		if(t[j] == t[i+1])
		{
			++count; 
			ch.put(t[j], count);
			System.out.println(ch);
		}
		++i;
		}
		j++;

		Map<Integer, Character> ch = new HashMap<>();
		for(int i=0; i< t.length; i++)
		{
		ch.put(i+1, t[i]);
		}
		System.out.println(ch);
		Set<Entry<Integer, Character>> entrySet = ch.entrySet();

		for(Entry<Integer, Character> e: entrySet)
		{
			System.out.println(e.getKey()+" "+e.getValue());
		}
		 */

	}

}
