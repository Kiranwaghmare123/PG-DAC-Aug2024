class SSorting{
	
	static void ssort(int a1[])
	{
		int n = a1.length;
		for(int i=0;i<n-1;i++)
		{
			int min = i;
			for(int j=i+1;j<n;j++)
			{
				if(a1[j] < a1[min])
					min = j;				
			}
			int temp = a1[min];
			a1[min] = a1[i];
			a1[i] = temp;
			
			
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
		ssort(a1);
		display(a1);
		
	}
		
}