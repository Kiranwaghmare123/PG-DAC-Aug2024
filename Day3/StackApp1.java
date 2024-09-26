class Stack {
    private int max;
    private int[] S1; // Array to store stack elements
    private int top;

    // Constructor to initialize stack
    Stack(int s) {
        top = -1;
        max = s;
        S1 = new int[max]; 
    }

    // Push method 
    public void push(int x) {
        if (!isFull()) {
            S1[++top] = x; // Increment top and add element
        } else {
            System.out.println("Stack is full. Push operation failed.");
        }
    }

    // Pop method 
    public int pop() {
        if (!isEmpty()) {
            return S1[top--]; // Return the top element and decrement top
        } else {
            System.out.println("Stack is empty. Pop operation failed.");
            return -1; // Return -1
        }
    }

    // Peek method to return the top element without removing it
    public long peek() {
        if (!isEmpty()) {
            return S1[top];
        } else {
            System.out.println("Stack is empty. Peek operation failed.");
            return -1; // Return -1 to indicate an error
        }
    }

    // Method to check if the stack is empty
    public boolean isEmpty() {
        return (top == -1);
    }

    // Method to check if the stack is full
    public boolean isFull() {
        return (top >= (max - 1));
    }

    // Method to display the elements in the stack
    public void display() {
        if (isEmpty()) {
            System.out.println("Stack is empty.");
        } else {
            for (int i = 0; i <= top; i++) {
                System.out.println(S1[i]);
            }
        }
    }
}

class StackApp1 {
    
    public static void reverse(StringBuffer str) {
        int n = str.length();
        Stack s1 = new Stack(n); // Create a stack of the same size as the string

        // Push each character of the string into the stack
        for (int i = 0; i < n; i++) {
            s1.push(str.charAt(i));
        }

        
        for (int i = 0; i < n; i++) {
            char ch = (char) s1.pop(); 
            str.setCharAt(i, ch); 
        }
    }

    public static void main(String args[]) {
        StringBuffer s = new StringBuffer("CDAC Mumbai");
        reverse(s); // Reverse the string
        System.out.println("Reverse of the string = " + s); 
    }
}