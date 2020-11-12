package JavaPractices;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class ArrayListThreadSafety {

	public static void main(String[] args) {
		
		List<String> syncList = Collections.synchronizedList(new ArrayList<String>());
		syncList.add("firstname");
		syncList.add("secondname");
		syncList.add("thirdname");
		syncList.add("fourthname");
		
		//in Synchronized list no need to use Synchronized keyword for add, remove. but need to use for fetching data
		synchronized (syncList)
		{
	Iterator<String> it = syncList.iterator();
	while(it.hasNext())
	{
		System.out.println(it.next());
	}
	}
	//this CopyOnWriteArrayList is a class to do all actions in synchorized without need to mention as sync keyword explicitly
		
		CopyOnWriteArrayList<String> cop = new CopyOnWriteArrayList<String>();
		cop.add("FIRSTNAME");
		cop.add("SECONDNAME");
		cop.add("THIRDNAME");
		
		Iterator<String> itc = cop.iterator();
		while(itc.hasNext())
		{
			System.out.println(itc.next());
		}
	}

}
