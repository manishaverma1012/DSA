package com.array;

import java.util.Stack;

public class Brackets {

	public static void main(String[] args) {
		String name="(()))";
		Stack<Character> st=new Stack<Character>();
		for(int i=0;i<name.length();i++)
		{
			if(st.empty())
			{
				st.push(name.charAt(i));
			}
			else if(!st.empty() && name.charAt(i)==')')
			{
				st.pop();
			}
			else
			{
				st.push(name.charAt(i));
			}
					
		}
		if(st.empty())
		{
			System.out.println("True");
		}
		else
		{
			System.out.println("False");
		}
		

	}

}
