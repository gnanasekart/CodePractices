package Java8Features;
import java.util.function.BiFunction;
import java.util.function.BinaryOperator;
public class BinaryOperatorFI {

	public static void main(String[] args) {
		
		
		
		BinaryOperator<Integer> bo = BinaryOperator.maxBy((a, b) -> (a > b)? 1 : ((a == b)? 0 : -1))   ;
		System.out.println(bo.apply(25, 66));
		
		BinaryOperator<Integer> bm = BinaryOperator.minBy((a, b) -> (a > b)? 1 : ((a == b)? 0 : -1))   ;
		System.out.println(bo.apply(25, 66));
		
		BiFunction<Integer, Integer, Integer> bf = (x,y) -> x+y;
		System.out.println(bf.apply(20,  30));
		
		BinaryOperator<Integer> boi = (x,y) -> x+y;
		System.out.println(boi.apply(20,  30));
		
		
	}

}
