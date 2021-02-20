package Array;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.stream.Collectors;

public class DuplicateArrayElement {

	public static void main(String[] args) {

		String[] lang = {"javascript", "java", "C", "R", "JS", "C", "java"};
//		forLop(lang);
//		forLoop(lang);
//		hashSet(lang);
//		//hashSetJava8(lang);
//		hashMap(lang);
		int[] number = new int[] {15, 21, 11, 21, 51, 21, 11};
		removeDuplicates(number);
	}
	
	public static void removeDuplicates(int[] number) {
		HashSet<Integer> hashSet = new HashSet<>();
		for(int i=0; i < number.length; i++)
		{
			hashSet.add(number[i]);
		}
		Object[] array = hashSet.toArray();
		for(Object arr:array) {
			System.out.println(arr);
		}
		hashSet.forEach(a -> System.out.print(a));
	}
		
	//1. for loop method
	public static void forLoop(String[] lang) {
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
	}

	public static void forLop(String[] lang) {
		Arrays.sort(lang);
		for(int i=0; i<lang.length; i++)
		{
			if(lang[i].equals(lang[i+1]))
			{
				System.out.println("duplicate element "+lang[i]);
			}
		}
	}

	//2. Hashset concept
	public static void hashSet(String[] lang) {
		Set<String> hashSet = new HashSet<>();
		for (String set: lang)
		{
			if(!hashSet.add(set))//(hashSet.add(set) == false)//
			{
				System.out.println("duplicate element is "+set);
			}
		}
	}

	//	public static void hashSetJava8(String[] lang) 
	//	{   
	//	    Set<Integer> uniqueElements = new HashSet<>();
	//	    Set<Integer> duplicateElements =  Arrays.stream(lang)
	//	                                            .filter(i -> !uniqueElements.add(i))
	//	                                            .boxed()
	//	                                            .collect(Collectors.toSet());
	//	    System.out.println(duplicateElements);
	//	}
	//3. HashMap concept

	public static void hashMap(String[] lang) 
	{
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