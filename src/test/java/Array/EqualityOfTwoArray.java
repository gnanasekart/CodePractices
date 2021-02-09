package Array;

import java.util.Arrays;

public class EqualityOfTwoArray {
	public static void main(String[] args)
    {   
        int[] arrayOne = {2, 5, 1, 7, 4};
        int[] arrayTwo = {2, 5, 1, 7, 4};
        
        String[] s1 = {"java", "j2ee", "struts", "hibernate"};
        String[] s2 = {"jsp", "spring", "jdbc", "hibernate"};
        String[] s3 = {"java", "j2ee", "struts", "hibernate"};
        
        String[][] ss1 = { {"java", "swings", "j2ee" }, { "struts", "jsp", "hibernate"} };
        String[][] ss2 = { {"java", "swings", "j2ee" }, { "struts", "jsp", "hibernate"} };
 
        System.out.println(Arrays.deepEquals(ss1, ss2));     
        System.out.println(Arrays.equals(ss1, ss2));    
        
       // Boolean status = numberArray(arrayOne, arrayTwo);
        Boolean status = arraySort(s1, s2);
        
        if (status){
            System.out.println("Two Arrays Are Equal");
        } else {
            System.out.println("Two Arrays Are Not equal");
        }
    }
	
    public static boolean numberArray(int[] arrayOne, int[] arrayTwo)
    {
        boolean equalOrNot = true;
        if(arrayOne.length == arrayTwo.length)
        {
            for (int i = 0; i < arrayOne.length; i++)
            {
                if(arrayOne[i] != arrayTwo[i])
                {
                    equalOrNot = false;
                } } }
        else{
            equalOrNot = false;
        }
        return equalOrNot;  
    }
    
    public static boolean arraySort(String[] s1, String[] s2)
    {
    	Arrays.sort(s1);
    	Arrays.sort(s2);
    	return Arrays.equals(s1, s2);
    }
}