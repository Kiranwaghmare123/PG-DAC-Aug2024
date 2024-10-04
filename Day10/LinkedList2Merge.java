class LinkedList2Merge {
    Node head;

  
    static class Node {
        int data;
        Node next;

       
        Node(int d) {
            data = d;
            next = null;
        }
    }

    
    void append(int newData) {
        Node newNode = new Node(newData);

        if (head == null) {
            head = newNode;
            return;
        }

        Node last = head;
        while (last.next != null) {
            last = last.next;
        }

        last.next = newNode;
    }

   
    Node sortedMerge(Node a, Node b) {
        if (a == null) return b;
        if (b == null) return a;

        Node result;

        if (a.data <= b.data) {
            result = a;
            result.next = sortedMerge(a.next, b);
        } else {
            result = b;
            result.next = sortedMerge(a, b.next);
        }

        return result;
    }

    
    Node mergeSort(Node h) {
        if (h == null || h.next == null) return h;

       
        Node middle = getMiddle(h);
        Node nextOfMiddle = middle.next;

     
        middle.next = null;

      
        Node left = mergeSort(h);
        Node right = mergeSort(nextOfMiddle);

      
        return sortedMerge(left, right);
    }

    
    Node getMiddle(Node h) {
        if (h == null) return h;

        Node slow = h, fast = h.next;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        return slow;
    }

    
    void display() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ---> ");
            temp = temp.next;
        }
        System.out.println("null");
    }

    public static void main(String[] args) {
        LinkedList2Merge list1 = new LinkedList2Merge();
        LinkedList2Merge list2 = new LinkedList2Merge();

      
        list1.append(15);
        list1.append(10);
        list1.append(5);

      
        list2.append(20);
        list2.append(3);
        list2.append(2);

       
        System.out.println("Original List 1:");
        list1.display();
        System.out.println("Original List 2:");
        list2.display();

        
        list1.head = list1.mergeSort(list1.head);
        list2.head = list2.mergeSort(list2.head);

     
        System.out.println("Sorted List 1:");
        list1.display();
        System.out.println("Sorted List 2:");
        list2.display();

      
        LinkedList2Merge mergedList = new LinkedList2Merge();
        mergedList.head = mergedList.sortedMerge(list1.head, list2.head);

       
        System.out.println("Merged Sorted List:");
        mergedList.display();
    }
}
