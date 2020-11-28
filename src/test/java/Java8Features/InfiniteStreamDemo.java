package Java8Features;

import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class InfiniteStreamDemo {

	public static void main(String[] args) {

		List<Integer> collect = Stream.iterate(0,  n -> n+3).limit(10).collect(Collectors.toList());
		collect.forEach(System.out::println);


		List<Integer> collect2 = Stream
				.generate(() -> (new Random()).nextInt(1000))
				.parallel()
				.limit(10)
				.collect(Collectors.toList());

		System.out.println(collect2);
	}

}
