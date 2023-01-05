package src.com.pattern.questions;

public class StarPattern {

	public static void main(String[] args) {
		int n=4;
		pattern6(n);	
	}
	
   public static void patterns(int n) {
	   for(int row=1;row<=n;row++)
	   {
		   for(int col=1;col<=row;col++)
		   {
			   System.out.print("*");
			   
		   }
		   System.out.println();
	   }   
   }
   
   public static void patterns1(int n) {
	   int i=1;
	   for(int row=1;row<=n;row++)
	   {
		   for(int col=1;col<=row;col++)
		   {
			   System.out.print(i);
			   i++;
		   }
		   System.out.println();
	   }   
   }
   
   
   public static void patterns2(int n) {
	   for(int row=1;row<=n;row++)
	   {
		   for(int col=1;col<=n-row+1;col++)
		   {
			   System.out.print("*");
			   
		   }
		   System.out.println();
	   }
	   
   }
   
   
   public static void patterns3(int n) {
	   for(int row=1;row<=2*n;row++)
	   {
		   int totalcolinrow= row>n?2*n-row :row;
		   
		  
		   for(int col=0;col<totalcolinrow;col++)
		   {
			   System.out.print("* ");
		   }
		   
		   System.out.println();
		  
	   }
   }
   
   
	 public static void patterns4(int n) 
	 {
		   for(int row=0;row<2*n;row++)
		   {
			   for(int col=1;col<=n-row+1;col++)
			   {
				   System.out.print("*");   
			   }
			   System.out.println();  
		   }
	 }
	 public static void patterns5(int n) {
		   for(int row=1;row<=2*n;row++)
		   {
			   int totalcolinrow= row>n?2*n-row :row;
			   int totalspace=n-totalcolinrow;
			   for(int s=0;s<totalspace;s++)
			   {
				   System.out.print(" ");
			   }
			   for(int col=0;col<totalcolinrow;col++)
			   {
				   System.out.print("* ");
			   }
			   
			   System.out.println();
			  
		   }
	   }
	 public static void pattern6(int n)
	 {
		 int original=n;
		 n=2*n;
		 for(int row=0;row<=n;row++)
		 {
			 for(int col=0;col<=n;col++)
			 {
				 int ateveryindex=original-(Math.min(Math.min(row, col),Math.min(n-row,n-col)));
				 System.out.print(ateveryindex+" ");
			 }
			 System.out.println(" ");
		 }
	 }
	   
	   
}
