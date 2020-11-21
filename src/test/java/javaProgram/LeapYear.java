package javaProgram;

public class LeapYear {

	public static void main(String[] args) {
		// divisble by 4 for all the century years -- ending with 00
		// century year is leap year only when its perfectly divisble by 400.

		int i = 2010;
		boolean leap = false;
		if(i%4 == 0)
		{
			if(i%100 == 0)
			{
				if(i%400 == 0){	leap = true;}
				else {leap = false;	}
			}
			else {leap = true;}
		}
		else {leap = false;	}

		if(leap)
		{
			System.out.println(i +" leap year");
		}else
		{
			System.out.println(i +" is not a leap year");
		}
	}}
