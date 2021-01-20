package SimpleJavaCode;

public class DivideNumber {

	public static void main(String[] args) {
		for(int i=1; i<=100; i++)
		{
			if(i%3 == 0 && i%5 == 0)
			{
				System.out.print("Z -"+i+" ");
				System.out.println();
			}else if(i%3 == 0)
			{
				System.out.print("X -"+i+" ");
				System.out.println();
			}else if(i%5 == 0)
			{
				System.out.print("Y -"+i+" ");
				System.out.println();
			}else
			{
				System.out.println("nothing for -"+i);
			}
		}
		
	}

}
