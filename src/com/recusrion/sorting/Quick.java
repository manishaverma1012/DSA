package src.com.recusrion.sorting;

import java.util.Arrays;

public class Quick {

	public static void main(String[] args) {
		int arr[]= {2,4,7,8,9,3,5,6};
		sort(arr,0,arr.length-1);
		System.out.println(Arrays.toString(arr));
		

	}
	static void sort(int arr[],int lo,int hi)
	{
		if(lo>=hi)
		{
			return;
		}
		int s=lo;
		int e=hi;
		
		int p=s+(e-s)/2;
		int pivot=arr[p];
		while(s<=e)
		{
			while(arr[s]<pivot)
			{
				s++;
			}
			while(arr[e]>pivot)
			{
				e--;
			}
			if(s<=e)
			{
				int temp=arr[s];
				arr[s]=arr[e];
				arr[e]=temp;
				s++;
				e--;
			}
		}
		sort(arr,lo,e);
		sort(arr,s,hi);
		
	}

}
