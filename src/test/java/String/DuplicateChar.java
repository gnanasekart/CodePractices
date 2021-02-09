package String;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class DuplicateChar 
{ 
	public static void main(String args[]) 
	{   
      // charOccurance("India is my acountry");  
       numberOccurance(new int[] {2, 5, 2, 7, 9, 1, 3, 6, 2, 8, 1, 9});
    } 
	
	    public static void charOccurance(String str) 
	    {  
	        Map<Character, Integer> baseMap = new HashMap<Character, Integer>();  
	        char[] charArray = str.toCharArray();  
	        for (Character ch : charArray) 
	        {  
	            if (baseMap.containsKey(ch))
	            {  
	                baseMap.put(ch, baseMap.get(ch) + 1);  
	            } else 
	            {  
	                baseMap.put(ch, 1);  
	            }
	        }
	        Set<Character> keys = baseMap.keySet();  
	        for (Character ch : keys)
	        {  
	            if (baseMap.get(ch) > 1) 
	            	//if we pass (baseMap.get(ch) >= 1) means we can get which char occur no of time
	            {  
	                System.out.println(ch + "  is " + baseMap.get(ch) + " times");  
	            }  
	        }  
	    }  
	    
	    public static void numberOccurance(int[] arrayInt) 
	    {  
	        Map<Integer, Integer> baseMap = new HashMap<Integer, Integer>();  
	        for (int ch : arrayInt) {  
	            if (baseMap.containsKey(ch)){  
	                baseMap.put(ch, baseMap.get(ch) + 1);  
	            } else {  
	                baseMap.put(ch, 1);  
	            }
	        }
	        Set<Integer> keys = baseMap.keySet();  
	        for (int ch : keys){  
	            if (baseMap.get(ch) >= 1) 
	            	//if we pass (baseMap.get(ch) >= 1) means we can get which char occur no of time
	            {  
	                System.out.println(ch + "  is " + baseMap.get(ch) + " times");  
	            }  
	        }  
	    }     
	}  