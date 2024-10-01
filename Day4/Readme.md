----------------------------------------
### Day 4 : Algorithms and Data Structures
----------------------------------------
    Topic: Introduction to ADS
    Date: 27/9/2024
    Meeting ID: 832 1579 8576
    Passcode:	806920
    ----------------------------------------
    Topics:
    	-Queue
    	-Circular Queue
    	-Dequeue
    	-Priority Queue
	-Heap
	
### Time and Space complexity for Stack:
--------------------------------------
    1. Push: T=O(1) S=O(1)
    
    2. Pop: T=O(1) S=O(1)
    
    3. Peek/Top: T=O(1) S=O(1)
    
    4. IsEmpty: T=O(1) S=O(1)
    
    5. Size: T=O(1) S=O(1)
    
    6. Stack storage: S=O(n)

### Advantage:
-----------
	-Simplicity:
	-Efficiency:
	-LIFO:
	-Memory efficient:
	
### Disadvantages:
--------------
	-Fixed capacity
	-No Ranadom access
	-Limited use/access
	-Overflow:
	
### Queue:
-------
    - A linear data structure, that follws FIFO (First In First Out) principle.
    - Elements are added at the rear end and removed fron the front.
    
    FIFO (First In First Out): 
    ---------------------------
    -The first element added is the first to be deleted.
    -Ex: Bus queue, ATM queue
    
    -Insertio: Rear
    -Deletion: Front

### Types of queue:
---------------
    1. Simple Queue
    	-Follow FIFO strictly.
    	-Insertion :rear and deletion :front
    	-Insertion: enqueue()
    	-Deletion: dequeue()
    	
    2. Circular Queue:
    	-It is an extension of a normal queue where the last element is connected back to the first element forming a circular queue.
    	-FIFO principle
    	-Call it a 'Ring Buffer'
    	
    Key parameter: A circular queue can utilize space efficiently by connecting the end back to the front.
    	-Prevents overflow by reusing empty spaces created by dequeue operations.
    	-Front: Deletion : Dequeue()
    	-Rear: Insertion : Enqueue()
	
    Applications:
    	-Memory Management
    	-Traffic System
    	-CPU Scheduling
    	
    3. Double-Ended Queue (Deque)
    	-It is a generalized version of a queue that allows insertion and deletion of elements from both ends.
![image](https://github.com/user-attachments/assets/e3924c71-f98f-4c59-bcee-705efbc917ef)
	
### Types:

    1. Deque: Input is blocked at a single end but allows deletion at both the ends.
    	-Insert: one
    	-Delete: both 
    
    2. Output Restricted Deque: Output is blocked at a single end but allows insertion at both the ends.
    	-Insert: both
    	-Delete: one 
    	
    		insertFront() : enqueue
    		insertRear() : enqueue
    		----------------------------
    		deleteFront() :dequeue
    		deleteRear() :dequeue
    
    		isEmpty()
    		isFull()
    		display()
    		getdata()
    	
    Applications:
    ---------------
    	-Web browsers : to store browsing history
    	-Job scheduling: 
    	
    	
	
### 4. Priority Queue:
    -A type of queu where each element has a priority value. Elements with higher priority are processed before those with lower priority.
    
    Properties:
    	-Each element has an associated priority.
    	-Elements with higher priority are dequeued before those with the lower priority.
    	-If two elements have the same priority they are served according to their order in the queue.
    	
    How Priority is assigned?
    	-Priority can be assigned on the value of the element(higher value = higher priority),(lower value=higher priority)
    	
    Operations:
    	-Insertion
    	-Deletion
    	-Peek
    	
    Types of Priority Queues:
    --------------------------------
    1. Ascending order Priority Queue
    	-Lower priority values get higher priority
    	-Eg: 4,6,8,9,10 => 4
    	
    2. Descending order Priority Queue
    	-Higher priorities values get higher priority
    	-Eg: 4,6,8,9,10 => 10
    	
    Special data structure: Heap (implement priority queue)
    
    Advantage:
    -----------
    	-Fast access according to the preference (priority)
    	-Real time examples for quick access using priority queue
    
    Disadvantage:
    	-More complex than simple queue.
    	-In Higher memory operations, nerver save the priority.
    
    Application:
    -----------
    	-Graph algorithms (Prims Algorithm, Krushkals Algorithms)
    	-Data compression(Huffman's coding)
### Time Complexity
![image](https://github.com/user-attachments/assets/daf4903b-bd83-446c-b3bb-f4022dab6aa7)

### Heap:
----
    -A special form of complete binary tree that key value of each node is smaller(larger) than the key value of it's children.
    
    Types of heap:
    1. Max Heap
    	-Parent key value is greater than or equal to the key value of children
    	-Parent value = maximum
    
    2. Min Heap
    	-Parent key value is less than or equal to the key value of children
    	-Parent value = minimum
    
    Properties:
    1. Complete Binary Tree:
    	-Every level, except possibly the last level is completely filled and all nodes as far as left as possible.
    2. Heap order property: 
    	-Max heap: each parent node is larger than the children
    	-Min heap: each parent node is amaller than the children.
    	
    Operations on heap:
    1. Insertion
    2. Deletion
    3. Heapify

### Time Complexity

![image](https://github.com/user-attachments/assets/aedf66f2-d138-41ac-8e09-9c138bb30d61)
