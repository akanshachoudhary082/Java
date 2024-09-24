package com.app.array;

import java.util.Arrays;

public class FindLargestSmallest {

//	public static void main(String[] args)
//	{
//		int arr[] = {12, 13, 1, 10, 34, 10};
//		
//		int largest= arr[0];
//		int smallest= arr[0];
//		
//		for(int i =0;i<arr.length;i++)
//		{
//			if(largest < arr[i])
//			{
//				largest = arr[i];
//			}
//			
//			if(smallest > arr[i])
//			{
//				smallest = arr[i];
//			}
//		}
//		
//		System.out.println("largest numbeer is :"+ largest);
//		System.out.println("smallest numbeer is :"+ smallest);
//	}
	
	//------------------------using sorting 
	
	public static void main(String[] args)
	{
		int arr[] = { 12, 13, 14, 1, 34, 10 };
	
		Arrays.sort(arr);
		
		int maxNumber = arr[arr.length -1];
		int min = arr[0];
		System.out.println("max numner:"+maxNumber + " "+ min);
	}
	
	
}
