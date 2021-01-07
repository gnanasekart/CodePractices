package JavaCollection;

import java.util.TreeSet;

public class Comp2 {

	
	public static void main(String args[])
	{
		Employee_Comparable e1 = new Employee_Comparable(100, "gnana");
		Employee_Comparable e2 = new Employee_Comparable(1150, "sekar");
		Employee_Comparable e3 = new Employee_Comparable(10, "gowri");
		Employee_Comparable e4 = new Employee_Comparable(433, "math");
		Employee_Comparable e5 = new Employee_Comparable(88, "cell");

	TreeSet t = new TreeSet();
	t.add(e1);
	t.add(e2);
	t.add(e3);
	t.add(e4);
	t.add(e5);
	System.out.println(t);

	TreeSet t1 = new TreeSet(new MyComparator());
	t1.add(e1);
	t1.add(e2);
	t1.add(e3);
	t1.add(e4);
	t1.add(e5);
	System.out.println(t1);
	}
}
