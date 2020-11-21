package String;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Stringcov {

	public static void main(String[] args) throws ParseException {
		String s="200";  
		int i = 300;
		String valueOf = String.valueOf(i);
		//converting String into Integer using Integer.valueOf() method  
//		Integer i=Integer.valueOf(s);  
	//	Integer.parseInt(s);
		System.out.println(valueOf); 
		
		String date = "10 10, 2020";
		
			Date date1 = new SimpleDateFormat("MM dd, yyyy").parse(date);
		
		System.out.println(date+"\t"+date1);
	}
}
