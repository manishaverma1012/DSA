package src.com.recusrion.sorting;

import java.util.Arrays;

public class Selection {
	public static void main(String[] args) {
		int arr[]= {2,1,7,9,4,3};
		selection(arr,arr.length-1,0,0);
		System.out.print(Arrays.toString(arr));
	}
	public static void selection(int arr[],int r,int c,int max)
	{
		if(r==0)
		{
			return;
		}
		if(c<r)
		{
			if(arr[c]>arr[max])
			{
				selection(arr,r,c+1,c);
			}
			else
			{
				selection(arr,r,c+1,max);
			}
						
		}
		else
		{
			int temp=arr[max];
			arr[max]=arr[r-1];
			arr[r-1]=temp;
			selection(arr,r-1,0,0);
		}
		
	}

}
