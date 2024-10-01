class DLL1{
	
	Node head;
	
	static class Node{
		int data;
		Node next;
		Node prev;
		
		Node(int d)
		{
			data = d;
			next = null;
			prev = null;
		}
	
	}
	
	void insert(int new_data){
	 Node new_node = new Node(new_data);
	 new_node.next = head;
	 new_node.prev = null;
	 if(head != null)
		 head.prev = new_node;
	 
	 head = new_node;
	 
 }
 
 void display(Node n){
	 Node p = null;
	 System.out.println("Forward Direction:");
	 while(n!=null)
	 {
		 System.out.print(n.data+"-->");
		 p=n;
		 n=n.next;
	 }
	System.out.println();
	System.out.println("Reverse Direction:");
	while(p!=null)
	{
		System.out.print(p.data+"<--");
		p=p.prev;
	}
 }
 void insertAfter(Node prev_node, int new_data)
 {
	 if(prev_node == null)
	 {
		 System.out.println("Node cannot exist!");
		 return;
	 }
	 
	 Node new_node = new Node(new_data);
	 new_node.next = prev_node.next;
	 prev_node.next = new_node;
	 new_node.prev =prev_node;
	 if(new_node.next != null)
		new_node.next.prev =new_node;
	 
	 
 }
 
 void append(int new_data)
 {
	 Node new_node = new Node(new_data);
	 Node last =head;
	 new_node.next = null;
	 if(head == null)
	 {
		 new_node.prev = null;
		 head=new_node;
		 return; 
	 }
	 while(last.next != null)
		 last=last.next;
	 
	 last.next = new_node;
	 new_node.prev = last;
	 
 }
 
  void deleteNode(Node del)
 {
	 //Empty list
	 if(head == null || del == null)
		 return;
	 //Deletion at the begining
	 if(head == del)
		 head = del.next;
	 
	 if(del.next != null)
	 {
		 del.next.prev = del.prev;
	 }
	 
	 if(del.prev != null)
	 {
		 del.prev.next = del.next;
	 }
	 return;
 }
 public static void main(String args[])
 {
	 DLL1 d1 = new DLL1();
	 d1.insert(6);
	 d1.insert(7);
	 d1.insert(8);
	 d1.insert(9);
	 d1.display(d1.head);
	 System.out.println();
	 d1.insertAfter(d1.head, 10);
	 d1.display(d1.head);
	 System.out.println();
	 d1.append(100);
	 d1.display(d1.head);
	 System.out.println();
	 d1.deleteNode(d1.head.next);
	 d1.display(d1.head);
	 System.out.println();
 }
}