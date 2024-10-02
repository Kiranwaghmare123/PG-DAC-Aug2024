### Binary Search Tree (BST) - Bulleted Notes

---

### Definition:
- A **Binary Search Tree (BST)** is a binary tree data structure in which each node has a key and satisfies the following properties:
  1. **Left Subtree** of a node contains only nodes with keys **less than** the node’s key.
  2. **Right Subtree** of a node contains only nodes with keys **greater than** the node’s key.
  3. Both left and right subtrees must also be **binary search trees**.

---

### Properties of Binary Search Tree:
1. **Binary Tree Structure**:
   - Each node has at most two children (left and right).

2. **Ordering Property**:
   - The left subtree of a node contains only nodes with keys less than the node’s key.
   - The right subtree contains only nodes with keys greater than the node’s key.

3. **Search Property**:
   - Searching in a BST is efficient, with time complexity proportional to the height of the tree.
   
4. **In-Order Traversal**:
   - In-order traversal of a BST results in the keys being traversed in **ascending sorted order**.

5. **Efficiency**:
   - The efficiency of operations (search, insert, delete) in a BST depends on the tree’s height:
     - **Best case**: O(log n) (when the tree is balanced).
     - **Worst case**: O(n) (when the tree is skewed, essentially a linked list).

---

### Common Operations in BST:

#### 1. **Search Operation**:
   - Start at the root, compare the target value with the root.
     - If equal, the search is successful.
     - If the target is smaller, move to the left subtree.
     - If larger, move to the right subtree.
   - Repeat until the target is found or a null subtree is reached.
   
   **Time Complexity**: O(h), where h is the height of the tree.

#### Example:
   ```
         10
        /  \
       5    15
      / \   / \
     2   7 12  18

   Search for 12:
   - 12 > 10 → Move to the right subtree.
   - 12 < 15 → Move to the left subtree.
   - 12 = 12 → Element found.
   ```

#### 2. **Insertion Operation**:
   - Compare the new key with the root.
     - If the new key is smaller, insert it into the left subtree.
     - If larger, insert it into the right subtree.
   - Continue comparing until an appropriate null position is found.

   **Time Complexity**: O(h), where h is the height of the tree.

#### Example:
   **Insert 6 into the following tree**:
   ```
         10
        /  \
       5    15
      / \   / \
     2   7 12  18
   ```

   - 6 < 10 → Move left.
   - 6 > 5 → Move right.
   - 6 < 7 → Insert 6 to the left of 7.

   **Resulting Tree**:
   ```
         10
        /  \
       5    15
      / \   / \
     2   7 12  18
        /
       6
   ```

#### 3. **Deletion Operation**:
   - **Case 1**: Deleting a leaf node (no children).
     - Simply remove the node.
   - **Case 2**: Deleting a node with one child.
     - Replace the node with its child.
   - **Case 3**: Deleting a node with two children.
     - Replace the node with its **in-order successor** (smallest node in the right subtree) or **in-order predecessor**.

   **Time Complexity**: O(h), where h is the height of the tree.

#### Example:
   **Delete 15 from the following tree**:
   ```
         10
        /  \
       5    15
      / \   / \
     2   7 12  18
   ```

   - Node 15 has two children. Replace it with its in-order successor (the smallest node in its right subtree), which is 18.

   **Resulting Tree**:
   ```
         10
        /  \
       5    18
      / \   / 
     2   7 12
   ```

---

### Advantages of Binary Search Trees:
1. **Efficient Searching**: 
   - Can efficiently search for elements in O(log n) time if the tree is balanced.
   
2. **Dynamic Data Structure**:
   - Can handle dynamic insertion and deletion without the need for re-arrangement (unlike arrays or lists).
   
3. **Sorted Data Retrieval**:
   - In-order traversal yields the elements in sorted order.

---

### Drawbacks:
1. **Unbalanced BST**:
   - If a tree becomes skewed (like a linked list), the time complexity for operations degrades to O(n).
   - This can happen when inserting already sorted data.

---

### Balanced BSTs:
To maintain efficient performance, we often use balanced versions of BSTs like:
1. **AVL Trees**.
2. **Red-Black Trees**.
   
These trees keep the height of the tree in check to ensure O(log n) complexity.

---

### Example BST:

**Given BST**:
```
        8
       / \
      3   10
     / \    \
    1   6    14
       / \   /
      4   7 13
```

- **In-Order Traversal (Sorted Order)**: 1, 3, 4, 6, 7, 8, 10, 13, 14.
- **Searching for 7**: Start from root (8), move left to 3, then right to 6, and finally right to 7.
- **Insert 5**: Move left from root (8), then right to 6, then left to 4. Insert 5 as the right child of 4.

---

### Time and Space Complexity of Binary Search Tree (BST) Operations


### 4. **Inorder/Preorder/Postorder Traversal**
- **Time Complexity**: O(n)  
  Each traversal visits all nodes in the tree exactly once.
  
- **Space Complexity**:
  - **Worst Case**: O(n)  
    The recursion stack for traversal could take O(n) space in the worst case (for an unbalanced tree).
  - **Average Case**: O(log n)  
    For a balanced tree, the recursion stack would be proportional to the height of the tree, which is O(log n).

---

### 5. **Space Complexity of the Tree Itself**
- **Space Complexity**: O(n)  
  A binary search tree stores n nodes, and each node requires O(1) space.

---

### Summary of Time Complexity:

| Operation   | Average Case (Balanced BST) | Worst Case (Unbalanced BST) |
|-------------|-----------------------------|-----------------------------|
| Insertion   | O(log n)                    | O(n)                        |
| Searching   | O(log n)                    | O(n)                        |
| Deletion    | O(log n)                    | O(n)                        |
| Traversal   | O(n)                        | O(n)                        |

### Summary of Space Complexity:

| Operation     | Space Complexity (without recursion) | Space Complexity (with recursion) |
|---------------|--------------------------------------|-----------------------------------|
| Insertion     | O(1)                                | O(log n) or O(n)                 |
| Searching     | O(1)                                | O(log n) or O(n)                 |
| Deletion      | O(1)                                | O(log n) or O(n)                 |
| Traversal     | O(1)                                | O(log n) or O(n)                 |

### Important Points:
- In the **worst case**, where the BST becomes skewed, the operations' time complexities become O(n).
- A **balanced BST** (e.g., AVL Tree or Red-Black Tree) guarantees logarithmic time for all operations.
