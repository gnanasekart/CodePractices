package MapCollection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class cd {

	public static void main(String[] args) {
		
		List<Integer> l = null;
		Scanner s = new Scanner(System.in);
		for(int j=0; j<3; j++)
		{
			String name = s.nextLine();
			String rep = name.trim().replaceAll(" ", "");
			char[] ch = rep.toCharArray();
			l = new ArrayList<Integer>();
			for(int i=0; i<ch.length; i++)
			{
				l.add(Character.getNumericValue(ch[i]));
			}
		}
		
		Collections.sort(l);
		
		System.out.println(l.get(0));

       
	}

}
