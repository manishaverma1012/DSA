package src.com.recusrion.sorting;

import java.util.Arrays;

public class Bubble {

	public static void main(String[] args) {
		int arr[]= {2,1,7,9,4,3};
		Bubble(arr,arr.length-1,0);
		System.out.print(Arrays.toString(arr));
	}
	public static void Bubble(int arr[],int r,int c)
	{
		if(r==0)
		{
			return;
		}
		if(c<r)
		{
			if(arr[c]>arr[c+1])
			{
				int temp=arr[c];
				arr[c]=arr[c+1];
				arr[c+1]=temp;
			}
			Bubble(arr,r,c+1);
					
		}
		else
		{
			Bubble(arr,r-1,0);
		}
	}

}
