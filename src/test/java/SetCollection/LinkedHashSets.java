package SetCollection;

import java.util.*;

public class LinkedHashSets extends SetHashSet
{

	public static void main(String[] args)
	{
			String[] name = {"manoj", "kumar", "raj", "kumar", "kumaran", "rajesh", "mano", "kumar"};
			int[] c = {12, 10, 6, 10, 4, 2, 32};
			//no insert order maintain
			LinkedHashSet <Integer> lhs = new LinkedHashSet<>();
			for(int i = 0; i<=c.length-1; i++)
			{
				lhs.add(c[i]);
			}
			System.out.println(lhs);
			
			//add to tree set to arrange in ascending order
			TreeSet<Integer> ts = new TreeSet<>();
			ts.addAll(lhs);
			//System.out.println(ts);
			
			lhs.clear();
			lhs.addAll(ts);			
			//System.out.println(lhs);
			
			List<Integer> list = new ArrayList<>();
			list.addAll(lhs);
			//to sort item in descending order
			Collections.sort(list, Collections.reverseOrder());
			//System.out.println(list);
			
			List<String> lname = new ArrayList<>();
			for(int i=0; i<name.length; i++)
			{
				lname.add(name[i]);
			}
			System.out.println(lname);
	
			Set<String> set = new HashSet<>(lname);
			System.out.println(set);
	}
}
