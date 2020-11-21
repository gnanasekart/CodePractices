package javaProgram;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class IntToString {

	public static void main(String[] args) {
		List<Integer> numList = new ArrayList<Integer>();
		numList.addAll(Arrays.asList(10, 2));
		Collections.sort(numList, new sortComparator());
		for(Integer i : numList){
			System.out.print(i); 
		}
	}
}