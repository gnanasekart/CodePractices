package Java8Features;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class MethodRefIf {

	public static void main(String[] args) {
	List<String> list = Arrays.asList("one", "two", "five", "Six");
	
	list.forEach(new Consumer<String>() {

		@Override
		public void accept(String t) {
			System.out.println(t);
		}
	});
	System.out.println("********************");
	
	//lambda expression
	list.forEach((l) -> System.out.println(l));
	System.out.println("********************");
	
	//method reference
	list.forEach(System.out::println);
	System.out.println("********************");
	
	for(String s : list)
	{
		System.out.println(s);
	}
	}

}
