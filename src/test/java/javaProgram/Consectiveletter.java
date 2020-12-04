package javaProgram;

public class Consectiveletter {

	public static void main(String[] args) {
		String txt = "Amazon is a great  AtoooZzz companyz as it hass";
		String trim = txt.replaceAll("[^a-zA-Z]", "").trim();
		int top = 0;
		int count = 0;
		char charAt = 0 ;
		/*while(i < l-2)
		{
			if(trim.substring(i, i+1).equals(trim.substring(i+1, i+2)))
			{
				count=count+1;
				if(count > top)
				{
				top = count;
				charAt = trim.charAt(i);
				}
			}	++i;			
		}
		System.out.println(count+" - "+charAt);
*/		
		for(int i = 0; i<trim.length()-2; i++)
		{
			int ch1 = trim.charAt(i);
			int ch2 = trim.charAt(i+1);
			if(trim.charAt(i) == trim.charAt(i+1) && trim.charAt(i) == trim.charAt(i+2) && trim.charAt(i+1) == trim.charAt(i+2))
			{
				count = 2;
				if(count > top)
				{
				top = count;
				++count;
				charAt = trim.charAt(i);
				}
			}
		}
		System.out.println(count+" - "+charAt);
	}
}
