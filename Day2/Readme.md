
----------------------------------------
### Day 2 : Algorithms and Data Structures
----------------------------------------
    Topic: Introduction to ADS
    Date: 25/9/2024
    Meeting ID:	832 1579 8576
    ----------------------------------------
    Topics:
    	-Recursion
    	-Backtracking
    	-Arrays
	
### Examples of Recursion:
	-Tower of Hanoi
	-Factorial
	-Fibonacci series
	-GCD
	-Printing all permutations of the given string
	-Generate all strings of n bits of binary number

### Recursion Type:
-----------------
    -These are 2 types of recusive call in the function.
    	1. Tail Recursion:
    	2. Head Recursion
    -When you give recursive call within the function and how the function progresses 
    to the base case is defined in head and tail recursion.
    
    Head Recursion:
    --------------
    	-It is the recursive call made before any other operations or 
    	calculations in the function.The function performs after the recursive call.
    
    Tail Recursion:
    ---------------	
    	-It is the recursive call made after all the processing in the function.The
    	function performs its operations first, and the recursive call is the last operation 
    	performed before returning.
    	
### Backtracking:
-------------
    Backtracking is an algorithm strategy for solving problems by exploring possible solutions anddead end solutions as it is determined they can no tlead to the solution.
    -problem solving techniques
    -It involves exploration of different paths to find a solution.
    -It provides multiple choice, and backtrack tries each option.

### Key concepts:
------------
    1. Partial solution:
    	-Backtracking works by building a solution one piece at a time.generally by adding or modifying parts of the solution in a way that is consistent with the problem constraints.
    	
    2. Feasibility Check:
    	-The algorithm checks whether the current parital solution can possibley lead to a complete valid solution. If not, it backtrack.
    
    3. Recursive Exploration:
    	-It is implemented with recusion and algorithm will explores one  possibility at a time and recurse into it.
    	
    4.Backtrack condition:
    	-If a solution is found to be invalid or leads to no solution, the algorithm backtracks to the previous step and try alternate route.
    	
    	
### Backtrack working:
------------------
    1. Initial DEcision Point:
    	-make intial choice for setting parameter for the algorithm.
    2.REcursive exploration:
    	-for each decision, algorithm proceedd recursive.
    3.Solution check:
    	-It checks and make current decision to a valid solution.
    4.Backtrack and try new option:
    	-If no options are valid the algorithm backtracks to the previous decision points
    5.Completion:
    	-Continue till get the solution.
    	
    Note: CHOOSE--->EXPORE---->BACKTRACK

### Applications:
-----------------
    1. N-Queen Problem:
    	-Placing N queens on an N X N chessboard such that no two queens threaten each other.
    
    2. Sudoku Solver:
    	-Filling in the missing numbers in a Sudoku puzzle
    	
    3. Maze Solving:
    	-Finding a path from start to end in maze
    	
    4. Graph Coloring:
    	-Assign colors to the vertices of a graph such that no two adjacent vertices have the same color.
    	
    5. Subsets/Permutation/Combinations:
    	-Numbers or String text
    	
    6. Knapsack problem:
    	-Solving  variations of the knapsack problem by exploring all possible ways to pack items into a knapsack
    	
### Homework:
    Difference:
    1. Linear and Nonlinear Data structure
    2. Static and Dynamic Data Structures
    3. ITeration and Recursion
    4. Recursion and Backtracking
    5. BAcktracking and branch and bound technique
    6. Head and Tail Recursion

	
### Permutaion: String
    "ABC"
    
    ABC
    ACB
    BAC
    BCA
    CAB
    CBA

### Arrays:
-------
    -finite, ordered, and homogeneous
    -An array is a finite, ordered, collection of homogeneous data elements.
    	-finite: it contains a limited number of elements.
    	-ordered: elements are stored one by one in contiguous locations of computer memory in a linear fashion.
    	-homogeneous: all elements of an array are of the same data type.


### Need for Array Data Structure:
------------------------------
    -Stores data for processing.
    -Implement data structures such as stacks and queue
    -2D: represent data in tables and matrix
    -Create dynamic data structures like linked lists and trees.

### Array Operations:
-------------------
    Insertion
    Deletion
    Searching
    Sorting
    Traversal
    Merging
