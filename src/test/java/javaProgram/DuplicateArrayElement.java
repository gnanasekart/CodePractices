package javaProgram;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class DuplicateArrayElement {

	public static void main(String[] args) {

		String[] lang = {"javascript", "java", "C", "R", "JS", "C", "java"};

		//1. for loop method
		for(int i=0; i<lang.length; i++)
		{
			for(int j=i+1; j<lang.length; j++)
			{
				if(lang[i].equals(lang[j]))
				{
					System.out.println("duplicate element "+lang[i]);
				}
			}
		}

		//2. Hashset concept
		Set<String> hashSet = new HashSet<>();
		for (String set: lang)
		{
			if(hashSet.add(set) == false)
			{
				System.out.println("duplicate element is "+set);
			}
		}

		//3. HashMap concept
		Map<String,Integer> hashMap = new HashMap<String,Integer>();

		for(String l: lang)
		{
			Integer count = hashMap.get(l);
			if(count == null)
			{
				hashMap.put(l, 1);
			}else
			{
				hashMap.put(l, ++count);
			}
		}

		System.out.println(hashMap);
		Set<Entry<String,Integer>> entrySet = hashMap.entrySet();
		for(Entry<String,Integer> es: entrySet)
		{
			if(es.getValue() > 1)
			{
				System.out.println("duplicate element is "+es.getKey());
			}
		}
	}
}