package Array;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class TwoArrayCommonElement {

	public static void main(String[] args) {

		Integer[] i1 = {1, 2, 3, 4, 5, 4};
        Integer[] i2 = {3, 4, 5, 6, 7, 4};
        
        String[] s1 = {"ONE", "TWO", "THREE", "FOUR", "FIVE", "FOUR"};        
        String[] s2 = {"THREE", "FOUR", "FIVE", "SIX", "SEVEN", "FOUR"};
 
        retain(s1, s2);
        retainnum(i1, i2);
	}
	
	public static void retain(String[] s1, String[] s2)
	{
		Set<String> hashSet1 = new HashSet<>(Arrays.asList(s1));
		Set<String> hashSet2 = new HashSet<>(Arrays.asList(s2));
		hashSet1.retainAll(hashSet2);
		System.out.println(hashSet1);
	}
	
	public static void retainnum(Integer[] i1, Integer[] i2)
	{
		HashSet<Integer> set = new HashSet<>();
		for(int i=0; i<i1.length; i++)
		{
			for(int j=0; j<i2.length; j++)
			{
				if(i1[i].equals(i2[j]))
				{
					set.add(i1[i]);
				}
			}
		}
		System.out.println(set);
	}
}