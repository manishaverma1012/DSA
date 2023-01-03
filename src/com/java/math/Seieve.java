package src.com.java.math;

public class Seieve {

	public static void main(String[] args) {
		int n=40;
		boolean prime[]=new boolean[n+1];
		//intially all the numbers are default in this array and are false;
		seive(n,prime);

	}
	static void seive(int n,boolean prime[])
	{
		for(int i=2;i*i<=n;i++)
		{
			if(!prime[i])
			{
				for(int j=i*2;j<=n;j+=i)
				{
					prime[j]=true;
				}
			}
		}
		for(int i=2;i<=n;i++)
		{
			if(!prime[i])
			{
				System.out.println(i+" ");
			}
		}
	}

}
