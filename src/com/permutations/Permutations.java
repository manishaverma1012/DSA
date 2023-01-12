package src.com.permutations;

import java.util.ArrayList;

public class Permutations {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         int ans=permutationscount("","dcba");
         System.out.println(ans);
	}
	static void permutations(String p, String up)
	{
		if(up.isEmpty())
		{
			System.out.println(p);
			return ; 
		}
		char ch=up.charAt(0);
		for(int i=0;i<=p.length();i++)
		{
			String f=p.substring(0,i);
			String s=p.substring(i,p.length());
			permutations(f+ch+s,up.substring(1));
		}
	}
	static ArrayList<String> permutationsList(String p,String up)
	{
		if(up.isEmpty())
		{
			ArrayList<String> list = new ArrayList<>();
			list.add(p);
			return list;
		}
		char ch=up.charAt(0);
		ArrayList<String> ans=new ArrayList<>();
		for(int i=0;i<=p.length();i++)
		{
			String f=p.substring(0,i);
			String s=p.substring(i,p.length());
			ans.addAll(permutationsList(f+ch+s,up.substring(1)));
		}
		return ans;
		
	}
	static int permutationscount(String p, String up)
	{
		int count=0;
		if(up.isEmpty())
		{
			
			return 1; 
		}
		char ch=up.charAt(0);
		for(int i=0;i<=p.length();i++)
		{
			String f=p.substring(0,i);
			String s=p.substring(i,p.length());
			count+= permutationscount(f+ch+s,up.substring(1));
		}
		return count;
		
	}

}
