package MapCollection;

import java.util.Comparator;
import java.util.TreeMap;

public class TreeMapDemo {

	public static void main(String[] args) {
		TreeMap<Integer, String> map = new TreeMap<>();
		map.put(467, "gnana");
		map.put(124, "sekar");
		map.put(222, "manoj");
		map.put(444, "sun");
		
		map.forEach((k,v) -> System.out.println("key = "+k+ " value = "+v));
		
		//System.out.println(map.ceilingEntry(444));
		
	//	System.out.println(map.pollFirstEntry());
		//System.out.println(map.lastKey());
	
		TreeMap<Integer, String> map1 = new TreeMap<>(Comparator.reverseOrder());
		map1.put(467, "gnana");
		map1.put(124, "sekar");
		map1.put(222, "manoj");
		map1.put(444, "sun");
		
		map1.forEach((k,v) -> System.out.println("key = "+k+ " value = "+v));
	
	}

}
