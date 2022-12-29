package src.com.Bitwise.sorting;

import java.util.Arrays;

public class Cyclicsort {

	public static void main(String[] args) {
		int arr[]= {5,4,3,2,1};
		cyclic(arr);
		System.out.println(Arrays.toString(arr));
		

	}
	public static void cyclic(int nums[])
	{
		for(int i=0;i<nums.length;i++)
		{
			if(nums[i]!=nums[i]-1)
			{
				swap(nums,i,nums[i]-1);
			}
		}
	}
	public static void swap(int nums[],int i,int j)
	{
		int temp=nums[i];
		nums[i]=nums[j];
		nums[j]=temp;
	}

}
