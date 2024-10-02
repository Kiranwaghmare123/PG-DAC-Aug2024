### Types of Binary Trees

1. **Strict Binary Tree**:
   - A **strict binary tree** (or **proper** or **2-tree**) is a tree where every node has either **0** or **2** children.
   - In other words, no node can have only one child.
   
   **Example**:
   ```
       1
      / \
     2   3
    / \   \
   4   5   6
   ```
   - Node 1 has two children (2, 3), nodes 2 and 3 also follow the rule, and nodes 4, 5, and 6 have zero children.
   - Node 3 violates the strict property because it has only one child.

2. **Full Binary Tree**:
   - A **full binary tree** is a tree in which every node has either **0** or **2** children (similar to strict binary tree).
   - The key difference is the context and emphasis. A **full binary tree** is often used interchangeably with a **strict binary tree**, although "full" generally stresses the idea that the tree has no nodes with one child.

   **Example**:
   ```
       1
      / \
     2   3
    / \ / \
   4  5 6  7
   ```
   - Each node either has zero or exactly two children.
   - Node 4, 5, 6, and 7 are leaf nodes with no children.

3. **Complete Binary Tree**:
   - A **complete binary tree** is a binary tree in which **all levels**, except possibly the last, are completely filled, and all nodes are as far left as possible on the last level.
   
   **Example**:
   ```
       1
      / \
     2   3
    / \  /
   4   5 6
   ```
   - The nodes are filled from left to right. The last level is not completely filled, but all nodes are as far left as possible.

4. **Almost Complete Binary Tree (ACBT)**:
   - An **almost complete binary tree** is essentially the same as a **complete binary tree**, but emphasizes the fact that the nodes at the last level may not fill up the entire row but should still be positioned as left as possible.

   **Example**:
   ```
       1
      / \
     2   3
    / \  
   4   5
   ```
   - The last level is not filled completely (it lacks right children), but all nodes are pushed to the left.

5. **Perfect Binary Tree**:
   - A **perfect binary tree** is a binary tree in which **all internal nodes have two children** and **all leaf nodes are at the same level**.
   - This tree is perfectly balanced, with all leaves at the maximum depth.
   
   **Example**:
   ```
       1
      / \
     2   3
    / \ / \
   4  5 6  7
   ```
   - All internal nodes (1, 2, 3) have two children, and all leaves (4, 5, 6, 7) are on the same level.

6. **Incomplete Binary Tree**:
   - An **incomplete binary tree** is the opposite of a complete or perfect binary tree.
   - This tree doesn't fill up all levels completely or doesn’t push nodes to the left.
   
   **Example**:
   ```
       1
      /
     2
    / \
   4   5
   ```
   - The tree is missing several nodes, making it unbalanced or incomplete.
