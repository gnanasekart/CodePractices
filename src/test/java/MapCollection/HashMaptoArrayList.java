package MapCollection;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.SortedMap;

import com.thoughtworks.qdox.library.SortedClassLibraryBuilder;

public class HashMaptoArrayList {

	public static void main(String[] args) {
		HashMap<String, Integer> hm = new HashMap<>();
		hm.put("chennai", 1);
		hm.put("Bangalore", 1);
		hm.put("kerala", 1);
		hm.put("delhi", 1);
		System.out.println(hm);
		System.out.println("--------------------");

		//Converting and getting keys from ArrayList
		List<String> al = new ArrayList<>(hm.keySet());
		for(String l : al)
		{
			System.out.println(l);
		}
		System.out.println("--------------------");

		Iterator iterator = hm.entrySet().iterator();
		while(iterator.hasNext())
		{
			System.out.println(iterator.next());
		}
		System.out.println("--------------------");

		List<Integer> in = new ArrayList<>(hm.values());
		hm.forEach((k,v) -> System.out.println(k.toUpperCase() +"=" +v));

		System.out.println("--------------------");
		LinkedHashMap<String, Integer> linkedHashMap = new LinkedHashMap<>();
		//Map<String, Integer> sortedMap = new SortedMap<>();

		linkedHashMap.putAll(hm);
		System.out.println(linkedHashMap);	
	}
}