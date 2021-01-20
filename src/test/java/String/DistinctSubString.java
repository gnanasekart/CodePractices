package String;

	// Java program to count all distinct substrings in a string 
	import java.util.HashSet; 
	import java.util.Iterator; 
	import java.util.Set; 

	public class DistinctSubString { 

		public static int distinctSubstring(String str) 
		{ 
			// Put all distinct substring in a HashSet 
			Set<String> result = new HashSet<String>(); 

			// List All Substrings 
			for (int i = 0; i <= str.length(); i++) { 
				for (int j = i + 1; j <= str.length(); j++) { 

					// Add each substring in Set 
					result.add(str.substring(i, j)); 
				} 
			} 

			// Return size of the HashSet 
			return result.size(); 
		} 

		// Driver Code 
		public static void main(String[] args) 
		{ 
//			String str = "abcd"; 
//			System.out.println(distinctSubstring(str)); 
			
			String str1 = "aaaaa"; 
			System.out.println(distinctSubstring(str1)); 
		} 
	} 


