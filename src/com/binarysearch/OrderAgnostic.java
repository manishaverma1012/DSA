package src.com.binarysearch;

public class OrderAgnostic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	public static int OrderAgnobinarysearch(int[] arr,int target,int start,int end)
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

}
