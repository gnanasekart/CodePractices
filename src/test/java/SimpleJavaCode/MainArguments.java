package SimpleJavaCode;

public class MainArguments 
{
	public static void main(String[] args) 
	{
		float sum = 0;		
		try {
			for(String argument : args)
			{
				sum = sum + Float.parseFloat(argument);
			}
		} catch (NumberFormatException e) {
			
			System.out.println(e.getMessage());
		}
		System.out.println(sum + "VALUE IS");  
		}
}
