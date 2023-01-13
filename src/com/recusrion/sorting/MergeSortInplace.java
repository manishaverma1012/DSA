package src.com.recusrion.sorting;

import java.util.Arrays;

public class MergeSortInplace {

	public static void main(String[] args) {
		int arr[] = {5,3,8,7,5};
		msInplace(arr,0,arr.length);
		System.out.println(Arrays.toString(arr));

	}
	public static void msInplace(int arr[],int s,int e)
	{
		if((e-s) ==1)
		{
			return ;
		}
		int mid=(e+s)/2;
		msInplace(arr,s,mid);
		msInplace(arr,mid,e);
		
		merge(arr,s,mid,e);
	}
	public static void merge(int arr[],int s,int mid,int e)
	{
		int mix[]=new int[e-s];
		int i=s;
		int j=mid;int k=0;
		while(i<mid && j<e)
		{
			if(arr[i]<arr[j])
			{
				mix[k]=arr[i];
				i++;
			}
			else
			{
				mix[k]=arr[j];
				j++;
			}
			k++;
		}
		//if one of the array is not complete
		//copy the remaining element ts
		while(i<mid)
		{
			mix[k]=arr[i];
			i++;
			k++;
		}
		while(j<e)
		{
			mix[k]=arr[j];
			j++;
			k++;
		}
		for(int l=0;l<mix.length;l++)
		{
			arr[s+l]=mix[l];
		}
	}

}
