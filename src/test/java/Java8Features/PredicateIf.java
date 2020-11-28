package Java8Features;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class PredicateIf {

	public static void main(String[] args) {
		Predicate<Integer> pre = x -> x > 10;
		boolean test = pre.test(4);
		System.out.println(test);
		
		//chaining
		System.out.println(pre.and(x -> x<20).test(12));

		System.out.println(pre.negate().and(x -> x<20).test(12));
		
		List<String> l = Arrays.asList("gnana", "sekar", "mathan", "gandhi");
		Predicate<String> ll = y -> y.contains("g");
		
		List<String> collect = l.stream().filter(ll.negate()).collect(Collectors.toList());
		System.out.println(collect);
	}

}
