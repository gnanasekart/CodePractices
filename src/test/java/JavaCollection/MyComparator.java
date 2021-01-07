package JavaCollection;

import java.util.Comparator;

public class MyComparator implements Comparator {

	@Override
	public int compare(Object obj1, Object obj2) {
//		Employee_Comparable e = (Employee_Comparable)obj1;
//		Employee_Comparable e1 = (Employee_Comparable)obj2;
//
//		String s1 = e.name;
//		String s2 = e1.name;
//
//		return s1.compareTo(s2);
		
		
		String s1 = obj1.toString();
		String s2 = obj2.toString();
		return s2.compareTo(s1);
	}
}
