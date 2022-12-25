package com.array;

//import java.sql.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Multi2dArray {

	public static void main(String[] args) {
		/*1 2 3
		 * 4 5 6
		 * 6 7 8 
		 */
		Scanner sc=new Scanner(System.in);
		ArrayList<ArrayList<Integer>> list=new ArrayList<>();
		int [][]arr =new int [3][];
		int [][] arr2D= {
				{2,4,5,6},
				{4,5},
				{5,6,7,8}
		};
		int a[]= {3,4,5,6};
//		for(int row=0;row<3;row++)
//		{
//			for(int col=0;col<arr2D[row].length;col++)
//			{
//				System.out.print(arr2D[row][col]+ " ");
//			}
//			System.out.println();
//		}
		for(int row=0;row<3;row++)
		{
			System.out.println(Arrays.toString(arr2D[row]));
		}
		//toString(object);
		for(int row=0;row<4;row++)
		{
			System.out.println(Arrays.toString(a));
		}
		
//		for(int row=0;row<4;row++)
//		{
//			for(int col=0;col<4;col++)
//			{
//				list.get(row).add(sc.nextInt());
//			}
			
	}
//		for(int i=0;i<4;i++)
//		{
//			System.out.println(list.add(new ArrayList()));
//		}
		
			
		
		
		
		
		
		
	}


