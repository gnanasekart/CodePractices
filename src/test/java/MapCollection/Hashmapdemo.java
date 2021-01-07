package MapCollection;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;

public class Hashmapdemo {

	public static void main(String[] args) {
		HashMap<String, String> maps = new HashMap<String, String>();
		maps.put("India", "newdelhi");
		maps.put("USA", "LA");
		maps.put("UK", "London");
		maps.put("UK", "Londons");// new value will be replaced by new value
		maps.put(null, "MA");// only one null key will be there
		maps.put(null, "SA"); //-> new value replaced over 
		maps.put("RUS", null);
		maps.put("FR", null);
		maps.put("FR", null);//but can have more no of null values
		
		//System.out.println(maps.get("RUS"));
		//System.out.println(maps.get("FR"));
		//System.out.println(maps.get(null));
		//System.out.println(maps.get("UK"));
		
		//"india" = key
		//"newdelhi" = value
		//combination of both key and value is entry
		
		Iterator<String> it = maps.keySet().iterator();
		while(it.hasNext())
		{
			String key = it.next();
			String value = maps.get(key);
			System.out.println(key +"="+value);
		}
		
		//entryset will get the one full entry
		
		Iterator<Entry<String, String>> it1 = maps.entrySet().iterator();
		while(it1.hasNext())
		{
			Entry<String, String> entry = it1.next();
			System.out.println(entry.getKey()+ "-=" +entry.getValue());
		}	
		
		//Iterator using foreach and lambda
		System.out.println(".............................");
		maps.forEach((k,v) -> System.out.println(k+" = "+ v));
		
		
	}
}
