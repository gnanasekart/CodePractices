package String;
public class Reverse_String_Preserve_Position 
{
	public static void main(String[] args) 
	{
		String inputString = "I am Gnana Sekar";
		reverseStr(inputString);
	}
	
	public static void reverseStr(String inputString)
	{
		char[] inputstringarray = inputString.toCharArray();
		char[] resultarray = new char[inputstringarray.length];
		for(int i = 0; i < inputstringarray.length; i++)
		{
			if(inputstringarray[i] == ' ')
			{
				resultarray[i] = ' ';
			}
		}
		int j = resultarray.length-1;
		for(int i=0; i<inputstringarray.length; i++)
		{
			if(inputstringarray[i] != ' ')
			{
				if(resultarray[j] == ' ')
				{
					j--;
				}
				resultarray[j] = inputstringarray[i];
				j--;
			}
		}
		System.out.println("--> "+String.valueOf(resultarray));
	}
}