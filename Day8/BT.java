class BT{
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
	
	BT()
	{
		root = null;
	}
	
	BT(int d)
	{
		root = new Node(d);
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
 
  void printPreorder(Node node)
 {
	 if(node == null)
		 return;
	 System.out.print(node.data+" ");//Root
	 printPreorder(node.left);//Left subtree
	 printPreorder(node.right);//Right subtree
	 
 }
 void preorder()
 {
	 printPreorder(root);
 }
 
 void printPostorder(Node node)
 {
	 if(node == null)
		 return;
	 
	 printPostorder(node.left);//Left subtree
	 printPostorder(node.right);//Right subtree
	 System.out.print(node.data+" ");//Root
	 
 }
  void postorder()
 {
	 printPostorder(root);
 }
	public static void main(String args[])
	{
		BT t1 = new BT();
		t1.root = new Node(11);
		t1.root.left = new Node(22);
		t1.root.right = new Node(33);
		t1.root.left.left = new Node(44);
		t1.root.left.right = new Node(55);
		
		System.out.println("PreOrder:");
		t1.preorder();
		System.out.println();
		
		System.out.println("InOrder:");
		t1.inorder();
		System.out.println();
		
		System.out.println("PostOrder:");
		t1.postorder();
		System.out.println();
	}
	

}