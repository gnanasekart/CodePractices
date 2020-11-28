package Java8Features;

import java.util.Arrays;
import java.util.concurrent.ForkJoinPool;
import java.util.stream.*;

public class ParallelStreamDemo {

	public static void main(String[] args) {
		
  ForkJoinPool commonPool = ForkJoinPool.commonPool();
 //System.out.println(commonPool.getParallelism());

  //Parallel method on streams
 Stream.of("gnana", "Sekar", "gowtham", "dan", "mahesh").parallel().forEach(System.out::println);
 System.out.println("------------------");
 Stream.of("gnana", "Sekar", "gowtham", "dan", "mahesh").parallel().forEachOrdered(System.out::println);
 System.out.println("------------------");		
 
 //ParallelStream method on collection stream
 Arrays.asList("gnana", "Sekar", "gowtham", "dan", "mahesh").parallelStream().forEach(System.out::println);
 
 //to check stream is parallel or not
 
 IntStream range = IntStream.range(0, 10);
 System.out.println(range.isParallel());
 range.parallel();
 System.out.println(range.isParallel());
 
	}

}
