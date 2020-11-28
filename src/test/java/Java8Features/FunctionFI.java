package Java8Features;

import java.util.function.Function;

public class FunctionFI {

	public static void main(String[] args) {
		
		Function<String, Integer> func = x -> x.length();
		
		System.out.println(func.apply("This is text"));
	
		Function<Integer, Integer> func1 = x -> x*2;
		int v = func.andThen(func1).apply("this is after text");
		System.out.println(v);
		
		Function<Integer, Integer> fun = x -> x+x;
		fun = fun.compose(a -> 3 * a);
		System.out.println(fun.apply(2));
	
	}
	

}
