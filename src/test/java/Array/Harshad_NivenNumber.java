package Array;
import java.util.Scanner;
public class Harshad_NivenNumber {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        System.out.println("Enter any positive number : ");
        int inputNumber = sc.nextInt();
        checkForHarshad(inputNumber);
        sc.close();
	}
	
	static void checkForHarshad(int inputNumber)
    {
        int copyOfInputNumber = inputNumber;
        int lastDigit = 0;
        int  sum=0;
        while (inputNumber != 0) 
        {
            lastDigit = inputNumber % 10;
           sum = sum + lastDigit;
            inputNumber = inputNumber / 10;
        }
        if((copyOfInputNumber % sum) == 0)
        {
            System.out.println(copyOfInputNumber+" is a Harshad number");
        }
        else
        {
            System.out.println(copyOfInputNumber+" is not a Harshad number");
        }
    }
}