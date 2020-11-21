package String;

public class StringReverse {

	public static void main(String[] args) {
		String name ="gnana sekar";
		//String name = "nitin";//Palindrome
		char[] chname = name.toCharArray();
		String revch = "";
		for(int i = chname.length-1; i>=0; i--)
		{
			revch+=chname[i];
		}
		boolean palindrome = revch.equals(name);
			System.out.println("string "+name+" is palindrome ? "+palindrome);

StringBuilder builder = new StringBuilder(name);
//System.out.println(builder.reverse());
	}

}
