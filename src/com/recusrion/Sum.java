package src.com.recusrion;

public class Sum {

	public static void main(String[] args) {
		int num=1345678;
		System.out.println((sumdigit(num)));
		

	}
	public static int sum(int n)
	{
		if(n==1)
		{
			System.out.println(n);
			return 1;
		}
		System.out.println(n);
		return n+sum(n-1);
		
	}
	
	public static int fact(int n)
	{
		if(n==1)
		{
			return 1;
		}
		return n*fact(n-1);
	}
	public static int sumdigit(int n)
	{
		if(n%10==n)
		{
			return n;
		}
		return n%10+sumdigit(n/10);
		
	}

}
