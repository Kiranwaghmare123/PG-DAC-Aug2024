//Finite loop
class Recursion5{
	
	static int fib(int n){
		if (n <= 1)
		{
				return n;
		}
		return fib(n-1)+fib(n-2);
	}
	
	public static void main(String args[])
	{
		int num=100;
		
		for(int i=0;i<=num;i++)
		{
			System.out.print(fib(i)+" ");
		}
		
	}
}