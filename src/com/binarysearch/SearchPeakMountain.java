package com.binarysearch;

public class SearchPeakMountain {

	public static void main(String[] args) {
		int arr[]= {1,3,6,9,8,7,5,4,2};
		int target=7;
		int value=search(arr,target);
		System.out.println(value);

	}
	public static int search(int[]arr, int target)
	{
		int peak=peakIndexInMountainArray(arr);
		int firsttry=binarysearch(arr,target,0,peak);
		
		if(firsttry!=-1)
	    {
			return firsttry;
		}
		else
		{
			return binarysearch(arr,target,peak+1,arr.length-1);
		}
	}
	public static int binarysearch(int[] arr,int target,int start,int end)
	{
		boolean isAsc=arr[start]<arr[end];
		while(start<=end)
		{
			int mid=start+(end-start)/2;
			if(arr[mid]==target)
			{
				return mid;
			}
			if(isAsc)
			{
				if(target<arr[mid])
				{
					end=mid-1;
				}
				else
				{
					start=mid+1;
				}
			}
			else 
				if(target>arr[mid])
				{
					end=mid-1;
				}
				else
				{
					start=mid+1;
				}
			
			
		}
		return -1;
	}
	public static int peakIndexInMountainArray(int[] arr) {
	int start=0;
	   int end=arr.length-1;
	   while(start<end)
	   {
		   int mid=start+(end-start)/2;
		   if(arr[mid]>arr[mid+1])
		   {
			   end=mid;
		   }
		   else 
		   {
			   start=mid+1;
		   }
	   }
	   return start;
	}

}
