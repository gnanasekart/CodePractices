package javaProgram;

public class PositiveNegative {

	public static void main(String[] args) {
		int a = 122;
		int b = 0;
		PositiveNegative p = new PositiveNegative();
		int compareTo = (a<b)? -1 :((a==b)? 0 : 1);
		if(compareTo < 0) {
		System.out.println("negative");
	}else if(compareTo > 0)
	{
		System.out.println("positive");
	}else
	{
		System.out.println("zero");
	}
	}
}
