package String;

public class Alphabeteornot {

	public static void main(String[] args) {
		char c = '#';
		int ash = c;
		if((ash > 'a' && ash < 'z') && (ash > 'A' && ash < 'Z')) {
			System.out.println("it is alphabet");
		}else
		{
			System.out.println("not an alphanet");
		}
	}
	//for(int i = 1; i< 255; i++)
	//{
	//	char num = (char) i;
	//	System.out.print(num);
	//}
}