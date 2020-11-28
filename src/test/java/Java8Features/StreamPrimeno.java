package Java8Features;
import java.util.stream.IntStream;

public class StreamPrimeno {

	public static void main(String[] args) {
		long count = IntStream
		.iterate(0, n -> n+1)
		.limit(1000)
		.parallel()
		.filter(StreamPrimeno :: isPrime)
		.peek(System.out::println)
		.count();
		System.out.println("count is = "+count);
	}
	
	public static boolean isPrime(int number)
	{
		if(number <= 1)
			return false;
					
		return !IntStream.rangeClosed(2, number/2).anyMatch(x -> number%x == 0);		
	
	}

}
