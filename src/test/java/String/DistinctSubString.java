package String;

	import java.util.HashSet;
import java.util.Set; 

	public class DistinctSubString { 

		public static int distinctSubstring(String str) 
		{ 
			Set<String> result = new HashSet<String>(); 
			for (int i = 0; i <= str.length(); i++) 
			{ 
				for (int j = i + 1; j <= str.length(); j++) 
				{ 
					result.add(str.substring(i, j)); 
				} 
			} 
			return result.size(); 
		} 

		public static void main(String[] args) 
		{ 
		String str = "abcd"; 
			System.out.println(distinctSubstring(str)); 
			
//			String str1 = "aaaaa"; 
//			System.out.println(distinctSubstring(str1)); 
		} 
	} 