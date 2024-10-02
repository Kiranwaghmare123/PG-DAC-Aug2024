### Day 8 : Algorithms and Data Structures
    ----------------------------------------
    Topic: Introduction to ADS
    Date: 02/10/2024
    Meeting ID: 832 1579 8576
    Passcode:	806920
    ----------------------------------------
    Topics:
    	-Tree
    	-Binary Tree
    	-Tree Traversal
    	-Binary Search Tree
	
 ### Relationship of Parent and LC and RC:
     LC= 2i + 1
     RC =2i + 2
     Parent = (i-1)/2
 
### Representation of Tree:
     1.Using Array
     
     2.Using Linked list
     
     class Node{
     int data;
     Node left;
     Node right;
     
     Node(int d)
     {
    	 data = d;
    	 left=regiht =null;
     }
     }
     
 ### Tree Traversals:
 -------------------
     1. Pre-order : Root, LC, RC
     2. In-order :  LC, Root, RC
     3. Post-order : LC, RC, Root
     
     
     void printInorder(Node node)
     {
    	 if(node == null)
    		 return;
    	 printInorder(node.left);
    	 System.out.print(node.data+" ");
    	 PrintInorder(node.right);
    	 
     }
      void inorder()
     {
    	 printInorder(root);
     }
     
      void printPreorder(Node node)
     {
    	 if(node == null)
    		 return;
    	 System.out.print(node.data+" ");//Root
    	 printPreorder(node.left);//Left subtree
    	 PrintPreorder(node.right);//Right subtree
    	 
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
    	 PrintPostorder(node.right);//Right subtree
    	 System.out.print(node.data+" ");//Root
    	 
     }
      void postorder()
     {
    	 printPostorder(root);
     }
     
