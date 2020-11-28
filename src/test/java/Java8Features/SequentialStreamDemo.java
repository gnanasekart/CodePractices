package Java8Features;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class SequentialStreamDemo {

	public static void main(String[] args) {
		Stream<String> s = Stream.of("gnana", "gana", "Sekar", "sek","sson");
		//using stream for first time
		s.limit(2).findFirst().ifPresent(System.out::println);
	
		//using stream for second time
		//s.findFirst().ifPresent(System.out::println); ->  here we face Illegalstateexception 
		//because once the stream is used then cannot able to use the same once again
		
		List<String> collect = Arrays.asList("gnana", "gana", "Sekar", "sek","sson")
		.stream().filter(a -> a.contains("g")).collect(Collectors.toList());
	//	collect.forEach(System.out::println);
		
		List<Integer> collect2 = Arrays.asList(1, 2, 3, 4)
		.stream()
		.map(a -> a * 2 + 1).collect(Collectors.toList());
		//.average()
		//.ifPresent(System.out::println);
		//collect2.forEach(System.out::println);
		
		Arrays.stream(new int[] {1, 2, 3, 4, 5})
		.map(m -> m*3-1)
		.average() 
		.ifPresent(System.out::println);
		
		Stream.of("a1", "b1", "c1", "d2")
		.map(x -> x.substring(1))
		.mapToInt(Integer::parseInt)
		.max()
		.ifPresent(System.out::println);
		
		Stream.iterate(0, n -> n+1)
		.filter(n -> n%2 != 0)
		.limit(10)
		.forEach(System.out::println);
	
	
	}

}
