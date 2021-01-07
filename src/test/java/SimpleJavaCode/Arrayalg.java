package SimpleJavaCode;
import java.util.*;
class Arrayalg
{
public static void main(String[] args)
{
int arr[] = {1, 5, 2, 8, 7, 3};
//index   -  0  1  2  3  4  5

Arrayalg array = new Arrayalg();

array.printAllElement("All elements:- ", arr);

int[] result = array.addElement(arr, 15, 4);
array.printAllElement("After add elements:- ", result);
//required item while adding new element in array(array, value, position)

int index = array.search(result, 7);
System.out.println("value is " +index);

arr = array.delete(result, 7);
System.out.println("after delete" +arr);
}

//print element
public void printAllElement(String msg, int[] arr)
{
System.out.print(msg);
for(int i=0; i<arr.length; i++)
{
System.out.print(" " +arr[i]);
}
System.out.println();
}

//adding element
public int[] addElement(int[] arr, int value, int position)
{
 int[] result = new int[arr.length + 1];
//creating new array to copy to new array with increased array size
for (int i=0; i < position; i++)
{
result[i] = arr[i];//copy value until the position
}
result[position] = value;//new value assigned
for(int i=position+1; i<result.length; i++)
{
result[i] = arr[i-1];//moving old value to new index value
}
return result;
}

//searching element
public int search(int[] arr, int value)
{
int loc = -1; 
//-1 denotes that searching value not in the array
for(int i=0; i<arr.length;i++)
{
if(arr[i] == value)
{
loc = i;
break;
}
}
return loc;
}

//deleting element
public int[] delete(int[] arr, int value)
{
int loc=search(arr, value);
if(loc >= 0)
{
for(int i = loc+1; i<arr.length; i++)
{
arr[i-1] = arr[i];
}
}
return Arrays.copyOf(arr, arr.length-1);
}
}