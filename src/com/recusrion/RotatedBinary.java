package src.com.recusrion;

public class RotatedBinary {

	public static void main(String[] args) 
	{
		int arr[]= {3,5,8,1,2};
		System.out.print(RotatedBinary(arr,8,0,arr.length));	
	}
	
	

	public static int RotatedBinary(int arr[],int target,int s,int e)
	{
		if(s>e)
		{
			return -1;
		}
		int mid=s+(e-s)/2;
		if(arr[mid]==target)
		{
			return mid;
		}
		if(arr[s]<=arr[mid])
		{
			if(target<=arr[mid] && target>=arr[s])
				return RotatedBinary(arr,target,s,mid-1);
			else
				return RotatedBinary(arr,target,mid+1,e);
		}
		if(target>=arr[mid] && target<=arr[e])
		{
			return RotatedBinary(arr,target,mid+1,e);
		}
		else
		{
			return RotatedBinary(arr,target,s,mid-1);
		}
		
	}

}
