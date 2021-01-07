package SimpleJavaCode;

public class Armstrongno {

	public static void main(String[] args) {
		int value = 123;//153
		int x = Armstrongno.arms(value);
		if(value == x)
		{
			System.out.println("this is armstrong number");
		}
		else
		{
			System.out.println("this is not an armstrong number");
		}
		
		System.out.println(x);
	}
	public static int arms(int x)
	{
		int a = x%10;
		int b = (x/10)%10;
		int c = (x/10)/10;
		return a*a*a + b*b*b + c*c*c;
	}
}
