package com.app.array;

import java.util.Arrays;
import java.util.Scanner;

public class FindSecondSmallest {

//	public static void main(String[] args)
//	{
//		Scanner sc = new Scanner(System.in);
//		System.out.println("enter the size  of array :");
//		int n = sc.nextInt();
//		
//		int arr[] = new int[n];
//		
//		System.out.println("enter the element of array :");
//		for(int i=0;i<n;i++)
//		{
//			arr[i] = sc.nextInt();
//		}
//		
//		int result = secSmallest(arr,n);
//		System.out.println("the second smallest element is : "+result);
//	}
//
//	private static int secSmallest(int arr[],int n)
//	{
//		int first = Integer.MAX_VALUE;
//		int second = Integer.MAX_VALUE;
//		
//		for(int i=0;i<n;i++)
//		{
//			if(arr[i] > first)
//			{
//				second = first;
//				first = arr[i];
//			}else if(second > arr[i] )
//			{
//				second = arr[i];
//			}
//			
//		}
//		return second;
//	}
//	
	
	
//---------------------------------with sorting ------------------------------
	
	public static void main(String[] args)
	{
		int [] arr = {12, 3, 5, 7, 2, 9};
		Arrays.sort(arr);
		
		//{2,3,3,5,7,9,12}
		
		int secondSmallest = Integer.MAX_VALUE;
		
		for(int i=1;i<arr.length;i++) // 1<7 
		{
			if(arr[i] != arr[i -1]) // 3 != 2=>true  
			{
				secondSmallest = arr[i];//ss = 3
				break; // it is breaking the loop 
			}
		}
		//This is a special constant in Java that represents the largest possible value for an int type, which is 2,147,483,647.
		
		if(secondSmallest != Integer.MAX_VALUE) // 3 !=2,147,483,647.
		{
			System.out.println("the second smallest element is :"+ secondSmallest); // this will print 
		}else {
			System.out.println("there is no second smallest element ");
		}
		
	}
}
