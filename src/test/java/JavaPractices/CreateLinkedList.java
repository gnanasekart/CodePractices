package JavaPractices;

public class CreateLinkedList {

	node head;
	class node
	{
		int data;
		node next;
		
		node(int data)
		{
			this.data= data;
			next = null;
		}
	}
	
	public void printLinkedList()
	{
	node n = head;
	while(n!=null)
	{
		System.out.println(n.data);
		n = n.next;
	}
	}
	
	public static void main(String[] args) {
		CreateLinkedList cl = new CreateLinkedList();
		//mapping
		node node1 = cl.new node(10);
		//assigning head node
		cl.head = node1;
		
		node node2 = cl.new node(20);
		//assigning next node
		node1.next = node2;
		
		node node3 = cl.new node(30);
		node2.next = node3;
		
		cl.printLinkedList();
	}

}
