//Infinite loop
class Recursion4{
	
	static int fact(int n)
	{
		if(n<=1)
			return 1;
		else
			return n*fact(n-1);
	}
	public static void main(String args[])
	{
		System.out.println(fact(5));// call for method
	}
}