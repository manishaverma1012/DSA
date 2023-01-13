package src.com.recursion.backtracking;

import java.util.ArrayList;

public class Phone_number {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	public static void subseq(String p, String up)
	{
		if(up.isEmpty())
		{
			System.out.println(p);
			return ;
		}
		int digit = up.charAt(0)-'0';
		for(int i=(digit-1)*3;i<digit*3;i++)
		{
			char ch=(char)('a'+i);
			subseq(p+ch,up.substring(1));
		}
		
	}
	public static ArrayList<String>  subseq1(String p, String up)
	{
		if(up.isEmpty())
		{
			ArrayList<String> list=new ArrayList<>();
			list.add(p);
			return list;
		}
		int digit = up.charAt(0)-'0';
		ArrayList<String> list=new ArrayList<>();
		for(int i=(digit-2)*3;i<(digit-1)*3;i++)
		{
			char ch=(char)('a'+i);
			list.addAll(subseq1(p+ch,up.substring(1)));
		}
		return list;
		
	}
	public static int  subseqcount(String p, String up)
	{
		if(up.isEmpty())
		{
			
			return 1;
		}
		int count=0;
		int digit = up.charAt(0)-'0';
		for(int i=(digit-1)*3;i<digit*3;i++)
		{
			char ch=(char)('a'+i);
			count=count+ subseqcount(p+ch,up.substring(1));
		}
		return count;
		
	}

}
