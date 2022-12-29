package src.com.binarysearch;

public class BinarySearch {

	public static void main(String[] args) {
		int arr[]= {};
		int start=0;
		int end=arr.length-1;
		
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
