//Finite loop
class Array{
	static int insert(int arr[],int size, int key, int capacity)
	{
		if(size >= capacity)
		{
			System.out.println("Array is full!");
			return size;
		}
		arr[size] = key;//new element
		return size+1;
	}
	static int search(int arr[],int size, int key)
	{
		for(int i=0;i<size;i++)
		{
			if(arr[i] == key)
			{
				return i;// returning index
			}
		}
		return -1;// Element not found
	}
		
	static int delete(int arr[], int size, int key)
	{
		int pos = search(arr,size,key);
		if(pos == -1)
		{
			System.out.println("Not found");
			return size;
		}
		//element is present then shift remaining elements
		for(int i=pos;i<size-1;i++)
		{
			arr[i] = arr[i+1];
		}
			
		return size-1;
	}
		
	public static void main(String args[])
	{
		int a1[] = new int[100];//capacity
		int size = 10;
		
		a1[0]=11;
		a1[1]=13;
		a1[2]=15;
		a1[3]=51;
		a1[4]=71;
		a1[5]=56;
		a1[6]=48;
		a1[7]=8;
		a1[8]=99;
		a1[9]=110;
		System.out.println();
		System.out.println("Display array");
		for(int i=0;i<size;i++)
		{
			System.out.print(a1[i]+ " ");
		}
		System.out.println();
		//---------search-----------------------
		int key = 48;
		int pos = search(a1,size,key);
		System.out.println("After search");
		System.out.println();
		if(pos != -1)
			System.out.println("Found");
		else
			System.out.println("Not Found");
		
		System.out.println();
		//-----------insert---------------------
		key =111;
		size = insert(a1, size, key,100);
		System.out.println("After insertion");
		//display the elements
		for(int i=0;i<size;i++)
		{
			System.out.print(a1[i]+ " ");
		}
		System.out.println();
		//----------delete------------------------
		key = 48;
		size = delete(a1,size,key);
		System.out.println("After deletion");
		for(int i=0;i<size;i++)
		{
			System.out.print(a1[i]+ " ");
		}
		System.out.println();
	}
}