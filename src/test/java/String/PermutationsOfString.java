package String;

public class PermutationsOfString {
	public static void main(String[] args) 
	{
		StringPermutation("JSP");
	}  

	static public void StringPermutation(String input)
	{
		StringPermutation("", input);
	}

	private static void StringPermutation(String permutation, String input)
	{   
		if(input.length() == 0)
		{
			System.out.println(permutation);
		}
		else
		{
			for (int i = 0; i < input.length(); i++)
			{   
				StringPermutation(permutation+input.charAt(i), input.substring(0, i)+input.substring(i+1, input.length()));
			}
			/*
			 * permutation = “”,  input = “JSP”

				As input.length() != 0

				Control comes to for loop of else block

				for i = 0

				StringPermutation(permutation+input.charAt(i), input.substring(0, i)+input.substring(i+1, input.length()))

				–> StringPermutation(“”+input.charAt(0), input.substring(0, 0)+input.substring(0+1, 3))

				–> StringPermutation(“”+’J’, “”+”SP”)

				–> StringPermutation(“J”, “SP”)

				permutation = “J”,  input = “SP” 
			 * 
			 * 
			 * 
			 */
		}
	} 
}