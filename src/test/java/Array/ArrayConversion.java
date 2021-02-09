package Array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class ArrayConversion {

	public static void main(String[] args) {
		String[] array = new String[] {"ANDROID", "JSP", "JAVA", "STRUTS", "HADOOP", "JSF"};
		System.out.println(array);
		System.out.println("--------");
		//Array To ArrayList
        ArrayList<String> list1 = new ArrayList<String>();
         list1.addAll(Arrays.asList(array));
         System.out.println(list1);
 		System.out.println("--------");
        Collections.addAll(list1, array);
        System.out.println(list1);
		System.out.println("--------");
        //stream
        List<Object> list = Arrays.stream(array).collect(Collectors.toList());
     
        //arraylist to array
        String[] arr = new String[list.size()]; 
        list.toArray(array);
        for (String string : array)
        {
          //  System.out.println(string);
        }   
	}
}