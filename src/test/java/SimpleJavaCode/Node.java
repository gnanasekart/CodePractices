package SimpleJavaCode;

public class Node {
int data;
Node next;
//public Node next;

Node(int d)
{
	data = d;
	next = null;
}

public void setData(int data)
{
	this.data = data;
}

public int getData()
{
	return data;
}

public void setNext(Node next)
{
	this.next = next;
}
public Node getNext()
{
	return next;
}
}
