package String;

public class StringCapitalizeWord {

	public static void main(String[] args) {
		String name = "my name is gnana";
		
		String[] words = name.split("\\s");
		String captial = "";
		for(String s :words)
		{
			String firstletter = s.substring(0, 1);
			String second = s.substring(1);
			captial+=firstletter.toUpperCase()+second+" ";
		}
System.out.println(captial);
	}
}