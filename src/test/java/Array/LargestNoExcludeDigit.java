package Array;

public class LargestNoExcludeDigit {

	public static void main(String[] args) 
	{
		 System.out.println(getLLessThanN(123, 3));
	}
	
	static int getLLessThanN(int number, int digit)
    { 
		char c = Integer.toString(digit).charAt(0);
        for (int i = number; i > 0; --i)
        {
            if(Integer.toString(i).indexOf(c) == -1)
            {  return i;
            }
        }
        return -1;
    }
}