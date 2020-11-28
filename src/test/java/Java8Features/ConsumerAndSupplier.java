package Java8Features;

import java.util.function.Consumer;
import java.util.function.Supplier;

public class ConsumerAndSupplier {

	public static void main(String[] args) {
		
		Consumer<String> con = x -> System.out.println(x);
		con.accept("hi");
		
		Supplier<Double> sup = () -> Math.random();
		System.out.println(sup.get());
	}

}
