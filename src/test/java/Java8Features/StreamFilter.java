package Java8Features;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

class Product
{
	int id;
	String name;
	double price;

	Product(int id, String name, double price)
	{
		this.id = id;
		this.name = name;
		this.price = price;
	}
	
	public int getId()
	{
		return id;
	}
	
	public String getName()
	{
		return name;
	}
	
	public double getPrice()
	{
		return price;
	}
}

public class StreamFilter {
	public static void main(String[] args) {

		List<Product> prod = Arrays.asList(new Product(1, "gnana", 100.00),
				(new Product(2, "sekar", 153.50)),
				(new Product(3, "muthu", 122))); 

		//finding higher value
		List<Double> collect = prod.stream().filter(p -> p.price >150).map(p -> p.price).collect(Collectors.toList());
		//System.out.println(collect);

		//finding matching value
		prod.stream().filter(p -> p.price == 100).forEach(product -> System.out.println(product.name));

		//sum of all values using reduce
		double d = prod.stream().map(p -> p.price).reduce(0.0, (sum, value) -> sum+value);
		//System.out.println(d);
		//sum if all values using collectors
		double dd = prod.stream().collect(Collectors.summingDouble(Product -> Product.price));
		//System.out.println(dd);
		
		//max and minimum
		Product maxprice = prod.stream().max((Product1, Product2) -> Product1.price < Product2.price ? 1 : -1).get(); 
		//System.out.println(maxprice.price);

		//no of count 
		long count = prod.stream().filter(Product -> Product.price > 100).count();
		//System.out.println(count);

		//list to set
		Set<Double> collect2 = prod.stream().filter(Product -> Product.price >= 100).map(Product -> Product.price).collect(Collectors.toSet());
		//System.out.println(collect2);

		//list to map
		Map<Integer, String> map = prod.stream().filter(Product -> Product.price > 100).collect(Collectors.toMap(p -> p.id, p -> p.name));
		//System.out.println(map);
		
		//method reference in stram
		List<Double> mf = prod.stream().filter(p -> p.price >= 100).map(Product::getPrice).collect(Collectors.toList());
		System.out.println(mf);
	}

}
