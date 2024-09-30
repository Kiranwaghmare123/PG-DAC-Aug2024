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
 
 public static void main(String args[])
 {
	 DLL1 d1 = new DLL1();
	 d1.insert(6);
	 d1.insert(7);
	 d1.insert(8);
	 d1.insert(9);
	 d1.display(d1.head);
	 System.out.println();
 }
}