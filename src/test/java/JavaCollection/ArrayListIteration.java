package JavaCollection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.ListIterator;

public class ArrayListIteration {

	public static void main(String[] args) {
		ArrayList<String> al = new ArrayList<>(Arrays.asList("sekar", "Gnana", "gowri", "shankar", "muthu", "kumar"));

		//1. for loop method

		for(int i=0; i<al.size();i++)
		{
			System.out.println(al.get(i));
		}

		//2. iteration method
		System.out.println("...............................................");
		Iterator<String> it = al.iterator();
		while(it.hasNext())
		{
			System.out.println(it.next());
		}

		//3. for each method
		System.out.println("...............................................");
		for(String s: al)
		{
			System.out.println(s);
		}

		//4. for each method
		System.out.println("...............................................");
		al.forEach(arr -> {
			System.out.println(arr);
		}
				);

		//5. for each method
		System.out.println("...............................................");
		it = al.iterator();
		it.forEachRemaining(arr1 -> {
			System.out.println(arr1);
		}
		);
		
		//6. ListIterator to print in reverse order
		System.out.println("...............................................");
		ListIterator<String> listIterator = al.listIterator(al.size());
		while(listIterator.hasPrevious()) {
			System.out.println(listIterator.previous());
		}


	}

}
