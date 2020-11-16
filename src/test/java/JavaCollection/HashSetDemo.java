package JavaCollection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class HashSetDemo {

	public static void main(String[] args) {
	
		Set<Integer> first = new HashSet<>(Arrays.asList(new Integer[] {1, 2, 5, 6, 9, 10, 8}));

		Set<Integer> second = new HashSet<>(Arrays.asList(new Integer[] {1, 2, 17, 3, 4, 5, 7, 6, 9, 10}));
		
		Set<Integer> third = new HashSet<>(first);
		third.addAll(Arrays.asList(new Integer[] {3, 6, 8, 0, 9, 11}));
		System.out.println("first and third = "+third);
		System.out.println("----------------------");
		
		Set<Integer> finalset = new HashSet<>(third);
		System.out.println("finalset and third with first = "+finalset);
		System.out.println("----------------------");
		
		finalset.addAll(second);		
		System.out.println("Union = "+finalset);
		System.out.println("----------------------");
		
		
		finalset.retainAll(second);		
		System.out.println("retain by intersection value = "+finalset);
		System.out.println("----------------------");
		
		Set<Integer> diff = new HashSet<>(third);
		diff.removeAll(second);		
		System.out.println("different = "+diff);
		System.out.println("----------------------");
	}

}
