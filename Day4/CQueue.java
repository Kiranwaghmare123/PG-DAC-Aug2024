//Infinite loop
class CQueue{
	
	
	int size = 5;
	int CQ[] = new int[size];
	int front, rear;
	
	CQueue()
	{
		front = -1;
		rear = -1;
	}
	
	boolean isEmpty()
	{
		return (front == -1);
	}
	
	boolean isFull ()
	{
		return ((rear + 1) % size == front);
	}
	
	void enqueue(int x)
	{
		if(isFull())
		{
			System.out.println("Queue is full !");
		}
		else
		{
			if(front == -1)
			{
				front = 0;// set front to 0 if queue is empty
			}
			rear = (rear + 1) % size;//r++
			CQ[rear] = x;
			System.out.println(x + " Inserted");
		}
	}

	int dequeue()
	{
		//Already empty queue
		if(isEmpty())
		{
			System.out.println("Queue is empty!");
			return -1;
		}
		else{
			int x = CQ[front];
			System.out.println(x+ " Deleted");
			if (front == rear)
			{
				front = -1;
				rear = -1;
			}
			else{
				front = (front+1) % size; //f++
			}
			return x;
		}
	}
	
	void display()
	{
		if(isEmpty())
		{
			System.out.println("Empty Queue !");
		}
		else{
			System.out.print("Queue elements: ");
			int i = front;
			while(i != rear)
			{
				System.out.print(CQ[i]+ " " );
				i = (i+1) % size;
			}
			
			System.out.println(CQ[rear]);
			System.out.println();
		}
		
	}
	public static void main(String args[])
	{
		CQueue q1 = new CQueue();
		q1.enqueue(11);
		q1.enqueue(12);
		q1.enqueue(13);
		q1.enqueue(14);
		q1.enqueue(11);
		q1.display();
		
		q1.dequeue();
		q1.display();
		
		
	}
}