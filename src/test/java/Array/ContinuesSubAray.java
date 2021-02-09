package Array;
import java.util.Arrays;
public class ContinuesSubAray {
	public static void main(String[] args) {
		findSubArray(new int[]{15, 51, 7, 81, 5, 11, 25}, 41);
	}

	static void findSubArray(int[] inputArray, int inputNumber)
	{
		int sum = 0;
		for (int i = 0; i < inputArray.length; i++)
		{
			sum = inputArray[i];
			for (int j = i+1; j < inputArray.length; j++)
			{
				sum = sum + inputArray[j];
				if(sum == inputNumber)
				{
					for (int k = i; k <= j; k++)
					{
						System.out.print(inputArray[k]+" ");
					}
					System.out.println();
				}
				else if (sum < inputNumber)
				{
					continue;
				}
				else if (sum > inputNumber)
				{
					break;
				}
			}        
			}    
		}}