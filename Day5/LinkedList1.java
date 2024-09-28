class LinkedList1{

	Node head;
	static class Node{
		int data;
		Node next;
		
		Node(int d)
		{
			data = d;
			next = null;
		}
	}
	
	public static void main(String args[])
	{
		LinkedList1 l1 = new LinkedList1();
		l1.head = new Node(10);
		Node Second = new Node(20);
		Node third = new Node(30);
		l1.head.next = Second;
		Second.next = third;
		
		
	}
	
}