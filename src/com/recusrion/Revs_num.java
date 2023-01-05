package src.com.recusrion;

public class Revs_num {
	static int sum=0;

	public static void main(String[] args) 
	{
		int num=1234;
		rev1(num);
		System.out.print(sum);
		
	}
	static void rev1(int num)
	{
		if(num==0)
		{
			return;
		}
		int rem=num%10;
		sum=sum*10+rem;
		rev1(num/10);
		
		
		
	}

}
