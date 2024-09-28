class LinkedList3{

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
	
	void insert(int new_data)
	{
		Node new_node = new Node(new_data);
		new_node.next = head;
		head = new_node;
	}
	
	void insertafter(Node prev_node, int new_data)
	{
		Node new_node = new Node(new_data);
		new_node.next = prev_node.next;
		prev_node.next = new_node;
		
	}
	public static void main(String args[])
	{
		LinkedList3 l1 = new LinkedList3();
		l1.head = new Node(10);
		Node Second = new Node(20);
		Node third = new Node(30);
		l1.head.next = Second;
		Second.next = third;
		
		l1.display();
		System.out.println();
		l1.insert(40);
		l1.insert(50);
		l1.display();
		System.out.println();
		
		l1.insertafter(l1.head, 60);
		l1.display();
		System.out.println();
		
		l1.insertafter(l1.head.next, 100);
		l1.display();
		System.out.println();
		
		
		
		
	}
	
}