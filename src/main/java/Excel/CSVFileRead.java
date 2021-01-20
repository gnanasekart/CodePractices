package Excel;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class CSVFileRead {

	public static void main(String[] args) throws FileNotFoundException {
		//parsing a CSV file into Scanner class constructor  
		Scanner sc = new Scanner(new File("F:\\CSVDemo.csv"));  
		sc.useDelimiter(",");   //sets the delimiter pattern  
		while (sc.hasNext())  //returns a boolean value  
		{  
		System.out.print(sc.next());  //find and returns the next complete token from this scanner  
		}   
		sc.close();  //closes the scanner 
		CSVCompare();
	}

	public static void CSVCompare()   
	{  
	String line = "";  
	String splitBy = ",";  
	try   
	{  
	//parsing a CSV file into BufferedReader class constructor  
	BufferedReader br = new BufferedReader(new FileReader("CSVDemo.csv"));  
	while ((line = br.readLine()) != null)   
	{  
	String[] employee = line.split(splitBy);   
	System.out.println("Employee [First Name=" + employee[0] + ", Last Name=" + employee[1]+".......]");  
	}  
	}   
	catch (IOException e)   
	{  
	e.printStackTrace();  
	}  
	}  
}
/* opecsv-3.8.jar
 * CSVReader reader = null;
 * parsing a CSV file into CSVReader class constructor  
reader = new CSVReader(new FileReader("F:\\CSVDemo.csv"));  
 * 
 * 
 */
