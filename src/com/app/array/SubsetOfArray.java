package com.app.array;

public class SubsetOfArray {

	public static void main(String [] args)
	{
		int [] arr1 = {10,20,30,50,60,29};
		int [] arr2 = {20,30,29};
		
		int n = arr1.length;
		int m = arr2.length;
		
		if(isSubset(arr1,arr2,n,m))
		{
			System.out.println("arr2[] is a subset of arr1[]");
		}else {
			System.out.println("not a subset");
		}
		System.out.println();
	}

	public  static boolean isSubset(int[] arr1, int[] arr2, int n, int m) {
		
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<m;j++)
			{
				if(arr1[i] == arr2[j])
				{
				   break;
			
				}
				if(j==m)
				{
					return false;
				}
			}
			
			
		}
		return true;
	}
}
