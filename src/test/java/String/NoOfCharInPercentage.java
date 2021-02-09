package String;

import java.text.DecimalFormat;

public class NoOfCharInPercentage {

	public static void main(String[] args) {
		String in = "This text contain 10% in - character and remaining 90% in - text";
		
		int leng = in.length();
		int uppercase = 0;
		int lowercase = 0;
		int number = 0;
		int others = 0;
		
		for(int i=0; i<leng-1; i++)
		{
			char ch = in.charAt(i);
		if(Character.isUpperCase(ch))
		{
			uppercase++;
		}
		else if(Character.isLowerCase(ch))
		{
			lowercase++;
		}
		
		else if(Character.isDigit(ch))
		{
			number++;
		}
		else
		{
			others++;
		}
		}
		double uppercases = (uppercase*100)/leng;
		double lowercases = (lowercase*100)/leng;
		double other = (others*100)/leng;
		double numbers = (number*100)/leng;
		
		DecimalFormat df = new DecimalFormat("##.##");
		System.out.println("uppercases "+df.format(uppercases)+"%");
		System.out.println("lowercases "+df.format(lowercase)+"%");
		System.out.println("oter cases "+df.format(other)+"%");
		System.out.println("number cases "+df.format(numbers)+"%");
	}
}