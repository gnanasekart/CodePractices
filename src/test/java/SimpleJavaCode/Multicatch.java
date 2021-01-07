package SimpleJavaCode;

public class Multicatch {

	public static void main(String[] args) {
		
		int first[] = {6, 2, 3, 4, 5};
		int last[] = {3, 1, 0, 3, 6, 1, 0, 3};
		//int sum = 0;
		try {
			for(int i=0; i<=last.length; i++)
			{
				System.out.println("i "+i);
				int sum = first[i]/last[i];
				 System.out.println(sum);
			}
		} 
		catch (ArithmeticException e) 
		{
			System.out.println("divide by zero"+e.getMessage());
			//e.printStackTrace();
		}
		catch (ArrayIndexOutOfBoundsException e)
		{
			System.out.println("out of bound");
		}
		catch (Exception e)
		{
			System.out.println(e.getMessage());
		}
		
		System.out.println("sample print");

		}
	}

