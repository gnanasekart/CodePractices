package SimpleJavaCode;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

import net.sf.saxon.exslt.Date;

public class DateSorter {
	static void printDatesAscending(ArrayList<String> arr) 
	{ 
		
		// Sort the dates using library 
		// sort function with custom Comparator 
		Collections.sort(arr,new Comparator<String>()
		{
			public int compare(String date1, String date2)
			{
				String day1 = date1.substring(0, 2); 
				String month1 = date1.substring(3, 5); 
				String year1 = date1.substring(6); 
			
				String day2 = date2.substring(0, 2); 
				String month2 = date2.substring(3, 5); 
				String year2 = date2.substring(6); 
				
				// Condition to check the year 
				if (year2.compareTo(year1) > 0)
					return -1;
				else if (year2.compareTo(year1) < 0)
					return 1;
				
				// Condition to check the month	 
				else if (month2.compareTo(month1) > 0)
					return -1;
				else if (month2.compareTo(month1) < 0)
					return 1;
				
				// Condition to check the day 
				else if (day2.compareTo(day1) > 0)
					return -1;
				else
					return 1;
			}
		}); 
		
		// Loop to print the dates 
		for(int i = 0; i < arr.size(); i++) 
			System.out.println(arr.get(i)); 
	} 


	public static void main(String[] args) 
	{
		ArrayList<String> arr = new ArrayList<>(); 
		arr.add("25-08-1996"); 
		arr.add("03-08-1970"); 
		arr.add("09-04-1994"); 
		arr.add("29-08-1996"); 
		arr.add("14-02-1972"); 
		
		printDatesAscending(arr); 
	}
}

/*
 *   String date = Date.date(new String("12/12/2002"));
	    java.util.Date simpleDateFormat = new SimpleDateFormat("dd/MM/yyyy").parse(date);
	    System.out.println(simpleDateFormat);
 * 
 * 
 */
