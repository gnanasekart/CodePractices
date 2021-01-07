package ListCollection;

import java.util.Stack;

public class StackDemo {

	public static void main(String[] args) {
		Stack<String> s = new Stack<String>();
		s.push("gnana");
		s.push("sekar");
		s.push("gow");
		System.out.println(s);
		
		System.out.println(s.peek());//gow - return top of the stack element
		
		System.out.println(s.pop());//gow - retunr top element and remove it
		System.out.println(s.empty());
		System.out.println(s.search("gnana"));//2 index value from bottom to up

	}
}
