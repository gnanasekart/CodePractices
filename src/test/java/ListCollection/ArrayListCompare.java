package ListCollection;

import java.util.ArrayList;
public class ArrayListCompare 
{

	public static void main(String[] args) 
	{
	ArrayList<String> list = new ArrayList<>();
	
	list.add("one");
	list.add("two");
	list.add("three");
	list.add("four");
	list.add("nine");

	ArrayList<String> list1 = new ArrayList<>();
	
	list1.add("one");
	list1.add("four");
	list1.add("three");
	list1.add("two");
	list1.add("six");
	
	//if two list are in same order means it will compare
	System.out.println(list.equals(list1));
	
	//it will remove all the element from list 2
	//list1.removeAll(list);
	System.out.println(list1);
	}
}