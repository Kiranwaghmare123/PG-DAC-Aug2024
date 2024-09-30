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
	
	void append(int new_data)
	{
		Node new_node = new Node(new_data);
		if(head == null)
		{
			head = new Node(new_data);
			return;
		}
		new_node.next = null;
		Node last = head;
		while(last.next != null)
		{
			last = last.next;
		}
		last.next = new_node;
		return;
		
	}
	
	void deleteNode(int key)//14
{
	Node temp = head, prev = null;
	//Deletion at begining
	if(temp != null && temp.data == key)
	{
		head = temp.next;
		return;
	}
	//Deletion in between & last node
	while(temp != null && temp.data != key)
	{
		prev = temp;
		temp = temp.next;
	}
	//Non-existing element
	if(temp == null)
		return;
	prev.next = temp.next;
	

}

void deleteNode1(int position)//1
{
	if(head == null)
		return;
	
	Node temp = head;
	//DEletion at the begining
	if(position == 0)
	{
		head = temp.next;// head position change
		return;
	}
	
	for(int i = 0; temp != null && i<position-1; i++)
	{
		temp = temp.next;
	}
	if(temp == null || temp.next == null)
		return;
	Node next = temp.next.next;
	temp.next = next;
}

void middlepoint(Node head)
{
	Node ptr1=head;//slowpointer
	Node ptr2=head;//fastpointer
	
	while(ptr1 != null && ptr2.next != null)
	{
		ptr1 = ptr1.next;//500
		ptr2 = ptr2.next.next;//1000
	}
	System.out.println("Mid element: "+ptr1.data);
	
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
		
		l1.insertafter(l1.head.next.next, 100);
		l1.display();
		System.out.println();
		
		l1.append(11);
		l1.display();
		System.out.println();
		
		l1.deleteNode(20);
		l1.display();
		System.out.println();
		
		
		//l1.deleteNode1(2);
		l1.display();
		System.out.println();
		l1.middlepoint(l1.head);
		
		
		
		
	}
	
}