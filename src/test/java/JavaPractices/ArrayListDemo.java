package JavaPractices;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
public class ArrayListDemo {

	public static void main(String[] args) {
		ArrayList<Object> arr = new ArrayList<Object>();
		arr.add(1);
		arr.add(2);
		arr.add(1);
		arr.add(3);
		arr.add(1);
		arr.add(4);
		arr.add(1);
		arr.add(5);
		
//		System.out.println(arr.size());
//		System.out.println(arr);
	ArrayList<Integer> num = new ArrayList<Integer>(Arrays.asList(1,2,3,4,5,6,7,8,9,10));
	//num.removeIf(num -> num % 2 == 0);
	//System.out.println(num);
	
	
	ArrayList<String> name = new ArrayList<String>(Arrays.asList("gnana", "sekar", "gnana", "shankar", "raj", "swamy"));
	name.retainAll(Collections.singleton("gnana"));
	System.out.println(name);
	//output -> [gnana, gnana]
	
	ArrayList<Integer> numb = new ArrayList<Integer>(num.subList(2, 7));
	System.out.println(numb);
	//output -> [3,4,5,6,7]
	
	/*
	ArrayList<String> names = new ArrayList<String>(Arrays.asList("gnana", "sekar", "raj", "swamy"));
	Object arra = names.toArray();
	Arrays.toString(arra);
	
	for(Object o: arra)
	{
		System.out.println(o);
	}
	*/
	}
	
	

}
