package javaProgram;

import java.util.Arrays;

public class ConsecutiveElement {

	public static void main(String[] args) 
	{
		int[] list = {100, 4, 200, 3, 1, 2};
		System.out.println(longconseq(list));
	}
	
public static int longconseq(int[] array) {
	int length = 1;
    int ans = 1;
    Arrays.sort(array);
    for (int i = 0; i < array.length - 1; i++)
    {
        if(array[i] == array[i+1]) 
        {
            continue;
        }
        else if (array[i] + 1 == array[i + 1])
        {
            length++;
        }
        else
        {
            length = 1;
        }
        ans = Math.max(ans,length);
    }
    return ans;
}}
