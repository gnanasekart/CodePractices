package Array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class ArrayConversion {

	public static void main(String[] args) {
		String[] array = new String[] {"ANDROID", "JSP", "JAVA", "STRUTS", "HADOOP", "JSF"};
        
		//Array To ArrayList
        ArrayList<String> list1 = new ArrayList<String>();
         list1.addAll(Arrays.asList(array));
             
        Collections.addAll(list1, array);
        
        //stream
        List<Object> list = Arrays.stream(array).collect(Collectors.toList());
     
        //arraylist to array
        String[] arr = new String[list.size()]; 
        list.toArray(array);
        for (String string : array)
        {
            System.out.println(string);
        }
        
	}

}
