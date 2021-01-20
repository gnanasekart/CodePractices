package String;

public class Word_Reverse {

	public static void main(String[] args) {
		String words = "My name is gnana sekar";
		wordReverse(words);
		wordReverseSB(words);
	}
	
	public static void wordReverse(String words)
	{//using char array
		String[] word = words.split(" ");
		String reversewords = "";
		for(int i=0; i < word.length; i++)
		{
			String w = word[i];
			String wr = "";
			for(int j = w.length()-1; j>=0; j--)
			{
				wr = wr+w.charAt(j);
			}
			reversewords = reversewords + wr + " ";
		}
		System.out.println(words);
		System.out.println(reversewords);
	}
	
	public static void wordReverseSB(String words)
	{//using stringbuffer reverse method
		String[] word = words.split(" ");
		String reversewords = "";
		for(int i=0; i < word.length; i++)
		{
			String w = word[i];
			String wr = "";
			StringBuffer sbw = new StringBuffer();
			sbw.append(w);
			wr = wr+sbw.reverse();
			reversewords = reversewords + wr + " ";
		}
		System.out.println(words);
		System.out.println(reversewords);
	}
}