package com.app.array;

import java.util.Arrays;

public class SortFirstHalfInAscAndThenDesc {

	public static void main(String [] args)
	{
		int arr[] = {1,2,6,3,10,20,60,30};
		
		System.out.println("print array in ascending order :");
		int n = arr.length;
		PrintInOrder(arr,n);
	}
	static void PrintInOrder(int arr[],int n)
	{
		Arrays.sort(arr);
		
		for(int i=0;i<n/2;i++)
		{
			System.out.println("print in asc order :"+arr[i]+"");
		}
		
		for(int j=n-1;j>=n/2;j--)
		{
			System.out.println("print in desc order "+arr[j]+" ");
		}
	}
}
