package MapCollection;

import java.util.AbstractMap;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class HashmapCreation {

	public static HashMap<String, Integer> map3;
	
	static
	{
		map3 = new HashMap<>();
		map3.put("A", 100);
		map3.put("B", 200);
		map3.put("C", 300);
	}
	
	
	public static void main(String[] args) {
		
		//using hashmap class
		HashMap<String, Integer> map1 = new HashMap<>();
		//using parent class
		Map<String, Integer> map2 = new HashMap<>();
		
		//using static methods 
		HashmapCreation.map3.get("A");
		
		//using immutablemap with only one single entry - using singleton class
		// if no any value assigned to undefined key means it shows null
		//if try to add more than one value means it does not allow because it is immutable 
		//Java main throws exception as UnsupportedOperationException
		Map<String, Integer> map4 = Collections.singletonMap("D", 100);
		System.out.println(map4.get("D"));
		//map4.put("E", 200);
		//System.out.println(map4.get("E"));
		
		//using jaba 8 stream
		
		Map<String, String> map5 = Stream.of(
				new String [][] {
					{"A", "Agrade"},
					{"B", "Bgrade"}
				}
				).collect(Collectors.toMap(data -> data[0], data -> data[1]));
		System.out.println(map5.get("A"));
		
		//using simpleentry - for mutable map
		
		Map<String, String> map6 = Stream.of(
				new AbstractMap.SimpleImmutableEntry<>("AAA", "A"),
				new AbstractMap.SimpleImmutableEntry<>("BBB", "B")
				).collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue));
		System.out.println(map6.get("AAA"));
		map6.put("CCC", "C");
		System.out.println(map6.get("CCC"));
		
		/*
		empty map using java 9
		
		Map<String, String> emptymap = Map.of();
		emptymap.put("name", "fullname");
		 here we get exception as UnsupportedOperationException because here we did not initialize the object,
		we just calling the empty map
		
		*		with singleton 
		*Map<String, Integer> singletonMap = Map.of("k", "v");
		*sop(singletonMap.get("k");
		*singleton.put("d", "g");//UnsupportedOperationException
		*
		*here in Map.of() = is overloaded with may types
		*
		*multivalue mapOf
		*
		*Map<String, Integer> singletonMap = Map.of("k1", "v1", "k2", "v2", "k3", "v3", "k4", "v4");
		*maximum it allow 10 pairs inside 
		*
		* Map<String, Integer> mutable = Map.ofEntries(
		* 				new AbstractMap.SimpleEntry<>("AAA", "A"),
						new AbstractMap.SimpleEntry<>("BBB", "B")
						);
				this method allow infinite no if entry pair inside map,  but if try to add outside means it is immutable
				
				mutable.put("CCC", "C");//unsupportedoperationexception
				
				
				//another way is by using guava API from Google library
				 * 
				 * Map<String, Integer> google = ImmutableMap.of("google", "google map", "yahoo", "yahoo map")
					google.put("redmi", "redmi china");//unsupportedoperationexception
					
					
				
		*
		*
		*
		*
		*
		*
		*
		*
		*
		*/
		
		
		
		
		
		
	}

}
