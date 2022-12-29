package src.com.Bitwise.sorting;

import java.util.Arrays;

public class BubbleSort {

	public static void main(String[] args) {
		int arr[]= {2,5,8,7,3};
		bubblesort(arr);
		System.out.println(Arrays.toString(arr));

	}
	public static void  bubblesort(int []arr)
	{
		boolean swapped=true;
		for(int i=0;i<arr.length;i++)
		{
			for(int j=1;j<=arr.length-i-1;j++)
			{
				if(arr[j]<arr[j-1])
				{
					int temp=arr[j];
					arr[j]=arr[j-1];
					arr[j-1]=temp;
					swapped=true;
				}
			}
			if(!swapped)
			{
				break;
			}
		}
	}

}
