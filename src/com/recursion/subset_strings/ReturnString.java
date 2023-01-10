package src.com.recursion.subset_strings;

public class ReturnString {

	public static void main(String[] args) {
		System.out.println(skip("bchhaahhh"));
		// TODO Auto-generated method stub

	}
	static String skip(String up)
	{
		if(up.isEmpty())
		{
			
			return "";
		}
		char ch=up.charAt(0);
		if(ch=='a')
		{
			return skip(up.substring(1));
		}
		else
		{
			return ch+skip(up.substring(1));
		}
	}


}
