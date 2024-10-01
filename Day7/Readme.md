### Day 7 : Algorithms and Data Structures
----------------------------------------
    Topic: Introduction to ADS
    Date: 01/10/2024
    Meeting ID: 832 1579 8576
    Passcode:	806920
    ----------------------------------------
    Topics:
    	-Doubly Linked List

### DLL Operations:
--------------------
    DLL: A doubly linked list is a data structure that contains nodes with reference to both the previous and next node.
    -It allows traversal, insertion and deletion.
    
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
    
    1.Insertion:
     1.1 Insertion at the begining:
     
     void insert(int new_data){
    	 Node new_node = new Node(new_data);
    	 new_node.next = head;
    	 new_node.prev = null;
    	 if(head != null)
    		 head.prev = new_node;
    	 
    	 head = new_node;
    	 
     }
     
     
     
     
     1.2 Insertion in between
     
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
     1.3 Insertion at the end
     
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

![image](https://github.com/user-attachments/assets/4bce1443-5cd1-4400-829f-6b0316b797ad)

