### Day 9 : Algorithms and Data Structures
    ----------------------------------------
    Topic: Introduction to ADS
    Date: 03/10/2024
    Meeting ID: 832 1579 8576
    Passcode:	806920
    ----------------------------------------
    Topics:
    	-Binary Search Tree
    	-Tree Applications
    	-Sorting Techniques
     
  ### BST Insertion	
  	Node insert( Node root, int key)
  	{
  		if(root == null)
  		{
  			root = new Node(key);
  			return root;
  		}
  		if(key <= root.data)
  			root.left = insert(root.left, key);
  		else
  			root.right = insert(root.right, key);
  		return root;
  		
  	}
 ### BST Deletion
  	Node delete(Node root, int key)
  	{
  		if(root == null)
  			return root;
  		if(key < root.data)
  			root.left = delete(root.left, key);
  		else if(key > root.data)
  			root.right = delete(root.right, key);
  		//Case 1: leaf node deletion
  		//Case 2: one child deletion
  		else{
  			if(root.left == null)
  				return root.right;
  			else if(root.right == null)
  				return root.left;
  		//Case 3: two childeren deletion
  		root.data	= minvalue(root.right);
  		root.right = delete(root.right, root.data);//32
  			
  		}
  		return root;
  	
  	}
  		
  	int minvalue(Node root)
  	{
  		int x = root.data;
  		while(root.left != null)
  		{
  			x = root.left.data;
  			root = root.left;
  		}
  		return x;
  	}
	
### Tree Applications:
----------------------
AVL Tree:
	-An AVL tree is a self balancing BST where the difference between heights of the left and right subtree (balance factor) of any node is at most 1
	
	
### Searching and Sorting:
-----------------------

    Searching: Key = 88
    
    1. Linear search
    	-work on sorted as well unsorted array.
    	-sequentially access.
    	-access slow
    	-1d and multidimension
    	-easy to implement
    	
    2. Binary search
    	-work on sorted array.
    	-access through mid point value calculation
    	-access fast
    	-1d 
    	-complex operation
    	
    	Important to remember: 
    	------------------------
    	mid= (low+high)/2
    	replace:
    	mid = (low + (high-low))/2
	
### Sorting:
	----------
    	-Sorting refers to arranging elements in some logical order.
    	-Ascending and Decending
    	
    	Types of sorting:
    	------------------
    	1. Internal sorting:
    		-If all the data that is to be sorted can be adjusted at a time in main memory, then internal sorting methods are used.
    		
    	2. External sorting:
    		-If a all the data to be sorted can't be accomodate in the memory at the same time and some has to use auxillary memory, then it is external sorting.
    		
    	Stable and not-stable sorting:
    	
    	
    	
    	-If a sorting algorithm after sorting the contents, does not change the sequence of similar content in which they appear, is calle stable sorting.
    	
    	-If a sorting algorithm, after sorting the contents, changes the sequence of similar content in which they are appear, it is called as unstable sorting.
