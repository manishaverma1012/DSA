package src.com.leetcode;

public class Leetcode557 {

	public static void main(String[] args) {
		
		String s = "Let's take LeetCode contest";
		reverseWords(s);
		

	}
	public static void reverseWords(String s) {
		StringBuilder sb=new StringBuilder();
		String arr[]=s.split("");
        for(String a:arr)
        {
            sb.append(reverse(a));
        }
        System.out.println(sb.toString());
        
    }
    public static String reverse(String s)
    {
    	
        char[] chArray = s.toCharArray();
        int i=0;
        int j=chArray.length-1;
        while(i<j)
        {
            char temp=chArray[i];
            chArray[i]=chArray[j];
            chArray[j]=temp;
            System.out.println(chArray[i]);
            
            i++;
            j--;
        }
        return new String(chArray);
        
        
    }

}
