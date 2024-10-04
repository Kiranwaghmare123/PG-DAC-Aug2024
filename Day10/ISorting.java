
Concept:Build a sorted array with one elementat a time by comparing and inserting the new element at its proper position.

Time complexity:
Best case: O(n)
Average case: O(n^2)
Worst case: O(n^2)
Stable sorting technique
Internal sorting


class ISorting{
	
	static void isort(int a1[])
	{
		int n = a1.length;
		for(int i=1;i<n;i++)
		{
			int key = a1[i];
			int j=i-1;
			while(j>=0 && a1[j]>key)
			{
				a1[j+1] = a1[j];
				j=j-1;
			}
			a1[j+1] = key;
			
			
		}
		
		
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
		display(a1);
		System.out.println();
		isort(a1);
		display(a1);
		
	}
		
}