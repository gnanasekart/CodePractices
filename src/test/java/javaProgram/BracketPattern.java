package javaProgram;

public class BracketPattern {

	public static void main(String[] args) {
		//String s = "([{{}])";
		String s = "{{[[(())]]}}";
		//String s = "()[]{}";
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
}