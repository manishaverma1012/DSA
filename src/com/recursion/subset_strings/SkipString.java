package src.com.recursion.subset_strings;

public class SkipString {

	public static void main(String[] args) {
		System.out.println(skipNotApple("bappfhapple"));
		

	}
	static String skipApple(String up)
	{
		if(up.isEmpty())
		{
			return "";
		}
		if(up.startsWith("apple"))
		{
			return skipApple(up.substring(5));
		}
		else
		{
			return up.charAt(0)+skipApple(up.substring(1));
		}
	}
	static String skipNotApple(String up)
	{
		if(up.isEmpty())
		{
			return "";
		}
		if(up.startsWith("app")&& !up.startsWith("apple"))
		{
			return skipNotApple(up.substring(3));
		}
		else
		{
			return up.charAt(0)+skipNotApple(up.substring(1));
		}
	}
	

}
