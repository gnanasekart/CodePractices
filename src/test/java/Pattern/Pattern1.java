package Pattern;

import java.text.ParseException;
import java.text.SimpleDateFormat;

import net.sf.saxon.exslt.Date;

public class Pattern1 {
	public static void main(String[] args) throws ParseException {
		int rows = 5, k = 0;

		//star(rows, k);
		//number(rows);    
		number2(rows);
		reversenumber(rows);
		highestfirst(rows);
	}

	public static void star(int rows, int k) {
		for (int i = 1; i <= rows; ++i, k = 0) {
			for (int space = 1; space <= rows - i; ++space) 
			{
				System.out.print("  ");
			}
			while (k != 2 * i - 1) {
				System.out.print("* ");
				++k;
			}
			System.out.println();
		}  
	}

	public static void number(int rows)
	{int rowCount = 1;
	for (int i = rows; i > 0; i--)
	{
		//Printing i spaces at the beginning of each row
		for (int j = 1; j <= i; j++)
		{
			System.out.print(" ");
		}
		//Printing 'rowCount' value 'rowCount' times at the end of each row
		for (int j = 1; j <= rowCount; j++)
		{
			System.out.print(rowCount+" ");
		}
		System.out.println();
		rowCount++;
	}
	}	
	
	public static void number1(int rows)
	{int rowCount = 1;
	for (int i = rows; i > 0; i--)
	{
		//Printing i spaces at the beginning of each row
		for (int j = 1; j <= i; j++)
		{
			System.out.print(" ");
		}
		//Printing 'rowCount' value 'rowCount' times at the end of each row
		for (int j = 1; j <= rowCount; j++)
		{
			System.out.print(j+" ");
		}
		System.out.println();
		rowCount++;
	}
	}
	
	public static void number2(int rows)
	{int rowCount = 1;
	for (int i = rows; i > 0; i--)
	{
		for (int j = 1; j <= i*2; j++)
		{
			System.out.print(" ");
		}
		
		for (int j = 1; j <= rowCount; j++)
		{
			System.out.print(j+" ");
		}
		
		for(int j=rowCount-1; j >= 1; j--)
		{
			System.out.print(j+" ");
		}
		System.out.println();
		rowCount++;
	}
	}
	
	public static void reversenumber(int rows)
	{int rowCount = rows;
	for (int i = 0; i < rows; i++)
	{
		for (int j = 1; j <= i*2; j++)
		{
			System.out.print(" ");
		}
		
		for (int j = 1; j <= rowCount; j++)
		{
			System.out.print(j+" ");
		}
		
		for(int j=rowCount-1; j >= 1; j--)
		{
			System.out.print(j+" ");
		}
		System.out.println();
		rowCount--;
	}
	}
	
	public static void highestfirst(int rows)
	{
        int rowCount = 1;
        for (int i = rows; i >= 1; i--)
        {
            //Printing i*2 spaces at the beginning of each row
            for (int j = 1; j <= i*2; j++)
            {
                System.out.print(" ");
            }
 
            //Printing j where j value will be from i to noOfRows
            for (int j = i; j <= rows; j++)          
            {
                System.out.print(j+" ");
            }
 
            //Printing j where j value will be from noOfRows-1 to i
            for (int j = rows-1; j >= i; j--)
            {               
                System.out.print(j+" ");            
            }             
            System.out.println();
            rowCount++;
        }
	}
}

/*
      * 
    * * * 
  * * * * * 
 * * * * * * * 

 */