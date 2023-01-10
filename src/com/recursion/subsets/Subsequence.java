package src.com.recursion.subsets;

import java.util.ArrayList;

public class Subsequence {

	public static void main(String[] args) 
	{
		System.out.println(subseqa("","abc"));
		// TODO Auto-generated method stub

	}
	static void subseq(String p, String up)
	{
		if(up.isEmpty())
		{
			System.out.println(p);
			return ;
	 	}
		char ch = up.charAt(0);
		subseq(p+ch,up.substring(1));
		subseq(p,up.substring(1));
	}
	static ArrayList<String> subseqa(String p, String up)
	{
		if(up.isEmpty())
		{
			
			ArrayList<String> list= new ArrayList<>();
			list.add(p);
			return list;
		}
		char ch = up.charAt(0);
		ArrayList<String> left=subseqa(p+ch,up.substring(1));
		ArrayList<String> right=subseqa(p,up.substring(1));
		left.addAll(right);
		return left;
	}
	

}
