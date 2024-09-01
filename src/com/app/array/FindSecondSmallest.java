package com.app.array;

import java.util.Scanner;

public class FindSecondSmallest {

	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the size  of array :");
		int n = sc.nextInt();
		
		int arr[] = new int[n];
		
		System.out.println("enter the element of array :");
		for(int i=0;i<n;i++)
		{
			arr[i] = sc.nextInt();
		}
		
		int result = secSmallest(arr,n);
		System.out.println("the second smallest element is : "+result);
	}

	private static int secSmallest(int arr[],int n)
	{
		int first = Integer.MAX_VALUE;
		int second = Integer.MAX_VALUE;
		
		for(int i=0;i<n;i++)
		{
			if(arr[i] > first)
			{
				second = first;
				first = arr[i];
			}else if(second > arr[i] )
			{
				second = arr[i];
			}
			
		}
		return second;
	}
}
