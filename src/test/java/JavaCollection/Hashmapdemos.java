package JavaCollection;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

public class Hashmapdemos {

	public static void main(String[] args) {
		HashMap<Integer, String> map1 = new HashMap<Integer, String>();
		map1.put(1, "A");
		map1.put(2, "B");
		map1.put(3, "C");
		map1.put(4, "D");

		HashMap<Integer, String> map2 = new HashMap<Integer, String>();

		map2.put(2, "B");
		map2.put(4, "D");
		map2.put(3, "C");
		map2.put(1, "A");

		HashMap<Integer, String> map3 = new HashMap<Integer, String>();
		map3.put(1, "A");
		map3.put(2, "B");
		map3.put(3, "C");
		map3.put(3, "D");
		map3.put(5, "E");

		//1. compare on the basis of key-value use equals method
		//System.out.println(map1.equals(map2));//true
		//System.out.println(map2.equals(map1));//false

		//2. compare hashmap for same keays using keyset()
		//System.out.println(map1.keySet().equals(map2.keySet()));//true
		//System.out.println(map1.keySet().equals(map3.keySet()));//true

		//3. find the extra key
		HashMap<Integer, String> map4 = new HashMap<Integer, String>();

		map4.put(1, "A");
		map4.put(2, "B");
		map4.put(3, "c");
		map4.put(4, "D");
		map4.put(5, "e");
		map4.put(6, "f");

		//find out the extra key in hashmap
		//store only single not key -value
		HashSet<Integer> combkeys = new HashSet<>(map1.keySet());  //here keys will be 1, 2, 3, 4

		//add the keyset from map4
		combkeys.addAll(map4.keySet());
		//here keys will be 1, 2, 3, 4 + 1, 2, 3, 4, 5, 6 = 1, 2, 3, 4, 5, 6 replace over the existing value
		combkeys.removeAll(map1.keySet());
		//now remove the map1 keys from map4 so 1, 2, 3, 4 will be removed and remaining 5, 6 only available
		System.out.println(combkeys);

		HashMap<Integer, String> map5 = new HashMap<Integer, String>();
		map5.put(1, "A");
		map5.put(2, "B");
		map5.put(3, "C");


		HashMap<Integer, String> map6 = new HashMap<Integer, String>();

		map6.put(4, "A");
		map6.put(5, "B");
		map6.put(6, "C");
		

		HashMap<Integer, String> map7 = new HashMap<Integer, String>();
		map7.put(1, "A");
		map7.put(2, "B");
		map7.put(3, "C");
		map7.put(3, "C");
		
		System.out.println(new ArrayList<>(map5.values()).equals(new ArrayList<>(map6.values())));
		System.out.println(new ArrayList<>(map5.values()).equals(new ArrayList<>(map7.values())));
		
		System.out.println(new HashSet<>(map5.values()).equals(new HashSet<>(map6.values())));
		System.out.println(new HashSet<>(map5.values()).equals(new HashSet<>(map7.values())));




	}

}
