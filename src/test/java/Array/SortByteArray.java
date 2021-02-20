package Array;
import java.util.Arrays;
public class SortByteArray {
	public static void main(String[] args) {
		byte[] byteArray = new byte[] { 13, 9, 15, 24, 4 };

		// Displaying Array before Sorting
		System.out.println("**byte Array Before Sorting**");
		for (byte temp: byteArray)
		{
			System.out.println(temp);
		}
		Arrays.sort(byteArray);
		System.out.println("**byte Array After Sorting**");
		for (byte temp: byteArray)
		{
			System.out.println(temp);
		}

		// Another byte Array
		byte[] byteArray2 = new byte[] { 15, 22, 3, 41, 24, 77, 8, 9 };

		// Selective Sorting
		/* public static void sort(byte[] a, int fromIndex, int toIndex)
		 * Sorts the specified range of the array into ascending order. 
		 * The range to be sorted extends from the index fromIndex, inclusive, to the 
		 * index toIndex, exclusive. If fromIndex == toIndex, 
		 * the range to be sorted is empty.
		 */
		Arrays.sort(byteArray2, 2, 5);
		for (byte temp: byteArray2)
		{
			System.out.println(temp);
		}
	}
}