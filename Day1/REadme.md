----------------------------------------
### Day 1 : Algorithms and Data Structures
----------------------------------------
### Topic: Introduction to ADS
----------------------------------------
### Topics:
	-Problem Solving & Computational Thinking
	-Algorithm & Data Structure
		-OODesign: ADTs
	-Recursion
		-Base condition
		-Direct & indirect recursion
		-Memory allocation
		-Pros and Cons
		-Complexity analysis

	
### Problem:
    -doubtful situation which requires solution: Travel to Goa (222)
    Strategy: 
    	Days, Time Hotel, travel(road/Flight), no of people....
    Constraints:
    	budget, time, capacity
	
    Solution:
    -----------
    1. Define the problem
    2. Analyse the problem
    3. Identify potential solutions
    4. Evalute and choose the best solution
    5. Plan action
    6. Implement and review the results

    
### Problem Solving and Computational Thinking:
    Computational Thinking: It is a problem solving process that includes
    1. Decomposition
    	-Breaking down the data, process or problems into smaller and managable task
    2. Pattern Recognition
    	-Observing patterns, trends and regularities in data
    3. Abstraction
    	-Identifying the general principles that generate these patterns
    4. Algorithm Design
    	-Developing the step by step instructions for solving theis and similar problems
    
    
    Some basic techniques for Logic building:
    1. Flow chart
    2. Algorithms
    3. Pseudo code

    Data: Collection of raw facts.
    
    Algorithms:The essence of a computational procedure, in step by step manure.
    
    Program:An implementation of an algorithm in some programming language.
    
    Data structure: Organization of data needed to solve the problem.

### Algorithm:
	-A step-by-step procedure to solve a real time problem or to perform any taks.
	-Algorithm is awell defined, step by step xomputational procedure that takes a set of inputs and produce a desired output.
	
### Characteristics for Algorithms:
-------------------------------
	-Finite: Must terminate after a finite number of steps.
	-Definite: Each step must be precisely defined.
	-Input: Takes zero or more inputs.
	-Output: Produce at least one output.
	-Effective: Each step must be basic and achievable.
	
### Types of Algorithm strategies:
-------------------------------
    1. Greedy Technique: 
    	-Makes the locally optimal choice at each step with the hope of finding a global optimum.
    	-e.g. Dijkstra's Algorithm.
    
    2. Divide and Conquer:
    	-Breaks the problem into smaller subproblems, solves them recursively, and combines the results.
    	-e.g.,Merge sort, Quick sort.
    	
    3. Dynamic Programming:
    	-Solves complex problems by braking them down into simpler subproblems and solving each once.
    	-e.g. Fibonacci, Knapsack problem.
    
    4. Brute Force:
    	-Tries all possible solutions untill the correct one is found
    	-e,g., String matching
    	
    5. Recursive:
    	-Solves a problem by solving smaller instances of the same program.
    	-e.g., Tower of Hanoi, Factorial
    	
    6.Search Algorithms:
    	-Finds an element in data structure
    	-e.g., Binary search, Linear search
    	
    7. Sorting Algorithms:
    	-Order the elements in a particular sequence.
    	-e.g., Bubble sort, selection sort, insertion
	
### Algorithm Analysis:
------------------
    1.Time Complexity:
    	-Measures the time of an algorithm takes as a function of the input size.
    
    2.Space complexity:
    	-Measures of the amount of memory consume by an algorithm uses  as a function of the input size.
    	
    3. Big O Notation:
    	-Best case
    	-Average case
    	-Worst case
	
### Data Structures:
----------------
	-A way of organizing, managing and storing data to enable efficient access and modification.
	-A data structure is a particular way of organizing , managing and storing data in a computer so that it can be used efficiently.
	-It defines the relationship between data, the operations that can be performed on the data and the methods of accessing or modifying it.
	-Data structures are crucial for developing efficient algorithms and are foundational for handling and processing data in various appilcations.
	
### Types of Data structure:
------------------------
    1. Linear Data strucutre:
    	-Data elements are arranged sequentially.
    	-e.g., Arrays, Linked List
    	
    	-Array: A collection of elements stored at contiguous memory location.
    	-Linked list: A linear collection of data elements, where each element points to the next
    	-Stack: Follows Last-In-First-Out (LIFO)
    	-Queue: Follows First-In-First-Out (FIFO)
    	-Hash Table: Stores key-vlaue pairs, offering fast lookup.
    
    2. Non-linear Data structure:
    	-Data elements are arranged hierarchically or in network.
    	-e.g., Trees, Graphs
    	
    	-Tree: A hierarchical structure with root, nodes, and edges (Binary Tree, AVL Tree)
    	-Graph: Consists of nodes(vertices) connected edges (Directed, undirected)
    	-Heap: A complete binary tree that maintains a specific order (Min-heap, Max-heap)
	
### Application on Data Structure:
--------------------------------
    Array : Sorted fixed data :Contact list
    Linked list: Implementing queues, stack and graph.
    Stack: Redo-Undo functionality, syntax parsing, expression evaluation
    Queue: Printer job queue, CPU task scheduling
    Tree: Hierarchical data storage(file system), database(B-Trees)
    Graph: Social network, road maps, and web page links

### Operations on Data Structures:
--------------------------------

    1.Traversing: Accesssing the element
    2.Searching: Finding the element at particular location
    3.Insertion: Adding a new element
    4.Deletion: Removing an element
    5.Sorting: Arangement elements in a particular order.
    6.Merging: Combining two data structure into one.

### Static Data Structure:
	-A static data structure is a fixed-size structure that allocates a predefined amount of memory at compile time.
	
	Characteristes:
	-Fixed size:
	-Memory allocation:
	-Access speed:
	-Efficient:
	
	Eg:
	class Test{
		public static void main(String args[]){
			int[] arr = new int[5]; //Fixed-size array length of 5
			arr[0] = 10;
			arr[1] = 20;
			arr[2] = 30;
			
			System.out.println(arr[1]);
		}
	}
	
### Dynamic Data Structure:
	-A dynamic data structure can grow or shrink in size during program execution.
	-It allocates memory as needed at runtime.
	
	Characteristics:
	-Variable-size:
	-Memory allocation:
	-Flexibility:
	-Overhead:

	Eg:
	class Test{
		public static void main(String args[]){
			LinkedList<Integer> dy = new LinkedList<>();
			
			dy.add(10);
			dy.add(20);
			
			System.out.println(dy.get(1));// 20
		}
	}
	
### Abstract Data Structure: (ADT)
---------------------------------
    -ADT is a type or class  for objects whose behaviour is defined  by the set of rules.
    -The definition of ADT only mentiones what operations are to be performed but not how to perform or how to implement.
    -It does not specify how data will be organized in memory and what algorithms are used for implementation. It is called 'abstract' because it give an implementation-independent view.
     
     
     Optimize the program: Make use og ADT (Java Collection Framework)
     
 ### Recursion:
 ----------
     -Any function which calls itself directly or indirectly is called recursion. 
     -The corresponding function is called recursive function.
     e.g:
     
     //Recursion
     void test()
     {
     
     test();// recursive call : copy of test function
     
     }
     
     p. s. v. main(){
     ....
     test();
     ....
     }

    -A recursive method solves problem by calling a copy of itself to work on a smaller problem.
    -It is also important to ensure that the recursion must terminate.
    -Each time the function call itself with a slightly simple version of the original problem.
    
### Types of recursion:
------------------
    1. Direct recursion:
    -A function fun() is called direct recursive if it calls the same function.
    
    eg:
    	void fun()
    	{
    		fun();
    	}
    
    2. Indirect Recursion:
    -A function fun is called indirect recursive if it calls another function say fun1 and fun2 directly or indirectly.
    eg:
    	void fun1()
    	{
    		fun2();
    	}
    	
    
      	void fun2()
  	{
  		fun1();
  	}
  	
