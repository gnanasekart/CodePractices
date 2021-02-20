package javaProgram;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;


public class Conveting {

	public static void main(String[] args) throws ParseException {

		//String to an int in java using Integer.parseInt() method. 
		//To convert String into Integer, we can use Integer.valueOf() method which returns instance of Integer class.
		//string to integer
		String s="200";  
		//Converting String into int using Integer.parseInt()  
		int i=Integer.parseInt(s); 

		//		String to integer
		//		The Integer.valueOf() method converts String into Integer object.
		//		If you don't have numbers in string literal, calling Integer.parseInt() or Integer.valueOf() methods throw NumberFormatException.

		String s1 ="200";  
		//converting String into Integer using Integer.valueOf() method  
		Integer i1 =Integer.valueOf(s);
		
		//int to string
		//String.valueOf() method converts int to String. The valueOf() is the static method of String class.

		int i2=200;  
		String s2=String.valueOf(i);  
		System.out.println(i+100);//300 because + is binary plus operator  
		System.out.println(s+100);//200100 because + is string concatenation operator  

		//convert int to String in java using Integer.toString() method.

		int i3=200;  
		String s3=Integer.toString(i);  
		System.out.println(i+100);//300 because + is binary plus operator  
		System.out.println(s+100);//200100 because + is string concatenation operator  

		//convert int to String in java using String.format() method.
		int i4=200;  
		String s4=String.format("%d",i);  
		System.out.println(s);  

		//Java String to Date
		//We can convert String to Date in java using parse() method of DateFormat and SimpleDateFormat classes.

		String sDate1="31/12/1998";  
		String sDate2 = "31-Dec-1998";  
		String sDate3 = "12 31, 1998";  
		String sDate4 = "Thu, Dec 31 1998";  
		String sDate5 = "Thu, Dec 31 1998 23:37:50";  
		String sDate6 = "31-Dec-1998 23:37:50";  
		SimpleDateFormat formatter1=new SimpleDateFormat("dd/MM/yyyy");  
		SimpleDateFormat formatter2=new SimpleDateFormat("dd-MMM-yyyy");  
		SimpleDateFormat formatter3=new SimpleDateFormat("MM dd, yyyy");  
		SimpleDateFormat formatter4=new SimpleDateFormat("E, MMM dd yyyy");  
		SimpleDateFormat formatter5=new SimpleDateFormat("E, MMM dd yyyy HH:mm:ss");  
		SimpleDateFormat formatter6=new SimpleDateFormat("dd-MMM-yyyy HH:mm:ss");  
		Date date1=formatter1.parse(sDate1);  
		Date date2=formatter2.parse(sDate2);  
		Date date3=formatter3.parse(sDate3);  
		Date date4=formatter4.parse(sDate4);  
		Date date5=formatter5.parse(sDate5);  
		Date date6=formatter6.parse(sDate6);  
		System.out.println(sDate1+"\t"+date1);  
		System.out.println(sDate2+"\t"+date2);  
		System.out.println(sDate3+"\t"+date3);  
		System.out.println(sDate4+"\t"+date4);  
		System.out.println(sDate5+"\t"+date5);  
		System.out.println(sDate6+"\t"+date6);  
	}
}