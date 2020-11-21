package javaProgram;

import java.util.Comparator;

public class sortComparator implements Comparator<Integer> {

	public int compare(Integer o1, Integer o2) {
		String a_o1 = o1.toString();
		String a_o2 = o2.toString();
		String a = a_o1+a_o2;
		String b = a_o2+a_o1;
		System.out.println("a- " + a);
		System.out.println("b- " + b);
		return b.compareTo(a);
	}
}
