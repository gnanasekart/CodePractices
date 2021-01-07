package ListCollection;

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
		});
		
		//4.1. for each method without println
				System.out.println(".....................without prinln..........................");
				al.forEach(arr -> 	System.out.print(arr+"\r\n"));
				
				System.out.println("..................line separator.............................");
				al.forEach(arr -> 	System.out.print(arr+System.lineSeparator()));

		//5. for each method
		System.out.println("....................for Each Remaining...........................");
		it = al.iterator();
		it.forEachRemaining(arr1 -> {
			System.out.println(arr1);
		});

		//6. ListIterator to print in reverse order
		System.out.println("...............................................");
		ListIterator<String> listIterator = al.listIterator(al.size());
		while(listIterator.hasPrevious()) {
			System.out.println(listIterator.previous());
		}
	}
}