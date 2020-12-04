package javaProgram;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DatesFormat {

	public static void main(String[] args) {
		
		DateFormat dateFormat = new SimpleDateFormat("ddMMyyyy ");
		 Date date = new Date();
		 String today= dateFormat.format(date);
		 System.out.println(today);

	}

}
