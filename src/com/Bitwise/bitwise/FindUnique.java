package src.com.Bitwise.bitwise;

public class FindUnique {

	public static void main(String[] args) {
		int [] arr= {3,4,5,7,5,4,3};
		System.out.println(findans(arr));
	}
	public static int findans(int [] arr)
	{
		int unique=0;
		for(int n:arr)
		{
			unique^=n;
		}
		return unique;
	}

}
