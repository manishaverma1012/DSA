//package src.com.Tree;
//
//public class Balanaced_BinaryTree {
//	static boolean result=true;
//	public static void main(String[] args)
//	{
//	    root = {3,9,20,null,null,15,7};
//		helper(root);
//		System.out.print(result);	
//	}
//
//	
//	   
//	    public static int helper(TreeNode root)
//	    {
//	        if(root==null)
//	        {
//	            return 0;
//	        }
//	        int l=helper(root.left);
//	        int r=helper(root.right);
//	        if(Math.abs(l-r)>1)
//	        {
//	           result=false;
//	        }
//	        return 1+Math.max(l,r);
//
//	    }
	

//}
