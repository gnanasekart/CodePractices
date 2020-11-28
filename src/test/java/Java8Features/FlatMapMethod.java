package Java8Features;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class FlatMapMethod {

	public static void main(String[] args) {
		//1. nested array into list
		String[][] data = new String[][]{{"a", "b"}, {"c", "d"}, {"e", "f"}};

		Stream<String> ss = Arrays.stream(data)
				.flatMap(x -> Arrays.stream(x))
				.filter(x -> "c".equals(x.toString()));		
	//	ss.forEach(System.out::println);
		
		//2. nested list into list
		//Flatmap concept
		List<String> houseGryffindor = Arrays.asList("Albus", "Harry", "Ron", "Hermione");
        List<String> houseHufflepuff = Arrays.asList("Bridget", "Cedric", "Nymphadora");
        List<String> houseRavenclaw = Arrays.asList("Luna", "Garrick", "Filius");
        List<String> houseSlytherin = Arrays.asList("Severus", "Tom", "Phineas");
        
        List<List<String>> allhouse = new ArrayList<List<String>>();
        allhouse.add(houseRavenclaw);
        allhouse.add(houseSlytherin);
        allhouse.add(houseGryffindor);
        allhouse.add(houseHufflepuff);
        
        //pre java 8
        List<String> allentry = new ArrayList<String>();
        for(List<String> houses : allhouse)
        {
        	for(String asinglehouse : houses)
        	{
        		allentry.add(asinglehouse);
        	}
        }
        for(String all: allentry)
        {
        	System.out.println(all);
        }
        
        //after flatmap in java 8
        
        List<String> collect = allhouse.stream()
        						.flatMap(a -> a.stream())
        						.collect(Collectors.toList());
        System.out.println(collect);
	}

}
