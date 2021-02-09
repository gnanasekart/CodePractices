package Array;

import java.util.Arrays;

public class LeaderNumber {

	public static void main(String[] args) {
		findTheLeaders(new int[] {12, 9, 7, 14, 8, 6, 3});
        findTheLeaders(new int[] {8, 23, 19, 21, 15, 6, 11});
	}

	static void findTheLeaders(int inputArray[])
    {
        for (int i = 0; i < inputArray.length; i++)
        {
            boolean flag = true;
 
            for (int j = i+1; j < inputArray.length; j++)
            {
                if (inputArray[j] > inputArray[i])
                {
                    flag = false;
                    break;
                }
            }
            if (flag)
            {
                System.out.println(inputArray[i]);
            }
        }    }}