
Singly linked list:
---------------------

Structure of Node:
-------------------
class Node{
	int data;
	Node next;
	
	Node(int d)
	{
		data = d;
		next = null;
	}
}

Linked List Operations:
------------------------
Insertion Operation:

	1.Insert at the begining
	
	void insert(int new_data)
	{
		Node new_node = new Node(new_data);
		new_node.next = head;
		head = new_node;
	}
	
	2.Insert in between
	
	void insertafter(Node prev_node, int new_data)
	{
		Node new_node = new Node(new_data);
		new_node.next = prev_node.next;
		prev_node.next = new_node;
		
	}
	
	3.Insert at the end

	void append(int new_data)
	{
		Node new_node = new Node(new_data);
		if(head == null)
		{
			head = new Node(new_data);
			return;
		}
		new_Node.next = null;
		Node last = head;
		while(last.next != null)
		{
			last = last.next;
		}
		last.next = new_node;
		return;
		
	}

Deletion of an element
-------------------------
1. Deletion at the begining
2. Deletion in between
3. Deletion of last element

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

void deleteNode(int position)//1
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

DEletion of Linked List:
---------------------------
void deleList()
{
		head = null;
}

To count the number of nodes in a linked list:
------------------------------------------------

int count()
{
	Node temp = head;
	int c = 0;
	while(temp != null)
	{
		c++;
		temp=temp.next;
	}
	
}

REcursive program for count number of nodes:
----------------------------------------------
int countRec(Node node)
{
	//Node node = head;
	//Base
	if(node == null)
		return 0;
	
	return 1 + countRec(node.next);
}

countRec(head))

Search an element in a linked list:
-----------------------------------

boolean search(Node head, int x)//9
{
	Node n = head;
	while(n != null)
	{
		if(n.data == x)
			return true;//element found
		n=n.next;
	}	
		return false;// element not found
}

Reverse a Linked list:
------------------------

Node reverse(Node n)
{
	//Node n = head;
	Node prev = null;
	Node current = n;
	Node next = null;
	
	while(current != null)
	{
		next = current.next;
		current.next = prev;
		prev = current;
		current = next;
	}
	n = prev;
	return n;
}


Print middle element of the linked list:
-----------------------------------------

void middlepoint()
{
	Node ptr1;//slowpointer
	Node ptr2;//fastpointer
	
	while(ptr1 != null && ptr2.next != null)//ptr1 = 1 ptr
	{
		ptr1 = ptr1.next;//500
		ptr2 = ptr2.next.next;//1000
	}
	System.out.println("Mid element: "+ptr1.data);
	
Detect a Loop in Linkedlist:
-----------------------------

boolean detectLoop(Node head)
{
	Node slow=head, fast=head;
	while(fast != null && fast.next != null)
	{
		slow=slow.next;
		fast=fast.next.next;
		if(slow == fast)
			return true;
	}
	return false;
	
}


Merge two sorted linked list:
-------------------------------

Node merge(Node l1, Node l2)
{
	if (l1 == null)
		return l2;
	if (l2 == null)
		return l1;
	
	if(l1.data < l2.data)
	{
		l1.next = merge(l1.next, l2);
		return l1;
	}
	else{
		l2.next = merge(l1, l2.next);
		return l2;
	}
}
---------------------------------------------

Doubly Linked List:
-------------------

class Node{
	
	int data;
	Node prev;
	Node next;
	
	Node (int d)
	{
		data = d;
		prev=next=null;
	}
	
}

DLL Operations:
--------------------
1. Insertion:
 1.1 Insertion at the beginning:
 
 void insert(int new_data){
	 Node new_node = new Node(new_data);
	 new_node.next = head;
	 new_node.prev = null;
	 if(head != null)
		 head.prev = new_node;
	 
	 head = new_node;
	 
 }
