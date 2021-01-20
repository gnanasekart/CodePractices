package String;

import java.util.HashMap;

public class Repeated_NonRepeated {

	public static void main(String[] args) {
		String str = "gnana sekar";
		repeatedAndNonRepeatedChar(str);

	}

	public static void repeatedAndNonRepeatedChar(String str)
	{
		HashMap<Character, Integer> map = new HashMap<>();
		char[]ch = str.toCharArray();
		for(Character c : ch)
		{
			if(map.containsKey(c))
			{
				map.put(c, map.get(c)+1);
			}
			else 
			{
				map.put(c, 1);
			}
		}

		for(char c:ch)
		{
			if(map.get(c) == 1)
			{
				System.out.println("first non-repeat char "+c);
				
			}
			else if(map.get(c) >= 1)
			{
				System.out.println("first repeat char "+c);
				break;
			}
		}

	}

}
