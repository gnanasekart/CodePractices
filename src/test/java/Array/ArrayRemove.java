package Array;

import java.util.Arrays;

import org.apache.commons.lang.ArrayUtils;

public class ArrayRemove {

	public static void main(String[] args) {
		String[] arrayBeforeRemoval = new String[] {"Zero", "One", "Two", "Three", "Four", "Five", "Six"};
    
		System.out.println(Arrays.toString(arrayBeforeRemoval));
        //Removing an element at index 2
        String[] arrayAfterRemoval = (String[]) ArrayUtils.remove(arrayBeforeRemoval, 2);
        
      //Removing an element "Two" from arrayBeforeRemoval
        Object[] arrayAfterRemoval1 = ArrayUtils.removeElement(arrayBeforeRemoval, "Two");
         
	}

}
