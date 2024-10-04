class QSorting{
	
	static void quicksort(int a1[],int low,int high)
	{
		if(low<high)
		{
			int pi=partition(a1,low,high);//Important
			quicksort(a1,low,pi-1);//Left partition
			quicksort(a1,pi+1,high);//right partition
		}
	}
	
	static int partition(int a1[], int low, int high)
	{
		int pivot = a1[high];
		int i = low;
		
		for(int j=low;j<high;j++)
		{
			if(a1[j] < pivot)
			{
				i++;
				swap(a1,i,j);
			}
		}
		swap(a1,i+1,high);
		return (i+1);
		
	}
	
	static void swap(int a1[], int i, int j)
	{
		int temp = a1[i];
		a1[i] = a1[j];
		a1[j] = temp;
	}
	
	
	
	static void display(int a1[])
	{
		for(int i=0;i<a1.length;i++)
		{
			System.out.print(a1[i]+" ");
		}
	}
	
	public static void main(String args[])
	{
		int a1[]={2,13,24,56,45,9,30};
		int n = a1.length;
		display(a1);
		System.out.println();
		quicksort(a1,0,n-1);
		display(a1);
		
	}
		
}