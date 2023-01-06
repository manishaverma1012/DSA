package src.com.recusrion;

public class Count0innums {

	public static void main(String[] args) {
//		int n=300987;
		System.out.print(count(300870));
	}
	static int count(int n)
	{
		
		return helper(n,0); 
	}
	static int helper(int n,int freq)
	{
		if(n==0)
		{
			return freq;
		}
		int rem= n%10;
		if(rem==0)
		{
			return helper(n/10,++freq);
		}
		return helper(n/10,freq);
		
	}

}
