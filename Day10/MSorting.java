


class MSorting{
	
	static void mergesort(int a1[],int l,int h)
	{
		if(l<h)
		{
			int m=l+(h-l)/2;//Important
			mergesort(a1,l,m);//Left array
			mergesort(a1,m+1,h);//right array
			merge(a1,l,m,h);

		}
	}
	
	static void merge(int a1[], int l, int m, int h)
	{
		int n1=m-l+1;
		int n2=h-m; 
		
		int L[] = new int[n1];
		int R[] = new int[n2];
		
		for(int i=0;i<n1;i++)
			L[i]=a1[l+i];//Left array elements
		for(int j=0;j<n2;j++)
			R[j]=a1[m+1+j];//Right array elements
		
		int i=0, j=0;
		int k=l;
		while(i<n1 && j<n2)
		{
			if(L[i] <= R[j])
			{
				a1[k]=L[i];
				i++;
			}
			else
			{
				a1[k]=R[j];
				j++;
			}
			k++;
		}
		while(i<n1)
		{
			a1[k] = L[i];
			i++;
			k++;
		}
		while(j<n2)
		{
			a1[k] = R[j];
			j++;
			k++;
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
		int n = a1.length;
		display(a1);
		System.out.println();
		mergesort(a1,0,n-1);
		display(a1);
		
	}
		
}