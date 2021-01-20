package SetCollection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.TreeSet;
import java.util.stream.Collectors;

public class RemoveDuplicate {

	public static void main(String[] args) {
		
		//using LinkedHashSet - by default in set it will remove duplicate
		ArrayList<Integer> number = new ArrayList<Integer>(Arrays.asList(1, 2, 3, 2, 5, 6, 7, 4, 5,10, 1, 6, 7, 5, 8));
		
		LinkedHashSet<Integer> lhs = new LinkedHashSet<Integer>(number);
		TreeSet<Integer> ts = new TreeSet<Integer>(number);
		ArrayList<Integer> numbe = new ArrayList<Integer>(lhs);
		ArrayList<Integer> numb = new ArrayList<Integer>(ts);
		
		Collections.sort(number);
		System.out.println(number);
		System.out.println(numb); //--> removed duplicate and ordered
		System.out.println(numbe);//removed only duplicate
		
		
		//By using stream methods
		ArrayList<Integer> numbers = new ArrayList<Integer>(Arrays.asList(1, 2, 3, 2, 5, 6, 7, 4, 5,11, 12, 1,1, 6, 7, 5, 8));
		
//		List<Integer> collect = numbers.stream().distinct().collect(Collectors.toList());
	//	System.out.println(collect);
		
		//to compare two list and find the odd one out
		//number.removeAll(numbers);//-->missing number from 'number'
		
//		numbers.removeAll(number);//-> missing number from 'numbers'
				
		//to find the common elements
		number.retainAll(numbers);
		
		System.out.println(number);
		
		
	}

}
