package String;

public class StringReverse {

	public static void main(String[] args) {
		String name ="gnana sekar";
		String name1 = "nitin";//Palindrome
		
		//reverse(name);
		Stringreverse(name);
		recursiveMethod(name);
	}
	
	public static void reverse(String name)
	{
		char[] chname = name.toCharArray();
		String revch = "";
		for(int i = chname.length-1; i>=0; i--)
		{
			revch+=chname[i];
		}
		boolean palindrome = revch.equals(name);
		
		System.out.println("string "+name+" is palindrome ? "+palindrome);
		//List<String> l = new ArrayList<>(Arrays.asList("gnana"));
		
	}
	
	public static void Stringreverse(String name)
	{
		StringBuilder builder = new StringBuilder(name);
		System.out.println("builder - "+builder.reverse());
	}
	
	public static String recursiveMethod(String str)
	{
	     if ((null == str) || (str.length() <= 1))
	     {
	            return str;
	     }
	 String value = recursiveMethod(str.substring(1)) + str.charAt(0);
	 System.out.println(value);
	     return value;
	}
}