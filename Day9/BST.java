class BST{
	Node root;//starting point of tree
	
	static class Node{
	int data;
	Node left,right;
	
	Node(int d)
	{
		data = d;
		left=right=null;
	}
	}
	
	BST()
	{
		root = null;
	}
	
	BST(int d)
	{
		root = new Node(d);
	}
	
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
	
	void printinsert(int key)
	{
		root =insert(root, key);
	}

	
 void printInorder(Node node)
 {
	 //base condition
	 if(node == null)
		 return;
	 printInorder(node.left);
	 System.out.print(node.data+" ");
	 printInorder(node.right);
	 
 }
  void inorder()
 {
	 printInorder(root);//call for function
 }
 
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
	void printdelete(int key)
	{
		root = delete(root, key);
	}
	public static void main(String args[])
	{
		
		BST t1 = new BST();
		t1.printinsert(37);
		t1.printinsert(20);
		t1.printinsert(45);
		t1.printinsert(10);
		t1.printinsert(40);
		t1.printinsert(35);
		t1.printinsert(47);
		t1.printinsert(70);
		t1.printinsert(25);
		t1.printinsert(100);
		t1.printinsert(60);
		t1.printinsert(85);
		
		System.out.println("InOrder:");
		t1.inorder();
		System.out.println();
		
		t1.printdelete(10);
		System.out.println("InOrder:");
		t1.inorder();
		System.out.println();
		
		t1.printdelete(70);
		System.out.println("InOrder:");
		t1.inorder();
		System.out.println();
		
		t1.printdelete(45);
		System.out.println("InOrder:");
		t1.inorder();
		System.out.println();
		
		
				
	}
	
	

}