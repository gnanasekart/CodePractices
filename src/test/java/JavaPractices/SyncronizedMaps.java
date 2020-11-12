package JavaPractices;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class SyncronizedMaps {

	public static void main(String[] args) {
	
		//Creating HashMap
		
		HashMap<String, Integer> map1 = new HashMap<>();
		
		map1.put("A", 100);
		map1.put("B", 200);
		Map<String, Integer> map2 = Collections.synchronizedMap(map1);
		map2.put("A", 101);
		System.out.println(map1);
		
		
		//concurrent Hash Map it does not shows any ConcurrentModificationException
		ConcurrentHashMap<String, Integer> map3 = new ConcurrentHashMap<>();
		ConcurrentHashMap<String, Integer> map4 = new ConcurrentHashMap<>();
		map3.put("A", 222);
		map3.put("A", 223);
		System.out.println(map3.get("A"));
		map4.put("D", 333);
		 map3.putAll(map4);
		 System.out.println(map3.get("D"));
	}

}
