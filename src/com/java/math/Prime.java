package src.com.java.math;

public class Prime {

	public static void main(String[] args) {
		int n=9;
		for(int i=0;i<=9;i++)
		{
			System.out.println(i+" "+ seive(i));
		}
	}
	public static boolean seive(int n)
	{
		if(n<=1)
		{
			return false;
		}
		int c=2;
		while(c*c<=n)
		{
			if(n%c==0)
			{
				return false;
			}
			c++;
		}
		return  true;
	}

}
