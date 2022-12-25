package com.binarysearch;

public class RotatedArraySearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	public int search(int nums[],int target)
	{
		int pivot=findpivot(nums);
		
		if(pivot==-1)
		{
			return binarysearch(nums,target,0,nums.length-1);
		}
		if(nums[pivot]==target)
		{
			return pivot;
		}
		if(nums[0]<=target)
		{
			return binarysearch(nums,target,0,pivot-1);
		}
		
			return binarysearch(nums,target,pivot+1,nums.length-1);
		
	}
	static int findpivot(int arr[])
	{
		int start=0;
		int end=arr.length-1;
		while(start<=end)
		{
			int mid=start+(end-start)/2;
			if(mid<end && arr[mid]>arr[mid+1])
			{
				return mid;
			}
			else if(mid>start && arr[mid]<arr[mid-1])
			{
				return mid-1;
			}
			else if(arr[start]>=arr[mid])
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
	public static int binarysearch(int[] arr,int target,int start,int end)
	{
		
			while(start<=end)
			{
				int mid=start+(end-start)/2;
				if(target<arr[mid])
				{
					end=mid-1;
				}
				else if(target>arr[mid])
				{
					start=mid+1;
				}
				else
				{
					return mid;
				}
			}
			return -1;
		
		
	}

}
