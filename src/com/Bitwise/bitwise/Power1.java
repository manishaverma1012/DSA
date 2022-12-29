package src.com.Bitwise.bitwise;

public class Power1 {

	public static void main(String[] args) {
		int base=4;
		int power=5;
		power(base,power);
		// TODO Auto-generated method stub

	}
	public static void  power (int power,int base)
	{
		int ans=1;
		while(power>0)
		{
			if((power & 1)==1)
			{
				ans*=base;
			}
			base*=base;
			power=power>>1;
		}
		System.out.println(ans);
	}

}
