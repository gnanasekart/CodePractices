package String;

import java.util.ArrayDeque;
import java.util.Deque;

public class Bracket {
	
	static void brackets(String s)
	{
		while(s.contains("()")||s.contains("{}")||s.contains("[]"))
		{
			s = s.replaceAll("\\(\\)", "").replaceAll("\\[\\]", "").replaceAll("\\{\\}", ""); 
			if(s.length() == 0)
			{
				System.out.println("correct format");
			}else
			{
				System.out.println("wrong format = " +s );
			}
		}	
	}

		static boolean areBracketsBalanced(String expr) 
		{ 
			Deque<Character> stack = new ArrayDeque<Character>(); 

			for (int i = 0; i < expr.length(); i++) 
			{ 
				char x = expr.charAt(i); 

				if (x == '(' || x == '[' || x == '{') 
				{ 
					stack.push(x); 
					continue; 
				} 

				// IF current character is not opening 
				// bracket, then it must be closing. So stack 
				// cannot be empty at this point. 
				if (stack.isEmpty()) 
					return false; 
				
				char check; 

				switch (x)
				{ 
				case ')': 
					check = stack.pop(); 
					if (check == '{' || check == '[') 
						return false; 
					break; 

				case '}': 
					check = stack.pop(); 
					if (check == '(' || check == '[') 
						return false; 
					break; 

				case ']': 
					check = stack.pop(); 
					if (check == '(' || check == '{') 
						return false; 
					break; 
				} 
			} 
			return (stack.isEmpty()); 
		} 

		public static void main(String[] args) 
		{ 
			String expr = "([{)}])"; 
			brackets(expr);
			if (areBracketsBalanced(expr)) 
				System.out.println("Balanced "); 
			else
				System.out.println("Not Balanced "); 
		} 
}