package src.com.recusrion;

public class Revs_num {
	static int sum=0;

	public static void main(String[] args) 
	{
		int num=1234;
//		rev1(num);
//		System.out.print(sum);
		
		System.out.print(rev2(num));
		
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
	static int rev2(int num)
	{
		int digit=(int)(Math.log10(num))+1;
		return helper(num,digit);
		
	}
	static int helper(int num,int digit)
	{
		if(num%10==num)
		{
			return num;
		}
		int rem=num%10;
		return rem*(int)(Math.pow(10, digit-1))+ helper(num/10,digit-1);
	}
	


}
