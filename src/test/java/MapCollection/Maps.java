package MapCollection;
import java.util.*;

public class Maps 
{
	public static void main(String[] args)
	{
		HashMap<Integer, String> map = new HashMap<>();
		map.put(4, "gnana");
		map.put(5, "sekar");
		map.put(1, "gnana");
		map.put(3, "kumar");
		map.put(4, null);
			//map.put(null, null);
		map.putIfAbsent(2, "sekar");
		//map.remove(1);
		map.equals(3);
		map.replace(1, "guna");
		map.replace(1, "guna", "gana");

		System.out.println(map);
			System.out.println(map.get(1));
		map.remove(2);
		System.out.println(map.getOrDefault(3, "gnanasekar"));
		System.out.println(map);
		//	System.out.println(map.size());

		for(Map.Entry m : map.entrySet())
		{
			System.out.println(m.getKey()+"  "+m.getValue());
		}

		//map.entrySet().stream().sorted(Map.Entry.comparingByKey()).forEach(System.out::println);

		map.entrySet()  
		//Returns a sequential Stream with this collection as its source  
		.stream()  
		//Sorted according to the provided Comparator  
		.sorted(Map.Entry.comparingByKey())  
		//Performs an action for each element of this stream  
		.forEach(System.out::println);  
	}
}