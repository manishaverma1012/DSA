package src.com.Bitwise.bitwise;

public class BitManipulation {

	public static void main(String[] args) {
		int n=45;
		System.out.println(isOdd(n));

	}
	public static boolean isOdd(int n)
	{
		return (n&1)==1;
	}

}
