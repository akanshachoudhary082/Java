package com.app.array;

public class MergeArray {

	public static void main(String[] args)
	{
		int [] arr1 = {1,2,3};
		int [] arr2 = {4,5,6};
		
		int [] mergeArray = new int [arr1.length + arr2.length];
		
		for(int i=0;i<arr1.length;i++)
		{
			mergeArray[i]= arr1[i];
			
		}
		
		for(int i=0;i<arr2.length;i++)
		{
			mergeArray[arr1.length +  i] = arr2[i];
		}
		
		System.out.println("merge");
		for(int num :mergeArray)
		{
			System.out.print( num + " ");
		}
	}
}
