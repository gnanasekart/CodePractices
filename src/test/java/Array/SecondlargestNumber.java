package Array;

public class SecondlargestNumber {

	public static void main(String[] args) {
		System.out.println(secondLargest(new int[] {45, 51, 28, 75, 49, 42}));
        System.out.println(secondLargest(new int[] {985, 521, 975, 831, 479, 861}));
        System.out.println(secondLargest(new int[] {9459, 9575, 5692, 1305, 1942, 9012}));
        System.out.println(secondLargest(new int[] {47498, 14526, 74562, 42681, 75283, 45796}));
	}

	public static int secondLargest(int[] input)
	{
		int first, second;
		if(input[0] > input[1])
		{
			first = input[0];
			second = input[1];
		}
		else
		{
			first = input[1];
			second = input[0];	
		}
		for(int i=2; i<input.length; i++)
		{
			if(input[i] > first)
			{
				second = first;
				first = input[i];
			}
			else if(input[i] > first && input[i] < second)
			{
				second = input[i];
			}
		}
		return second;
	}
}