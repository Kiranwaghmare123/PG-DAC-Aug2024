//Infinite loop
class DQueue{
	
	
	int size = 5;
	int DQ[] = new int[size];
	int front, rear;
	
	DQueue()
	{
		front = -1;
		rear = 0;
	}
	
	boolean isEmpty()
	{
		return (front == -1);
	}
	
	boolean isFull ()
	{
		return ((front == 0 && rear == size-1) || front == rear + 1);
	}
	
	void insertfront(int key) {
        if (isFull()) {
            System.out.println("Overflow");
            return;
        }

        // If queue is initially empty
        if (front == -1) {
            front = 0;
            rear = 0;
        }

        // Front is at the first position of the array
        else if (front == 0)
            front = size - 1;

        else
            front = front - 1;

        DQ[front] = key;
    }

    void insertrear(int key) {
        if (isFull()) {
            System.out.println("Overflow");
            return;
        }

        // If queue is initially empty
        if (front == -1) {
            front = 0;
            rear = 0;
        }

        // Rear is at the last position of the array
        else if (rear == size - 1)
            rear = 0;

        else
            rear = rear + 1;

        DQ[rear] = key;
    }

    void deletefront() {
        if (isEmpty()) {
            System.out.println("Queue Underflow");
            return;
        }

        // Deque has only one element
        if (front == rear) {
            front = -1;
            rear = -1;
        } else if (front == size - 1)
            front = 0;

        else
            front = front + 1;
    }

    void deleterear() {
        if (isEmpty()) {
            System.out.println("Underflow");
            return;
        }

        // Deque has only one element
        if (front == rear) {
            front = -1;
            rear = -1;
        } else if (rear == 0)
            rear = size - 1;

        else
            rear = rear - 1;
    }

    int getFront() {
        if (isEmpty()) {
            System.out.println("Underflow");
            return -1;
        }
        return DQ[front];
    }

    int getRear() {
        if (isEmpty() || rear < 0) {
            System.out.println("Underflow");
            return -1;
        }
        return DQ[rear];
    }

    public static void main(String[] args) {

        DQueue dq = new DQueue();

        System.out.println("Insert at rear end: 12");
        dq.insertrear(12);

        System.out.println("Insert at rear end: 14");
        dq.insertrear(14);

        System.out.println("Get rear element: " + dq.getRear());

        dq.deleterear();
        System.out.println("After delete rear element new rear becomes: " + dq.getRear());

        System.out.println("Inserting element at front end");
        dq.insertfront(13);

        System.out.println("Get front element: " + dq.getFront());

        dq.deletefront();
        System.out.println("After delete front element new front becomes: " + dq.getFront());
    }
}
