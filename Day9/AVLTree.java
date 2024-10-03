class AVLTreeNode {
    int key, height;
    AVLTreeNode left, right;

    AVLTreeNode(int key) {
        this.key = key;
        height = 1;
    }
}

class AVLTree {
    AVLTreeNode root;

    // Get the height of the node
    int height(AVLTreeNode node) {
        if (node == null) return 0;
        return node.height;
    }

    // Get the balance factor of the node
    int getBalance(AVLTreeNode node) {
        if (node == null) return 0;
        return height(node.left) - height(node.right);
    }

    // Right rotation
    AVLTreeNode rightRotate(AVLTreeNode y) {
        AVLTreeNode x = y.left;
        AVLTreeNode T2 = x.right;

        x.right = y;
        y.left = T2;

        // Update heights
        y.height = Math.max(height(y.left), height(y.right)) + 1;
        x.height = Math.max(height(x.left), height(x.right)) + 1;

        return x; // New root
    }

    // Left rotation
    AVLTreeNode leftRotate(AVLTreeNode x) {
        AVLTreeNode y = x.right;
        AVLTreeNode T2 = y.left;

        y.left = x;
        x.right = T2;

        // Update heights
        x.height = Math.max(height(x.left), height(x.right)) + 1;
        y.height = Math.max(height(y.left), height(y.right)) + 1;

        return y; // New root
    }

    // Insert a node
    AVLTreeNode insert(AVLTreeNode node, int key) {
        if (node == null) return new AVLTreeNode(key);

        if (key < node.key)
            node.left = insert(node.left, key);
        else if (key > node.key)
            node.right = insert(node.right, key);
        else
            return node;  // No duplicates allowed

        // Update height
        node.height = 1 + Math.max(height(node.left), height(node.right));

        // Get balance factor
        int balance = getBalance(node);

        // If the node is unbalanced, rotate
        // Left-Left Case
        if (balance > 1 && key < node.left.key)
            return rightRotate(node);

        // Right-Right Case
        if (balance < -1 && key > node.right.key)
            return leftRotate(node);

        // Left-Right Case
        if (balance > 1 && key > node.left.key) {
            node.left = leftRotate(node.left);
            return rightRotate(node);
        }

        // Right-Left Case
        if (balance < -1 && key < node.right.key) {
            node.right = rightRotate(node.right);
            return leftRotate(node);
        }

        return node; // return unchanged node pointer
    }

    // Utility function to print the tree (in-order traversal)
    void inOrder(AVLTreeNode node) {
        if (node != null) {
            inOrder(node.left);
            System.out.print(node.key + " ");
            inOrder(node.right);
        }
    }

    public static void main(String[] args) {
        AVLTree tree = new AVLTree();
        
        // Insert nodes
        tree.root = tree.insert(tree.root, 10);
        tree.root = tree.insert(tree.root, 20);
        tree.root = tree.insert(tree.root, 30);
        tree.root = tree.insert(tree.root, 40);
        tree.root = tree.insert(tree.root, 50);
        tree.root = tree.insert(tree.root, 25);

        // Print the tree
        System.out.print("In-order traversal: ");
        tree.inOrder(tree.root);
    }
}