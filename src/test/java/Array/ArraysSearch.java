package Array;

import java.util.Arrays;

public class ArraysSearch {

	public static void main(String[] args) {
		
	int[] a = {10, 5, 20, 11, 6};
	
	Arrays.sort(a);
	System.out.println(Arrays.binarySearch(a,6));//1
	System.out.println(Arrays.binarySearch(a,14));//-5

	String[] s = {"A", "C", "Z", "B"};
	
	Arrays.sort(s);
	System.out.println(Arrays.binarySearch(s,"Z"));//2
	System.out.println(Arrays.binarySearch(s,"S"));//-3

	Arrays.sort(s, new MyComparator());
	System.out.println(Arrays.binarySearch(s, "Z", new MyComparator()));//0
	System.out.println(Arrays.binarySearch(s, "S", new MyComparator()));//-2
	System.out.println(Arrays.binarySearch(s, "N")); //unpredictable
	
	
	String[] d = {"A", "aai", "hrllo"};
	Arrays.sort(d);
	System.out.println(Arrays.binarySearch(d,"Z"));
	System.out.println(Arrays.binarySearch(d,"S"));	
	}
}