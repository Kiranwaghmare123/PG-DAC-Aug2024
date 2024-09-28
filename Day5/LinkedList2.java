class LinkedList2{

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
	
	void display()
	{
		Node n = head;
		while(n != null)
		{
			System.out.print(n.data+ "--->");
			n=n.next;
		}
	}
	public static void main(String args[])
	{
		LinkedList2 l1 = new LinkedList2();
		l1.head = new Node(10);
		Node Second = new Node(20);
		Node third = new Node(30);
		l1.head.next = Second;
		Second.next = third;
		
		l1.display();
		
		
	}
	
}