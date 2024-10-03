class RedBlackTreeNode {
    int key;
    RedBlackTreeNode left, right, parent;
    boolean isRed;

    public RedBlackTreeNode(int key) {
        this.key = key;
        isRed = true; // New node is always red initially
    }
}

class RedBlackTree {
    private RedBlackTreeNode root;

    // Left rotation
    private void leftRotate(RedBlackTreeNode x) {
        RedBlackTreeNode y = x.right;
        x.right = y.left;

        if (y.left != null) y.left.parent = x;
        y.parent = x.parent;

        if (x.parent == null) root = y;
        else if (x == x.parent.left) x.parent.left = y;
        else x.parent.right = y;

        y.left = x;
        x.parent = y;
    }

    // Right rotation
    private void rightRotate(RedBlackTreeNode y) {
        RedBlackTreeNode x = y.left;
        y.left = x.right;

        if (x.right != null) x.right.parent = y;
        x.parent = y.parent;

        if (y.parent == null) root = x;
        else if (y == y.parent.left) y.parent.left = x;
        else y.parent.right = x;

        x.right = y;
        y.parent = x;
    }

    // Insert node and fix violations
    public void insert(int key) {
        RedBlackTreeNode node = new RedBlackTreeNode(key);
        root = bstInsert(root, node);
        fixViolations(node);
    }

    // Binary search tree insert
    private RedBlackTreeNode bstInsert(RedBlackTreeNode root, RedBlackTreeNode node) {
        if (root == null) return node;

        if (node.key < root.key) {
            root.left = bstInsert(root.left, node);
            root.left.parent = root;
        } else if (node.key > root.key) {
            root.right = bstInsert(root.right, node);
            root.right.parent = root;
        }

        return root;
    }

    // Fix Red-Black Tree violations
    private void fixViolations(RedBlackTreeNode node) {
        RedBlackTreeNode parent = null, grandparent = null;

        while (node != root && node.isRed && node.parent.isRed) {
            parent = node.parent;
            grandparent = parent.parent;

            // Case A: Parent is the left child of grandparent
            if (parent == grandparent.left) {
                RedBlackTreeNode uncle = grandparent.right;

                // Case 1: Uncle is red (recoloring required)
                if (uncle != null && uncle.isRed) {
                    grandparent.isRed = true;
                    parent.isRed = false;
                    uncle.isRed = false;
                    node = grandparent;
                } else {
                    // Case 2: Node is the right child of its parent (left rotate required)
                    if (node == parent.right) {
                        leftRotate(parent);
                        node = parent;
                        parent = node.parent;
                    }

                    // Case 3: Node is the left child (right rotate required)
                    rightRotate(grandparent);
                    boolean tmp = parent.isRed;
                    parent.isRed = grandparent.isRed;
                    grandparent.isRed = tmp;
                    node = parent;
                }
            }

            // Case B: Parent is the right child of grandparent
            else {
                RedBlackTreeNode uncle = grandparent.left;

                // Case 1: Uncle is red (recoloring required)
                if (uncle != null && uncle.isRed) {
                    grandparent.isRed = true;
                    parent.isRed = false;
                    uncle.isRed = false;
                    node = grandparent;
                } else {
                    // Case 2: Node is the left child of its parent (right rotate required)
                    if (node == parent.left) {
                        rightRotate(parent);
                        node = parent;
                        parent = node.parent;
                    }

                    // Case 3: Node is the right child (left rotate required)
                    leftRotate(grandparent);
                    boolean tmp = parent.isRed;
                    parent.isRed = grandparent.isRed;
                    grandparent.isRed = tmp;
                    node = parent;
                }
            }
        }

        root.isRed = false; // Root is always black
    }

    // Inorder traversal of the Red-Black Tree
    public void inorderTraversal(RedBlackTreeNode node) {
        if (node == null) return;
        inorderTraversal(node.left);
        System.out.print((node.isRed ? "R" : "B") + node.key + " ");
        inorderTraversal(node.right);
    }

    public static void main(String[] args) {
        RedBlackTree tree = new RedBlackTree();
        tree.insert(10);
        tree.insert(20);
        tree.insert(30);
        tree.insert(15);
        tree.insert(25);
        tree.insert(5);

        System.out.println("In-order traversal of Red-Black Tree:");
        tree.inorderTraversal(tree.root);  // Example Output: B5 R10 B15 R20 B25 R30
    }
}