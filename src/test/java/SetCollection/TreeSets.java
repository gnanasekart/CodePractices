package SetCollection;
import java.util.*;
public class TreeSets {

	public static void main(String[] args) {
		Long start = System.currentTimeMillis();
					
		TreeSet<String> ts = new TreeSet<>();
		
		//String[] name = {"manoj", "kumar", "gnana", "kumar", "a", "v", "f", "r", "d", "f"};
		
		ts.add("A");
		ts.add("B");
		ts.add("C");
		ts.add("D");
		ts.add("E");
		
		System.out.println("headset :"+ts.headSet("C", true));
	
		System.out.println("headset :"+ts.headSet("C", false));
		
		System.out.println("subset :"+ts.subSet("B", true, "E", false));
		
		System.out.println("tail :"+ts.tailSet("B", false));
		
		
		
//		System.out.println(ts.pollFirst());
		
		
		/*/Using iterator for ascending and descending
		Iterator i = ts.iterator();
		Iterator i = ts.descendingIterator();
		while(i.hasNext())
		{
			System.out.println(i.next());
		}
		//Using for loop	
		for(int i = 0; i<name.length; i++)
		{
			ts.add(name[i]);
		}
		System.out.println(ts);
		*/	
	
		
		/*
		TreeSet<Integer> set = new TreeSet<>();
		int[] c = {1, 5, 7,33, 88, 55, 25, 95, 22};
		for(int i = 0; i<c.length; i++)
		{
			set.add(c[i]);
		}
		System.out.println(set);
		System.out.println("Takes the first item in the list :"+set.pollFirst());
		System.out.println("Takes the first item in the list :"+set.pollFirst());
		System.out.println("pulls the last item in the list :"+set.pollLast());
		System.out.println(set);
		*/
		
		Long end = System.currentTimeMillis();
		System.out.println("Time is " +(end-start));
	}
}