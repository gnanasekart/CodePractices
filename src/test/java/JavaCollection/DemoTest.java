package JavaCollection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class DemoTest {

	public static void main(String[] args) {
		
	int[] a = {1, 2, 3};
	DemoTest d = new DemoTest();
	System.out.println(d.solution(a));
	}
	
	 public int solution(int[] A) {
	       ArrayList<Object> list = new ArrayList<>();
	       Arrays.sort(A);
	       for(int a: A)
	       {
	    	   list.add(a);
	       }
	       
	       int n = A.length;
	       
	       
		return 0;
	       
	    }
}
