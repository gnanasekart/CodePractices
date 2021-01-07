package ListCollection;

import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Vector;

public class VectorDemo {

	public static void main(String[] args) {
		Vector<String> v = new Vector<String>();
		v.add("gnana");
		v.add("sekar");
		v.add("t");
		
		//v.forEach((name) -> System.out.println(name));
		
		Iterator<String> it= v.iterator();
		//while(it.hasNext())
		//System.out.println(it.next());
				
		Vector<String> lang = new Vector<String>();
		lang.add("java");
		lang.add("C");
		lang.add("C#");
		lang.add("JS");
		lang.add("Python");
		
		Vector<String> spklang = new Vector<String>(Arrays.asList(new String[] {"ES", "MY", "SG", "ID", "VN"}));
		
		Vector platform = new Vector();
		platform.add(lang);
		platform.add(spklang);
		
		for(int i=0; i<lang.size(); i++)
		{
			String string = (String) ((Vector)platform.get(1)).get(i);
			String stringz = (String) ((Vector)platform.get(0)).get(i);
			System.out.println(string);
			System.out.println(stringz);
		}
	}
}