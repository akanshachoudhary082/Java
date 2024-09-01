package com.app.array;

public class FindLargestSmallest {

	public static void main(String[] args)
	{
		int arr[] = {12, 13, 1, 10, 34, 10};
		
		int largest= arr[0];
		int smallest= arr[0];
		
		for(int i =0;i<arr.length;i++)
		{
			if(largest < arr[i])
			{
				largest = arr[i];
			}
			
			if(smallest > arr[i])
			{
				smallest = arr[i];
			}
		}
		
		System.out.println("largest numbeer is :"+ largest);
		System.out.println("smallest numbeer is :"+ smallest);
	}
}
