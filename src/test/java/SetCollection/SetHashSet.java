package SetCollection;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetHashSet {
	public static void main(String[] args)
	    { int[] c = {12, 3, 12, 5, 10, 9, 10, 5};
		//insert by loop
	    Set<Integer> set = new HashSet<Integer>();
		for(int i = 0; i<=c.length-1; i++)
		{
			set.add(c[i]);
		}
		//insert individually 
//		set.add(3);
//		set.add(7);
//		set.add(2);
//		set.add(10);
//		set.add(13);
		
		System.out.println(set);
		
		Set<Integer> treeset = new TreeSet<>();
		for(int i = 0; i<=c.length-1; i++)
		{
			treeset.add(c[i]);
		}
		System.out.println(treeset);
		
		TreeSet <Integer> ts = new TreeSet<>();
		for(int i = 0; i<=c.length-1; i++)
		{
			ts.add(c[i]);
		}
		System.out.println(ts);
	}
}