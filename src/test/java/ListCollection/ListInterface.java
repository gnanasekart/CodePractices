package ListCollection;

import java.util.*;
public class ListInterface
{
public static void main(String[] args)
{
List<String> list = new ArrayList<>();
list.add("gnana");
list.add("sekar");
list.add("gowri");
list.add("gnana");
list.add("shankar");
list.add("kumar");
list.add(3, "between");

//Array to list
Integer[] id = {101, 102, 103, 104};
List<Integer> ids = new ArrayList<>();
for(Integer no:id)
{
ids.add(no);
}

//list to Array using toArray()
String[] name = list.toArray(new String[list.size()]);
String names = Arrays.toString(name);
System.out.println(names);

if(list.contains("gnana"))
{
	System.out.println("yes correct");
}

System.out.println(ids);
System.out.println(list);
System.out.println("fetch value- " +list.get(3));
System.out.println("Set data- " +list.set(3, "inbetween"));
System.out.println("fetch value after set- " +list.get(3));
//System.out.println(list.lastIndexOf(list));
Collections.sort(list);
//System.out.println(list);

//ListIterator

ListIterator<String> ls = list.listIterator();
while(ls.hasNext())
{
System.out.println("This is the value of "+ls.next()+" from the index "+ls.nextIndex());
}
System.out.println("forward iterator ends");
while(ls.hasPrevious())
{
System.out.println("This is the value of "+ls.previous()+" from the index "+ls.previousIndex());
}
}
}